package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Periyasamy");
		driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input[@name='firstname']")).sendKeys("periyasamy");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Anbu");
		driver.findElement(By.name("reg_email__")).sendKeys("Example@gmail.com");
		//driver.findElement(By.xpath("//input[@id='u_3_g_bG']")).sendKeys("example@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Example@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Selva@1234567");
		//driver.findElement(By.xpath("//select[@id='day']/option[@value='26']")).click();
		
		WebElement drop=driver.findElement(By.xpath("//select[@id='day']"));
		Select date= new Select(drop);
		date.selectByIndex(26);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select ssmonth=new Select(month);
		ssmonth.selectByIndex(10);
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select ssyear=new Select(year);
		ssyear.selectByIndex(29);
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		System.out.println("create account successfully");
		
		
		
	
	
		
		
		
		
		
	}

}
