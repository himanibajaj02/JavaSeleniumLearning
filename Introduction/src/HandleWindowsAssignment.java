import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Udemy_RahulShetty_Docs_Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		//click on Multiple Windows
		driver.findElement(By.xpath("//*[@id='content']/ul/li[33]/a")).click();
		driver.findElement(By.xpath("//a[contains(text() , 'Click Here')]")).click();
		
		Set <String> ids = driver.getWindowHandles();
		Iterator <String> itr = ids.iterator();
		
		String parentId = itr.next();
		String childId = itr.next();
		
		//go to child window
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//div[@class = 'example']//h3")).getText());
		
		//go to parent window 
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//div[@class = 'example']//h3")).getText());

	}

}
