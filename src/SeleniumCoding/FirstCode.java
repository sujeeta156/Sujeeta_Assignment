package SeleniumCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCode {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujee\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/#/index");
		driver.findElement(By.xpath("//a[@href = '#/practice-project']")).click();
		driver.findElement(By.id("name")).sendKeys("Sujeeta Gupta");
		driver.findElement(By.id("email")).sendKeys("sujeetagupta16@gmail.com");
		driver.findElement(By.id("form-submit")).click();	
		driver.findElement(By.xpath("//a[contains(@href,'seleniumPractise')]")).click();
		driver.close();
		
	}

}