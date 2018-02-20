package com.mkp.designPattern.factory;

import com.mkp.designPattern.model.Computer;
import com.mkp.designPattern.model.PC;
import com.mkp.designPattern.model.Server;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
		
		return null;
	}
}