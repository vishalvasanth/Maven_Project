package com.DataProvider_Demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Maven_Project.Base_Class_Mystore;
import com.helper.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

public class Data_Provider_Demo extends Base_Class_Mystore {
		
		public static WebDriver driver = browser("chrome");
		
		Page_Object_Manager pom = new Page_Object_Manager(driver);
		
		@Test(dataProvider = "test_Data")
		private void data_Credentials(String username, String password) throws Throwable {
			deleteallcookies();
			maximize();
			String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
			url(url);
			clickOnElement(pom.getHp().getSignin_Btn());
			implicitWait(10);
			inputValues(pom.getSp().getUsermail(), username );
			inputValues(pom.getSp().getPassword(), password);
			clickOnElement(pom.getSp().getSignin_Btn());
		}
		@DataProvider
		private Object[][] test_Data() {
			return new Object [] [] {
				{"vishaalseenu1@gmail.com" ,"vishal@123"},
				{"vishnu2101996@gmail.com" , "Fzrider02"},
				
			};

		}
		@Test(priority = 1)
		private void logOut() {
			clickOnElement(pom.getSo().getLogout());
			close();
		}
		
	
}
