package test.dj.testcase6;

import org.junit.jupiter.api.*;

public class FixTruesExtend extends FixTrues{
    @BeforeAll
    public static void childBeforeAll(){
        System.out.println("chileBeforeAll执行！");
    }
    @AfterAll
    public static void childAfterAll(){
        System.out.println("childAfterAll执行！");
    }
    @BeforeEach
    public void childBeforeEach(){
        System.out.println("childBeforeEach执行！");
    }
    @AfterEach
    public void childAfterEach(){
        System.out.println("childAfterEach执行！");
    }
    @Test
    public void methodTest1(){
        System.out.println("方法1执行！");
    }
    @Test
    public void methodTest2(){
        System.out.println("方法2执行！");
    }
    @Test
    public void methodTest3(){
        System.out.println("方法3执行！");
    }

}
