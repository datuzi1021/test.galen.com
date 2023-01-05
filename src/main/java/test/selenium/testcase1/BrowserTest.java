package test.selenium.testcase1;

import org.junit.jupiter.api.Test;
/*
* 用来验证浏览器兼容 浏览器切换 basetest
* */
public class BrowserTest extends BaseTest{
    @Test
    public void browserTest(){
        driver.get("https://home.testing-studio.com");
    }
}
