import java.io.*;

class Point implements Serializable
{
	int x , y;
	Point(int x , int y)
	{
		this.x = x;
		this.y = y;
	}
	void display()
	{
		System.out.println("x = "+x + " y = "+y);
	}
}
class ObjectStreamDemo 
{
	public static void main(String[] args) throws Exception
	{
		File file = new File("Object.txt");
		Point p = new Point(10,20);
		FileOutputStream out = new FileOutputStream(file);
		ObjectOutputStream obj = new ObjectOutputStream(out);
		obj.writeObject(p);
		FileInputStream in = new FileInputStream(file);
		ObjectInputStream inObj = new ObjectInputStream(in);
		Point p1 = (Point)inObj.readObject();
		p1.display();
		out.close();
		obj.close();

	}
}
