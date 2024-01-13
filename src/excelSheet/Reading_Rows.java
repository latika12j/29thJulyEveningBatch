package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Reading_Rows 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\lenovo\\Desktop\\SAMPLE.xlsx");
		Workbook myworkbook = WorkbookFactory.create(myfile);
		Sheet mySheet = myworkbook.getSheet("Sheet1");
		
		//Reading data from the whole row
		System.out.println("Data in 0 Row is: ");
		for(int i=0;i<=3;i++)
		{
		String value = mySheet.getRow(0).getCell(i).getStringCellValue();
		System.out.print(value+" ");
		}
		System.out.println();
	}

}
