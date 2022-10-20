package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSeleniumCode {
	public static void main(String[] args) {
		//setup driver
		WebDriverManager.operadriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.chromedriver().setup();
		//Open Chrome Browser
		//OperaDriver driver=new OperaDriver();
		EdgeDriver driver=new EdgeDriver();
		//ChromeDriver driver=new ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the browser
		driver.manage().window().maximize();
		//close browser
		driver.close();
}
}
