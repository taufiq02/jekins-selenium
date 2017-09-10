import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_bootstrap {
	
	@Test
public void bootstrap() throws InterruptedException {
	

	
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
	

	WebDriver driver = new ChromeDriver();   //object that enables to open the chrome driver.
	driver.manage().window().maximize();   //maximize window
	
	driver.get(" http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
	driver.findElement(By.xpath(".//*[@id='menu1']")).click();
	Thread.sleep(2000);
	
	List<WebElement> dd_menu=driver.findElements(By.xpath(".//*[@id='post-body-4615304122771162527']/div[1]/div/ul"));
	//we are using enhanced for loop to get to elements.
	
	//store all the webelements of xpath and from their print all the inner html.
	for (int i=0; i<dd_menu.size();i++)
		
	{
		//for every elements it will print the name using inner html.
		WebElement element=dd_menu.get(i);
		
		//from the all the html just select the inner html and print inner html.
		String innerhtml=element.getAttribute("innerHTML");
		System.out.println(innerhtml);
	
		
		//here we will verify if link(item) is equal to java script.
		if (element.getAttribute("innerHTML").contains("JavaScript")) {
			//if yes then click on link(item)
			
			element.click();
			//break the loop or come out of loop
			break;
		}
		}
	
	
	
	
	
	driver.close();
	driver.quit();
	
	
	}
	}
	
