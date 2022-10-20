package week2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3_6 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Which is your favorite UI Automation tool?
		WebElement automationTool = driver.findElement(By.className("ui-selectonemenu"));
		Select Tool= new Select(automationTool);
		Tool.selectByVisibleText("Selenium");
		//Choose your preferred country.
		WebElement selectCountry = driver.findElement(By.id("j_idt87:country_label"));
		selectCountry.click();
		driver.findElement(By.id("j_idt87:country_3")).click();
		//Choose the Course
		WebElement chooseCourse = driver.findElement(By.xpath("//input[@placeholder='Choose Course']"));
		chooseCourse.sendKeys("se");
		driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']")).click();
		//Choose language randomly
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[@data-label='Tamil']")).click();
		//Select 'Two' irrespective of the language chosen
		//driver.findElement(By.id("j_idt87:value_label")).click();
		//driver.findElement(By.id("j_idt87:value_1")).click();
		
		
	}

}
