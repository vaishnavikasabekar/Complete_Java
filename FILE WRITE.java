import java.io.*;
class FILE WRITE
{
	public static void main(String[] args) throws IOException
	{
		String str="Hello this is a java book";
		FileWriter fw=new FileWriter("a.txt");
		for(int i=0;i<str.length();i++)
		{
			fw.write(str.charAt(i));
		}
		fw.close();
	}
}