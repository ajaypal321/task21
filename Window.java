package com.task.twenty.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		//set the path a the chromediver
				System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver.exe");	
		// instance of chromedriver 
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				// navigate to herokuapp
				driver.get(" https://the-internet.herokuapp.com/windows");
				// click on click here
				WebElement clickherebtn= driver.findElement(By.linkText("Click Here"));
				clickherebtn.click();
				// Switch to new window
				for (String windowHandle: driver.getWindowHandles()) {
					driver.switchTo().window(windowHandle);}
					// verify the text of the new window
					WebElement newWindow= driver.findElement(By.tagName("h3"));
					String expectedText= "New Window";
					String actualText= newWindow.getText();
					if(actualText.equals(expectedText)) {
						System.out.println("New window is present on the page.");
					}else {
						System.out.println("New window is not present on the page.");
					}
				// close the window
					driver.close();
					// switch back to  original window
					driver.switchTo().window(driver.getWindowHandles().iterator().next());
					// verify the original window
					WebElement originalWindowText= driver.findElement(By.tagName("h3"));
					String expectedOriginalText= "Opening a new window";
					String actualOriginalText= originalWindowText.getText();
					if(actualOriginalText.equals(expectedOriginalText)){
						System.out.println("Original window is present on the page");
					}else {System.out.println("Original window is not present on the page");
						
					}
					// close the window
					driver.close();

	}

}
//result
/*
 * Jul 12, 2023 8:51:07 AM org.openqa.selenium.remote.service.DriverService$Builder getLogOutput
INFO: Driver logs no longer sent to console by default; https://www.selenium.dev/documentation/webdriver/drivers/service/#setting-log-output
SLF4J: No SLF4J providers were found.
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.
New window is present on the page.
Original window is present on the page

 */
