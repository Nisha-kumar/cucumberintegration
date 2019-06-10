import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Searches {
	WebDriver driver;
	@Given("open testmeapp")
	public void open_testmeapp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.01\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");

}
	   
	

	@When("user enters {string}")
	public void user_enters(String string) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='myInput]")).sendKeys(string);
		Thread.sleep(3000);
		
	    
	   
	}

	@When("user clicks enter")
	public void user_clicks_enter() {
	   Actions act=new Actions(driver);
	   act.sendKeys(Keys.ENTER).click().build().perform();
	}


}
