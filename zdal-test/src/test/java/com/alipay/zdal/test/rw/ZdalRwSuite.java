package com.alipay.zdal.test.rw;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RunWith(Suite.class)
@Suite.SuiteClasses( {

                      //rw


}

)
public class ZdalRwSuite {

    public static ApplicationContext context;

    @BeforeClass
    public static void beforeTestClass() {
        String[] springXmlPath = { "./rw/spring-rw-ds.xml" };
        context = new ClassPathXmlApplicationContext(springXmlPath);
    }

}
