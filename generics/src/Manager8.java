class I<X>
{
X f1;
}
public class Manager8
{
	public static void main(String[] args)
{
		I obj1=new I();
obj1.f1=10;
		System.out.println(obj1.f1);
		System.out.println("-----");
		
obj1.f1=10.12;
		System.out.println(obj1.f1);

		System.out.println("-----");
		
obj1.f1="xyz";
	
		System.out.println(obj1.f1);

		System.out.println("-----");
obj1.f1=new Object();
		
		System.out.println(obj1.f1);

		System.out.println("-----");
obj1.f1=new Integer(10);
		
		System.out.println(obj1.f1);

		System.out.println("-----");
obj1.f1=new Double(10.9);
		
		System.out.println(obj1.f1);

		System.out.println("-----");
obj1.f1=new String("1233");
//obj1.f1=new String();
		
		System.out.println(obj1.f1);

		System.out.println("-----");
obj1.f1=new Manager();
		
		System.out.println(obj1.f1);
		System.out.println("-----");
		
		
		I<String>obj2=new I<String>();
obj1.f1=new Object();		
		System.out.println(obj1.f1);
		System.out.println("-----");
obj2.f1="abc";
	
		System.out.println(obj2.f1);
		
		System.out.println("done");
}
}
	

