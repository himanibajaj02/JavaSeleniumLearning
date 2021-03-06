import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Himani Bajaj";
		System.setProperty("webdriver.chrome.driver",
				"D:\\Udemy_RahulShetty_Docs_Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Enter string into textbox to get the java alert

		driver.findElement(By.xpath("//input[@name = 'enter-name']")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();

		// Alert is open ---> Accept the alert. So u need to switch to alert window from
		// the browser window and then accept it.
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		// Open the alert again to accept or reject
		driver.findElement(By.xpath("//input[@name = 'enter-name']")).sendKeys(text);
		driver.findElement(By.xpath("//input[@value = 'Confirm']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
