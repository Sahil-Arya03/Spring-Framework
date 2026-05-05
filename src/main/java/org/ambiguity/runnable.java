package org.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class runnable {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ambiguity.xml");
       Addition a = (Addition) context.getBean("add");
       a.getResult();
    }
}
