package week2.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3_2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01uwse2e3mjhu41g6ob84cjmhcy363172.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click and Confirm title.
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		if(title1.equals(title2)) {
			System.out.println("title1 is not clicked");
		}
		else {
			System.out.println("title1 is clicked successfully");
		}
		//Confirm if the button is disabled.
		driver.navigate().to("https://www.leafground.com/button.xhtml;jsessionid=node01uwse2e3mjhu41g6ob84cjmhcy363172.node0");
		boolean buttonenabled = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled();
	    System.out.println(buttonenabled);
	    //Find the position of the Submit button
	    Point getPosition = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).getLocation();
	    System.out.println(getPosition);
	    //Find the height and width of this button
	    Dimension gethight = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).getSize();
	    System.out.println(gethight);
	    //Mouse over and confirm the color changed
	    String getColour = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).getCssValue("background-colour");
	    System.out.println(getColour);
	}

}
