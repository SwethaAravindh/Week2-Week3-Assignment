package week2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3_5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Basic Checkbox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//Notification
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		boolean displayed = driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
		System.out.println(displayed);
		//Choose your favorite language(s)
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		//Tri State Checkbox
		/*Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();
		boolean state1 = driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed();
		System.out.println(state1);
		driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']//span[1]")).click();
		boolean state2 = driver.findElement(By.xpath("//p[text()='State = 2']")).isDisplayed();
		System.out.println(state2);
		driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']//span[1]")).click();
		boolean state3 = driver.findElement(By.xpath("//span[@class='ui-growl-image ui-growl-image-info']")).isDisplayed();
		System.out.println(state3);*/
	}

}
