import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Udemy_RahulShetty_Docs_Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//check if 2nd calender button is enabled ??
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_view_date2\']")).isEnabled());
		//Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\'ctl00_mainContent_view_date2\']")).isEnabled());
		
		/*driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_txt_Fromdate']")).click();
		driver.findElement(By.xpath("//a[contains(@class , 'ui-state-highlight')]")).click();*/

	}

}
