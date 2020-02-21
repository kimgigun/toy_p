package com.myproject.web.service;

import org.jsoup.nodes.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autoExcute {
	
	public static void main(String[] args) {
		autoExcute exc = new autoExcute("https://www.naver.com");
		exc.crawl();
	}
	private WebDriver driver;
	private WebElement webEl;
	
	private static final String WEB_DRIVER_ID = "webdriver.chrome.driver"; 
	private static final String WEB_DRIVER_PATH = "C:/Users/ggg/Downloads/sts-4.5.1.RELEASE/chromedriver_win32/chromedriver.exe"; 
	
	private String base_url;
	
	public autoExcute(String url) {
		
		super();
		
		System.setProperty(WEB_DRIVER_ID,WEB_DRIVER_PATH);
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("headless");
		driver =  new ChromeDriver(op);
		base_url = url;
		
	}
	
//	
//	private void waitForLoad(WebDriver driver) {
//		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
//			public Boolean apply(WebDriver driver) {
//				return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
//			}
//		}
//				
//	}
	
	public void crawl() {
		
		try {
			driver.get(base_url);
			Thread.sleep(2000);
			//WebDriverWait wait = new WebDriverWait(driver, 30);
			//wait.util(pageLoadCondotion);
			//System.out.println(driver.getPageSource());
			//String logEl = driver.findElement(By.tagName("ul").className("ah_l")).getTagName();
			//Thread.sleep(3000);
			String logEl = driver.findElement(By.ByCssSelector.cssSelector("span.ah_k")).getText();
			System.out.println("logEl::"+logEl);
			
//			if(logEl != null) {
//				
//				System.out.println("logEl::"+logEl);
//			}else {
//				
//				Thread.sleep(2000);
//				logEl = driver.findElement(By.cssSelector("ul.ah_l li")).getText();
//				System.out.println("logEl::"+logEl);
//			}
//			driver.findElement(By.className("ico_local_login")).click();
//			
//			setEl("id", "kimgigun");
//			setEl("pw", "gigun0928@");
			
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		} finally {
			//driver.close();
		}
		
		
	}
	
	private void setEl(String type ,String name) {
		
		webEl = type.equals("id") == true ? driver.findElement(By.id("id")) : driver.findElement(By.id("pw"));
		webEl.sendKeys(name);
		
	}
	
	private void login() {
		
		try {
			driver.get(base_url);
			System.out.println(driver.getPageSource());
			//Time
			String logEl = driver.findElement(By.className("ico_local_login")).getTagName();
			System.out.println("logEl::"+logEl);
			Thread.sleep(3000);
			driver.findElement(By.className("ico_local_login")).click();
			
			setEl("id", "kimgigun");
			setEl("pw", "gigun0928@");
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			//driver.close();
		}
	}
}
