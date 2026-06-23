package Tests;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.FactorialPage;

public class Class5AutomateBug extends BaseTest { 

	@Test
	public void largeNumberNotHandeled() {
		FactorialPage page = new FactorialPage(driver);
		page.enterNumber("1000");
		page.clickOnButton();
		//page.getResultText();

		 
WebElement result= driver.findElement(By.id("resultDiv"));
String text =result.getText();
Assert.assertTrue(text.isEmpty(),"Result is empty for large input");
	
	}

}
