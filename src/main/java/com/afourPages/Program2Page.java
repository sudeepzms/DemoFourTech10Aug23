package com.afourPages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Program2Page {
	WebDriver driver;

	@FindBy(xpath = "//a[text()= ' Arrivals ']")
	WebElement menuArrivalBtnWE;
	
	@FindBy(xpath = "//div[@role = 'tabpanel']")  ////div[@role = "tabpanel"]  it is for complete table
	WebElement completePanlWE;
	
	@FindBy(xpath = "//*[@id=\"cnt-data-content\"]/div/div[2]/div/aside/div[1]/table/tbody")
	WebElement tableWE;
	
	public Program2Page(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void enterUrl(String url2)
	{
		System.out.println("driver::::::::::::::::::::"+driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url2);
	}

	public void clickOnArrivalBtn()
	{
		menuArrivalBtnWE.click();
	}
	
	public void goToArrival()
	{
		clickOnArrivalBtn();
		//System.out.println(completePanlWE.findElements(By.tagName("td")));
		
		//*[@id="cnt-data-content"]/div/div[2]/div/aside/div[1]/table/thead/tr[1]
		//*[@id="cnt-data-content"]/div/div[2]/div/aside/div[1]/table/tbody/tr[98]
		//*[@id="cnt-data-content"]/div/div[2]/div/aside/div[1]/table/tbody/tr[99]
		//*[@id="cnt-data-content"]/div/div[2]/div/aside/div[1]/table/tbody/tr[132]
		//*[@id="cnt-data-content"]/div/div[2]/div/aside/div[1]/table/tbody/tr[59]
		
	//tableXpath ==	//*[@id="cnt-data-content"]/div/div[2]/div/aside/div[1]/table
		
		List<WebElement>rows = driver.findElements(By.xpath("//table[@class ='table table-condensed table-hover data-table m-n-t-15']//tbody//tr[@class='hidden-xs hidden-sm ng-scope']"));
		//int rowCount = rows.size();
		
		//List<WebElement>rows = driver.findElements(By.xpath("//*[@id=\"cnt-data-content\"]/div/div[2]/div/aside/div[1]/table/tbody/tr"));
		int rowCount = rows.size();		
		System.out.println("Row Counts: "+rowCount);
		
		
		//System.out.println("Row Display "+rows);
		System.out.println("==================");
		
//		for(int i = 45; i<rowCount; i++)
//		{
//		System.out.println("Row Texts are: "+rows.get(i));
//		}
		
		String beforeXpath = "//*[@id=\"cnt-data-content\"]/div/div[2]/div/aside/div[1]/table/tbody/tr[";
		String afterXpath = "]";
		
		for(int r = 51; r<=116; r++)
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("*******************");
//			String actualXpath = beforeXpath+i+afterXpath;
//			WebElement element = driver.findElement(By.xpath(actualXpath));
//			System.out.println(element.getText());
			
		/* To print complete Rows 	
			String fromText = driver.findElement(By.xpath("//table[@class ='table table-condensed table-hover data-table m-n-t-15']//tbody//tr["+r+"]")).getText();
			System.out.println("Name are FROM: "+fromText);
		*/	
			
		/*To print rows with column basis*/
			String time = driver.findElement(By.xpath("//table[@class ='table table-condensed table-hover data-table m-n-t-15']//tbody//tr["+r+"]//td[2]")).getText();
		//	String flight = driver.findElement(By.xpath("//table[@class ='table table-condensed table-hover data-table m-n-t-15']//tbody//tr["+r+"]//td[2]")).getText();
		//	String from = driver.findElement(By.xpath("//table[@class ='table table-condensed table-hover data-table m-n-t-15']//tbody//tr["+r+"]//td[3]")).getText();
		//	String airline = driver.findElement(By.xpath("//table[@class ='table table-condensed table-hover data-table m-n-t-15']//tbody//tr["+r+"]//td[4]")).getText();
		//	String aircraft = driver.findElement(By.xpath("//table[@class ='table table-condensed table-hover data-table m-n-t-15']//tbody//tr["+r+"]//td[5]")).getText();
		//	String status = driver.findElement(By.xpath("//table[@class ='table table-condensed table-hover data-table m-n-t-15']//tbody//tr["+r+"]//[td[6]")).getText();
			
		//	System.out.println(time+"  "+flight+"  "+from+"  "+airline+"  "+aircraft+"  "+status);
			System.out.println(time);
//			if(element.getText().equals("Hyderabad"))
//			{
//				System.out.println("Name are: "+ element.getText()+" is found"+" at position: "+(i-1));
//				break;
//			}
		}
		
		
		
	}
	
}
