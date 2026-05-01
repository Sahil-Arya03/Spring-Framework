package org.example;

import org.Springcore.Emp;
import org.Springcore.Student;
import org.refstest.A;
import org.refstest.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // classic injection
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Student s = context.getBean("Student", Student.class);
        System.out.println(s);
        Student q = context.getBean("Student2", Student.class);
        System.out.println(q);
        Student d = context.getBean("Student3", Student.class);
        System.out.println(d);
        // injecting collection type
        ApplicationContext rek = new ClassPathXmlApplicationContext("testconfig.xml");
        Emp k  = rek.getBean("Emp", Emp.class);
        System.out.println(k);
        //injecting reference type
        ApplicationContext con = new ClassPathXmlApplicationContext("reftestconfig.xml");
        A a = (A) con.getBean("a", A.class);
        System.out.println(a);

    }
}
