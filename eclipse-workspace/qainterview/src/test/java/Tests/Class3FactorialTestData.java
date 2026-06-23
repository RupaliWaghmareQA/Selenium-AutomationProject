package Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.FactorialPage;

public class Class3FactorialTestData extends BaseTest

{

	
	@Test(dataProvider="FactorialData")
	public void verifyFactorial(int num, String expResult)
	{
		FactorialPage page=new FactorialPage(driver);

		page.enterNumber(String.valueOf(num));
		page.clickOnButton();
		
		String actulResult=page.getResultText();
		Assert.assertTrue(actulResult.contains(expResult));
	}
	
	
	@DataProvider(name="FactorialData")
	public Object[][]  getData()
	{
	
		return new Object[][]
				{
					{4,"24"},
					{5,"120"},
					{6,"720"},
					{7,"5040"},
					{8,"40320"},
					{9,"362880"},
					{10,"3628800"}
					
			   };
			
				
	}
}
