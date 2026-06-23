package Tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.FactorialPage;

public class Class4AboutLink extends BaseTest {


	@Test
	public void clickonAbout() {
		FactorialPage page = new FactorialPage(driver);

		page.clickonAbout();
		String url=driver.getCurrentUrl();
		Assert.assertTrue(url.contains("about"));
	}

	
	@Test
	public void verifyTotalLink()
	{
		FactorialPage page = new FactorialPage(driver);

		page.clickonAbout();
		List<WebElement> totalLinks= page.getAllLink();
		System.out.println("Total links are:  "+totalLinks.size());
		
		Assert.assertTrue(totalLinks.size()>5);

	System.out.println("Links Are :   ");
		for(WebElement link:totalLinks)
		{
			if(!link.getText().isEmpty())
			{
			System.out.println(link.getText());
			}
		}
	}
}
