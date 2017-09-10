import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	@Test
	public void Email() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();   //object that enables to open the chrome driver.
		driver.manage().window().maximize();
		driver.get("http://www.qtptutorial.net/automation-practice/");
		//driver.findElement(By.xpath("//input[@id='et_pb_signup_firstname']")).sendKeys("tom");
		//driver.findElement(By.id("et_pb_signup_firstname")).sendKeys("tom");
	
	Thread.sleep(2000);
	//driver.findElement(By.id("et_pb_signup_email")).sendKeys("tom@gmail.com");
	
	//driver.findElement(By.xpath("//input [@id='et_pb_signup_email']")).sendKeys("tom@gmail.com");
	//driver.findElement(By.xpath("//a[@class='et_pb_newsletter_button']")).click();
	//driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("html/body/div[1]/div[2]/div/article/div/div[4]/div/div/div/form[1]/input")).click();
	driver.findElement(By.xpath("html/body/div[1]/div[2]/div/article/div/div[4]/div/div/div/form[2]/input")).click();
	Thread.sleep(2000);

	driver.findElement(By.className("et_pb_newsletter_button_text")).click();
	Thread.sleep(2000);
	driver.close();
	driver.quit();
	}
	}




