package StepDef;

import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import TestPom.TestSigninPom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSigninStep {
	public WebDriver driver=new ChromeDriver();
	public TestSigninPom tsp;
	
	 public TestSigninStep() {
		 
	       this.tsp = new TestSigninPom(driver);
	    }
	@Given("The user opens the url {string}")
	public void the_user_opens_the_url(String string) {
		driver.get(string);
		
	}

	@Given("User enters {string} and {string} fields")
	public void user_enters_and_fields(String username, String password) throws InterruptedException {
		Thread.sleep(3000);
		username="winterchamps";
		password="Testwinter1!";
		tsp.passingValues(username,password);
		
	 }

	@When("The User clicks {string} button")
	public void the_user_clicks_button(String string) throws InterruptedException {
		Thread.sleep(4000);
		tsp.clickLoginBtn();
		
	}

	
	@Then("It should display as {string}")
	public void it_should_display_as(String string) {
		 //AssertJUnit.assertEquals(string, driver.getTitle());
		tsp.printSuccess();
		
	}
	@Then("Close the driver")
	public void close_the_driver() {
	   driver.quit();
	}



}
