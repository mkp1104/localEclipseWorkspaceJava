class N 
{
	
	static 
			{
				System.out.println("SIB-N");
			}
}
class O extends N
{
	static 
	{
	System.out.println("SIB-O");
	}
}
class P extends O
{
	{
		System.out.println("from P");
	}
	static
	{
	System.out.println("SIB-P");
	}
}