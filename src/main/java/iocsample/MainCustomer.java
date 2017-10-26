package iocsample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCustomer {

    public static void main(String[] args){
        ApplicationContext bf = new ClassPathXmlApplicationContext("/customer.xml");
        Customer customer = (Customer) bf.getBean("customer");
        System.out.println("Customer Id: " + customer.getID());
        System.out.println("Customer Phone: " + customer.getPhone());
        System.out.println("Customer Address: " + customer.getAddress());
        System.out.println("Customer Balance: " + customer.getAccount().getBalance());
    }

}
