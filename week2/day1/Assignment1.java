package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static void main(String[] args) {
		//setup driver
		WebDriverManager.operadriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.chromedriver().setup();
		//Open Chrome Browser
		//OperaDriver driver=new OperaDriver();
		//EdgeDriver driver=new EdgeDriver();
		ChromeDriver driver=new ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser
		driver.manage().window().maximize();
		//Find an element
		WebElement elementUsername = driver.findElement(By.id("username"));
		//Action on element found
		elementUsername.sendKeys("demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		//Action on element found
		elementPassword.sendKeys("crmsfa");
		WebElement elementLogin =driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("TCS");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Allen");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Frudo");
		WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys("TCOE");
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("Learn Selenium");
		WebElement primaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		primaryEmail.sendKeys("swethasiva@gmail.com");
		WebElement createLead = driver.findElement(By.className("smallSubmit"));
		createLead.click();
		System.out.println("Title is" + driver.getTitle());
		//close browser
		//driver.close();
	}

}
