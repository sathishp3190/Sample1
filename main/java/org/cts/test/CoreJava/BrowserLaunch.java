package org.cts.test.CoreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shylaja\\eclipse-workspace\\CoreJava\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumhq.org/download/");
	WebElement text = driver.findElement(By.xpath("//a[text()='Previous Releases']"));
	text.click();
	
}
}
