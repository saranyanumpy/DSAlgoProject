package TestPom;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestStructurePom {
	@FindBy(xpath="//input[@id='id_username']") WebElement userNameLocator;
	@FindBy(xpath="//input[@id='id_password']") WebElement passwordLocator;
	@FindBy(xpath = "//input[@value='Login']") WebElement loginBtn;
	@FindBy(linkText="Time Complexity") WebElement time;
	@FindBy(xpath ="//a[@class='btn btn-info']") WebElement tryHere;
	private By getstart= By.className("btn");
	@FindBy(xpath = "//button[text()='Run' and @type='button' and @onclick='runit()']") WebElement buttonElement1;
	@FindBy(xpath = "//div[@class='CodeMirror-scroll']") WebElement codeArea;
	private WebDriver driver;
	String codeToExecute;
	public TestStructurePom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}//class="list-group-item"
	public void signingIn(String username,String password) throws InterruptedException 
	{
		
		Thread.sleep(2500);
		userNameLocator.sendKeys(username);
		passwordLocator.sendKeys(password);
		loginBtn.click();
	}
	public void getStarted() throws InterruptedException 
	{
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	    Thread.sleep(3000);
		driver.findElement(getstart).click();
		System.out.println("22222");

}
	public void timeComplexity() throws InterruptedException 
	{
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	    Thread.sleep(1500);
		time.click();
	System.out.println("22222");

}
	public void tryHere() throws InterruptedException 
	{
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	    Thread.sleep(1500);
		tryHere.click();
	System.out.println("22222");

}
	public void uploadWordDocument() throws InterruptedException {
		 try {
	         File file = new File("documents/word.docx"); // Path to the Word document
	         FileInputStream fis = new FileInputStream(file);
	         XWPFDocument document = new XWPFDocument(fis);
	         List<XWPFParagraph> paragraphs = document.getParagraphs();

	         // Assuming the "print('Hello')" is the only content or the first paragraph
	         codeToExecute = paragraphs.get(0).getText();
	         fis.close();
	     } catch (Exception e) {
	         e.printStackTrace();
	     }
	}
	public void codeExecute() throws InterruptedException {
		Thread.sleep(2500);
	   // WebElement codeArea = driver.findElement(By.xpath("//div[@class='CodeMirror-scroll']")); 
	    // Assume the editor has a textarea with an id 'codeArea' to input code
	    Thread.sleep(2500);
	    Actions actions=new Actions(driver);
	    actions.moveToElement(codeArea).click().sendKeys(codeToExecute).build().perform();
	    Thread.sleep(4000);
	    // Assume there is an execute/run button to click
	  //  WebElement buttonElement = driver.findElement(By.xpath("//button[text()='Run' and @type='button' and @onclick='runit()']"));
		buttonElement1.click();
		
	}
	public void displayResult() throws InterruptedException {
		// Assume the output is displayed in an element with id 'outputArea'
	    WebElement outputArea = driver.findElement(By.id("output"));
	    String actualOutput = outputArea.getText();
	    System.out.println("ActualOutput"+actualOutput);
	  //  assertEquals(expectedOutput, actualOutput.trim()); // Verify the output
		}
}
