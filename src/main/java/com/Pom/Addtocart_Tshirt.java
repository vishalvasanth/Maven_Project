package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart_Tshirt {
		public WebDriver driver;
		
		@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
		private WebElement tshirt;
		
		public Addtocart_Tshirt(WebDriver driver2) {
			this.driver= driver2;
			PageFactory.initElements(driver, this);
		}

		public WebElement getTshirt() {
			return tshirt;
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

		public WebElement getAddtocartBtn() {
			return addtocartBtn;
		}

		public WebElement getProceedBtn() {
			return proceedBtn;
		}

		@FindBy (xpath = "//a[@class='quick-view']")
		private WebElement quickview;
		
		@FindBy (className = "fancybox-iframe")
		private WebElement frame;
		
		@FindBy (xpath = "//a[@class='btn btn-default button-plus product_quantity_up']//span")
		private WebElement quantity;
		
		@FindBy (xpath = "//select[@name='group_1']")
		private WebElement size;
		
		@FindBy (xpath = "//a[@id='color_14']")
		private WebElement colour;
		
		@FindBy (xpath = "//button[@name='Submit']")
		private WebElement addtocartBtn;
		
		@FindBy (xpath = "//span[normalize-space()='Proceed to checkout']")
		private WebElement proceedBtn;
		
		
}
