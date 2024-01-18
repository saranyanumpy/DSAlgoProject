package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import TestPom.TestQueueImpPom;
import TestPom.TestStructurePom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStructureStep {
	public WebDriver driver=new ChromeDriver();
	public TestStructurePom tsp;
	String codeToExecute; 
	 public TestStructureStep() {
			
	        this.tsp = new TestStructurePom(driver);
	    }
	@Given("User Signed into DsAlgo portal page with {string} and {string} fields in the url {string}")
	public void user_signed_into_ds_algo_portal_page_with_and_fields_in_the_url(String username, String password, String string3) throws InterruptedException {
		driver.get(string3);
		tsp.signingIn(username,password);
	}

	@When("User clicks GetStarted Data Structures button")
	public void user_clicks_get_started_data_structures_button() throws InterruptedException {
		System.out.println("2");
		tsp.getStarted();
	}
	

	@Then("The User is in the DataStructure home page")
	public void the_user_is_in_the_data_structure_home_page() {
		String ss=driver.getCurrentUrl();
		System.out.println("Current URL:"+ss);
	}


	@When("User click Time Complexity button")
	public void user_click_time_complexity_button() throws InterruptedException {
		System.out.println("4");
		tsp.timeComplexity();
	}

	@Then("It should go to data structure time-complexity page")
	public void it_should_go_to_data_structure_time_complexity_page() {
		System.out.println("5");
		String ss=driver.getCurrentUrl();
		System.out.println("Current URL:"+ss);
	}
	@When("User Submits on Try Here button")
	public void user_submits_on_try_here_button() throws InterruptedException {
		System.out.println("6");
		tsp.tryHere();
	}
	@When("User read from a file")
	public void user_read_from_a_file() throws InterruptedException {
		System.out.println("7");
		tsp.uploadWordDocument();
	}

	@When("Clicks on the Run button")
	public void clicks_on_the_run_button() throws InterruptedException {
		System.out.println("8");
		tsp.codeExecute();
	}

	@Then("Result is in the console")
	public void result_is_in_the_console() throws InterruptedException {
		System.out.println("9");
		tsp.displayResult();
	}


}
