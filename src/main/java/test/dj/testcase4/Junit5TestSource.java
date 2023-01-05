package test.dj.testcase4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import java.util.stream.Stream;


class Junit5TestSource {
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void testValueSource1(int intParam){
        System.out.println("测试valueSource"+"    "+intParam);
       /* assertTrue(intParam>0);
        System.out.println();*/
    }
    @ParameterizedTest
    @ValueSource(strings = {"123","\t","\n"})
    void testValueSource2(String str){
        System.out.println("测试数据"+str);
    }
    @ParameterizedTest
    @MethodSource("strAndInt")
    void methodSource(int ints,String str){
        System.out.println(ints+"-"+str);
    }
    static Stream<Arguments> strAndInt(){
        return Stream.of(
                Arguments.arguments(1,"雪碧"),
                Arguments.arguments(2,"可乐")
        );
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/test.csv",numLinesToSkip = 0)
    void csvSource(int ints,String str){
        System.out.println(ints+"-"+str);
    }
}
