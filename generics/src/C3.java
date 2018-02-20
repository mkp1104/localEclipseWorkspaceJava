public class C3<X>
{
X i;

public static void main(String[] args) {
	
	C3<String>c1=new C3<String>();
	C3<Integer>c2=new C3<Integer>();
	C3<Double>c3=new C3<Double>();
	c1.i="abc";
	c2.i=282;
	c3.i=23.789;
	
	System.out.println("done");
}
}
