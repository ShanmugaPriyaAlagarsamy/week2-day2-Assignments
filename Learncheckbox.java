package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learncheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.get("http://leafground.com/pages/checkbox.html");
	
	//1.http://leafground.com/pages/checkbox.html
	
	driver.findElement(By.xpath("(//label[contains(text(),'Select the language')]/following-sibling::input)[1]")).click();
	
	//2.Confirm Selenium is checked
	
	boolean cbisselected = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']//following-sibling::input")).isSelected();
	
		if(cbisselected==true)
		{System.out.println("The checkbox selenium is checked");}
		else {System.out.println("The checkbox is not checked");}
		Thread.sleep(2000);
		
		//3.DeSelect only checked
		
		driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following-sibling::input)[2]")).click();
		Thread.sleep(2000);
		
		
		//4.Select all below checkboxes
		
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[1]")).click();
	    driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[3]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[4]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[5]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following-sibling::input)[6]")).click();
		
			
		

	}

}
