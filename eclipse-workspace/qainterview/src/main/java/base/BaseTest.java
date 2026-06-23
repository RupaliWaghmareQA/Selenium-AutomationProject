package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import driverfactory.DriverFactory;

public class BaseTest {

	public WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		driver = DriverFactory.initDriver(browser);
		driver.get("https://qainterview.pythonanywhere.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	}

	@AfterMethod
	public void tearDown() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));

		
		
		DriverFactory.quiteDriver(driver);
	}
}
