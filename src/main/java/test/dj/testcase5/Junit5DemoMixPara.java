package test.dj.testcase5;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
* 混合场景并发
* */
public class Junit5DemoMixPara {
    @RepeatedTest(10)
    public void addTest()  {
        int result=JiSuan.add(4,2);
        System.out.println(result);
        assertEquals(6,result);
    }
    @RepeatedTest(10)
    public void subTest() {
        int result=JiSuan.sub(4,2);
        System.out.println(result);
    }
}
