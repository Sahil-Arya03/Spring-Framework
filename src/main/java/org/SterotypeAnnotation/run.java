package org.SterotypeAnnotation;

import org.springframework.context.ApplicationContext;

public class run {
    public static void main(String[] args) {
        ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("SterotypeAnnotation.xml");
        Amnex amnex = (Amnex) context.getBean("amnex");
        System.out.println(amnex);
    }
}
