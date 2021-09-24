package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
		
		public static Properties p;
		
		public Configuration_Reader() throws Throwable {
	
		File f = new File("C:\\Users\\user\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\helper\\Configuration.properties");
	
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();             //--------->static
		
		p.load(fis);
		
		}
	
		public String getBrowser() {
			String browser = p.getProperty("browser");       // ------->case sensitive
			return browser;
		}
		
		public String getUrl() {
			String url = p.getProperty("url");
			return url;
		}
		
		public String getUsername() {
			String username = p.getProperty("username");
			return username;
		}
		
		public String getPassword() {
			String password = p.getProperty("password");
			return password;
		}
		
		public String getMsg() {
			String msg = p.getProperty("msg");
			return msg;
		}
		
		public String getsize() {
			String size = p.getProperty("size");
			return size;
		}
		
		public String getScreenshot1() {
			String ss1 = p.getProperty("screenshot1");
			return ss1;
		}
		
		public String getScreenshot2() {
			String ss2 = p.getProperty("screenshot2");
			return ss2;		
		}
		
		public String getScreenshot3() {
			String ss3 = p.getProperty("screenshot3");
			return ss3;
		}
		
		public String getScreenshot4() {
			String ss4 = p.getProperty("screenshot4");
			return ss4;
		}
		
		public String getScreenshot5() {
			String ss5 = p.getProperty("screenshot5");
			return ss5;
		}
		
		public String getScreenshot6() {
			String ss6 = p.getProperty("screenshot6");
			return ss6;
		}
		
		public String getScreenshot7() {
			String ss7 = p.getProperty("screenshot7");
			return ss7;
		}
		
		public String getScreenshot8() {
			String ss8 = p.getProperty("screenshot8");
			return ss8;
		}
		
}

