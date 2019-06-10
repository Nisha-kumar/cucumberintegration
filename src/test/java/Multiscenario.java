import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Multiscenario {
	
	WebDriver driver;

	@When("testme displays welcome message")
	public void testme_displays_welcome_message() {
		
		

			System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.01\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
			driver=new ChromeDriver();
			driver.get("http://10.232.237.143:443/TestMeApp/");

		System.out.println("WELCOME");
	    
	}
	
	

	@When("user performs login operation")
	public void user_performs_login_operation() {
		driver.findElement(By.partialLinkText("SignIn")).click();
		/*driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("monisha");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");*/
		driver.findElement(By.xpath("//input[@id='/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]']")).click();
	    
	    
	}

	@When("user searching for product available in cart")
	public void user_searching_for_product_available_in_cart() {
	    
	}

	@When("user validating the cart")
	public void user_validating_the_cart() {
	   
	}

	@When("user performs payment")
	public void user_performs_payment() {
	   
	}

	@When("user performs logout")
	public void user_performs_logout() {
		driver.close();
	    
	}


}
