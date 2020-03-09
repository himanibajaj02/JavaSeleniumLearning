import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\Udemy_RahulShetty_Docs_Java_Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Check on Option 2 in the checkbox
		driver.findElement(By.id("checkBoxOption2")).click();
		
		//Grab Label of selected box
		String labelName = driver.findElement(By.id("checkBoxOption2")).getText();
		System.out.println(labelName);
		
		//select the same labelname from the drop down
		Select s = new Select(driver.findElement(By.xpath("//select[@id = 'dropdown-class-example']")));
		s.selectByValue(labelName);
		
		// Enter labelname in the textbox
		driver.findElement(By.xpath("//input[@id = 'name']")).sendKeys(labelName);
		
		//click on Alert button and check if the text has labelname in it.
		driver.findElement(By.xpath("//input[@id = 'alertbtn']")).click();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage.contains(labelName));
		
		
	}

}
