package test.dj.testcase6;

import org.junit.jupiter.api.*;

public class FixTrues {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll执行！");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll执行！");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach执行！");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("afterEach执行！");
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
