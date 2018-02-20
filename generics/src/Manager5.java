
class F<Test>
{
	void method(Test i)
	{
		System.out.println("method1:"+i);
		
	}
}
public class Manager5 {
public static void main(String[] args) {
	
	F<String>f1=new F<String>();
	F<Integer>f2=new F<Integer>();
	f1.method("abc");
	f2.method(100);
	System.out.println("done");
}
}