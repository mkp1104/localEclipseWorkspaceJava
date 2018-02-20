class L1
{
		static 
	{
	System.out.println("from L-SIB");
	}
}
class M1 extends L1
{
static int i;

 static 
	{
		System.out.println("from M-SIB");
	}
}
class Manager61
{

	public static void main(String[] args) 
	{
		System.out.println("-----");
		System.out.println(M1.i);//(L.i)
		System.out.println("-----");

	}
}
