class R1 
{
	enum En
	{
	c1,c2,c3,c4;
	}
}
class S1
{

	public static void main(String[] args) 
	{
		R1 e1=R1.En.c4;
		 R1 e2=R1.En.c2;
		System.out.println(e1);
		System.out.println(e2);
	}
}
