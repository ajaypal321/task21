package com.task.twenty.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		//set the path a the chromediver
		System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver.exe");	
// instance of chromedriver 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		// navigate to herokuapp
		driver.get("https://the-internet.herokuapp.com/iframe");
		// switch to i-frame
			//	driver.switchTo().frame.("//iframe[@id='mce_0_ifr']");
		driver.switchTo().frame(0);
		WebElement text = driver.findElement(By.tagName("p"));
		text.clear();
		text.sendKeys("Hello People.");
		driver.close();
	}

}
