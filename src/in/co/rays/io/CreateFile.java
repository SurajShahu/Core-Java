package in.co.rays.io;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Suraj\\Desktop\\IO\\suraj.txt");
		if(f.createNewFile())
		{
			System.out.println("File created");
		}
		else {
			System.out.println("File is already exist");
		}
	}
}
