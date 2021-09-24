package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {
		public WebDriver driver;
		
		@FindBy (xpath = "//input[@id='cgv']")
		private WebElement cBox;
		
		public Shipping_Page(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
			
		}

		public WebElement getcBox() {
			return cBox;
		}

		public WebElement getProceedBth() {
			return proceedBth;
		}

		@FindBy (xpath = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
		private WebElement proceedBth;
		



}
