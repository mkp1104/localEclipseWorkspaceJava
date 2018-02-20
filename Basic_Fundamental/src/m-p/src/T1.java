 class DoubleTon
{
private static DoubleTon[]tons=new DoubleTon[2];
private static int index;
private DoubleTon()
	{

	}
	static
	{
	tons[0]=new DoubleTon();
	tons[1]=new DoubleTon();
	}
	public static DoubleTon getObject()
	{
	return tons[(index++)%2];
	}
}
	class T1
	{
	
 

	public static void main(String[] args) 
	{
	DoubleTon d1=DoubleTon.getObject();
	DoubleTon d2=DoubleTon.getObject();
	DoubleTon d3=DoubleTon.getObject();
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}