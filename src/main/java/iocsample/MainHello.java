package iocsample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHello {

    public static void main(String[] args){
        ApplicationContext bf = new ClassPathXmlApplicationContext("/hello.xml");
        Hello hello = (Hello) bf.getBean("hello");
        System.out.println(hello);
    }

}
