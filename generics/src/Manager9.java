interface J<A>
{
void test1(A a1);
A test2(A a1,int i);
}
class K implements J<String>
{
public void test1(String s1)
{
	
}
public String test2(String s1,int i)
{
	return s1;
}
}
class L implements J<Integer>
{
public void test1(Integer i)
{
	
}
public Integer test2(Integer i,int j)
{
return i;	
}
}
public class Manager9
{
	public static void main(String[] args)
{
		K k1=new K();
		L l1=new L();
	//	System.out.println(k1.test1("xyz")); void type is not Allowed Heere!!!!
		System.out.println(k1.test2("xyz",10));
		System.out.println("done");
	//	System.out.println(l1.test1(12));Void type is Not Allowed Here!!!!
		System.out.println(l1.test2(13,10));
		System.out.println("done");

}
}
	

