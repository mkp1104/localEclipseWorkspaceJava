class G 
{
	class H
	{
	}
	static class I
	{
	}
	public static void main(String[] args) 
	{
		H h1=null;
		I i1=null;
		//h1=new H();
		h1=new G().new H();
		i1=new I();
		G g1=new G();
		System.out.println("done");
	}
}
