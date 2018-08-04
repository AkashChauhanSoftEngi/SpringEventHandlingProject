# SpringEventHandlingProject
* These are the main five ways for Event Handling on ApplicationContext
	
>1. ContextRefreshedEvent
```text
This event is published when the ApplicationContext is either initialized or refreshed. This can also be raised using the refresh() method on the ConfigurableApplicationContext interface.
```

>2. ContextStartedEvent
```text
This event is published when the ApplicationContext is started using the start() method on the ConfigurableApplicationContext interface. You can poll your database or you can restart any stopped application after receiving this event.
```

>3. ContextStoppedEvent
```text
This event is published when the ApplicationContext is stopped using the stop() method on the ConfigurableApplicationContext interface. You can do required housekeep work after receiving this event.
```

>4. ContextClosedEvent
```text
This event is published when the ApplicationContext is closed using the close() method on the ConfigurableApplicationContext interface. A closed context reaches its end of life; it cannot be refreshed or restarted.
```

>5. RequestHandledEvent
```text
This is a web-specific event telling all beans that an HTTP request has been serviced.
```
