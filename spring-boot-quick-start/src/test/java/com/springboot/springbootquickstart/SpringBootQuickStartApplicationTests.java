package com.springboot.springbootquickstart;

import com.springboot.springbootquickstart.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
Spring boot's Junit
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootQuickStartApplicationTests {

    @Autowired
    Person person;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
