package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Reading_Columns 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\lenovo\\Desktop\\SAMPLE.xlsx");
		Workbook myworkbook = WorkbookFactory.create(myfile);
		Sheet mySheet = myworkbook.getSheet("Sheet1");
		
		//Reading data from the whole coloumn
		System.out.println("Data in 0 Coloumn is: ");
		for(int i=0;i<=2;i++)
		{
		String value = mySheet.getRow(i).getCell(0).getStringCellValue();
		System.out.print(value+" ");
		}
		System.out.println();
		
		System.out.println("Data in 1 Coloumn is: ");
		for(int i=0;i<=2;i++)
		{
		String value1 = mySheet.getRow(i).getCell(1).getStringCellValue();
		System.out.print(value1+" ");
		}
	}

}
