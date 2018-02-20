package logical.logical1;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.Collections;

public class Second_Highest_integer_array
{
public static void main(String[] args) 
{
int[] a={4,4,7,24,6,78,9,999,122}; 	
Arrays.sort(a);
System.out.println(Arrays.toString(a));
System.out.println(a[a.length-2]);
ArrayList list=new ArrayList();
//list.sort();
LinkedList llist=new LinkedList();
//llist.sort();
Collections.sort(llist);
HashSet hs=new HashSet();
//hs.sort();
//Collections.sort(hs);
Hashtable ht=new Hashtable();
//ht.sort();
//Collection.sort(ht);

}
}
