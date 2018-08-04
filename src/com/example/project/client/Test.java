package com.example.project.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.project.model.Message;abstract

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctc = new ClassPathXmlApplicationContext("Beans.xml");
		ctc.start();
		System.out.println("----------------------------------");
		
		Message message = ctc.getBean("message",Message.class);
		System.out.println(message.getMessageId() + ", " + message.getMessage());
		
		System.out.println("----------------------------------");
		ctc.refresh();
		System.out.println("----------------------------------");
		ctc.stop();
		System.out.println("----------------------------------");
		ctc.close();
	}
}
