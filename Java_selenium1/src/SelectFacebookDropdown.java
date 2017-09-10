
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFacebookDropdown 
{
	@Test
	public void selectDDValues() throws InterruptedException
	
	{
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement month_dropdown=driver.findElement(By.id("month"));
	Select month_dd=new Select(month_dropdown);
	
	WebElement selected_value=month_dd.getFirstSelectedOption();
	System.out.println("Before Selection selected values is "+selected_value.getText());
	//it will select march
	month_dd.selectByIndex(3);
	WebElement selected_value1=month_dd.getFirstSelectedOption();
	System.out.println("After Selection selected values is "+selected_value1.getText());
	
	Thread.sleep(3000);
	//it will select oct
	month_dd.selectByValue("10");
	
	Thread.sleep(3000);
	
	//it will select august
	month_dd.selectByVisibleText("Aug");
	
	
		
	}

}
