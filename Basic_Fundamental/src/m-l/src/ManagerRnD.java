class R 
{
	void test1()
	{
	System.out.println("R-test()");
	}
	
}
class S extends R
{
	void test2()
	{
	System.out.println("S-test()");
	
	}
}
class ManagerRnD
{

	public static void main(String[] args) 
	{
		R r1=new S();
		r1.test1();
/*		r1.test();
		//S s1=new S();
		//s1.test1();
	//	s1.test2();
		R r2=new S();
		r2.test();
		r2.test();
		/*if (r2 instanceof S)
		{
			S s2=(S) r2;
			s2.test2();
	}
	*/
	
	System.out.println("done");
	}
}
