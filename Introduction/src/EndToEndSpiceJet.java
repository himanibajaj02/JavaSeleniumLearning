import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEndSpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Udemy_RahulShetty_Docs_Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		//Verify one way radio button is checked default.
		System.out.println("One way radio button enabled" + " " +driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isEnabled());
		
		//Verify since one way trip enabled , the return calender is disabled. if not , enable one way trip.
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Since One way is enabled , therefore return calender is disabled");
		}
		else
		{
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		}
		
		//Enter source place
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value = 'BLR']")).click();
		Thread.sleep(2000);
		
		//Enter destination place
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click(); 
		
		//Enter Start Date
		driver.findElement(By.xpath("//a[contains(@class , 'ui-state-highlight')]")).click();
		
		//Enter number of Passengers and print/Assert the number of passengers added
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Select s = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
		s.selectByValue("2");
		s.selectByIndex(3);
		s.selectByVisibleText("5");
		
		//Click on search button
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}