package corejava1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExamples {

	public static void main(String[] args) {
		
		String baseurl ="http://newtours.demoaut.com/";
		System.setProperty("webdriver.gecko.driver","C:\\Browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(baseurl);
		WebElement link_Home= driver.findElement(By.linkText("Home"));
		WebElement td_Home= driver.findElement(By.xpath("//html/body/div"                + "/table"
                + "/tbody"
                + "/tr/td"
                + "/table"
                + "/tbody"
                + "/tr/td"
                + "/table/"
                + "tbody/"
                + "tr/td"
                + "/table"
                + "/tbody"
                + "/tr"));
        //create an object for Actions class..........
        Actions builder = new Actions(driver);
        //put the actions into a single action......
        Action mouseOverHome = builder
                .moveToElement(link_Home)
                .build();
        //get the background color of the home link....before mousehover.....
        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover: " + bgColor);
        
        //perform the mouseHover action now and then get the background color....
        mouseOverHome.perform();
        String bgColor1 = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor1);
       //driver.quit();
        driver.close();
		
	}

}