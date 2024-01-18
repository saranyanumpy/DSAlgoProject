package StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import TestPom.TestStructurePom;
import TestPom.TestTreePom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestTreeStep {
	
	public WebDriver driver=new ChromeDriver();
	public TestTreePom ttp;
	String codeToExecute; 
	 public TestTreeStep() {
			
	        this.ttp = new TestTreePom(driver);
	    }
	

@Given("User entering into DsAlgo portal page with {string} and {string} fields in the url {string}")
public void user_entering_into_ds_algo_portal_page_with_and_fields_in_the_url(String username, String password, String string3) throws InterruptedException {
	// System.out.println("Tree"+ss);
	driver.get(string3);
	ttp.signingIn(username,password);
	System.out.println("Suuuuuuu");
}

@When("User submitting Data Structures dropdown")
public void user_submitting_data_structures_dropdown() throws InterruptedException {
    ttp.dropDownClick();
}

@Then("The User is in the Tree home page")
public void the_user_is_in_the_tree_home_page() {
    String ss=driver.getCurrentUrl();
    System.out.println("Tree"+ss);
}

@When("User clicks on Overview of Trees button")
public void user_clicks_on_overview_of_trees_button() throws InterruptedException {
	ttp.overView();
}

@Then("User should be directed to next page")
public void user_should_be_directed_to_next_page() {
	 String ss=driver.getCurrentUrl();
	 System.out.println("Current URL"+ss);
}

@When("User clicks to Try Here button to work further")
public void user_clicks_to_try_here_button_to_work_further() throws InterruptedException {
   ttp.tryHere();
}

@When("User submitting the file")
public void user_submitting_the_file() throws InterruptedException {
   ttp.uploadWordDocument();
}

@When("Working on the Run button")
public void working_on_the_run_button() throws InterruptedException {
   ttp.codeExecute();
 
}

@Then("Result is displayed")
public void result_is_displayed() throws InterruptedException {
  ttp.displayResult();
  }

@When("User goes back")
public void user_goes_back() throws InterruptedException {
   ttp.goBack();
}

@When("User clicks on Terminologies button")
public void user_clicks_on_terminologies_button() throws InterruptedException {
  ttp.clickTerminology();
}

@Then("User should be redirected to Terminologies page")
public void user_should_be_redirected_to_terminologies_page() {
   String ss= driver.getCurrentUrl();
   System.out.println("Tree Page"+ss);
}

@When("User clicks on Try Here button to work on Terminologies")
public void user_clicks_on_try_here_button_to_work_on_terminologies() throws InterruptedException {
	ttp.tryHere();
}

@When("User passing the file")
public void user_passing_the_file() throws InterruptedException {
	ttp.uploadWordDocument();
}

@When("Working on the Run button for Terminologies")
public void working_on_the_run_button_for_terminologies() throws InterruptedException {
	ttp.codeExecute();
	
}

@Then("Result is displayed on the console for Terminologies")
public void result_is_displayed_on_the_console_for_terminologies() throws InterruptedException {
	ttp.displayResult();
	
}
@When("User goes back to Tree")
public void user_goes_back_to_tree() throws InterruptedException {
   ttp.goBack();
}

@When("User clicks on Types of Trees button")
public void user_clicks_on_types_of_trees_button() throws InterruptedException {
   ttp.clickTypesOfTrees();
}

@Then("User should be redirected to Types of Trees page")
public void user_should_be_redirected_to_types_of_trees_page() {
	 String ss= driver.getCurrentUrl();
	   System.out.println("Tree Page"+ss);
  }

@When("User clicks on Try Here button to work on Types of Trees")
public void user_clicks_on_try_here_button_to_work_on_types_of_trees() throws InterruptedException {
    ttp.tryHere();
}

@When("User passing the file to Types of Trees")
public void user_passing_the_file_to_types_of_trees() throws InterruptedException {
   ttp.uploadWordDocument();
}

@When("Working on the Run button for Types of Trees")
public void working_on_the_run_button_for_types_of_trees() throws InterruptedException {
   ttp.codeExecute();
}

@Then("Result is displayed on the console for Types of Trees")
public void result_is_displayed_on_the_console_for_types_of_trees() throws InterruptedException {
   ttp.displayResult();
    System.out.println("Saranya you are here");
}

@When("User goes back to Tree page")
public void user_goes_back_to_tree_page() throws InterruptedException {
   ttp.goBack();
}

@When("User clicks on Tree Traversals")
public void user_clicks_on_tree_traversals() throws InterruptedException {
    ttp.clickTreeTraversal();
}

@Then("User should be redirected to Tree Traversals")
public void user_should_be_redirected_to_tree_traversals() {
	 String ss= driver.getCurrentUrl();
	   System.out.println("Tree Page"+ss);
}

@When("User clicks on Try Here button to work on Tree Traversals")
public void user_clicks_on_try_here_button_to_work_on_tree_traversals() throws InterruptedException {
   ttp.tryHere();
}

@When("User passing the file to Tree Traversals")
public void user_passing_the_file_to_tree_traversals() throws InterruptedException {
   ttp.uploadWordDocument();
}

@When("Working on the Run button for Tree Traversals")
public void working_on_the_run_button_for_tree_traversals() throws InterruptedException {
   ttp.codeExecute();
}

@Then("Result is displayed on the console for Tree Traversals")
public void result_is_displayed_on_the_console_for_tree_traversals() throws InterruptedException {
    ttp.displayResult();
}

@When("User navigate back to Tree page")
public void user_navigate_back_to_tree_page() throws InterruptedException {
   ttp.goBack();
}

@When("User clicks on Traversals-Illustration")
public void user_clicks_on_traversals_illustration() throws InterruptedException {
  ttp.clickTraversalIllustration();
}

@Then("User should be redirected to Traversals-Illustration")
public void user_should_be_redirected_to_traversals_illustration() {
	 String ss= driver.getCurrentUrl();
	 System.out.println("Tree Page"+ss);
}

@When("User clicks on Try Here button to work on Traversals-Illustration")
public void user_clicks_on_try_here_button_to_work_on_traversals_illustration() throws InterruptedException {
   ttp.tryHere();
}

@When("User passing the file to Traversals-Illustration")
public void user_passing_the_file_to_traversals_illustration() throws InterruptedException {
   ttp.uploadWordDocument();
}

@When("Working on the Run button for Traversals-Illustration")
public void working_on_the_run_button_for_traversals_illustration() throws InterruptedException {
    ttp.codeExecute();
}

@Then("Result is displayed on the console for Traversals-Illustration")
public void result_is_displayed_on_the_console_for_traversals_illustration() throws InterruptedException {
    ttp.displayResult();
    System.out.println("Ended");
}
@Then("Quit the browser")
public void quit_the_browser() {
   driver.quit();
}





}
