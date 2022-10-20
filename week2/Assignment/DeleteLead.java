package week2.Assignment;

import java.time.Duration;

import javax.print.event.PrintEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
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
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("ZOHO");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Frudo");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Allen");
		WebElement phoneNumber = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		phoneNumber.sendKeys("9876543210");
		WebElement createLead = driver.findElement(By.className("smallSubmit"));
		createLead.click();
		WebElement elementLeads = driver.findElement(By.xpath("//a[text()='Leads']"));
		elementLeads.click();
		WebElement findLeads = driver.findElement(By.linkText("Find Leads"));
		findLeads.click();
		Thread.sleep(2000);	
		WebElement phoneBtn = driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]"));
		phoneBtn.click();
		WebElement enterPhoneNumber = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		enterPhoneNumber.sendKeys("9876543210");
		Thread.sleep(2000);
		WebElement findLeadsBtn = driver.findElement(By.xpath("//button[@id='ext-gen334']"));
		findLeadsBtn.click();
		Thread.sleep(2000);
		WebElement resultingLead = driver.findElement(By.xpath("(//a[contains(@class,'linktext')])[4]"));
		resultingLead.getAttribute("href");		
		resultingLead.click();
		WebElement deletebtn = driver.findElement(By.linkText("Delete"));
		deletebtn.click();
		Thread.sleep(2000);
		WebElement findLeads1 = driver.findElement(By.linkText("Find Leads"));
		findLeads1.click();
		Thread.sleep(2000);
		WebElement leadId = driver.findElement(By.xpath("//input[@name='id']"));		
		leadId.getAttribute("resultingLead");
		findLeadsBtn.click();
		WebElement verifyMessage = driver.findElement(By.xpath("//div[@id='ext-gen437']"));
		System.out.println(driver.findElement(By.xpath("//div[@id='ext-gen437']")).getText());
		verifyMessage.getText().equals(verifyMessage);
		verifyMessage.isDisplayed();
		driver.close();
}
}
