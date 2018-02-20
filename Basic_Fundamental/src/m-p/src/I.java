class I 
{
	void test()
	{
	System.out.println("test:"+this);
	}
	public static void main(String[] args) 
	{
		I i1=new I();
		I i2=new I();
		System.out.println("main:"+i1);
		i1.test();
		System.out.println("-----");
		System.out.println("main:"+i2);
		i2.test();
	}
}
