package corejava1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonCount {

	public static void main(String[] args) {
		String baseurl ="http://apps.qaplanet.in/qahrm/login.php";
		System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(baseurl);
		
		WebElement wb =driver.findElement(By.name("txtUserName"));
		wb.sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("user1");
		driver.findElement(By.name("Submit")).click();
		
		int buttoncount = driver.findElements(By.className("plainbtn")).size();
		System.out.println(buttoncount);
		driver.close();
		}

}
