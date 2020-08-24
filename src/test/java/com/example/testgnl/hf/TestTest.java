package com.example.testgnl.hf;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: GuiNailu
 * @description：描述
 * @Date: 2020/8/24 19:52
 */
@Slf4j
class TestTest {

    @Test
    void letterCombinations() {
        int [] data =  new int[]{90};
        TestLetter testLetter = new TestLetter();
        List<String> strings = testLetter.letterCombinations(data);
        if(strings.size() > 0 && data.length == 1 && data[0] < 10 ){
            log.info("只有一个数字：{}", StringUtils.join(strings,""));
        }
        log.info("执行结果： {}", strings);
//        log.info("个位数： {}", 87%10);
//        log.info("十位数： {}", 87/10);
    }

    @Test
    void letterCombinations2() {
        int [] data =  new int[]{0};
        TestLetter testLetter = new TestLetter();
        List<String> strings = testLetter.letterCombinations(data);
        if(strings.size() > 0 && data.length == 1 && data[0] < 10 ){
            log.info("只有一个数字：{}", StringUtils.join(strings,""));
        }
        log.info("执行结果： {}", strings);
//        log.info("个位数： {}", 87%10);
//        log.info("十位数： {}", 87/10);
    }

    @Test
    void letterCombinations3() {
        int [] data =  new int[]{1};
        TestLetter testLetter = new TestLetter();
        List<String> strings = testLetter.letterCombinations(data);
        if(strings.size() > 0 && data.length == 1 && data[0] < 10 ){
            log.info("只有一个数字：{}", StringUtils.join(strings,""));
        }
        log.info("执行结果： {}", strings);
//        log.info("个位数： {}", 87%10);
//        log.info("十位数： {}", 87/10);
    }

    @Test
    void letterCombinations4() {
        int [] data =  new int[]{2,98,10,1,0};
        TestLetter testLetter = new TestLetter();
        List<String> strings = testLetter.letterCombinations(data);
        if(strings.size() > 0 && data.length == 1 && data[0] < 10 ){
            log.info("只有一个数字：{}", StringUtils.join(strings,""));
        }
        log.info("执行结果： {}", strings);
//        log.info("个位数： {}", 87%10);
//        log.info("十位数： {}", 87/10);
    }

    @Test
    void letterCombinations5() {
        int [] data =  new int[]{0,1,3};
        TestLetter testLetter = new TestLetter();
        List<String> strings = testLetter.letterCombinations(data);
        if(strings.size() > 0 && data.length == 1 && data[0] < 10 ){
            log.info("只有一个数字：{}", StringUtils.join(strings,""));
        }
        log.info("执行结果： {}", strings);
//        log.info("个位数： {}", 87%10);
//        log.info("十位数： {}", 87/10);
    }

    @Test
    void letterCombinations6() {
        int [] data =  new int[]{0,1,3,4,5,23};
        TestLetter testLetter = new TestLetter();
        List<String> strings = testLetter.letterCombinations(data);
        if(strings.size() > 0 && data.length == 1 && data[0] < 10 ){
            log.info("只有一个数字：{}", StringUtils.join(strings,""));
        }
        log.info("执行结果： {}", strings);
//        log.info("个位数： {}", 87%10);
//        log.info("十位数： {}", 87/10);
    }

    @Test
    void letterCombinations7() {
        int [] data =  new int[]{2,0,11,13,14,23,56,78,1,9,8,6,5};
        TestLetter testLetter = new TestLetter();
        List<String> strings = testLetter.letterCombinations(data);
        if(strings.size() > 0 && data.length == 1 && data[0] < 10 ){
            log.info("只有一个数字：{}", StringUtils.join(strings,""));
        }
        log.info("执行结果： {}", strings);
//        log.info("个位数： {}", 87%10);
//        log.info("十位数： {}", 87/10);
    }

    @Test
    void letterCombinations8() {
        int [] data =  new int[]{};
        TestLetter testLetter = new TestLetter();
        List<String> strings = testLetter.letterCombinations(data);
        if(strings.size() > 0 && data.length == 1 && data[0] < 10 ){
            log.info("只有一个数字：{}", StringUtils.join(strings,""));
        }
        log.info("执行结果： {}", strings);
//        log.info("个位数： {}", 87%10);
//        log.info("十位数： {}", 87/10);
    }
}