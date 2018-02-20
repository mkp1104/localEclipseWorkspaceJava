package mb.app12.src;
class L
{
	L()
	{
	System.out.println("L()");
	}
}
class M extends L
{
	M()
	{
		System.out.println("M()");
	}
}
class N extends M
{
	N()
	{
	System.out.println("N()");
	}
}
class O
{

	
	public static void main(String[] args) 
	{
			L obj=new L();
			System.out.println("----");
			M obj1=new M();
			System.out.println("----");
			N obj2=new N();
			System.out.println("----");
	}
}
