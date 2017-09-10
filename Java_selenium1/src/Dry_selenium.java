import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dry_selenium {
	@Test
	public void login()  {
		
System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();   //object that enables to open the chrome driver.
		driver.manage().window().maximize();
		driver.get("http://demosite.center.net/automation-practice/");	
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("demo123");
		driver.findElement(By.id("wp-submit")).click();
		driver.close();
		driver.quit();
		
		
	}
		
	}
