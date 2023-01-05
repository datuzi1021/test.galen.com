package test.dj.testcase5;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Junit5DemoAssert {
    @Test
    @Order(1)
    public void addTest() throws InterruptedException {
        int result=JiSuan.add(4,2);
        System.out.println(result);
        assertEquals(6,result);
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
    @Test
    @Order(5)
    public void countTest() throws InterruptedException {
        int result=JiSuan.count(2);
        result=JiSuan.count(2);
        result=JiSuan.count(2);
        System.out.println(result);
    }

}
