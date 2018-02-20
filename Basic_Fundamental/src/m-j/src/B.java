class A
{
	void test1()
	{
	System.out.println("from A-test1");
	}
	void test2()
	{
		System.out.println("from A-test2");
	}
}
class B extends A
{
	void test3()
	{
	super.test1();
	super.test2();
	//this.test1(); compiler will check it 1st in current class if not available then it will go to the super class and find there..
	test1();
	//this.test2(); compiler will check it in the current class...
	test2();
	}
	void test2()
	{
	System.out.println("from B-test2");
	}
	public static void main(String []args)
	{
	B y=new B();
	y.test3();
	System.out.println("done");
	}
}