package com.mkp.ola.question7.method3;

//public class Fibonacci {
//
//}
//Java program for Fibonacci Series using Space
//Optimized Method
//nth Fibonacci number.
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
//Method 3 ( Space Optimized Method 2 )
//We can optimize the space used in method 2 by storing the previous two numbers only because that is all we
//need to get the next Fibonacci number in series.
class Fibonacci
{
 static int fib(int n)
 {
     int a = 0, b = 1, c;
     if (n == 0)
         return a;
     for (int i = 2; i <= n; i++)
     {
         c = a + b;
         a = b;
         b = c;
     }
     return b;
 }

 public static void main (String args[])
 {
     int n = 2;
     System.out.println(fib(n));
 }
}

//This code is contributed by Mihir Joshi
//Time Complexity: O(n)
//Extra Space: O(1)
