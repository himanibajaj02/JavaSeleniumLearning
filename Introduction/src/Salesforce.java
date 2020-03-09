import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Udemy_RahulShetty_Docs_Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector("#username")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("79879797");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		String ErrorMessage = driver.findElement(By.className("loginError")).getText();
		System.out.println(ErrorMessage);
		driver.close();
		
		
		// Xpath for travelling from one sibling to other - //div[contains(@class , 'remember')]/input/following-sibling::label
		// Xpath for travelling from parent to sibling - //div[contains(@class , 'remember')]/label
		//Xpath for travelling from child to parent - //label[@for='rememberUn']/parent::div




	}

}
