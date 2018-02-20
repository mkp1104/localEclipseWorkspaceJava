package com.mkp.dataStucture;


public class MyBubbleSort {
	  
    // logic to sort the elements
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        int count;
        for (int m = n; m >= 0; m--) {
        	count = 0;
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                count++;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            System.out.println("count: " + count);
            printNumbers(array);
        }
    }
  
    private static void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
  
    private static void printNumbers(int[] input) {
          
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
  
    public static void main(String[] args) {
//        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
    	 int[] input = { 5, 1, 12, -5, 16 };
    	bubble_srt(input);
  
    }
}