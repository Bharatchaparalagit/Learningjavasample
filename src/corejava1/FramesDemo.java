package corejava1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		String baseurl ="http://apps.qaplanet.in/qahrm/login.php";
		System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(baseurl);
		//login into the application........
				driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
				driver.findElement(By.name("txtPassword")).sendKeys("user1");
				driver.findElement(By.name("Submit")).click();
				
				//click on the ADD button by switching on to the frame.......
				//String firstName ="bharat";
				//String lastName  ="chap";
				driver.switchTo().frame("rightMenu");
				driver.findElement(By.xpath(".//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
				
				//add the employee details.....
				
				driver.findElement(By.name("txtEmpLastName")).sendKeys("chapa");
				driver.findElement(By.name("txtEmpFirstName")).sendKeys("kumar");
				driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
				
				
				driver.findElement(By.xpath("//*[@id='btnEditPers']")).click();
				Thread.sleep(2000);
				String fN=driver.findElement(By.xpath("//*[@id='txtEmpFirstName']")).getAttribute("value");
				String lN=driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).getAttribute("value");
				System.out.println("firstName :"+ fN);
				System.out.println("lastName : "+ lN);
				
				if(fN.equals("kumar")&&(lN.equals("chapa"))){
					System.out.println("Employee successfully added : TestCase Passed");
				}
				else
				{
					System.out.println("Add Employee failed : testcase failed");
				}
				
				driver.switchTo().defaultContent();
				//driver.switchTo().parentFrame();
				driver.findElement(By.xpath("html/body/div[3]/ul/li[3]/a")).click();
				
				driver.close();
				
	}

}
