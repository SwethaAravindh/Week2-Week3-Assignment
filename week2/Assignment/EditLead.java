package week2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
		//Open Ede Browser
		//EdgeDriver driver=new EdgeDriver();	
		ChromeDriver driver=new ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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
		WebElement findLeads = driver.findElement(By.linkText("Find Leads"));
		findLeads.click();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.xpath("//input[@id='ext-gen248']"));		
		firstName.sendKeys("Allen");
		Thread.sleep(2000);
		WebElement findLeadsBtn = driver.findElement(By.xpath("//button[@id='ext-gen334']"));
		findLeadsBtn.click();		
		Thread.sleep(2000);
		WebElement selectLead = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		selectLead.click();
		System.out.println("Title is" + driver.getTitle());
		WebElement editbtn = driver.findElement(By.linkText("Edit"));
		editbtn.click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("Accenture");
		Thread.sleep(2000);
		WebElement updatebtn = driver.findElement(By.xpath("//input[@class='smallSubmit']"));
		updatebtn.click();
		String updatedCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(updatedCompanyName);
		//driver.close();
	}

}
