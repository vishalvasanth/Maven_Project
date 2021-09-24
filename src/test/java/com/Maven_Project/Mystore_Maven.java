package com.Maven_Project;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.helper.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

public class Mystore_Maven extends Base_Class_Mystore {

	public static WebDriver driver= browser("chrome");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable, IOException {
		
		
		String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
		url(url);
		deleteallcookies();
		maximize();
		 
		clickOnElement(pom.getHp().getSignin_Btn());
		implicitWait(10);
		
		String username = File_Reader_Manager.getInstance().getInstanceCR().getUsername();
		//String username = read_Particular_Data("D:\\Materials\\Test Case (My Store).xlsx", 23, 5);
		inputValues(pom.getSp().getUsermail(), username );
		
		String password = File_Reader_Manager.getInstance().getInstanceCR().getPassword();
		//String password = read_Particular_Data("D:\\Materials\\Test Case (My Store).xlsx", 24, 5);
		inputValues(pom.getSp().getPassword(), password);
		
		clickOnElement(pom.getSp().getSignin_Btn());
		implicitWait(10);
		
		moveToElement(pom.getDp().getDress());
		clickOnElement(pom.getDp().getEveDress());
		
		moveToElement(pom.getAp().getImage());
		clickOnElement(pom.getAp().getQuickview());
		implicitWait(10);
		frameelement(pom.getAp().getFrame());
		for (int i = 1; i < 10; i++) {
			clickOnElement(pom.getAp().getQuantity());
		}
		String size = File_Reader_Manager.getInstance().getInstanceCR().getsize();
		dropdown_ByValue(pom.getAp().getSize(), size);
		clickOnElement(pom.getAp().getColour());
		clickOnElement(pom.getAp().getSubmitbtn());
		defaultcontent();
		sleep();
		String screenshot1 = File_Reader_Manager.getInstance().getInstanceCR().getScreenshot1();
		screenshot(screenshot1);
		clickOnElement(pom.getAp().getCheckout());
		scrolldown();
		String screenshot2 = File_Reader_Manager.getInstance().getInstanceCR().getScreenshot2();
		screenshot(screenshot2);
		
		clickOnElement(pom.getSpage().getProceedBtn());
		
		String msg = File_Reader_Manager.getInstance().getInstanceCR().getMsg();
		inputValues(pom.getAddpage().getMessage(), msg );
		clickOnElement(pom.getAddpage().getProceedBtn());
		
		clickOnElement(pom.getShippage().getcBox());
		clickOnElement(pom.getShippage().getProceedBth());
		
		clickOnElement(pom.getPp().getPaymentMethod());
		scrolldown();
		String screenshot3 = File_Reader_Manager.getInstance().getInstanceCR().getScreenshot3();
		screenshot(screenshot3);
		clickOnElement(pom.getPp().getConfirmPayment());
		scrolldown();
		String screenshot4 = File_Reader_Manager.getInstance().getInstanceCR().getScreenshot4();
		screenshot(screenshot4);
		
		clickOnElement(pom.getRp().getHome());
		
		clickOnElement(pom.getTp().getTshit());
		
		moveToElement(pom.getAt().getTshirt());
		clickOnElement(pom.getAt().getQuickview());
		frameelement(pom.getAt().getFrame());
		for (int i = 1; i < 15; i++) {
			clickOnElement(pom.getAt().getQuantity());
		}
		String size2 = File_Reader_Manager.getInstance().getInstanceCR().getsize();
		dropdown_ByValue(pom.getAt().getSize(), size2 );
		clickOnElement(pom.getAt().getColour());
		clickOnElement(pom.getAt().getAddtocartBtn());
		sleep();
		defaultcontent();
		sleep();
		String screenshot5 = File_Reader_Manager.getInstance().getInstanceCR().getScreenshot5();
		screenshot(screenshot5);
		clickOnElement(pom.getAt().getProceedBtn());
		scrolldown();
		sleep();
		String screenshot6 = File_Reader_Manager.getInstance().getInstanceCR().getScreenshot6();
		screenshot(screenshot6);
		
		clickOnElement(pom.getSpage2().getProceedBtn());
		
		clickOnElement(pom.getAddpage2().getProceedBtn());
		
		clickOnElement(pom.getShippage2().getcBox());
		clickOnElement(pom.getShippage2().getProceedBtn());
		
		clickOnElement(pom.getPp2().getPaymentmethd());
		scrolldown();
		String screenshot7 = File_Reader_Manager.getInstance().getInstanceCR().getScreenshot7();
		screenshot(screenshot7);
		clickOnElement(pom.getPp2().getConfirmpayment());
		scrolldown();
		String screenshot8 = File_Reader_Manager.getInstance().getInstanceCR().getScreenshot8();
		screenshot(screenshot8);
		sleep();
		
		clickOnElement(pom.getSo().getLogout());
		
		close();
		
	}

}

