package org.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpeEL {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpEL.xml");
        demo d1 = (demo) context.getBean("demo");
        System.out.println(d1);
    }
}
//SpelExpressionParser temp = new SpelExpressionParser();
//Expression expression = temp.parseExpression("10+20");