package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnimage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Image.html");
		
		
		//1.Click on this image to go home page
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[text()='Image']/following-sibling::img")).click();
		Thread.sleep(2000);
		
		
		//2.Am I Broken Image?
		
		WebElement image = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img"));
			
		if(image.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println(image.getAttribute("outerHTML") + "is broken");
						
		}
		
		else
		{
			System.out.println("The image is not broken");
			
		}
		
		// 4.Click me using Keyboard or Mouse
		
		
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img")).click();
		System.out.println("On clicking the image, it is directing to " + driver.getCurrentUrl());
		
		Thread.sleep(2000);
		

	}

}
