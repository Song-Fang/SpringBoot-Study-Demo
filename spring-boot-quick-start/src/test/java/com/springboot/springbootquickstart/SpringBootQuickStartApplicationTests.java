package com.springboot.springbootquickstart;

import com.springboot.springbootquickstart.bean.Person;
import com.springboot.springbootquickstart.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/*
Spring boot's Junit
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootQuickStartApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void contextLoads() {

        System.out.println(person);
        System.out.println("Hello World!");
    }

    @Test
    public void helloService(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }

}
