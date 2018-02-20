package com.lara;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R1 
{
public static void find(String string,String pattern)
{
	Pattern pt=Pattern.compile(pattern);
	Matcher mt=pt.matcher(string);
	int count=0;
	while(mt.find())
	{
	
		System.out.println(pattern+" Found "+count+" time at "+mt.start()+" in "+string);
		count++;
	}
	System.out.println(pattern+" found in "+"'"+string+"'"+" "+count+" many times" );
}

}
