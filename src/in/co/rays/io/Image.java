package in.co.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Image {
	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("C:\\Users\\Suraj\\Desktop\\IO\\wallpaper.jpg");
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Suraj\\Desktop\\ION\\wall.jpg");
		int i=fi.read();
		while(i!=-1)
		{
			fo.write(i);
			i=fi.read();
		}
		fi.close();
		fo.close();
	}
	
}
