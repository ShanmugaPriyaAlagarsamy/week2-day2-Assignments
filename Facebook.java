package week2.day2;

//import java.util.concurrent.TimeUnit;
// import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
			
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button'][@rel='async']")).click();
		Thread.sleep(5000);
		// driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("shanmuga");
		
		
		
	driver.findElement(By.xpath("//input[@name='firstname'][@type='text']")).sendKeys("Shanmuga");
	driver.findElement(By.xpath("//input[@name='lastname'][@type='text']")).sendKeys("Priya");
    driver.findElement(By.name("reg_email__")).sendKeys("123456789");
    driver.findElement(By.id("password_step_input")).sendKeys("testpw");
	WebElement birthday = driver.findElement(By.xpath("//select[@id='day'][@name='birthday_day']"));
	Select bddd = new Select(birthday);
	bddd.selectByVisibleText("21");
	WebElement birthmonth = driver.findElement(By.name("birthday_month"));
	Select bmdd = new Select(birthmonth);
	bmdd.selectByVisibleText("Jan");
	WebElement birthyear = driver.findElement(By.xpath("//select[@id='year'][@name='birthday_year']"));
	Select bydd = new Select(birthyear);
	bydd.selectByVisibleText("1988");
	driver.findElement(By.xpath("//input[@name='sex'][@value='1']")).click();
		
		
		

	}

}
