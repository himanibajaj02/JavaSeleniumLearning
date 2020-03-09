import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a driver object for the "Specific" browser
		// example: create a driver object for chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\Udemy_RahulShetty_Docs_Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		//System.out.println(driver.getPageSource());
		driver.get("https://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.get("https://epmqa.esmsolutions.com/");
		driver.findElement(By.id("email")).sendKeys("offshoreqa11@esmsolutions.com");
		driver.findElement(By.name("password")).sendKeys("epm#357");
		driver.findElement(By.id("loadButton")).click();
		driver.close();

	}

}
