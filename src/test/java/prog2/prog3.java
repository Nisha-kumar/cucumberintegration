package prog2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class prog3 {
	WebDriver driver;
	
	@Given("users open testmeapp")
	public void users_open_testmeapp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.01\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");

}

@When("user enters username as {string}")
public void user_enters_username_as(String string) {
	driver.findElement(By.partialLinkText("SignIn")).click();
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(string);
    
}

@When("user enters password as {string}")
public void user_enters_password_as(String string) {
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string);
   
}

@When("user clicks login button")
public void user_clicks_login_button() {
	driver.findElement(By.xpath("//input[@id='/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]']")).click();
    
}

@When("verify login success")
public void verify_login_success() {

}
    

@Then("close testmeapp")
public void close_testmeapp1() {
	driver.close();
    
	}

	/*@When("user enters username as {string}")
	public void user_enters_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("verify login success")
	public void verify_login_success() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("close testmeapp")
	public void close_testmeapp() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}*/

}
