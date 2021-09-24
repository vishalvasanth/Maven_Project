package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Page {
		
		public WebDriver driver;
		
		@FindBy(css = "body > div:nth-child(1)> div:nth-child(1) > header:nth-child(1) > div:nth-child(3) >div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > ul:nth-child(2) >li:nth-child(2) > a:nth-child(1)")
		private WebElement dress;
		
		public Dress_Page(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver2, this);
		}

		public WebElement getDress() {
			return dress;
		}

		public WebElement getEveDress() {
			return eveDress;
		}

		@FindBy(css = "body > div:nth-child(1) > div:nth-child(1) > header:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > ul:nth-child(2) > li:nth-child(2) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)")
		private WebElement eveDress;
		
		





}		
