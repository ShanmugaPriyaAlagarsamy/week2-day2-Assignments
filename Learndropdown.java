package week2.day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learndropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select dd1options = new Select(dropdown1);
		dd1options.selectByIndex(1);
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select dd2options = new Select(dropdown2);
		dd2options.selectByVisibleText("Selenium");
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select dd3options = new Select(dropdown3);
		dd3options.selectByValue("1");
	WebElement dropdown4 = driver.findElement(By.className("dropdown"));
	Select dd4options = new Select(dropdown4);
	 List<WebElement> listofoptions = dd4options.getOptions();
	int size = dd4options.getOptions().size();
	System.out.println("The number of values in the dropdown is: "+size);
	
	for(int i=0; i<size; i++)
		
	{
		WebElement eachoption = listofoptions.get(i);
		String text = eachoption.getText();
		System.out.println(text);		
		
	}
	Thread.sleep(2000);
		
	driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Selenium");
	driver.findElement(By.xpath("(//select/option[text()='Selenium'])[6]")).click();
	
	
	

	}

}
