package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Return_Homepage {
		public WebDriver driver;
		
		@FindBy(xpath = "//img[@alt='My Store']")
		private WebElement home;

		public Return_Homepage(WebDriver driver2) {
			this.driver= driver2;
			PageFactory.initElements(driver, this);
		}

		public WebElement getHome() {
			return home;
		}
		
}
