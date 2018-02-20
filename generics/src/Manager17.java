import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Manager17 
{
public static void main(String[] args) 
{

//	int[]<Integer> x={1,2,34};	
//	int[]<Integer> x=new int[12]<Integer>;	

List<Integer> list=new ArrayList<Integer>();
list.add(1);
list.add(2);
//list.add(true);
//list.add('c');
//list.add("abc");
List<String> list1=new ArrayList<String>();
list1.add("1");//its not in it is String!!!
list1.add("2");
list1.add("true");
list1.add("as");
list1.add("abc");
List<Integer> ll=new LinkedList<Integer>();
ll.add(1);
ll.add(2);
//list.add(true);
//list.add('c');
//list.add("abc");
List<Object> lo=new ArrayList<Object>();
lo.add(new Integer(19));
lo.add(new Boolean(true));
lo.add(new String("abc"));
lo.add("abc");
//lo=list1;
//List<Object> lk=new ArrayList<String>();
//List<Object> lk=(List<Object>)new ArrayList<Integer>();
//List<Object> lkk=new ArrayList<Boolean>();
//List<Object> lkkk=new ArrayList<Double>();
String s="abc";
Integer i=new Integer(10);
System.out.println(s instanceof Object);//true
System.out.println(i instanceof Object);//true
Object o=new Object();
String s1=(String)o;

}
}
