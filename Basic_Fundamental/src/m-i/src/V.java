class U
{
	void test()
	{
		System.out.println("from U");
	}

}
class V extends U

{
void test()
	{
				System.out.println("from V");
	}
	public static void main(String []args)
	{
	V obj=new V();
	obj.test();
	}
}