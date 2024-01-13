package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet_1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\lenovo\\Desktop\\SAMPLE.xlsx");
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		Sheet mysheet = myWorkbook.getSheet("Sheet1");
		int lastrownum = mysheet.getLastRowNum();
		int totalnoofrows = lastrownum;
		
		short lastcellnum = mysheet.getRow(0).getLastCellNum();
		int totalnumofcells = lastcellnum-1;
		for(int i=0;i<=totalnoofrows;i++)
		{
			for(int j=0;j<=totalnumofcells;j++)
			{
				String value = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
		System.out.println();
		}
		System.out.println("======================");
		
	}

}
