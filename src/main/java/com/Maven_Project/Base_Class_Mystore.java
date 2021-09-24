package com.Maven_Project;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class_Mystore {

	public static WebDriver driver;
	public static String value;
	
	public static WebDriver browser(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
					
			driver = new ChromeDriver();
			
		} else if (type.equalsIgnoreCase("Firefox")) {
			System.setProperty(null, null);
			driver = new FirefoxDriver();
			
			
		} else if (type.equalsIgnoreCase("Edge")) {
			System.setProperty(null, null);
			driver = new EdgeDriver();
		}
		return driver;
		
		
		
		}
		public static void url(String url) {
			driver.get(url);
		}
		public static void maximize() {
			driver.manage().window().maximize();
		}
		public static void deleteallcookies() {
			driver.manage().deleteAllCookies();
		}
		public static void close() {
			driver.close();
		}
		public static void quit() {
			driver.quit();
		}
		
		// Navigate ------------
		
		public static void navigateUrl(String url) {
			driver.navigate().to(url);
		}
		public static void nextpage() {
			driver.navigate().forward();
		}
		public static void previouspage() {
			driver.navigate().back();
		}
		public static void refreshpage() {
			driver.navigate().refresh();
		}
		
		
		//Alert------------------
		
		public static void alerkok() {
			driver.switchTo().alert().accept();
		}
		public static void alertcancel() {
			driver.switchTo().alert().dismiss();
		}
		public static void alertgettext() {
			Alert a = driver.switchTo().alert();
			String text=a.getText();
			System.out.println(text);
		}
		public static void alertsendkey(String input) {
			Alert a = driver.switchTo().alert();
			a.sendKeys(input);
			a.accept();
		}
		
		//Actions--------------------
		
		
		public static void moveToElement(WebElement target) {
			Actions a = new Actions (driver);
			a.moveToElement(target).build().perform();
		}
		public static void doubleclick(WebElement target) {
			Actions a = new Actions(driver);
			a.doubleClick(target).build().perform();
		}
		public static void rightclick(WebElement target) {
			Actions a = new Actions(driver);
			a.contextClick(target).build().perform();
		}
		public static void mousedrag(WebElement src , WebElement dest) {
			Actions a = new Actions(driver);
			a.dragAndDrop(src, dest).build().perform();
		}
		
		//Robot Class--------------------------
		
		
		public static void keyup() throws Throwable {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		}
		public static void keydown() throws Throwable {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		public static void enter() throws Throwable {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		public static void cut() throws Throwable { 
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_COPY);
			r.keyRelease(KeyEvent.VK_COPY);
		}
		public static void copy() throws Throwable {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CUT);
			r.keyRelease(KeyEvent.VK_CUT);
		}
		public static void paste() throws Throwable {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_PASTE);
			r.keyRelease(KeyEvent.VK_PASTE);
		}
		
		//Frame ------------------------
		
		
		public static void frameid(int id) {
			driver.switchTo().frame(id);
		}
		public static void frameindex(int index) {
			driver.switchTo().frame(index);
		}
		public static void frameelement(WebElement element) {
			driver.switchTo().frame(element);
		}
		
		public static void parentframe() {
			driver.switchTo().parentFrame();
			
		}
		public static void defaultcontent() {
			driver.switchTo().defaultContent();
			
		}
		//Window Handle------------------------
		
		
		public static void windowhandle() {
			String parent = driver.getWindowHandle();
			Set<String> child = driver.getWindowHandles();
			for (String str : child) 
				{
					if (parent.equals(str))
					{
						driver.switchTo().window(str);
					}
				}
			}
		
		
		//Select  ---------------------------
		
		
		public static void dropdown_ByIndex (WebElement element, int index) {
			Select s = new Select(element);
			s.selectByIndex(index);
			}
		
		public static void dropdown_ByValue(WebElement element, String value) {
			Select s = new Select(element);
			s.selectByValue(value);
		}
		
		public static void deselectindex(WebElement element, int index) {
			Select s = new Select(element);
			s.deselectByIndex(index);
		}
		
		public static void deselectvalue(WebElement element, String value) {
			Select s = new Select(element);
			s.deselectByValue(value);
		}
		public static void deselecttext (WebElement element, String text) {
			Select s = new Select(element);
			s.deselectByVisibleText(text);
		}
		public static void deselectall(WebElement element) {
			Select s = new Select(element);
			s.deselectAll();
		}
		
		//Boolean  ------------------------
		
		
		public static boolean isEnabled (WebElement element) {
			boolean enabled = element.isEnabled();
			return enabled;
			
		}
		
		public static boolean isDisplayed (WebElement element) {
			boolean displayed = element.isDisplayed();
			return displayed;
			
		}
		
		public static boolean isSelected (WebElement element) {
			boolean selected = element.isSelected();
			return selected;
			
		}
		
		//Get -------------------
		
		
		public static String gettext(WebElement element) {
			String text = element.getText();
			return text;
		}

		public static String pageTitle() {
			String title = driver.getTitle();
			return title;
		}
		public static String pageUrl() {
			String url = driver.getCurrentUrl();
			return url;
		}
		
		public static String getAttributeValue (WebElement element , String attributename) {
			String attributevalue = element.getAttribute(attributename);
			return attributevalue;
		}
		
		public static String getTagname(WebElement element) {
			String tagName = element.getTagName();
			return tagName;
		}
		public static void alloptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> options = s.getOptions();
			for (WebElement listoptions : options) {
				System.out.println(listoptions.getText());
			}
		}

		public static void firstSelectedOption(WebElement element) {
			Select s = new Select (element);
			WebElement text = s.getFirstSelectedOption();
			text.getText();
			System.out.println(text);
			
		}
		
		public static void allSelectedOptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> options = s.getAllSelectedOptions();
			for (WebElement allseloptions : options) {
				System.out.println(allseloptions.getText());
			}
		}
			
		
		//click  -----------------------
		
		
		public static void clickOnElement(WebElement element) {
			element.click();
		}
		
		public static void inputValues(WebElement element, String value) {
			element.sendKeys(value);
		}
		
		//sleep -----------------------
			
		public static void sleep() throws Throwable {
			Thread.sleep(3000);
		}
		
		//Wait -------------------------
		
		public static void implicitWait(int sec) {
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		}	
		
		public static void webdriverWait (long value, WebElement element) {
			WebDriverWait w = new WebDriverWait(driver, value);
			w.until(ExpectedConditions.elementToBeClickable(element));
		
		}
		
		//Screenshot  -----------------------
		
		public static void screenshot(String path) throws Throwable {
			TakesScreenshot shot = (TakesScreenshot) driver;
			File src = shot.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			FileUtils.copyFile(src, dest);
			
		}
		
		//Scroll -----------------------------
		
		
		public static void scrollup() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-430)");
		}
		
		public static void scrolldown() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,430)");
		}
		
		public static String read_Particular_Data(String path ,int row_index ,int cell_index) throws Throwable {
			
			File f = new File(path);
			FileInputStream fis = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fis);
			Sheet sheetAt = w.getSheetAt(0);
			Row row = sheetAt.getRow(row_index);
			Cell cell = row.getCell(cell_index);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				value = cell.getStringCellValue();
			}
			else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				value = Double.toString(numericCellValue);
				
			}	
			w.close();
			return value;
		
			
			
		}
		
}
