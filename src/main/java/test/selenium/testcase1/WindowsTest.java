package test.selenium.testcase1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WindowsTest {
   public static WebDriver driver;

   @BeforeAll
    public static void setUp(){
       driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   }
   @Test
    public void switchWindowTest(){
        driver.get("https://www.baidu.com");
        //*[@id="s-top-loginbtn"]
        driver.findElement(By.xpath("//*[@id='s-top-loginbtn']")).click();

        //当前百度首页的句柄窗口
        String baiduwin=driver.getWindowHandle();
        System.out.println(baiduwin+"打印窗口句柄");
        driver.findElement(By.xpath("//*[@id='TANGRAM__PSP_11__regLink']")).click();
        //返回所窗口句柄
       // Set<String> windowHandles = driver.getWindowHandles();

        for(String win:driver.getWindowHandles()){
            if(!win.equals(baiduwin)){
                driver.switchTo().window(win);
                //切换窗口后输入用户名 手机号
                driver.findElement(By.xpath("//input[@id='TANGRAM__PSP_4__userName']")).sendKeys("dujing");
                driver.findElement(By.xpath("//input[@id='TANGRAM__PSP_4__phone']")).sendKeys("18611111111");
                //再次切回百度首页窗口
                driver.switchTo().window(baiduwin);
                //*[@id="TANGRAM__PSP_11__changePwdCodeItem"]
                //*[@id="TANGRAM__PSP_11__userName"]
                //输入账户名密码进行百度登录
                driver.findElement(By.xpath("//input[@id='TANGRAM__PSP_11__userName']")).sendKeys("18611666947");
                driver.findElement(By.xpath("//input[@id='TANGRAM__PSP_11__password']")).sendKeys("1qaz2wsx");


            }

        }
   }
}
