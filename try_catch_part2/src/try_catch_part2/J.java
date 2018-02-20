package try_catch_part2;
import java.util.Scanner;
public class J {
public static void main(String[] args) {
	System.out.println("Please enter your Age");
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	if(age<=0)
	{
		throw new AgeIsNegative("Age Should be +ve");
		
	}
	System.out.println("your age is ="+age);
}
}
