package in.co.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadByLine {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\Suraj\\Desktop\\IO\\hello.txt");
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
		while (s!=null) {
			System.out.println(s);
			s=br.readLine();
		}
		br.close();
		fr.close();
	}
}
