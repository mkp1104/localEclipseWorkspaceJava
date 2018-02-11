package com.mkp.designPattern.DI.injector;

import com.mkp.designPattern.DI.consumer.Consumer;
import com.mkp.designPattern.DI.consumer.MyDIApplication;
import com.mkp.designPattern.DI.services.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}