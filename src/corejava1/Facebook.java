package corejava1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		WebElement UserName=driver.findElement(By.id("email"));
		Actions builder=new Actions(driver);
		
		Action seriesOfActions=builder.moveToElement(UserName).click().sendKeys(UserName,"hello").
				doubleClick(UserName).contextClick().build();
		
		seriesOfActions.perform();
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
