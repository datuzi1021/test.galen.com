package test.selenium.testcase1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UpLoadTest {
    public static WebDriver driver;
    @BeforeAll
    static void setUpTest(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void upLoadTest(){
        //打开百度
          driver.get("https://www.baidu.com");
        //点击照相机
          driver.findElement(By.xpath("//span[@class='soutu-btn']")).click();
        //选择图片上传
          driver.findElement(By.xpath("//input[@class='upload-pic']")).sendKeys("C:\\Users\\Administrator\\Desktop\\测试礼物.png");
    }
}
