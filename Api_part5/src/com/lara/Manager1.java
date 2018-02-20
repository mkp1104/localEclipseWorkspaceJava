package com.lara;
import java.util.HashMap;
import java.util.TreeMap;
public class Manager1 {
public static void main(String args[])
{
HashMap map=new HashMap();
map.put("key",2000);
map.put("abc",2300);
map.put("hello",2050);
map.put("done",9090);
map.put("check",9093);
map.put("test",9190);
map.put("java",9091);
System.out.println(map);
//TreeMap map1=new TreeMap(map);
TreeMap map1=new TreeMap();
map1.put("key",2000);
map1.put("abc",2300);
map1.put("hello",2050);
map1.put("done",9090);
map1.put("check",9093);
map1.put("test",9190);
map1.put("java",9091);
System.out.println(map1);
}
}
