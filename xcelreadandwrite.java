package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xcelreadandwrite {

	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\ELCOT\\eclipse-workspace\\test\\xcel\\homework.xlsx");
		FileInputStream s1=new FileInputStream(f1);
		XSSFWorkbook w=new XSSFWorkbook(s1);
		XSSFSheet sheet1=w.getSheet("sheet1");
		int rowsize=sheet1.getPhysicalNumberOfRows();
		//System.out.println(rowsize);
		for(int i=0;i<rowsize;i++)
		{
			XSSFRow r=sheet1.getRow(i);
			int colsize=r.getPhysicalNumberOfCells();
			//System.out.println(colsize);
			for(int j=0;j<colsize;j++)
			{
				XSSFCell c=r.getCell(j);
				DataFormatter df=new DataFormatter();
				
				System.out.println(c.getCellType());
				if(c.getCellType()==0)
				{
				String str=df.formatCellValue(c);
				System.out.println(str);
				}
				else 
				{
					Date d=c.getDateCellValue();
					SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
					String value=sd.format(d);
					System.out.println(value);
				}
				
			}
		}

	}

}
