package week2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement createNewUser = driver.findElement(By.linkText("Create New Account"));
		createNewUser.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Swetha");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Aravindh");
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		phoneNumber.sendKeys("1234567890");
		WebElement newPassword = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		newPassword.sendKeys("SweAra123");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select dd= new Select(day);
		dd.selectByVisibleText("20");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select mm= new Select(month);
		mm.selectByIndex(5);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select yy= new Select(year);		
		yy.selectByValue("1998");
		WebElement gender = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		gender.click();				
	}

}
