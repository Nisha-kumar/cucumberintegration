

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility {
	public static WebDriver getDriver(String browser)
{
 if (browser.equals ("Chrome"))
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.01\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
 
	return new ChromeDriver(); 
 }
 else if(browser.equals ("firefox"))
 {
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\training_c2a.05.01\\Downloads\\geckodriver-v0.24.0-win32");
  return new FirefoxDriver();
 }
 else
	 return null;
}



}
