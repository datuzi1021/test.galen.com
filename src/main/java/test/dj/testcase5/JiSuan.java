package test.dj.testcase5;

public class JiSuan {
    public static int result=0;
    public static int add(int x,int y){
        result=x+y;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  result;
    }
    public static int sub(int x,int y)  {
       int result=x-y;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return result;
    }
    public static int mul(int x,int y){
        int result=x*y;
        return result;
    }
    public static int div(int x ,int y){
        int result=x/y;
        return result;
    }
    public  static int count(int x) throws InterruptedException {
        int i=result;
        Thread.sleep(1000);
        result=i+x;
        return result;
    }
    public synchronized static int sycount(int x) throws InterruptedException {
        int i=result;
        Thread.sleep(1000);
        result=i+x;
        return result;
    }
    public static void clean(){
        result=0;
        System.out.println("当前结果已清零");
    }

}
