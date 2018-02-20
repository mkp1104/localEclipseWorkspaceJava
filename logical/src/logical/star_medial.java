package logical;

public class star_medial
{
public static void main(String[] args) 

{
	for(int i=1;i<=20;i++)
{
		System.out.print(" ");
if(i==10)
{
	System.out.print("*");
	while(i>0)
	{
System.out.println();
	for(int j=i-1;j<i+1;j++)
	{
		System.out.print("*");
		
	}
	i--;
	}


}


}

}
}
   