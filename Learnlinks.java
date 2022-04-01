package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnlinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		
		//1.Go to home page
		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		String currenturl = driver.getCurrentUrl();
		if(currenturl.contains("home"))
		{
			System.out.println("I am currently in Homepage");			
		}
		else
		{
			System.out.println("I am not in Homepage");
					}
		
		//2.Find where i am supposed to go without clicking
		
		
		driver.findElement(By.xpath("//h5[text()='HyperLink']/following-sibling::img")).click();
		Thread.sleep(2000);
		
		String attribute = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href");
		System.out.println("This link is directed to "+ attribute );
		Thread.sleep(2000);
		
		//3************
		driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("404 Not Found"))
		{
			System.out.println("The link is broken");
			
		}
		
		else
		{
		System.out.println("The link is not broken");	
		}
		driver.navigate().back();
		Thread.sleep(2000);
		
		//4***************8
		
		String tagName = driver.findElement(By.xpath("//a[text()='How many links are available in this page?']")).getTagName();
		List<WebElement> links = driver.findElements(By.tagName(tagName));
		int size = links.size();
		System.out.println("The number of urls in the page is: "+ size);
		Thread.sleep(2000);
	}
	
	
}
