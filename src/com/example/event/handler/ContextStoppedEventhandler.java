package com.example.event.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextStoppedEventhandler implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
		System.out.println("ContextStoppedEvent is Receivde..!");
		System.out.println(contextStoppedEvent.getSource());
	}

}
