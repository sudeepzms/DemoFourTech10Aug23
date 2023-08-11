package aFourStepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.afourPages.Program1Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Program1Test {
	
	WebDriver driver;
	Program1Page program1pgObj;
	
	public Program1Test()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium Jar Files\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 this.program1pgObj = new Program1Page(driver);	
	}
	
	@Given("^Enter Url as \"([^\"]*)\"$")
	public void enter_Url_as(String url) {
		program1pgObj.enterUrl(url);	  
	}

	@Then("^Search For \"([^\"]*)\"$")
	public void search_For(String arg1){
		program1pgObj.searchFor(arg1);
	   
	}

	@Then("^Print The Description$")
	public void print_The_Description() {
		program1pgObj.srchByNavigate();
	}

}
