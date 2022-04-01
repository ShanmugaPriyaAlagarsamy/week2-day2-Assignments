package week2.day2;

import org.openqa.selenium.By;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber'][@type='text']")).sendKeys("9543511379");
		driver.findElement(By.xpath("//button[text()='Find Leads'][@type='button']")).click();
		Thread.sleep(5000);
		String leadID = driver.findElement(By.xpath("(//a[@class='linktext'][contains(@href,/crmsfa/control/viewlead)])[4]")).getText();
			System.out.println("The lead ID is: "+ leadID);
		driver.findElement(By.xpath("(//a[@class='linktext'][contains(@href,/crmsfa/control/viewlead)])[4]")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='id'][@type='text']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		boolean displayed = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
		System.out.println(displayed);
		
		if(displayed)
		{
			System.out.println("No records found for the leadID: "+ leadID);
		}
		else
		{
			System.out.println("Check for the records");
			
		}
		
		driver.close();
		
		
		

	}

}
