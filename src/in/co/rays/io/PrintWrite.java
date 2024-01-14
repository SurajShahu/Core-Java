package in.co.rays.io;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWrite {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("C:\\Users\\Suraj\\Desktop\\IO\\suraj.txt");
		pw.write("new content");
		System.out.println("done");
		pw.close();
	}
}
