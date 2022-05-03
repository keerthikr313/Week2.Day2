package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMELogin {
	public static void main(String[] args) {
		//open a chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//load url "https://acme-test.uipath.com/login"
		driver.get("https://acme-test.uipath.com/login");
		
		//enter email as "kumar.testleaf@gmail.com"
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
		//enter password as "leaf@12"
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		
		//click login button
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		//get the title of the page and print
		String title = driver.getTitle();
		System.out.println("Title is" + title);
		
		//click on log out
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		
		//close the browser(use-driver.close())
		driver.close();


	}

}
