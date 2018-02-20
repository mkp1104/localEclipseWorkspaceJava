class Get_Setter
{
	private  int i;
//	private  int j;
	public void setter(int k)
{
	 i=k;
	
}
 public int getter()
 {
	 return i;
	 
 }
}
public class P3
{
public static void main(String[] args) {
	
	Get_Setter gs=new Get_Setter();
	gs.setter(12);
	System.out.println(gs.getter());
}	
}

