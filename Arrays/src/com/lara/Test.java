package com.lara;

public class Test
{
public static void main(String[] args)
{
int[] data = new int[100];
for(int i=0;i< data.length;i++)
{
data[i]=5;
}


int total=0;
for(int i=1;i < data.length;i++)
{
total+=i;
}


System.out.println(total);
}
}