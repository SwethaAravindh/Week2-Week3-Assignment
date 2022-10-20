package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {
	public static void main(String[] args) {
		//setup driver		
		WebDriverManager.chromedriver().setup();		
		//Open Ede Browser
		//EdgeDriver driver=new EdgeDriver();	
		ChromeDriver driver=new ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("crmsfa");		
		WebElement loginbtn = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		loginbtn.click();
		WebElement crmsfaLink = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		crmsfaLink.click();		
		WebElement elementLeads = driver.findElement(By.xpath("//a[text()='Leads']"));
		elementLeads.click();
		WebElement createNewLeads = driver.findElement(By.xpath("//a[text()='Create Lead']"));
		createNewLeads.click();
		WebElement companyName = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		companyName.sendKeys("ZOHO");

}
}
