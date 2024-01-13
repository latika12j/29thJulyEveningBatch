package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	    //Create an object of FileInputStream class to read the excel file
		FileInputStream myfile=new FileInputStream("C:\\Users\\lenovo\\Desktop\\SAMPLE.xlsx");
		//Create an object of WorkbookFactory Class that refers to .xlxs file
		String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		//Printing Data fetched from excel file
		System.out.println("The data in 0 row and 0 coloumn is: "+value);
		
		FileInputStream myfile1=new FileInputStream("C:\\Users\\lenovo\\Desktop\\SAMPLE.xlsx");
		String value1 = WorkbookFactory.create(myfile1).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println("The data in 0 row and 1 coloumn is: "+value1);
		
		FileInputStream myfile2=new FileInputStream("C:\\Users\\lenovo\\Desktop\\SAMPLE.xlsx");
		String value2 = WorkbookFactory.create(myfile2).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		System.out.println("The data in 0 row and 2 coloumn is: "+value2);
		
		FileInputStream myfile3=new FileInputStream("C:\\Users\\lenovo\\Desktop\\SAMPLE.xlsx");
		String value3 = WorkbookFactory.create(myfile3).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println("The data in 1 row and 1 coloumn is: "+value3);


	}

}
