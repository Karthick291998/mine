package pack1;

import org.testng.annotations.DataProvider;

public class dataprovider {
	@DataProvider(name="login",parallel=true,indices={0,1})
	public String[][] getdata()
	{
		String[][] data=new String[3][2];
		data[0][0]="karti0@gmail.com";
		data[0][1]="pass0";
		
		data[1][0]="karti1@gmail.com";
		data[1][1]="pass01";
		
		data[2][0]="karti2@gmail.com";
		data[2][1]="pass123";
		
		return data;
	}

}
