package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FBDataProvider 
{
 @DataProvider(name = "FBRegression")
 public static String[][] fbDataSet()
 {
	 String data[][]= {{"Pradeep","Pathak","1234567890"},{"Ayaansh","Pathak","2134567890"},{"Krishiv","Pathak","4321567890"}};
	 return data;
 }
 @DataProvider(name = "FBSanity")
 public static String[][] fbDataSet1()
 {
	 String data[][]= {{"Gunjan","Joshi","1234567890"},{"Omkar","Joshi","2134567890"},{"Narendra","Joshi","4321567890"}};
	 return data;
 }
}
