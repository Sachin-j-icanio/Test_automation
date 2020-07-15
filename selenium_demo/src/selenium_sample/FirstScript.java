package selenium_sample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
 
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://dev-esi-admin-kmywba2exq-uc.a.run.app/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("test@icanio.com");
		driver.findElement(By.id("password")).sendKeys("test");
		driver.findElement(By.cssSelector("#app > div > div > div > div.align-self-center.col-md-3 > div.login-box-inner.form-styling > div.d-flex.justify-content-center.mt-3.mr-2.mb-3 > button")).click();
		
	}
}
