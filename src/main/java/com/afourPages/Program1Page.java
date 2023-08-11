package com.afourPages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Program1Page {
	
	String searchText;
	
	private WebDriver driver;
	

	@FindBy(name = "q")
	private	WebElement gglSrchWE;
	
	@FindBy(name = "btnK")
	private WebElement gglSrchBtnWE;
	
	@FindBy(xpath = "//a[@aria-label = 'Page 7']")
	private WebElement forPagingWE;
	
	@FindBy(xpath = "//div[@class = 'IsZvec']//span/em")
	private static List<WebElement> allResultListWE;
	
	@FindBy(xpath = "//a[@aria-label = 'Page']")
	private List<WebElement> listPaginationWE;
	
	public Program1Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public void enterUrl(String url)
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	public void searchFor(String searchTxt)
	{
		gglSrchWE.sendKeys(searchTxt);
		gglSrchBtnWE.submit();
		
		searchText = searchTxt;
		//searchText = "employees are working";
	}
	
	public void srchByNavigate()
	{
		System.out.println("Enter in srchByNavigate1");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)", "");
		System.out.println("Enter in srchByNavigate2");
		
		int counter = 1;
		boolean flag = true;
		
					
			List<WebElement> results = driver.findElements(By.xpath("//div[@id='rso']"));
			
//			for(int j=0;j<=results.size();j++)
//			{
//				System.out.println("===========================");
//				System.out.println(results.getText().contains(searchText));
				
//				for(WebElement asd:driver.findElements(By.xpath("//div[@id='rso']")))
//				{
//					System.out.println(asd.getText().contains(searchText));
//				}
//				
//				for(WebElement aaa: results.size())
//				{
//					System.out.println(aaa.getText());
//				}
				
			//for(WebElement page: listPaginationWE)
			for(int i=2; i<=5; i++)
			{				
			
				for(WebElement lstResult: allResultListWE) //Why its become static
				{
					String strResultText = lstResult.getText(); 
					System.out.println("<<<<<<<<<<<<<<<"+strResultText);
					if(!strResultText.toLowerCase().contains(searchText))
					{
						System.out.println(counter);
						counter++;
						System.out.println("Do not Found Matching Word!");
						flag = false;
						break;
					}
					
				}
				if(flag == true)
				break;
				WebElement abcWE = driver.findElement(By.xpath("//a[@aria-label = 'Page "+i+"']"));
				abcWE.click();
				
			}
			//}
//			System.out.println("Result====="+results.get(j).getText());
				
//			}
				
//			for(int i=2; i<=5; i++)
//			{
//			WebElement abcWE = driver.findElement(By.xpath("//a[@aria-label = 'Page "+i+"']"));
//			abcWE.click();
//		}
		
		//driver.quit();		//div[@class = 'IsZvec']//span/em
		
	}
	
}
