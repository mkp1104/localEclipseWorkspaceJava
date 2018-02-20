class V<A>
{
A i;	
}
public class Manager14 
{
public static void test1(V<?> obj)
{	
}
public static void test2(V<? extends Number> obj)
{	
}
public static void test3(V<? extends P> obj)
{	
}
public static void test4(V<? super Number> obj)
{	
}

public static void main(String[] args) 
{
test1(new V<Integer>());	
test1(new V<Double>());	
test1(new V<String>());	
test1(new V<Object>());	
test1(new V<P>());	
test2(new V<Integer>());	
test2(new V<Number>());	
test2(new V<Double>());	
//test2(new V<Object>());	
//test2(new V<P>());	
test3(new V<P>());	
test3(new V<Q>());	
test3(new V<R>());	
test3(new V<S>());	
//test3(new V<Object>());
test4(new V<Object>());
test4(new V<Number>());
//test4(new V<Integer>());
//test4(new V<Double>());

System.out.println("Done");

}
}
