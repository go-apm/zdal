package com.alipay.zdal.test.shardrw;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@RunWith(Suite.class)
@Suite.SuiteClasses({ 
//shard+rw
	


}
)
public class ZdalShardrwSuite {
  
	public static ApplicationContext context;

	@BeforeClass
	public static void beforeTestClass() {
		String[] springXmlPath = {  "./shardrw/spring-shardrw-ds.xml" };
		context = new ClassPathXmlApplicationContext(springXmlPath);
		
	}
}
