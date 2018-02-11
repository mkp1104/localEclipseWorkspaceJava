package com.mkp.designPattern.DI.injector;


public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}