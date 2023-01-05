package test.dj.example;

import java.util.concurrent.TimeUnit;

public class ThreadTest {
    private int num=100;
    public void sell() throws InterruptedException {
        while(num>0){
            System.out.println(Thread.currentThread().getName()+"买票，票号为："+(num--));
            TimeUnit.SECONDS.sleep(1);
        }
    }
    public static void main(String[] args) {
        ThreadTest tt=new ThreadTest();
        for(int i=0;i<4;i++){
               new Thread(() -> {
                   try {
                       tt.sell();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }, "售票员" + String.valueOf((i))
               );
        }
    }
}
