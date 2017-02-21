package com.alipay.zdal.test.client;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RunWith(Suite.class)
@Suite.SuiteClasses( {
//client

})
public class ZdalClientSuite {

    public static ApplicationContext context;

    @BeforeClass
    public static void beforeTestClass() {
        String[] springXmlPath = { "./client/spring-client-ds.xml" };
        context = new ClassPathXmlApplicationContext(springXmlPath);

    }

}
