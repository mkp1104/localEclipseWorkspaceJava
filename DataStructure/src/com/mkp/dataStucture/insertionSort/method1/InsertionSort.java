package com.mkp.dataStucture.insertionSort.method1;

//Java program for implementation of Insertion Sort
public class InsertionSort
{
 /*Function to sort array using insertion sort*/
 void sort(int arr[])
 {
	 int count = 0;// kept for auditing
     int n = arr.length;
     for (int i=1; i<n; ++i)
     {
//    	 int arr[] = {12, 11, 13, 5, 6};
         int key = arr[i];//11,13,5,6
         int j = i-1;//0,1,2,3,4

         /* Move elements of arr[0..i-1], that are
            greater than key, to one position ahead
            of their current position */
         while (j>=0 && arr[j] > key)//12>11,12>13,13>5,11>13,12>11
         {
             arr[j+1] = arr[j];//11->12,5->13,11->12
             j = j-1;//-1,1,
             count++; // kept for auditing 
         }
         System.out.println("count: "+count+" after while loop execution");
         count = 0;// kept for auditing
         arr[j+1] = key;
         for (int k : arr) {// kept for auditing
			System.out.print(k+":");// kept for auditing
		}// kept for auditing
         System.out.println();// kept for auditing
         
     }
 }

 /* A utility function to print array of size n*/
 static void printArray(int arr[])
 {
     int n = arr.length;
     for (int i=0; i<n; ++i)
         System.out.print(arr[i] + " ");

     System.out.println();
 }

 // Driver method
 public static void main(String args[])
 {        
     int arr[] = {12, 11, 13, 5, 6};
     for (int i : arr) {// kept for auditing
 		System.out.print(i+",");// kept for auditing
 	}// kept for auditing
     InsertionSort ob = new InsertionSort(); 
     System.out.println();// kept for auditing
     ob.sort(arr);
      System.out.println();// kept for auditing
      
     printArray(arr);
 }
} /* This code is contributed by Rajat Mishra. */