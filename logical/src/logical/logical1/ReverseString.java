package logical.logical1;

import java.util.Scanner;

public class ReverseString {
private StringBuilder output;
private char[] charA;
private int length;

//private char reverse(int length){
//	if(length > 0){
//		output.append(charA[length]);
//		length = length-1;
//	//	output.append(reverse(length--));
////		length = length-1;
//		return reverse(length);
//	}else{
//		output.append(charA[length]);
//		return charA[0];
//	}
//	
//}

//private void reverse(int length){
//	if(length > 0){
//		output.append(charA[length]);
//		length = length-1;
//		reverse(length);
////		return output;
//	}else{
//		output.append(charA[length]);
////		return output;
//	}
//	
//}

private void reverse(){
	if(length > 0){
		output.append(charA[length--]);
		reverse();
	}else{
		output.append(charA[length]);
	}
}


public static void main(String[] args) {
	System.out.println("Please Enter String to Reverse... ");
	Scanner sc = new Scanner(System.in);
	String input = sc.next();
	
	ReverseString revString = new ReverseString();
	revString.charA = input.toCharArray();
	revString.output = new StringBuilder();
	revString.length = revString.charA.length-1;
//	revString.reverse(revString.length);
	revString.reverse();
	System.out.println("Reversed String: " + revString.output);
}
}
