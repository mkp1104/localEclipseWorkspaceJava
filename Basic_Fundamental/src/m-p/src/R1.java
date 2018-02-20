class Q1 
{
	 static Q1 obj=null;
	static 
	{ 
	obj=new Q1();
	}
	private Q1()
	{
	System.out.println("Q()");
	}
	public static Q1 getObject()
	{
	return obj;
	
	}
}
	class R1
	{
	
	public static void main(String[] args) 
	{
		//Q1 q1=new Q1();
//		Q1 q2=obj;
		Q1 q3=Q1.getObject();
		Q1 q4=Q1.getObject();
		Q1 q5=Q1.getObject();
		System.out.println(q3);

		System.out.println(q4);
	
		System.out.println(q5);
		
		System.out.println(Q1.obj);
		}
}
