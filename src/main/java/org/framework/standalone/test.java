package org.framework.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import sun.awt.AppContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/config/standalone.xml");
        Standalone standalone = (Standalone) context.getBean("standalone");
        System.out.println(standalone);
    }
}
