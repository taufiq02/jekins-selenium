import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Java_selenium {

@Test               //Junit automation.it is a test runner and view test.
public void test() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();   //object that enables to open the chrome driver.
		driver.manage().window().maximize();
	driver.get("http://www.qtptutorial.net/automation-practice/");
	
	if (driver.findElement(By.id("idExample")).isDisplayed()){
	System.out.println("webpage is working");}
	else
	{System.out.println("webpage is not working");}
	
	driver.findElement(By.id("idExample")).click();
if (driver.findElement(By.className("main_title")).isDisplayed())
	{System.out.println("first button is taking me to the webpage");}
else
{System.out.println("first button is not working");}


Thread.sleep(2000);

driver.navigate().back();  //takes me to the back page
	
driver.findElement(By.className("buttonClassExample")).click();

if (driver.findElement(By.className("main_title")).isDisplayed())
{System.out.println("second button is taking me to the webpage");}
else
{System.out.println("second button is not working");}

driver.navigate().back();


driver.findElement(By.name("NameExample")).click();
if (driver.findElement(By.className("main_title")).isDisplayed())
{System.out.println("third button is taking me to the webpage");}
else
{System.out.println("third button is not working");}

driver.navigate().back();

driver.close();
	driver.quit();
}

@Before   //this annotation will execute this methodfirst


public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
	
}


@Test
public void Email() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
	

	WebDriver driver = new ChromeDriver();   //object that enables to open the chrome driver.
	driver.manage().window().maximize();
	driver.get("http://www.qtptutorial.net/automation-practice/");
driver.findElement(By.id("et_pb_signup_firstname")).sendKeys("tom");
Thread.sleep(2000);
driver.findElement(By.id("et_pb_signup_email")).sendKeys("tom@gmail.com");
Thread.sleep(2000);

driver.findElement(By.className("et_pb_newsletter_button_text")).click();
Thread.sleep(2000);
driver.close();
driver.quit();
}
}




