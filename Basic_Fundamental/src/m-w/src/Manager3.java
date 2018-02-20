@SuppressWarnings(value="deprecation")
class Manager3 
{
	
	public static void main(String[] args) 
	{
		Thread t1=new Thread();
		t1.stop();
		C c1=new C();
		c1.test1();
		System.out.println("Hello World!");
	}
}
