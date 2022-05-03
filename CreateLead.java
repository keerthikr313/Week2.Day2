package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//enter username and password using id locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on login button using class locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click on leads button
		driver.findElement(By.linkText("Leads")).click();
		
		//click on create lead button
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter companyname using id locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Name");
		
		//enter firstname using id locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("First");
		
		//enter lastname using id locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Last");
		
		//click on create lead button using name locator
		driver.findElement(By.name("submitButton")).click();
		
		//get the title of the resulting page
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("Company name is" + text);
		
		//close the browser
		driver.close();


	}
	

}
