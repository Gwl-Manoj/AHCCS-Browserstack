package Login_Page_Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library_Files.Achievement_Charter_Excel_Data_BaseClass;
import Login_Page_POM.Login_Page_Pom;

public class Login_Page_Test extends Achievement_Charter_Excel_Data_BaseClass
{

	Login_Page_Pom Login;
	
	@BeforeClass
	public void OpenBrowser() throws InterruptedException, MalformedURLException
	{
		open_browser();
		
		Login = new Login_Page_Pom(driver);
	}
	
	@Test
	public void Login_With_multiple_data() throws InterruptedException, IOException
	{
		Login.Login_With_Multiple_data(driver);
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close(); // Close the browser
		
		
	}
	
}
