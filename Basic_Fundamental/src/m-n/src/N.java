class N
{
	N()
	{
	System.out.println("N()");
	}
	final int i=10;
	public static void main(final String[] args) 
	{
		N n1=new N();
		n1=new N();
		n1.i=90;
		System.out.println("done");


			}
}
