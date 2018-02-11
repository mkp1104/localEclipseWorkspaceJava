package com.mkp.designPattern.NotDI;


public class MyApplication {
	private int z;//non static variable declaration and initialization.
	private static int m;//static variable declaration and initialization.
	private int x = 10;//non static variable declaration and initialization.
	private static int y = 20;//static variable declaration and initialization.
	private EmailService email = new EmailService();
	
	public void processMessages(String msg, String rec){
		//do some msg validation, manipulation logic etc
		this.email.sendEmail(msg, rec);
	}
}