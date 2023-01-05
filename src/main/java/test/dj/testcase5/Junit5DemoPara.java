package test.dj.testcase5;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
/*
* 计算器累加并发
* */
public class Junit5DemoPara  {
    @Test
    @RepeatedTest(10)//串行的，不是并发
    public void countTest() throws InterruptedException {
        int result=JiSuan.sycount(2);
        //int result=JiSuan.count(1);
        String str=Thread.currentThread().getName();
        System.out.println("线程"+str+"打印----"+result);
    }
}
