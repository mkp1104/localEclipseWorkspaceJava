class Manager2 
{	
public static void main(String args[])
	{
		Object obj=null;
		A a1=null;
		//A  a1;
		B b1=null;
		C c1=null;
		D d1=null;
		obj=new Object();
		a1=new A();
	  //a1=new A(); it's ok not CTE,because it's not uses of a1,if there is use of a1 then a1 must intialize first...
		 b1=new B();
		 c1=new C();
		 d1=new D();
		System.out.println("done");
//		System.out.println(a1.i); it's ok also just try it man....
	}
}

