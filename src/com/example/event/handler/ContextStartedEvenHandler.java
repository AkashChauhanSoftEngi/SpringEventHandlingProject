package com.example.event.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartedEvenHandler implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
		System.out.println("ContextStartedEvent is Received!");
		// ApplicationContext applicationContext =
		// contextStartedEvent.getApplicationContext();
		System.out.println(contextStartedEvent.getSource());
	}

}
