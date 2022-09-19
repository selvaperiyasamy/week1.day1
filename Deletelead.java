package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deletelead {

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
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys("11497");
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				String msg=driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
				System.out.println(msg+ "Account deleted successfully");
				driver.close();
	}

}
