package Multiple_Data_Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.Achievement_Charter_Excel_Data_BaseClass;
import Library_Files.Utility;
import Multiple_data_POM.Form_Page_6_Excel_Data_Pom;
import Pom_classes.Form_Page_1_Pom;
import Pom_classes.Home_Page_Pom;

public class Form_Page_6_Excel_Data_Test extends Achievement_Charter_Excel_Data_BaseClass
{
	
	int TCID;
	Pom_classes.Login_Pom login;
	Home_Page_Pom Home_Page;
	Form_Page_1_Pom Form;
	Pom_classes.Form_Page_2_Pom Form2;
	Pom_classes.Form_Page_3_Pom Form3;
	Pom_classes.Form_Page_4_Pom Form4;
	Pom_classes.Form_Page_5_Pom Form5;
	Form_Page_6_Excel_Data_Pom Form6;
	
	
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException, MalformedURLException
	{
		open_browser();
		
		login=new Pom_classes.Login_Pom(driver);
		Home_Page = new Home_Page_Pom(driver);
		Form = new Form_Page_1_Pom(driver);
		Form2 = new Pom_classes.Form_Page_2_Pom(driver);
		Form3 = new Pom_classes.Form_Page_3_Pom(driver);
		Form4 = new Pom_classes.Form_Page_4_Pom(driver);
		Form5 = new Pom_classes.Form_Page_5_Pom(driver);
		Form6 = new Form_Page_6_Excel_Data_Pom(driver);
		
		
	}
		
		
		@Test
		public void Verify_Full_Name_Field() throws EncryptedDocumentException, InterruptedException, IOException
		{

			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
			Form2.Fill_Form_Page_2(driver,  Utility.getdata(14,1));
			
			Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
			
			Form4.Click_Next_Btn();
			
			Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
			
			Form6.Set_Full_Name(driver);
			
			
		}
		
		@Test
		public void Verify_Primary_Parent_Email_Field() throws EncryptedDocumentException, InterruptedException, IOException
		{

			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
			Form2.Fill_Form_Page_2(driver,  Utility.getdata(14,1));
			
			Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
			
			Form4.Click_Next_Btn();
			
			Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
			
			Form6.Set_Primary_Parent_Email(driver);
			
			
		}
		
		@Test
		public void Verify_Primary_Parent_Phone_Field() throws EncryptedDocumentException, InterruptedException, IOException
		{

			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
			Form2.Fill_Form_Page_2(driver,  Utility.getdata(14,1));
			
			Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
			
			Form4.Click_Next_Btn();
			
			Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
			
			Form6.Set_Primary_Parent_Phone(driver);
			
			
		}
		
		@Test
		public void Verify_Primary_Parent_Employeer_Field() throws EncryptedDocumentException, InterruptedException, IOException
		{

			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
			Form2.Fill_Form_Page_2(driver,  Utility.getdata(14,1));
			
			Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
			
			Form4.Click_Next_Btn();
			
			Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
			
			Form6.Set_Primary_Parent_Employeer(driver);
			
			
		}
		
		@Test
		public void Verify_Work_number_Field() throws EncryptedDocumentException, InterruptedException, IOException
		{

			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
			Form2.Fill_Form_Page_2(driver,  Utility.getdata(14,1));
			
			Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
			
			Form4.Click_Next_Btn();
			
			Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
			
			Form6.Set_Work_number(driver);
			
		}
		
		@Test
		public void Verify_Work_Email_Field() throws EncryptedDocumentException, InterruptedException, IOException
		{

			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
			Form2.Fill_Form_Page_2(driver,  Utility.getdata(14,1));
			
			Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
			
			Form4.Click_Next_Btn();
			
			Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
			
			Form6.Set_Work_Email(driver);
			
			
		}
		
		@Test
		public void Verify_Contact_Language_Field() throws EncryptedDocumentException, InterruptedException, IOException
		{

			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
			Form2.Fill_Form_Page_2(driver,  Utility.getdata(14,1));
			
			Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
			
			Form4.Click_Next_Btn();
			
			Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
			
			Form6.Set_Contact_Language(driver);
			
			
		}
		
		
		@Test
		public void Verify_Name_Field() throws EncryptedDocumentException, InterruptedException, IOException
		{

			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
			Form2.Fill_Form_Page_2(driver,  Utility.getdata(14,1));
			
			Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
			
			Form4.Click_Next_Btn();
			
			Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
			
			Form6.Set_Name(driver);
			
			
		}
		
		@Test
		public void Verify_Email_Field() throws EncryptedDocumentException, InterruptedException, IOException
		{

			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
			Form2.Fill_Form_Page_2(driver,  Utility.getdata(14,1));
			
			Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
			
			Form4.Click_Next_Btn();
			
			Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
			
			Form6.Set_Email(driver);
			
			
		}
		
		@Test
		public void Verify_Relationship_With_Student_Field() throws EncryptedDocumentException, InterruptedException, IOException
		{

			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
			Form2.Fill_Form_Page_2(driver,  Utility.getdata(14,1));
			
			Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
			
			Form4.Click_Next_Btn();
			
			Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
			
			Form6.Set_Relationship_With_Student(driver);
			
			
		}
		
		@Test
		public void Verify_Phone_Number_Field() throws EncryptedDocumentException, InterruptedException, IOException
		{

			login.login(Utility.getdata(1, 1), Utility.getdata(2, 1));
			
			Home_Page.Home_Page(driver);
			
			Form.Fill_Form_Page_1(driver, Utility.getdata(3,1), Utility.getdata(4,1), Utility.getdata(5,1), Utility.getdata(6,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(7,1), Utility.getdata(8,1), Utility.getdata(9,1), Utility.getdata(10,1), Utility.getdata(11,1));
		
			Form2.Fill_Form_Page_2(driver,  Utility.getdata(14,1));
			
			Form3.Fill_Form_Page_3(driver, Utility.getdata(17,1), Utility.getdata(18,1), Utility.getdata(19,1), Utility.getdata(20,1), Utility.getdata(21,1), Utility.getdata(22,1));
			
			Form4.Click_Next_Btn();
			
			Form5.Fill_Form_Page_5(driver, Utility.getdata(25,1));
			
			Form6.Set_Phone_Number(driver);
			
			
		}
		
		
		@AfterMethod
		public void closeBrowser() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.close(); // Close the browser
			
			
		}

		
}
