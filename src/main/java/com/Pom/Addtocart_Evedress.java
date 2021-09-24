package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart_Evedress {
		
		public WebDriver driver;
		
		@FindBy (xpath = "//img[@title='Printed Dress']")
		private WebElement image;
		
		public Addtocart_Evedress(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
			
		}

		public WebElement getImage() {
			return image;
		}

		public WebElement getQuickview() {
			return quickview;
		}

		public WebElement getFrame() {
			return frame;
		}

		public WebElement getQuantity() {
			return quantity;
		}

		public WebElement getSize() {
			return size;
		}

		public WebElement getColour() {
			return colour;
		}

		public WebElement getSubmitbtn() {
			return submitbtn;
		}

		public WebElement getCheckout() {
			return checkout;
		}

		@FindBy (xpath = "//a[@class='quick-view']")
		private WebElement quickview;
		
		@FindBy (className = "fancybox-iframe")
		private WebElement frame;
		
		@FindBy (xpath = "/html/body/div/div/div[3]/form/div/div[2]/p[1]/a[2]/span")
		private WebElement quantity;
		
		@FindBy (id = "group_1")
		private WebElement size;
		
		@FindBy (id = "color_24")
		private WebElement colour;
		
		@FindBy (xpath = "//button[@name='Submit']")
		private WebElement submitbtn;
		
		@FindBy (xpath = "//a[@title='Proceed to checkout']")
		private WebElement checkout;
		
		
}
