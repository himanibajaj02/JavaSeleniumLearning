import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\\\Udemy_RahulShetty_Docs_Java_Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		// Number of Links in the entire page
		int numberOfLinksOnPage = driver.findElements(By.tagName("a")).size();
		System.out.println(numberOfLinksOnPage);

		// Number of Links in the footer section of the page
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		int numberOfLinksOnFooter = footerdriver.findElements(By.tagName("a")).size();
		System.out.println(numberOfLinksOnFooter);

		// Number of links in the footer sections left column
		WebElement footerLeftDriver = footerdriver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		int numberOfLinksOnFooterLeft = footerLeftDriver.findElements(By.tagName("a")).size();
		System.out.println(numberOfLinksOnFooterLeft);

		// click on each link and verify if pages are opening.
		List<WebElement> leftFooterLinks = footerLeftDriver.findElements(By.tagName("a"));
		for (int i = 1; i < numberOfLinksOnFooterLeft; i++) {
			// click on link and open in different window
			leftFooterLinks.get(i).sendKeys(Keys.CONTROL, Keys.ENTER);
			Thread.sleep(5000L);

			/*
			 * leftFooterLinks.get(i).click(); System.out.println(driver.getTitle());
			 * driver.navigate().back();
			 */

		}

			//Go to each window and grab the title

			Set<String> windows = driver.getWindowHandles();
			Iterator<String> itr = windows.iterator();

			while (itr.hasNext()) {
				driver.switchTo().window(itr.next());
				System.out.println(driver.getTitle());
			}
		

	}

}
