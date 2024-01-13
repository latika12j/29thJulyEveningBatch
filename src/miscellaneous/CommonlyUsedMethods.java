package miscellaneous;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;


public class CommonlyUsedMethods 
{
	public static void takeScreenshot(WebDriver driver,String filename) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\sc\\"+filename+".png");
		FileHandler.copy(src, dest);
	}
	public static void scrollIntoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		implicitWait(driver, 10);
		js.executeScript("arguments[0].scrollIntoView();",element );
	}
	public static void implicitWait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public static String readDataFromExcel(String SheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		Reporter.log("Reading Data From Excel Sheet",true);
		FileInputStream myfile=new FileInputStream("C:\\Users\\lenovo\\Desktop\\coverfox.xlsx");
		org.apache.poi.ss.usermodel.Sheet mysheet=WorkbookFactory.create(myfile).getSheet("Sheet1");
	    String data = mysheet.getRow(row).getCell(cell).getStringCellValue();
	    return data;		
	}
	
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		//Create Object of Properties Class
		Properties prop=new Properties();
		//File Location
		FileInputStream myfile=new FileInputStream(System.getProperty("user.dir")+"//CoverFoxData.properties");
		//load file
		prop.load(myfile);
		//pass the Key for the data we want
		String value=prop.getProperty(key);
		return value;	
		
	}
	
	/*public static void takeScreenShot(WebDriver driver,String TCID) throws IOException
	{
		Reporter.log("Taking Scrrenshot",true);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\SC\\coverfox"+TCID+""+".png");
		FileHandler.copy(src, dest);
	}
	*/

}
