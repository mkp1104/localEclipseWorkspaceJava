package jdbc_app1;
interface T
{
Test test();	
}
public class Test implements T
{
public static void main(String[] args) 
{
T t=new T()
{
	public Test test()
	{
	return new Test();	
	}
	
};
T t1=t.test();
}
}
