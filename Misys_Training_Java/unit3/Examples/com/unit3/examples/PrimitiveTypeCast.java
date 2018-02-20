package com.unit3.examples;
class PrimitiveTypeCast 
{
	public static void main(String[] args) 
	{
		int num1  = 111;
		short num2 = 222;
		double num3 = 111.11;
		char ch = 'c';
		boolean flag = true;
		
		//implicit type casting
		//short to int  
		num1 = num2;

		//int to double
		num3 = num1;
		
		//char to int
		num1 = ch;

		//explicit type casting
		//double to int
		int num4 = (int)1000.11;
		
		//error boolean cannot be cast
		//flag = (boolean)100;
		//flag = 'c';
	}
}
