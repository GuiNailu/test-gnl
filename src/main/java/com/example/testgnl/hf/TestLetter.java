package com.example.testgnl.hf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: GuiNailu
 * @description：
 * @Date: 2020/8/24 19:44
 */
public class TestLetter {

    //用于临时存储路径
    private StringBuilder sb = new StringBuilder();
    private List<String> res = new ArrayList<>();


    private Node root = new Node("");


    public List<String> letterCombinations(int[] data) {
        List<String> result = new ArrayList<>();  //响应结果

        if (data == null || data.length == 0) {
            return result;
        }

        List<List<String>> lists = new ArrayList<>();  //存放每个数字对应的字母集合
        for (int c : data) {
            if (c == 0 || c == 1) {
                continue;
            }

            if(c >= 10){  //处理十位数
                int[] gtTen = getGtTen(c);
                for (int i : gtTen) {
                    lists.add(getLetter(i));
                }
            }else{
                lists.add(getLetter(c));
            }

        }

       if(lists.size() <= 0){
           return result;
       }
        //生成树
        tree(root, lists, 0);

        return ergodicTree(root);
    }

    /**
     * 处理十位数以上
     * @param data
     * @return
     */
    private int[] getGtTen(int data) {

        int singleDigit = data % 10;  //个位数
        int tens = data / 10;  //十位数

        return new int[]{tens,singleDigit};
    }

    /**
     * 遍历树
     *
     * @param tree
     * @return
     */
    private List<String> ergodicTree(Node tree) {

        getCode(tree, tree.c, sb);
        return res;
    }


    /**
     * 获取所有可能的匹配
     *
     * @param node
     * @param str
     * @param sb
     */
    private void getCode(Node node, String str, StringBuilder sb) {

        StringBuilder stringBuilder = new StringBuilder(sb);
        stringBuilder.append(str);

        if (node.nodes.size() > 0) {  //如果有子节点
            for (Node n : node.nodes) {
                getCode(n, n.c, stringBuilder);
            }
        } else {
            res.add(stringBuilder.toString());
        }

    }

    /**
     * 递归得到树结构
     *
     * @param node  结点
     * @param lls   所有输入的数字对应的字符集合
     * @param index 下标
     */
    private void tree(Node node, List<List<String>> lls, int index) {

        List<String> cl = lls.get(index);
        for (String c : cl) {
            node.nodes.add(new Node(c));
        }
        index++;
        if (index < lls.size()) {
            for (Node n : node.nodes) {
                tree(n, lls, index);
            }
        }

    }


    /**
     * 通过数字得到数字对应的字母
     *
     * @param c
     * @return
     */
    private List<String> getLetter(int c) {
        List<String> characters = null;
        switch (c) {
            case 0:
                characters = Arrays.asList("");
                break;
            case 1:
                characters = Arrays.asList("");
                break;
            case 2:
                characters = Arrays.asList("a", "b", "c");
                break;
            case 3:
                characters = Arrays.asList("d", "e", "f");
                break;
            case 4:
                characters = Arrays.asList("g", "h", "i");
                break;
            case 5:
                characters = Arrays.asList("j", "k", "l");
                break;
            case 6:
                characters = Arrays.asList("m", "n", "o");
                break;
            case 7:
                characters = Arrays.asList("p", "q", "r", "s");
                break;
            case 8:
                characters = Arrays.asList("t", "u", "v");
                break;
            case 9:
                characters = Arrays.asList("w", "x", "y", "z");
                break;
        }
        return characters;
    }


    /**
     * 树结构
     */
    private class Node {

        String c;  //当前结点
        List<Node> nodes;  //当前节点的所有子节点

        public Node(String c) {
            this.c = c;
            nodes = new ArrayList<>();
        }

    }

}

