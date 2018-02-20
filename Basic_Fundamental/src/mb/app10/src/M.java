package mb.app10.src;

class M 
{
	M(int i)
	{
	 System.out.printl("M(int)");
	}
	public static void main(String[] args) 
	{

		M m1=new M(10);
		System.out.println("-----");
		M m2=new M();
		System.out.println("-----");
	}
}
