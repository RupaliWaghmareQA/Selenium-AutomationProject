package driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver = null;

	public static WebDriver initDriver(String browser) {

		WebDriver driver = null;
		if (browser.equalsIgnoreCase("chrome")) {
			// ChromeDriver setup
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Edge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Program Files\\edgedriver_win64\\msedgedriver.exe");

			//WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;

	}


	public static void quiteDriver(WebDriver driver) {
		if (driver != null) {
			driver.quit();
		}

	}
}
