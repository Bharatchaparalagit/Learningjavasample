package corejava1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoitExample {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("user1");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		//enter the name of the employee.......
		driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("Tungala");
		Thread.sleep(2000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Mahesh");
		// click on browser button to upload a file....
		driver.findElement(By.xpath("//*[@id='photofile']")).click();
		Runtime.getRuntime().exec("C:\\Users\\Bharat\\Desktop\\FileUpload.exe");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
