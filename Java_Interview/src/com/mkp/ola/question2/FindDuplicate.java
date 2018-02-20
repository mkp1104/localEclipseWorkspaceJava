package com.mkp.ola.question2;

class FindDuplicate
{
    void printRepeating(int arr[], int size)
    {
        int i;  
        System.out.println("The repeating elements are : ");
    
        for (i = 0; i < size; i++)
        {
            if (arr[Math.abs(arr[i])] >= 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i]) + " ");
        }         
    } 
 
    /* Driver program to test the above function */
    public static void main(String[] args) 
    {
        FindDuplicate duplicate = new FindDuplicate();
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        duplicate.printRepeating(arr, arr_size);
    }
}
 
// This code has been contributed by Mayank Jaiswal
//Note: The above program doesn’t handle 0 case (If 0 is present in array). The program can be easily modified to handle that also. It is not handled to keep the code simple.
//with no extra space...
//Time Complexity: O(n)
//Auxiliary Space: O(1)