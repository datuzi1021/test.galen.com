package test.dj.testcase2;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class LoginTest {
    private static HashMap<String,Object> hashdate=new HashMap<String, Object>();
    @Test
    void loginTest(){
        hashdate.put("login","登录成功");
        System.out.println(hashdate.get("login"));
    }
   @Nested
    class  PayTest{
        @Test
        void payTest(){
            if(null!=hashdate.get("buy")){
                System.out.println("正在支付，请等待");
                System.out.println(hashdate.get("buy"));
            }else{
                System.out.println("你还没购买商品呢，赶紧去购买吧");
            }
        }
    }
//主类第一个，倒序执行
    @Nested
    class BuyTest{
        @Test
        void  buyTest(){
            if(hashdate.get("login").equals("登录成功")){
                System.out.println("登录成功啦O(∩_∩)O哈哈~可以购买东西啦");
                hashdate.put("buy","购买了微油的好些商品");
            }else {
                System.out.println("登录失败啦┭┮﹏┭┮");
            }


        }
    }


}
