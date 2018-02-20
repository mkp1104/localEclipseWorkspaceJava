
class D<T>
{
String s1;
T s2;

}
public class Manager3 {
public static void main(String[] args) {
	
	D<String>d2=new D<String>();
	D<Integer>d1=new D<Integer>();
	D<Double>d3=new D<Double>();
	d1.s1="abc";
	
	d1.s2=100;
	d2.s2="xyz";
	d2.s1="abc";
	d3.s2=873.3;
	d3.s1="abc";
	System.out.println("done");
}
}
