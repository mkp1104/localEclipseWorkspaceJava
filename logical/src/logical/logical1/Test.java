package logical.logical1;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class Test 
{
public static void main(String[] args) 
{
ArrayList pq=new ArrayList();
pq.add(12);
pq.add(23);
pq.add(234);
pq.add(66);
pq.add(9);
pq.add("abc");
Collections.sort(pq);

System.out.println(pq);
}
}
