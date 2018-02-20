package mb.app13.src;

class Q
{
	Q()
	{
	System.out.println("Q()");
	}
	{
	System.out.println("Q-IIB");
	}
}
class R extends Q
{
	R()
	{
System.out.println("R()");

}
{
System.out.println("R-IIB");
}
}
class S extends  R
{
S(int i)
	{
System.out.println("S(int)");
}
	{
	System.out.println("S-IIB");
	}  

	public static void main(String[] args) 
	{
		S s1=new S(32);
		System.out.println("-----");
		R rv=new R();
		System.out.println("-----");
		Q q1=new Q();
		System.out.println("-----");
	}
}
