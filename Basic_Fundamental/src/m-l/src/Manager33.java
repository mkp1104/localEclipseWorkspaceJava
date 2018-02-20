class Manager33 
{
	static void test(Object obj)
	{
		if(obj instanceof A)
		{
	System.out.println("V can cast into A");
	A a1=(A)obj;
	}
	if(obj instanceof B)
		{
				System.out.println("V can Cast into B");
		B b1=(B) obj;
		}
		if(obj instanceof C)
		{
			System.out.println("V can cast into C");
C c1=(C) obj;
		}
		if(obj instanceof D )
		{
System.out.println("V can cast into D");
D d1=(D)obj;
		}
		System.out.println("----------");
	}	public static void main(String[] args) 
	{
		A a1=new A();
		A a2=new B();
		A a3=new C();
		A a4=new D();
		test(a1);
		test(a2);
		test(a3);
		test(a4);
		}
}
