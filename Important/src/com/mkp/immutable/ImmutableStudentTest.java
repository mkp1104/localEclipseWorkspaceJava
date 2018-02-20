package com.mkp.immutable;

//Driver class
public class ImmutableStudentTest
{
//An immutable class, all the wrapper classes 
//(like String, Boolean, Byte, Short) and String class is immutable.
public static void main(String args[])
{
	ImmutableStudent s = new ImmutableStudent("ABC", 101);
   System.out.println(s.name);
//   ors
   System.out.println(s.getName());
   System.out.println(s.regNo);
   String str = new String("abc");
   ImmutableStudent s1 = new ImmutableStudent("XYZ", 101);
   String str1 = new String("xyz");

//   str.set
   System.out.println(str.getBytes());

   // Uncommenting below line causes error
//    s.regNo = 102;
}
}
