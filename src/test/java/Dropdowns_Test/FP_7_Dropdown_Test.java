package Dropdowns_Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Dropdowns_Pom.FP_7_Dropdowns_Pom;
import Library_Files.Achievement_Charter_Excel_Data_BaseClass;
import Library_Files.Utility;
import Pom_classes.Form_Page_2_Pom;
import Pom_classes.Home_Page_Pom;

public class FP_7_Dropdown_Test extends Achievement_Charter_Excel_Data_BaseClass
{

	int TCID;
	Pom_classes.Login_Pom login;
	Home_Page_Pom Home_Page;
	Pom_classes.Form_Page_1_Pom Form;
	Form_Page_2_Pom Form2;
	Pom_classes.Form_Page_3_Pom Form3;
	Pom_classes.Form_Page_4_Pom Form4;
	Pom_classes.Form_Page_5_Pom Form5;
	Pom_classes.Form_Page_6_Pom Form6;
	FP_7_Dropdowns_Pom Form7;
	
	
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException, MalformedURLException
	{
		open_browser();
		
		login=new Pom_classes.Login_Pom(driver);
		Home_Page = new Home_Page_Pom(driver);
		Form = new 	Pom_classes.Form_Page_1_Pom(driver);
		Form2 = new Form_Page_2_Pom(driver);
		Form3 = new Pom_classes.Form_Page_3_Pom(driver);
		Form4 = new Pom_classes.Form_Page_4_Pom(driver);
		Form5 = new Pom_classes.Form_Page_5_Pom(driver);
		Form6 = new Pom_classes.Form_Page_6_Pom(driver);
		Form7 = new FP_7_Dropdowns_Pom(driver);
		
	}
	
	@Test
	public void Verify_Contact_Option_Dropdown() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
	
		Form2.Fill_Form_Page_2(driver, Utility.getdata(14,1));
		
		Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
		
		Form4.Click_Next_Btn();
		
		Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
		
		Form6.Fill_Form_Page_6(driver, Utility.getdata(28,1), Utility.getdata(29,1), Utility.getdata(30,1), Utility.getdata(31,1), Utility.getdata(32,1), Utility.getdata(33,1), Utility.getdata(34,1), Utility.getdata(35,1), Utility.getdata(36,1), Utility.getdata(37,1), Utility.getdata(38,1), Utility.getdata(39,1), Utility.getdata(40,1), Utility.getdata(41,1), Utility.getdata(42,1));
		
		Form7.set_Grade(driver);
	}

	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}
}

