package test.dj.testcase1;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
/*@SelectPackages({
        "test.dj.testcase3" , "test.dj.testcase2"//执行包下面的所有类
})
@IncludePackages({
        "test.dj.testcase3"
})*/
@SelectClasses({
        Junit5Demo.class
})
@IncludeTags({
    "testdemo","uatdemo"
})

public class Junit5SuitDemo1 {

}

