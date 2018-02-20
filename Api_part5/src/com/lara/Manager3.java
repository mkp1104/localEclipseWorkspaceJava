package com.lara;
import java.util.HashMap;
import java.util.TreeMap;
public class Manager3{
public static void main(String args[])
{

TreeMap map=new TreeMap();
//map.put(80,"abc");//here listen R.T.Exception happening Integer Class not InstanceOf String Class and Vice-Versa.
map.put("abc","abc");
map.put("xyz","abc");
//map.put(81,"abc");

System.out.println(map);

}
}
