package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {
		public WebDriver driver;
		
		@FindBy (className = "bankwire")
		private WebElement paymentMethod;
		
		public Payment_Page(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver, this);
			
		}

		public WebElement getPaymentMethod() {
			return paymentMethod;
		}

		public WebElement getConfirmPayment() {
			return confirmPayment;
		}

		@FindBy (xpath = "//span[normalize-space()='I confirm my order']")
		private WebElement confirmPayment;
		
		
}
