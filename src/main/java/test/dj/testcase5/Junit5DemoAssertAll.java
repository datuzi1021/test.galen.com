package test.dj.testcase5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Junit5DemoAssertAll {
    @Test
    @Order(1)
    public void addTest() throws InterruptedException {
        int result01=JiSuan.add(4,2);
        System.out.println(result01);
        //assertEquals(6,result01);

        int result02=JiSuan.add(5,3);
        System.out.println(result02);
        //assertEquals(6,result02);

        int result03=JiSuan.add(5,3);
        System.out.println(result03);
        //assertEquals(6,result03);
        assertAll("计算机结果校验",
                ()->assertEquals(6,result01),
                ()->assertEquals(6,result02),
                ()->assertEquals(6,result03)
        );

    }
    @Test
    @Order(2)
    public void subTest() throws InterruptedException {
        int result=JiSuan.sub(5,2);
        System.out.println(result);
    }
    @Test
    @Order(3)
    public void mulTest(){
        int result=JiSuan.mul(5,6);
        System.out.println(result);
    }
    @Test
    @Order(4)
    public void disTest(){
        int result=JiSuan.div(7,8);
        System.out.println(result);
    }
    //@Test
    //@Order(5)
    @BeforeEach
    public void cleanTest(){
        JiSuan.clean();
    }
    @Test
    @Order(6)
    public void countTest() throws InterruptedException {
        int result=JiSuan.count(11);
        result=JiSuan.count(11);
        result=JiSuan.count(11);
        System.out.println(result);
    }

}
