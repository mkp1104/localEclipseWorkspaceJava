package mb.app12.src;
class S
{
S()
	{
System.out.println("S()");
}
}
class U extends S
{
	U()
	{
	System.out.println("U()");
	}
}
class T extends U
{
	T()
	{
	System.out.println("T()");
	}
}



class V
{

	public static void main(String[] args) 
	{
		T obj=new T();
		System.out.println("------");
		U obj1=new U();
		System.out.println("------");
		S obj2=new S();
		System.out.println("------");
	}
}
