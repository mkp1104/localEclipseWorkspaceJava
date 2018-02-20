class P1
{
  void test1()
{
System.out.println("test-P");	
}
}
class R1 extends P1
{
 void test2()
{
System.out.println("test-R");	
}
}
public class Manager61
{
public static void main(String args[])
	{
	
	R1 r1=new R1();
	P1 p1=new P1();
	P1 p2=new R1();
//	r1.test1();
	p1.test1();
	p2.test1();
	//p2.test2();
	}
}