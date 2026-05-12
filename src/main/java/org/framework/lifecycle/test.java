package org.framework.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("org/config/lifecycle.xml");
        context.registerShutdownHook();
        Cars cars = (Cars) context.getBean("cars");
        System.out.println(cars);
    }
}
