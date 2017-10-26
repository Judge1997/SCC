package iocsample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAccount {

    public static void main(String[] args){
        ApplicationContext bf = new ClassPathXmlApplicationContext("/account.xml");
        ApplicationContext bf2 = new ClassPathXmlApplicationContext("/account.xml");
        BankAccount account = (BankAccount) bf.getBean("account");
        BankAccount account2 = (BankAccount) bf2.getBean("account");
        account2.deposit(500);
        System.out.println("Balance1: " + account.getBalance());
        System.out.println("Balance2: " + account2.getBalance());
    }

}
