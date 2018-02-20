
/* Standard interface defined in java.lang
public interface CharSequence			
{
	char charAt(int index);
	int length();
	CharSequence subSequence(int start, int end);
	String toString();
}*/
package com.unit4.examples;
class MyCharSequence implements CharSequence
{
	private char[] charArr = new char[100];
	private int numOfChars = 0;
	
	MyCharSequence(String str)
	{
		for(int i=0;i<str.length();i++)
			charArr[numOfChars++] = str.charAt(i);
	}

	public char charAt(int index)
	{
		char retChar=' ';

		if(index<0 || index>=charArr.length)
		{
			System.out.println("Invalid Index");
			System.exit(1);
		}
		else
			retChar = charArr[index];
		return retChar;
	}

	public int length()
	{
		return numOfChars;
	}

	public CharSequence subSequence(int start, int end)
	{
		String str = "";

		if(start<0 || end >=numOfChars)
		{
			System.out.println("Invalid range");
			System.exit(1);
		}
		else
			for(int i=start;i<end;i++)
				str = str + charArr[i];
		return str;
	}

	public String toString()
	{
		String str = "";
		for(int i=0;i<numOfChars;i++)
			str = str + charArr[i];
		return str;
	}
}

class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		CharSequence cs = new MyCharSequence("JavaProgramming");
		System.out.println("Char at position 1 is : " + cs.charAt(1));
		System.out.println("Length is : " + cs.length());
		System.out.println("Sub sequence from 7 to 11 : " + cs.subSequence(7,11));
		System.out.println("String representation : " + cs.toString());
	}
}
