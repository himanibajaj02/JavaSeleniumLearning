import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//D:\\Udemy_RahulShetty_Docs_Java_Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe
		//webdriver.gecho.driver
		
		System.setProperty("webdriver.gecko.driver", "D:\\Udemy_RahulShetty_Docs_Java_Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
	}

}
