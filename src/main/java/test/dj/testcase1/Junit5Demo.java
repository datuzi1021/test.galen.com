package test.dj.testcase1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@DisplayName("Junit5Demo类")
public class Junit5Demo {
    @Test
    @DisplayName("test1")
    @Tag("testdemo")
    void test1() {
        System.out.println("test1");
    }
    @Test
    @DisplayName("test2")
    @Tag("uatdeom")
    void test2(){
        System.out.println("test2");
    }
    @Tag("intdemo")
    @Test
    @DisplayName("test3")
    void test3(){
        System.out.println("test3");
    }
    @Tag("testdeom")
    void test4(){
        System.out.println("test4");
    }
}
