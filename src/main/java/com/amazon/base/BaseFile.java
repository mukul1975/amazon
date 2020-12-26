package com.amazon.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.amazon.data.Data;

public class BaseFile {
	public static WebDriver driver;
	public static Properties prob;
	public BaseFile() {
		prob=new Properties();
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Saiful\\eclipse-workspace\\Novermber20\\src\\main\\java\\com\\amazon\\config\\config.properties");
			prob.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void browser() {
		String browserName=prob.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Saiful\\Desktop\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver","C:\\Users\\Saiful\\Desktop\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Saiful\\Desktop\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Data.page_load_time, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Data.implicit_time, TimeUnit.SECONDS);
		driver.get(prob.getProperty("url"));
	}
}
