package com.mkp.designPattern.DI.injector;


public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new EmailServiceImpl());
	}

}