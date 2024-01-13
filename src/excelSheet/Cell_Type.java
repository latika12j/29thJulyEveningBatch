package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Cell_Type 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\lenovo\\Desktop\\SAMPLE.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		int totalrows = mysheet.getLastRowNum();
		short totalcells = mysheet.getRow(0).getLastCellNum();
		int totalnoofcells = totalcells-1;
		for(int i = 0;i<=totalrows;i++)
		{
			for(int j=0;j<=)
		}
		
			
		
		
     }

}
