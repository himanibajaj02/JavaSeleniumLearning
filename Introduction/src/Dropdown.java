import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Udemy_RahulShetty_Docs_Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Assert.assertFalse(false);
		
		//check box - friend and family
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		//count the number of checkboxes on the screen
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("divpaxinfo")).click();
		Select s = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
		s.selectByValue("2");
		s.selectByIndex(3);
		s.selectByVisibleText("5");
		
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")).getText(), "5");
		//System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")).getText());
		
		//driver.findElement(By.id("//select[@id='ctl00_mainContent_ddl_Adult']")).click();
		
		//FROM
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		//BANGLORE
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//TO
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		//AJMER selected using INDEX
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//AJMER selected using parent child relation
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

		
		
		
	}

}
