package com.unit3.examples;
class InitialisationDemo 
{
	private int num1;
	private int num2 = 111;
	private char ch;
	private double num3;
	private String str;

	public void show()
	{
		System.out.println("Value of num1 :"+num1);
		System.out.println("Value of num2 :"+num2);
		System.out.println("Value of ch :"+ch);
		System.out.println("Value of num3 :"+num3);
		System.out.println("Value of str :"+str);
	}
	public static void main(String[] args) 
	{
		InitialisationDemo demo = new InitialisationDemo();
		demo.show();
	}
}
