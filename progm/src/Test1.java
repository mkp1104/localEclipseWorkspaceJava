class G
{
int j=12;;
}
class E
{
String  s="Class E";	
}
public class Test1 
{
	public static void main(String[] args) {
		
	
G g=new G();
E e=new E();
Object obj=g;
Object obj1=e;
//G g1=(G)obj1;
//System.out.println(g1.j);
//E e1=(E)obj;
//System.out.println(e1.s);
E e2=(E)obj1;
System.out.println(e2.s);
}
}
