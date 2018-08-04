package com.example.event.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ContextClosedEventHandler implements ApplicationListener<ContextClosedEvent> {

	@Override
	public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
		System.out.println("ContextClosedEvent is Received..!");
		System.out.println(contextClosedEvent.getSource());
	}

}
