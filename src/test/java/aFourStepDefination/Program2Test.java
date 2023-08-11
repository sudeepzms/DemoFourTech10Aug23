package aFourStepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.afourPages.Program2Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Program2Test {

	WebDriver driver;
	Program2Page program2PgObj;
	
	public Program2Test()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		this.program2PgObj = new Program2Page(driver);
	}
	
		
	@Given("^Navigate to Url as \"([^\"]*)\"$")
	public void navigate_to_Url_as(String url2)
	{
		program2PgObj.enterUrl(url2);
	}

	@Then("^Go to Arrivals and Search For Flights$")
	public void go_to_Arrivals_and_Search_For_Flights()
	{
		program2PgObj.goToArrival();
	}
}
