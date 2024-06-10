package pack1;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xcel {
	public static String[][]  exceldata()
	{
		
		String filelocation="C:\\Users\\ELCOT\\eclipse-workspace\\test\\xcel\\dataprovid.xlsx";

			XSSFWorkbook workbook = null;
				try {
					workbook = new XSSFWorkbook(filelocation);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		XSSFSheet sheet=workbook.getSheetAt(0);
		int lastrow=sheet.getPhysicalNumberOfRows();
		int lastcell=sheet.getRow(0).getLastCellNum();
		String[][] xdata=new String[lastrow][lastcell];
		for(int i=1;i<lastrow;i++)
		{
				XSSFRow row=sheet.getRow(i);
			
			for(int j=0;j<lastcell;j++)
			{
				XSSFCell cell=row.getCell(j);
				DataFormatter df=new DataFormatter();
				String str=df.formatCellValue(cell);
				xdata[i-1][j]=str;
				//System.out.println(str);
			}
		}
		return xdata;
	}

}
