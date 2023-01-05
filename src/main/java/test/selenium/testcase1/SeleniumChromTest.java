package test.selenium.testcase1;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumChromTest {
    public static WebDriver driver;
    @BeforeAll
    static void setUpTest(){
       driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    void  seleniumTest(){
        driver.get(" http://crmtest.weoil.net.cn");
        driver.findElement(By.id("username")).sendKeys("dujing");
        driver.findElement(By.id("password")).sendKeys("weoil123456");
        driver.findElement(By.className("login")).click();
        driver.switchTo().frame(1);
        //driver.findElement(By.cssSelector("#m11 li:nth-child(4) a")).click();
        driver.findElement((By.xpath("//a[contains(text(),'优惠券管理')]"))).click();
        //driver.switchTo().frame(2);
        //driver.findElement(By.id("import_info")).sendKeys("C:\\Users\\Administrator\\Desktop\\用户优惠券导入模板.xlsx");
       /* Assert.assertThat(driver.switchTo().alert().getText(),
                is("导入成功：\r\n导入优惠券数：100 ，优惠券总额：5,500.00"));
*/
    }
   // @Test
    void baiDuTest(){
        //打开浏览器
        driver.get(" http://www.baidu.com");
        //填写内容
        driver.findElement(By.name("wd")).sendKeys("selenium");
        //点击查询
        driver.findElement(By.id("su")).click();
    }
    @AfterAll
    static void tearDown(){
       //driver.quit();
    }
}
