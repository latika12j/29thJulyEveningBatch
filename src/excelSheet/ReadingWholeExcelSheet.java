package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingWholeExcelSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\lenovo\\Desktop\\SAMPLE.xlsx");
		Workbook myworkbook = WorkbookFactory.create(myfile);
		Sheet mySheet = myworkbook.getSheet("Sheet1");
		System.out.println("Data from the whole Excel sheet is: ");
		for(int i=0;i<=2;i++)
		{			
			for(int j=0;j<=2;j++)
			{
				String value =mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();

		}
		
	}

}
