package test.testweb;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestWeb {
    public static WebDriver driver;
    @BeforeAll
    public static void setUpTest(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void testLogin() throws IOException, InterruptedException {
        driver.get("https://work.weixin.qq.com/wework_admin/frame");
        //driver.get("https://passport.jd.com/new/login.aspx?ReturnUrl=https%3A%2F%2Fwww.jd.com%2F");
        //driver.get("https://wx.qsq.com/index.php");
        //driver.get("http://gtest.weoil.net.cn/Login/");
        Thread.sleep(15000);
        //人工登录  把cookies记录到yaml文件中
        Set<Cookie> cookies = driver.manage().getCookies();
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.writeValue(new File("cookies.yaml"),cookies);
    }
    @Test
    public void testLogined() throws IOException {
        //driver.get("http://gtest.weoil.net.cn/Login/");
        driver.get("https://work.weixin.qq.com/wework_admin/frame");
        //driver.get("https://passport.jd.com/new/login.aspx?ReturnUrl=https%3A%2F%2Fwww.jd.com%2F");
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        TypeReference<List<HashMap<String,Object>>> typeReference = new TypeReference<List<HashMap<String,Object>>>(){};
        //List<HashMap<String,Object>> cookies = mapper.readValue(new File("cookies.yaml"),typeReference);
        List<HashMap<String, Object>> cookies = mapper.readValue(new File("cookies.yaml"),typeReference);
        System.out.println(cookies);
        cookies.forEach(cookieMap->{
            driver.manage().addCookie(new Cookie(cookieMap.get("name").toString(),cookieMap.get("value").toString()));
        });
        driver.navigate().refresh();
    }
}