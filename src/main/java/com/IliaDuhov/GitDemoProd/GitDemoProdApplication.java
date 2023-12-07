package com.IliaDuhov.GitDemoProd;

import com.IliaDuhov.GitDemoProd.Quouters.Quoter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class GitDemoProdApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Hello, GIT!!!");
		context.getBean(Quoter.class).sayQuote();
	}

}
