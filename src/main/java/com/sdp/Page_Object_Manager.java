package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Pom.Address_Page;
import com.Pom.Address_Page2;
import com.Pom.Addtocart_Evedress;
import com.Pom.Addtocart_Tshirt;
import com.Pom.Dress_Page;
import com.Pom.Home_Page;
import com.Pom.Payment_Page;
import com.Pom.Payment_Page2;
import com.Pom.Return_Homepage;
import com.Pom.Shipping_Page;
import com.Pom.Shipping_Page2;
import com.Pom.SignOut_Page;
import com.Pom.Signin_Page;
import com.Pom.Summary_Page;
import com.Pom.Summary_Page2;
import com.Pom.Tshirt_Page;

public class Page_Object_Manager {
	
		public WebDriver driver;
		
		private Home_Page hp;
		private Signin_Page sp;
		private Dress_Page dp;
		private Addtocart_Evedress ap;
		private Summary_Page spage;
		private Address_Page addpage;
		private Shipping_Page shippage;
		private Payment_Page pp;
		private Return_Homepage rp;
		private Tshirt_Page tp;
		private Addtocart_Tshirt at;
		private Summary_Page2 spage2;
		private Address_Page2 addpage2;
		private Shipping_Page2 shippage2;
		private Payment_Page2 pp2;
		private SignOut_Page so;
		
		
		public Page_Object_Manager(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
		}
		public Home_Page getHp() {
			hp = new Home_Page(driver);
			return hp;
		}
		public Signin_Page getSp() {
			sp = new Signin_Page(driver);
			return sp;
		}
		public Dress_Page getDp() {
			dp = new Dress_Page(driver);
			return dp;
		}
		public Addtocart_Evedress getAp() {
			ap = new Addtocart_Evedress(driver);
			return ap;
		}
		public Summary_Page getSpage() {
			spage = new Summary_Page(driver);
			return spage;
		}
		public Address_Page getAddpage() {
			addpage = new Address_Page(driver);
			return addpage;
		}
		public Shipping_Page getShippage() {
			shippage = new Shipping_Page(driver);
			return shippage;
		}
		public Payment_Page getPp() {
			pp = new Payment_Page(driver);
			return pp;
		}
		public Return_Homepage getRp() {
			rp = new Return_Homepage(driver);
			return rp;
		}
		public Tshirt_Page getTp() {
			tp = new Tshirt_Page(driver);
			return tp;
		}
		public Addtocart_Tshirt getAt() {
			at = new Addtocart_Tshirt(driver);
			return at;
		}
		public Summary_Page2 getSpage2() {
			spage2 = new Summary_Page2(driver);
			return spage2;
		}
		public Address_Page2 getAddpage2() {
			addpage2 = new Address_Page2(driver);
			return addpage2;
		}
		public Shipping_Page2 getShippage2() {
			shippage2 = new Shipping_Page2(driver);
			return shippage2;
		}
		public Payment_Page2 getPp2() {
			pp2 = new Payment_Page2(driver);
			return pp2;
		}
		public SignOut_Page getSo() {
			so = new SignOut_Page(driver);
			return so;
		}
		
}
