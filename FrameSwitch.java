package com.task.twenty.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSwitch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver.exe");	
		// instance of chromedriver 
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				// navigate to herokuapp
				driver.get("http://the-internet.herokuapp.com/nested_frames");
				 // Switch to the top frame
		        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));

		        // Verify that there are three frames on the page
		        int frameCount = driver.findElements(By.tagName("frame")).size();
		        if (frameCount == 3) {
		            System.out.println("There are three frames on the page.");
		        } else {
		            System.out.println("There are not three frames on the page.");
		        }
		     // Switch to the left frame
		        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-left']")));

		        // Verify that the left frame has a text "LEFT"
		        WebElement leftFrameText = driver.findElement(By.tagName("body"));
		        if (leftFrameText.getText().equals("LEFT")) {
		            System.out.println("The left frame has the text 'LEFT'.");
		        } else {
		            System.out.println("The left frame does not have the text 'LEFT'.");
		        }
		     // Switch back to the top frame
		        driver.switchTo().parentFrame();

		        // Switch to the middle frame
		        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));

		        // Verify that the middle frame has a text "MIDDLE"
		        WebElement middleFrameText = driver.findElement(By.tagName("body"));
		        if (middleFrameText.getText().equals("MIDDLE")) {
		            System.out.println("The middle frame has the text 'MIDDLE'.");
		        } else {
		            System.out.println("The middle frame does not have the text 'MIDDLE'.");
		        }
		     // Switch back to the top frame
		        driver.switchTo().parentFrame();

		        // Switch to the right frame
		        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-right']")));

		        // Verify that the right frame has a text "RIGHT"
		        WebElement rightFrameText = driver.findElement(By.tagName("body"));
		        if (rightFrameText.getText().equals("RIGHT")) {
		            System.out.println("The right frame has the text 'RIGHT'.");
		        } else {
		            System.out.println("The right frame does not have the text 'RIGHT'.");
		        }
		      
		     // Switch back to the main frame
		        driver.switchTo().defaultContent();
		        Thread.sleep(2000);
		        // Switch to the bottom frame
		        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-bottom']")));

		        // Verify that the bottom frame has a text "BOTTOM"
		        WebElement bottomFrameText = driver.findElement(By.xpath("//body[contains(text(),\"BOTTOM\")]"));
		        if (bottomFrameText.getText().equals("BOTTOM")) {
		            System.out.println("The bottom frame has the text 'BOTTOM'.");
		        } else {
		            System.out.println("The bottom frame does not have the text 'BOTTOM'.");
		        }
		        // Switch back to the top frame
		        driver.switchTo().defaultContent();

		        // Verify that the page title is "Frames"
		        String pageTitle = driver.getTitle();
		        if (pageTitle.equals("Frame")) {
		            System.out.println("The page title is 'Frames'.");
		        } else {
		            System.out.println("The page title is not 'Frames'.");
		        }
//		     // Switch back to the top frame
//		        driver.switchTo().defaultContent();
//		        Thread.sleep(2000);
//		        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
//		        driver.findElements(By.tagName("frame"));
//		      
//		        // Verify that the page title is "Frames"
//		        String pageTitle = driver.getTitle();
//		        System.out.println(pageTitle);
////		        if (pageTitle.equals("Frames")) {
////		            System.out.println("The page title is 'Frames'.");
////		        } else {
////		            System.out.println("The page title is not 'Frames'.");
////		        }

	}

}
