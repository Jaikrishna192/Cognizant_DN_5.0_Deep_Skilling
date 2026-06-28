package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.services.BookServices;

public class Main {

    public static void main(String[] args)
   {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServices service = context.getBean("bookService", BookServices.class);
        service.displayService();
    }
}