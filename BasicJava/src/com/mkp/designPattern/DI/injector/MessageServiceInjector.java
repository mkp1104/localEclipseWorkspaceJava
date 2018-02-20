package com.mkp.designPattern.DI.injector;

import com.mkp.designPattern.DI.consumer.Consumer;

public interface MessageServiceInjector {

	public Consumer getConsumer();
}