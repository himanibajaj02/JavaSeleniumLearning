import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\Udemy_RahulShetty_Docs_Java_Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		//click on nested frames link
		driver.findElement(By.xpath("//a[contains(text() , 'Nested Frames')]")).click();
		int numberOfFrames = driver.findElements(By.tagName("frameset")).size();
		System.out.println(numberOfFrames);
		
		//go to frame - top and then switch to middle frame.
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.xpath("//div[@id = 'content']")).getText());

	}

}