package com.lara;
import java.lang.reflect.Modifier;
abstract class E
{
}
final class F
{
}
class G extends E
{
}
public class Manager4
{

	public static void main(String[] args) throws Exception 
	{

		Class c1=Class.forName("com.lara.E");
		Class c2=Class.forName("com.lara.F");
		Class c3=Class.forName("com.lara.G");
System.out.println(":"+Modifier.toString(c1.getModifiers()));
System.out.println(":"+Modifier.toString(c2.getModifiers()));
System.out.println(":"+Modifier.toString(c3.getModifiers()));
//System.out.println(":"+Modifier.toString(c3.getName()));
System.out.println("--------");
System.out.println(c1.getSuperclass());
System.out.println(c2.getSuperclass());
System.out.println(c3.getSuperclass());
}
}
