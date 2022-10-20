package week2.Assignment;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3_4 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Your most favorite browser
		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[9]")).click();
		//UnSelectable
		WebElement selectPlace = driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']"));
		selectPlace.click();
		//Find the default select radio button
		boolean browser = driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td[3]/div[1]/div[2]/span[1]")).isEnabled();
		System.out.println(browser);
		//Select the age group (only if not selected)
		WebElement ageGroup = driver.findElement(By.xpath("//div[@id='j_idt87:age']/div[1]/div[1]/div[1]/div[2]/span[1]"));
		ageGroup.click();
		}
	}


