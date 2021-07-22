package SeleniumCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujee\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://customer.servetel.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[id='login_id']")).sendKeys("sujeetagupta16@gmail.com");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("JOB@4job");
		driver.findElement(By.cssSelector("[id='login_button']")).click();
		
		driver.findElement(By.xpath("//span[.='Services']")).click();
		driver.findElement(By.xpath("//span[.='System Recordings']")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'Upload Recording')]")).click();
		driver.findElement(By.id("name")).sendKeys("Sujeeta_Recording");
		driver.findElement(By.xpath("//label[for='create_recording']")).click();
		driver.findElement(By.className("form-label")).click();
		
		driver.findElement(By.id("speechinput")).sendKeys("Thank you for calling, our one of the executive will help you shortly, please be online.");
		driver.findElement(By.id("generate_recording")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		driver.findElement(By.className("btn btn-link waves-effect")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver,20);
		
		driver.close();
	}
}
