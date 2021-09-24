package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Page {

			public WebDriver driver;
			
			@FindBy(xpath = "//input[@id='email']")
			private WebElement usermail;
			
			@FindBy(xpath = "//input[@id='passwd']")
			private WebElement password;
			
			@FindBy(xpath = "//button[@id='SubmitLogin']")
			private WebElement signin_Btn;
			
			public Signin_Page(WebDriver driver2) {
				this.driver = driver2;
				PageFactory.initElements(driver, this);
			}

			public WebElement getUsermail() {
				return usermail;
			}

			public WebElement getPassword() {
				return password;
			}

			public WebElement getSignin_Btn() {
				return signin_Btn;
			}

			
			
}			
			
