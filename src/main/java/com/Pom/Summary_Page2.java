package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page2 {
		public WebDriver driver;
		
		@FindBy (xpath = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
		private WebElement proceedBtn;

		public Summary_Page2(WebDriver driver2) {
			this.driver= driver2;
			PageFactory.initElements(driver, this);
			
		}

		public WebElement getProceedBtn() {
			return proceedBtn;
		}
		
}
