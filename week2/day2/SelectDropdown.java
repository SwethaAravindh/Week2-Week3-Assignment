package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
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
		companyName.sendKeys("ZOHO");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Swetha");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Aravindh");
		WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys("Automtion Tester");
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("Learn Selenium");
		WebElement primaryEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		primaryEmail.sendKeys("swethasiva@gmail.com");
		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select ID= new Select(source);
		ID.selectByVisibleText("Employee");
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select IND= new Select(industry);
		IND.selectByValue("IND_FINANCE");
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select OWN= new Select(ownership);
		OWN.selectByIndex(3);
		driver.close();
	}
	
	
}

