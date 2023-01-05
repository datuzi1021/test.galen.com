package test.selenium.testcase1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest {
    public static  WebDriver driver;
    @BeforeAll
    public static void initDate(){
        String browserName = System.getenv("browser");
        if("chrome".equals(browserName)){
           // System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
            driver=new ChromeDriver();
        }else if ("firefox".equals(browserName)){
            System.setProperty("webdriver.gecko.driver","E:\\firefox57\\geckodriver");
            driver=new FirefoxDriver();
        }else if ("sarfari".equals(browserName)){
            driver=new SafariDriver();
        }else if ("ie".equals(browserName)){
            driver=new FirefoxDriver();
        }
    }
    @AfterAll
    public static void tearDown(){
        //driver.quit();
    }

}
