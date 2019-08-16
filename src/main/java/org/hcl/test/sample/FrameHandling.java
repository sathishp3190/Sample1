package org.hcl.test.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shylaja\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/guru99home/");
	List<WebElement> Count = driver.findElements(By.tagName("iframe"));
	int i = Count.size();
	System.out.println("Total frame count:"+ i);
	String Parentwindow = driver.getWindowHandle();
	WebElement frame = driver.findElement(By.id("a077aa5e"));
	driver.switchTo().frame(frame);
	WebElement image = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	image.click();
	driver.switchTo().window(Parentwindow);
	
}
}
