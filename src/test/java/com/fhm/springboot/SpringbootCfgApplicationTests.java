package com.fhm.springboot;

import com.fhm.springboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCfgApplicationTests {

	@Autowired
	Person person;
	@Test
	public void contextLoads() {
		System.out.println(person);
	}

	@Autowired
	ApplicationContext ioc;

	@Test
	public void testBean(){
		Boolean b = ioc.containsBean("helloService");
		System.out.println(b);

	}

}
