class O 
{
	int i;
	void test1(O x)
	{
	x.i=i;
	}
	public static void main(String[] args) 
	{
		O o1=new O();
		O o2=new O();
		o1.i=10;
		o2.i=20;
		o1.test1(o2);
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println("----");
		o1.i=10;
		o2.i=20;
		o2.test1(o1);
		System.out.println(o1.i);
		System.out.println(o2.i);
		}
}
