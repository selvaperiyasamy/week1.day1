package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main\r\n");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement menu = driver.findElement(By.linkText("CRM/SFA"));
		menu.click();
		WebElement lead = driver.findElement(By.linkText("Leads"));
		lead.click();
		WebElement findlead = driver.findElement(By.linkText("Find Leads"));
		findlead.click();
		WebElement find = driver.findElement(By.xpath("//input[@name='id']"));
		find.sendKeys("11497");
		WebElement click = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
		click.click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		WebElement com = driver.findElement(By.id("updateLeadForm_companyName"));
		com.clear();
		com.sendKeys("Anuntatech");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String newcompanyname = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if(com.equals(newcompanyname))
		{
			System.out.println("company name not changed");
		}
		else
		{
			System.out.println("company name changed");
		
			}
		
	

	}

}
