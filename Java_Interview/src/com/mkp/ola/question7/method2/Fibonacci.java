package com.mkp.ola.question7.method2;

//Fibonacci Series using Dynamic Programming
//nth Fibonacci number.
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
//Method 2 ( Use Dynamic Programming )
//We can avoid the repeated work done is the method 1 by 
//storing the Fibonacci numbers calculated so far.
class Fibonacci
{
static int fib(int n)
 {
     /* Declare an array to store Fibonacci numbers. */
 int f[] = new int[n+1];
 int i;
   
 /* 0th and 1st number of the series are 0 and 1*/
 f[0] = 0;
 f[1] = 1;
 System.out.print(f[0]+","+f[1]+",");
 for (i = 2; i <= n; i++)
 {
    /* Add the previous 2 numbers in the series
      and store it */
     f[i] = f[i-1] + f[i-2];
     System.out.print(f[i]+",");
 }
   
 return f[n];
 }
   
 public static void main (String args[])
 {
     int n = 9;
     System.out.println(fib(n));
 }
}
/* This code is contributed by Rajat Mishra */
//Time Complexity: O(n)
//Extra Space: O(n)
