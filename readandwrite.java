package pack1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readandwrite {

	public static void main(String[] args) throws IOException {
		File a=new File("D:\\screen\\school\\a\\note");
		System.out.println(a.isFile());
/*		FileReader r=new FileReader(a);
		char[] rd=new char[10];
		r.read(rd);
		for(char read:rd)
		{
			System.out.print(read);
		}
	FileWriter a1=new FileWriter(a);
		a1.write("karthick29");
		//a1.write(12);
		a1.close();
	
		File[] files=a.listFiles();
		for(File f:files)
		{
			System.out.println(f);
		}
		String[] filesname=a.list();
		for(String f:filesname)
		{
			System.out.println(f);
		}*/
		




	}

}
