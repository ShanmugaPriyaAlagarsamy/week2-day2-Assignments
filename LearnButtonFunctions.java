package week2.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnButtonFunctions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.xpath("//button[@id='home'][text()='Go to Home Page']")).click();
		driver.findElement(By.xpath("//img[@alt = 'Buttons']")).click();
		Point getPosition = driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation();
		System.out.println("The position of button(x,y) is: " + getPosition);
		String fieldColor = driver.findElement(By.xpath("//button[text()='What color am I?']")).getCssValue("background-color");
		System.out.println("The field color is: " + fieldColor);
		int height = driver.findElement(By.xpath("//button[@id='size'][text()='What is my size?']")).getSize().getHeight();
		System.out.println("The height of the field is: " + height);
		int width = driver.findElement(By.xpath("//button[@id='size'][text()='What is my size?']")).getSize().getWidth();
		System.out.println("The width of the field is: " + width);
		
		
		
		

	}

}
