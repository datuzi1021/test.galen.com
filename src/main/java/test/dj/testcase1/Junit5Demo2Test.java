package test.dj.testcase1;
import org.junit.jupiter.api.*;

@DisplayName("junit5展示类")
public class Junit5Demo2Test {
    @Test
    @DisplayName("test1展示方法")
    void  junitTest1(){
        System.out.println("-----demo1-----");
    }
    @Test
    @DisplayName("test2展示方法")
    @RepeatedTest(4)
     void junitTest2(){
        System.out.println("-----demo2-----");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("------beforeeache-----");
    }
    @AfterEach
     void afterEach(){
        System.out.println("------aftereach-------");
    }

}
