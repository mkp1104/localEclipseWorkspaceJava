package mb.app10.src;

class S 
{
	S()
	{
	System.out.println("S()");
	}
	S(int i)
	{
	S();

	System.out.println("S(int)");
	
	}
	public static void main(String[] args) 
	{
		S s1=new S();
		System.out.println("----");
		S s2=new S(10);
		System.out.println("----");
	}
}
