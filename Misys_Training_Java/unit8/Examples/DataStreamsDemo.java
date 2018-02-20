import java.io.*;

class DataStreamsDemo 
{
	public static void main(String[] args) throws Exception
	{
		File file = new File("DataStreams.txt");
		FileInputStream in = new FileInputStream(file);
		FileOutputStream out = new FileOutputStream(file);	
		DataInputStream din = new DataInputStream(in);
		DataOutputStream dout = new DataOutputStream(out);

		for(int i=0 ; i<10 ; ++i)
		{
			dout.writeInt(i);
			dout.writeChar(',');
			dout.writeDouble(Math.sqrt(i));
			dout.writeByte(10);
		}
		dout.flush();
		for(int i=0 ; i<10 ; ++i)
		{
			System.out.print(din.readInt());
			System.out.print(din.readChar());
			System.out.print(din.readDouble());
			System.out.write(din.readByte());
		}
	}
}
