package ApplicationHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.driverFactory;
import config.configReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class applicationhooks {
	
	private driverFactory driverFactory;
	private WebDriver driver;
	private configReader configReader;
	Properties prop;
	
	@Before(order = 0)
	public void getProperty() {
		
		configReader = new configReader();
		prop = configReader.init_prop();
	}
	
	@Before(order = 1)
	public void launchBrowser() {
	String browserName = prop.getProperty("browser");
		driverFactory = new driverFactory();
		driver = driverFactory.init_driver(browserName);
	}
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}
	
	@After(order = 1)
	public void teardown(Scenario sc) {
		if(sc.isFailed()) {
		String ScreenShotName =	sc.getName().replaceAll(" ", " _ ");
		byte[] sourcepath =	((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		sc.attach(sourcepath, "image/png", ScreenShotName);
		
		}
		
		
	}

}