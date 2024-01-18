package StepDef;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import TestPom.TestQueueImpPom;
import TestPom.TestSigninPom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestQueImpStep {
	public WebDriver driver=new ChromeDriver();
	public TestQueueImpPom tqp;
	String codeToExecute; 
	 public TestQueImpStep() {
	
	        this.tqp = new TestQueueImpPom(driver);
	    }
	
	 @Given("User logged into DsAlgo portal page with {string} and {string} fields in the url {string}")
		public void user_logged_into_ds_algo_portal_page_with_and_fields_in_the_url(String username, String password, String string3) throws InterruptedException {
		driver.get(string3);
		tqp.signingIn(username,password);
		
	}
	 @When("User clicks Data Structures dropdown")
	 public void user_clicks_data_structures_dropdown() throws InterruptedException {
		 tqp.dropDownClick();
		
	 }
	 @Then("The User is in the Queue structure home page")
	 public void the_user_is_in_the_queue_structure_home_page() {
	   String ss=driver.getCurrentUrl();
	//   assert driver.getTitle().equals("Queue");
	 }

@When("User clicks on Implementation of Queue in Python link")
public void user_clicks_on_implementation_of_queue_in_python_link() throws InterruptedException {
 
   tqp.clickImp();
}

@Then("User Should be redirected to correct Queue page")
public void user_should_be_redirected_to_correct_queue_page() {
	//assert driver.getTitle().equals("Implementation of Queue in Python	");
	 String ss=driver.getCurrentUrl();
	   System.out.println("Current Title:"+ss);
	   System.out.println("1");  
}

@When("User clicks on Try Here button")
public void user_clicks_on_try_here_button() throws InterruptedException {
	
	tqp.tryHere();
}

@Then("User should be redirected to next page")
public void user_should_be_redirected_to_next_page() {
	 String ss=driver.getCurrentUrl();
	   System.out.println("Current Title:"+ss);
	}



@When("I have a Word document with code")
public void i_have_a_word_document_with_code() throws InterruptedException {
	
	tqp.uploadWordDocument();
 }
@When("I execute the code in the Try Editor")
public void i_execute_the_code_in_the_try_editor() throws InterruptedException {
	tqp.codeExecute();
	
}


@Then("Result is displayed on the console")
public void result_is_displayed_on_the_console() throws InterruptedException {
    tqp.displayResult();
    System.out.println("This is 1 link"); 
}

@Then("Go back to previous page")
public void go_back_to_previous_page() throws InterruptedException {
	tqp.goBack();
}

//Deque
@When("User clicks on Implementation using collections.Deque")
public void user_clicks_on_implementation_using_collections_deque() throws InterruptedException {
	tqp.collectionsDeque();
}
@Then("User Should be redirected to correct Implementation using using collections.deque")
public void user_should_be_redirected_to_correct_implementation_using_using_collections_deque() {
    String ss= driver.getCurrentUrl();
    System.out.println("Collections Deque"+ss);
}

@When("User submit on Try Here")
public void user_submit_on_try_here() throws InterruptedException {
   tqp.tryHere();
}

@When("User enters the text in the TextEditor by reading the doc")
public void user_enters_the_text_in_the_text_editor_by_reading_the_doc() throws InterruptedException {
   tqp.uploadWordDocumentDeque();
}

@When("Clicks on the Run button to see the results by executing it")
public void clicks_on_the_run_button_to_see_the_results_by_executing_it() throws InterruptedException {
    tqp.codeExecute();
}

@Then("Result should be displayed on the console")
public void result_should_be_displayed_on_the_console() throws InterruptedException {
    tqp.displayResult();
}



//Array
@When("User clicks on Implementation using array link")
public void user_clicks_on_implementation_using_array_link() throws InterruptedException {
  tqp.array();
}

@Then("User Should be redirected to correct Implementation using array page")
public void user_should_be_redirected_to_correct_implementation_using_array_page() throws InterruptedException {
  String ss = driver.getCurrentUrl();
  System.out.println(ss);
}

@When("User submit on Try Here button")
public void user_submit_on_try_here_button() throws InterruptedException {
  tqp.tryHere();
}

@Then("User should be redirected to the next page")
public void user_should_be_redirected_to_the_next_page() {
   String ss=driver.getCurrentUrl();
   System.out.println(ss);
}

@When("User enters the text in the TextEditor by reading the document")
public void user_enters_the_text_in_the_text_editor_by_reading_the_document() throws InterruptedException {
	tqp.uploadWordDocumentArray();
}

@When("Clicks on the Run button to execute and see the results")
public void clicks_on_the_run_button_to_execute_and_see_the_results() throws InterruptedException {
   tqp.codeExecute();
   tqp.displayResult();
}

@Then("Navigate to previous page")
public void navigate_to_previous_page() throws InterruptedException {
   tqp.goBack();
}

@When("User clicks on Practice link")
public void user_clicks_on_practice_link() throws InterruptedException {
 tqp.practiceClick();
}

@Then("Move back again")
public void move_back_again() throws InterruptedException {
   tqp.goBack();
}

@Then("Driver is quitting")
public void driver_is_quitting() {
   driver.quit();
  }












}
