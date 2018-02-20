class N1
{
	int j=890;
	final int i=10;
	{
	System.out.println("IIB");
	}
	public static void main(final String[] args) 
	{
		N1 n1=new N1();
		n1=new N1();
		n1.j=90;
		System.out.println("done");
		System.out.println(n1.j);
		System.out.println(n1.j);


			}
}
