package mb.app10.src;

class Q
{
	Q()
	{
	this(10);
	System.out.println("Q()");
	}
	Q(int i)
	{
		this(10,12);
	System.out.println("Q(int)");
	}
	Q(int i,int j)
	{
	System.out.println("Q(int,int)");
	}
	public static void main(String[] args) 
	{
		Q q1=new Q();
		System.out.println("-------");
		Q q2=new Q(10,2);
		System.out.println("-------");
		Q q3=new Q(32);
		System.out.println("-------");
	}
}
