package org.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
    public static void main(String[] args) {
        ApplicationContext con = new AnnotationConfigApplicationContext(configjava.class);

            zoom zoomBean = con.getBean("zoom", zoom.class);
            System.out.println(zoomBean);
        }
    }

