class U<A extends Object>
{
A i;	
}
public class Manager121
{
public static void main(String[] args) {
	U<Integer> u1=new U<Integer>();
	U<Double> u2=new U<Double>();
	U<String> u3=new U<String>();
	System.out.println("done");
}	
}