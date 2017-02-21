package com.alipay.zdal.test.shardfailover;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@RunWith(Suite.class)
@Suite.SuiteClasses({ 

//shard+failover

}
)

public class ZdalShardfailoverSuite {
	public static ApplicationContext context;
	
	@BeforeClass
	public static void beforeTestClass() {
		String[] springXmlPath = {
				"./shardfailover/spring-shardfailover-ds.xml" };
		context = new ClassPathXmlApplicationContext(springXmlPath);

	}
}
