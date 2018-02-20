import java.util.ArrayList;
@SuppressWarnings({"unchecked","deprecation"})
class  Manager5
{

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add(90);	
		list.add(90);
		Thread t1=new Thread();
		t1.stop();
		C c1=new C();
		c1.test1();
		System.out.println("Hello World!");
	}
}
