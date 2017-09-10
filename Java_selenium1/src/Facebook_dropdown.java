import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_dropdown {
	
@Test	
	public void facebook() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
	

	WebDriver driver = new ChromeDriver();   //object that enables to open the chrome driver.
	driver.manage().window().maximize();   //maximize window
	driver.get("https://www.facebook.com/");
	WebElement month =driver.findElement(By.id("month"));
	//Select x = new Select (driver.findElement(By.id("month")));	
	Select x = new Select (month);
	x.selectByVisibleText("Jan");
	x.selectByIndex(7);
	
	WebElement day =driver.findElement(By.id("day"));
	Select x1 =new Select (day);
	x1.selectByIndex(10);
	
	WebElement year =driver.findElement(By.id("year"));
	Select x2 =new Select (year);
	x2.selectByVisibleText("1983");;
	}

}
