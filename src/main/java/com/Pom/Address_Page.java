package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {
		public WebDriver driver;
		
		@FindBy (xpath = "//textarea[@name='message']")
		private WebElement message;
		
		@FindBy (xpath = "//button[@name='processAddress']")
		private WebElement proceedBtn;
		
		public WebElement getProceedBtn() {
			return proceedBtn;
		}

		public Address_Page(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
			
		}

		public WebElement getMessage() {
			return message;
		}
		
}
