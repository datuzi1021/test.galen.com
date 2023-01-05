package test.dj.testcase5;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
@Epic("计算器项目")
@Feature("计算器运算过程")
public class Junit5DemoAllure {
    @Test
    @Order(1)
    @Description("加分测试case")
    @Story("加分测试case")
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
    @Description("减法测试case")
    public void subTest() throws InterruptedException {
        int result=JiSuan.sub(5,2);
        System.out.println(result);
    }

    @Test
    @Order(3)
    @Story("乘法测试case")
    public void mulTest(){
        int result=JiSuan.mul(5,6);
        System.out.println(result);
    }
    @Test
    @Order(4)
    @Story("除法测试case")
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
    @Description("累加测试case")
    @Story("累加测试case")
    public void countTest() throws InterruptedException {
        int result=JiSuan.count(11);
        result=JiSuan.count(11);
        result=JiSuan.count(11);
        System.out.println(result);
    }

}
