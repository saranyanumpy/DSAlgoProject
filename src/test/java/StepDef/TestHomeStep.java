package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import TestPom.TestHomePom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestHomeStep {
	private WebDriver driver;
	TestHomePom thp;
	@Given("User launches Chrome browser")
	public void user_launches_chrome_browser() throws InterruptedException {
		driver = new ChromeDriver();
		thp=new TestHomePom(driver);
		Thread.sleep(500);
	  
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		
		 driver.get(url);
	}

	@When("User clicks on {string} button")
	public void user_clicks_on_button(String string) {
		
		 thp.clickGetstarted();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String string) {
		
		 Assert.assertEquals(string, driver.getTitle());
		 System.out.println("Title:" +string);
		 
	}
	@Then("Quit the driver")
	public void quit_the_driver() {
	    driver.quit();
	}



}
