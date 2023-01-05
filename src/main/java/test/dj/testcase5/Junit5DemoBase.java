package test.dj.testcase5;

import org.junit.jupiter.api.Test;
/*
* 基础脚本分别进行了加减乘除计算，并打印了结果
* */
public class Junit5DemoBase {
    @Test
    public void addTest(){
        int result= 0;
        result = JiSuan.add(1,2);
        System.out.println(result);
    }
    @Test
    public void subTest() {
        int result=JiSuan.sub(5,2);
        System.out.println(result);
    }
    @Test
    public void mulTest(){
        int result=JiSuan.mul(5,6);
        System.out.println(result);
    }
    @Test
    public void disTest(){
        int result=JiSuan.div(7,8);
        System.out.println(result);
    }
    @Test
    public void countTest() throws InterruptedException {
        int result=JiSuan.count(2);
        result=JiSuan.count(2);
        result=JiSuan.count(2);
        System.out.println(result);
    }
}
