class R1 
{
	void test1()
	{
	System.out.println("R-test1()");
	}
}
class S1 extends R1
{
	void test2()
	{
	System.out.println("s-test2()");
	
	}
}

class T1 extends S1
{
	void test3()
	{
	System.out.println("T-test3()");
	}
}
class ManagerRnD1
{

	public static void main(String[] args) 
	{
		R1 r1=new S1();
		r1.test1();
		//r1.test2();
		S1 s1=(S1)r1;
		s1.test1();
		s1.test2();
		T1 t1=(T1)r1;
	//	r2.test1();
		//r2.test2();
		//if (r2 instanceof S)
	//	{
	//		S s2=(S) r2;
	//		s2.test2();
	//	}
		//if ()
	//	{
	//	}
		System.out.println("done");
	}
}
