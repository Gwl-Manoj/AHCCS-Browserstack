package Dropdown_Validations_Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Dropdown_Validatoins_Pom.DV_FP_2_Pom;
import Library_Files.Achievement_Charter_Excel_Data_BaseClass;
import Library_Files.Utility;
import Pom_classes.Home_Page_Pom;

public class DV_FP_2_Test extends Achievement_Charter_Excel_Data_BaseClass
{

	int TCID;
	Pom_classes.Login_Pom login;
	Home_Page_Pom Home_Page;
	Pom_classes.Form_Page_1_Pom Form;
	DV_FP_2_Pom Form2;
	
	
	
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException, MalformedURLException
	{
		open_browser();
		
		login=new Pom_classes.Login_Pom(driver);
		Home_Page = new Home_Page_Pom(driver);
		Form = new 	Pom_classes.Form_Page_1_Pom(driver);
		Form2 = new DV_FP_2_Pom(driver);
		
		
		
	}
	
	
	@Test
	public void Validate_School_District_Dropdown() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
		
		Home_Page.Home_Page(driver);
		
		Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));

		Form2.set_School_District(driver);
	
			
	}
	
	
	
	
	
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}
}

