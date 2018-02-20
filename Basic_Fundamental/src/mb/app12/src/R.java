package mb.app12.src;
class P
{
P()
	{
 
 System.out.println("P()");
 
}
}
class Q extends P

{
	Q()
	{
super();

System.out.println("Q()");
	}


}


class R 
{
	public static void main(String[] args) 
	{
		Q obj1=new Q();
		System.out.println("------");
		P obj=new P();
		System.out.println("------");
	}
}
