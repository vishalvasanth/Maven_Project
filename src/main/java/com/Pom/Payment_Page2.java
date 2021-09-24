package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page2 {
		public WebDriver driver;
		
		@FindBy (xpath = "//a[@title='Pay by bank wire']")
		private WebElement paymentmethd;
		
		public Payment_Page2(WebDriver driver2) {
			this.driver= driver2;
			PageFactory.initElements(driver, this);
		}

		public WebElement getPaymentmethd() {
			return paymentmethd;
		}

		public WebElement getConfirmpayment() {
			return confirmpayment;
		}

		@FindBy (xpath = "//span[normalize-space()='I confirm my order']")
		private WebElement confirmpayment;
		
		
}
