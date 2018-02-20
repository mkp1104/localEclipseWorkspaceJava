class O1 
{
	enum Test1
	{
	C1,C2,C3,C4;
	}
	public static void main(String[] args) 
	{
		Test1 t1=Test1.C2;
		Test1 t2=Test1.C4;
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.ordinal());
		System.out.println(t2.ordinal());
		int i=Test1.C3.ordinal();
		System.out.println(i);
		System.out.println(Test1.C3.ordinal());
	}
}
