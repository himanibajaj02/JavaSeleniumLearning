import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\\\Udemy_RahulShetty_Docs_Java_Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		// build = builds the action ie execute the action.
		
		// Enter key in CAPS on
		a.moveToElement(driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"))).click()
				.keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//move to a specfic location and right click with mouse
		a.moveToElement(driver.findElement(By.xpath("//a[@id ='nav-link-accountList']"))).contextClick().build().perform();


	}

}