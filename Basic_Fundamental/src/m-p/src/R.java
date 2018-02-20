class Q 
{
	private static Q obj=null;
	static 
	{ 
	obj=new Q();
	}
	private Q()
	{
	System.out.println("Q()");
	}
	public static Q getObject()
	{
	return obj;
	}
}
	class R
	{
	
	public static void main(String[] args) 
	{
		//Q q1=new Q();
		Q q2=Q.getObject();
		Q q3=Q.getObject();
		Q q4=Q.getObject();
		Q q5=Q.getObject();
		Q q6=Q.getObject();
		System.out.println(q2);
		System.out.println(q3);
		System.out.println(q4);
	}
}
