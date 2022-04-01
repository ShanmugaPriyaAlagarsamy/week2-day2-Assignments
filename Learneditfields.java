package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learneditfields {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("http://leafground.com/pages/Edit.html");
	driver.findElement(By.id("email")).sendKeys("Shanmugapriyaalagarsamy@gmail.com");
	driver.findElement(By.xpath("//input[@type = 'text'][@value='Append ']")).sendKeys("the name" + Keys.TAB);  
	driver.findElement(By.xpath("//input[@name='username'][@value='TestLeaf']")).clear();
	driver.findElement(By.xpath("//input[@name='username'][@value='TestLeaf']")).sendKeys("default");
	String value = driver.findElement(By.xpath("//input[@name='username'][@value='TestLeaf']")).getAttribute("value");
	String name = driver.findElement(By.xpath("//input[@name='username'][@value='TestLeaf']")).getAttribute("name");
	System.out.println(value + "," + name);
	driver.findElement(By.xpath("//input[@name='username'][@value='Clear me!!']")).clear();
	boolean editField = driver.findElement(By.xpath("//input[@type='text'][@disabled='true']")).isEnabled();
	System.out.println(editField);
	
	if(editField==true)
	{
		System.out.println("The edit field is enabled");
	}
	else
	{
		System.out.println("The edit field is disabled");
		}

	}

}
