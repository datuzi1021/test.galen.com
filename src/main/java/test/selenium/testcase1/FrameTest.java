package test.selenium.testcase1;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FrameTest {

    public static WebDriver driver;
    @BeforeAll
    static void setUpTest(){
        driver=new ChromeDriver();
        // System.setProperty("webdriver.gecko.driver","E:\\firefox57\\geckodriver");
        //driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    } void frameTest(){
        driver.get("\n" + "https://www.runoob.com/try/try.php?filename=jqueryui-api-droppable");
        //*[@id="iframeResult"]
        driver.switchTo().frame("iframeResult");
        //*[@id="draggable"]
        System.out.println(driver.findElement(By.id("draggable")).getText());
        //跳出frame
        driver.switchTo().parentFrame();
        //*[@id="submitBTN"]
        System.out.println(driver.findElement(By.id("submitBTN")).getText());
    }
}
