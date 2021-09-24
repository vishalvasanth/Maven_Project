package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOut_Page {
	public WebDriver driver;
	
	@FindBy (xpath = "//a[@title='Log me out']")
	private WebElement logout;

	public SignOut_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
}
