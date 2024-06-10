package pack1;


import org.testng.annotations.DataProvider;


public class logindataprovider extends xcel {
	
	@DataProvider(name="logindata")
	public String[][] getdata()
	{
			String [][] data=xcel.exceldata();
			System.out.println(data);
			return data;
	}
}
