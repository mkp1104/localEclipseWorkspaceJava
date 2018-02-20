package com.mkp.ola.question7.method1;

//Fibonacci Series using Recursion.
//nth Fibonacci number.
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
//Method 1 ( Use recursion ) 
//A simple method that is a direct recursive implementation mathematical recurrence relation given above.
class Fibonacci
{
    static int fib(int n)
    {
    	System.out.print(n + ",");
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
      
    public static void main (String args[])
    {
    int n = 4;
    System.out.println(fib(n));
    }
}
/* This code is contributed by Rajat Mishra */
//Extra Space: O(n) if we consider the function call 
//stack size, otherwise O(1).