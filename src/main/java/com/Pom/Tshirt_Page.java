package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_Page {
		public WebDriver driver;
		
		@FindBy (xpath = "//body/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a[1]")
		private WebElement tshit;

		public Tshirt_Page(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver, this);
			
		}

		public WebElement getTshit() {
			return tshit;
		}
		
}
