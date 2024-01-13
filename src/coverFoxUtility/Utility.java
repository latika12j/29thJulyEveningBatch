package coverFoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Utility 
{
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
	Reporter.log("Reading data from ExcelSheet", true);

	FileInputStream myfile= new FileInputStream("C:\\Users\\lenovo\\Desktop\\coverfox.xlsx");

	org.apache.poi.ss.usermodel.Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");

	String data = mysheet.getRow(row).getCell(cell).getStringCellValue();
	
	return data;
	}
	
	public static void takeScreenShot(WebDriver driver,String TCID) throws IOException
	{
	Reporter.log("Taking screenshot", true);
	
	String timeStamp= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\lenovo\\Desktop\\images\\coverFox"+TCID+"_"+timeStamp+".png");
	
	Reporter.log("Saved screenshot at "+dest, true);
	
	org.openqa.selenium.io.FileHandler.copy(src, dest);
	}
}
