package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.FactorialPage;
import pages.BasePage;


public class Class2PageValidation extends BaseTest{
	
	//WebDriver driver;

	@Test
	public void verifyPlaceholder()
	{
		//Verify placeholder
	    FactorialPage page = new FactorialPage(driver);
				
		String placeholder =page.getTextBoxPlaceholder();
			
		Assert.assertEquals(placeholder, "Enter an integer");

		

		
	}
	@Test
	public void verifyTitleOfthePage()
	{
	    FactorialPage page = new FactorialPage(driver);
	
		//verify the Titleof the page
		
		String title=page.getTitleOfthePage();
		Assert.assertEquals(title, "Factoriall");
	
	}
	
	@Test
	public void verifyPageURL()
	{
		//Verify the URL contains https
	    FactorialPage page = new FactorialPage(driver);

		
		String url=page.getURLOfpage();
		Assert.assertTrue(url.contains("https:"));
	}


}
