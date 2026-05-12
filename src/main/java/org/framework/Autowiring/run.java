package org.framework.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class run {
    public static void main(String[] args) {
        ApplicationContext con= new ClassPathXmlApplicationContext("org/config/autowire.xml");
        company c = (company) con.getBean("comp");
        System.out.println(c);
        company d = (company) con.getBean("trip");
        System.out.println(d);
    }
    }

