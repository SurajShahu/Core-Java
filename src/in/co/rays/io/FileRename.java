package in.co.rays.io;

import java.io.File;

public class FileRename {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\Suraj\\Desktop\\IO\\suraj.txt");
		File f1=new File("C:\\Users\\Suraj\\Desktop\\IO\\surajsahu.txt");
		if(f.exists())
		{
			f.renameTo(f1);
		}
		else
		{
			System.out.println("File not found");
		}
	}
}
