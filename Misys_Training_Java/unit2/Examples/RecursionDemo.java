
public class RecursionDemo {

	static int total;
	public static int triple(int n)
    {
        if (n == 0)
            return 0;
        else
            total = 3 + triple(n-1);
    System.out.println(total);
    return total;
    }
	
	
	
	public static void main(String[] args) {
		triple(5);

	}

}
