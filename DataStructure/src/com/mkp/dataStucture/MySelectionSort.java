package com.mkp.dataStucture.insertionSort.method1;


public class MySelectionSort {
	 
    public static int[] doSelectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[index] > arr[j]) {
                    index = j;
                }
//    int[] arr1 = {2,34,56,7,67,10,88,42};
//      swapping the values using temporary variable.           
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            }
            for (int i1 : arr) {
           	 System.out.print(i1 + ",");
   		}
          System.out.println();
        }
       
        return arr;
    }
     
    public static void main(String a[]){
         
        int[] arr1 = {2,34,56,7,67,10,88,42};
        int[] arr2 = doSelectionSort(arr1);
        System.out.println();
        System.out.print("[");
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.print("]");
    }
}