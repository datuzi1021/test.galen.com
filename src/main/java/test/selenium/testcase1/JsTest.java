package test.selenium.testcase1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JsTest extends BaseTest{
    public static WebDriver driver;
    @BeforeAll
    static void setUpTest(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void jsTst() throws InterruptedException {
        driver.get("https://www.12306.cn/index/");
        JavascriptExecutor jsDriver=(JavascriptExecutor)driver;
            Thread.sleep(4000);
        jsDriver.executeScript("document.getElementById('train_date').value='2022-8-28'");
            Thread.sleep(4000);
        Object date=jsDriver.executeScript("return document.getElementById('train_date').value");
        System.out.println(date);

    }
}
