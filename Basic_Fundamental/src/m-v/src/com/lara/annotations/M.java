package com.lara.annotations;
@interface Ann2
{
public int countValue() ; 
public String someMessage() default "abc";
}


@Ann2(someMessage="dell",countValue=89)
class M
	{
		@Ann2(countValue=90,someMessage="hello")

		public static void main(String[] args) 
		{
			System.out.println("Hello World!");
	}
}