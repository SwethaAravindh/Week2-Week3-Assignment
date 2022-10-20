package week2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3_3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Take me to dashboard
		driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		//Find my destination
		String myDesitination = driver.findElement(By.xpath("//a[@class='ui-link ui-widget']")).getAttribute("href");
		System.out.println(myDesitination);
		//Am I broken link?
		driver.findElement(By.linkText("Broken?")).click();
		WebElement errorPage = driver.findElement(By.xpath("//td[text()='404']"));
		System.out.println(errorPage.isDisplayed());
		
		if (errorPage.isDisplayed()) {
			System.out.println("Link is broken");
			
		}
		else {
			System.out.println("Link is not broken");
			
		}
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		//Duplicate Link
		
		driver.findElement(By.linkText("Go to Dashboard")).click();
	}

}
