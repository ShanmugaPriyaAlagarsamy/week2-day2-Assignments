package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Updatestatecontactlead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit'][@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')][contains(@href,/crmsfa/control/main)]")).click();	
		driver.findElement(By.xpath("//a[contains(text(),'Leads')] [contains(@href,'/crmsfa/control/leadsMain')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'/crmsfa/control/createLeadForm')][contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Microsoft");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Akshara");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Manikandan");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("This is Akshara from Microsoft");
		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId'][@id='createLeadForm_generalStateProvinceGeoId']"));
		Select statedd = new Select(state);
		statedd.selectByVisibleText("New York");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9543511379");
		driver.findElement(By.xpath("//input[@class='smallSubmit'][@name='submitButton']")).click();
		
	}

}
