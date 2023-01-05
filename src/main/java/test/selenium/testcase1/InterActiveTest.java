package test.selenium.testcase1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class InterActiveTest {
    public static WebDriver driver;
    public static Actions actions;
    @BeforeAll
    public static void setUpTest(){
        driver=new ChromeDriver();
        actions=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

/*    @BeforeAll
    public static void initDate(String map){
        System.setProperty("webdriver.firefox.bin", map);
        System.setProperty("webdriver.gecko.driver", "E:\\firefox57\\geckodriver.exe");
        driver =new FirefoxDriver();
    }*/


    @Test
    public void clickTest(){
        //点击事件
        driver.get("https://sahitest.com/demo/clicks.htm");
        //单击
        actions.click(driver.findElement(By.xpath("//input[@value='click me']")));
        //双击
        actions.doubleClick(driver.findElement(By.xpath("//input[@value='dbl click me']")));
        //右键
        actions.contextClick(driver.findElement(By.xpath("//input[@value='right click me']")));
        actions.perform();
    }
    @Test
    public void  dragAndDropTest(){
         driver.get("https://sahitest.com/demo/dragDropMooTools.htm");
         //  /html/body/div[3]   /html/body/div[3]   //*[@class='Item'][last()]   /html/body/div[5]
        // actions.dragAndDrop(driver.findElement(By.id("dragger")),driver.findElement(By.xpath("//*[@class='Item'][last()]"))).perform();
        actions.dragAndDrop(driver.findElement(By.id("dragger")),driver.findElement(By.xpath("//*[@class='Item'][last()]"))).perform();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void keyBoardTest(){
        //复制粘贴
        driver.get("https://sahitest.com/demo/label.htm");
        driver.findElements(By.xpath("//input[@type='textbox']")).get(0).sendKeys("dujing");

    }

    @Test
    public void moveTest(){
        driver.get("http://www.baidu.com");
        actions.moveToElement(driver.findElement(By.id("s-usersetting-top")));
        actions.perform();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @AfterAll
    public static void tearDown(){
        //driver.quit();
    }

}
