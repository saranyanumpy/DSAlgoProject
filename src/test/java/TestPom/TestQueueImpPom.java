package TestPom;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
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

public class TestQueueImpPom {
	//public WebDriver driver;
	String codeToExecute;
	@FindBy(linkText="Data Structures") WebElement dropdown;
	@FindBy(xpath="//input[@id='id_username']") WebElement userNameLocator;
	@FindBy(xpath="//input[@id='id_password']") WebElement passwordLocator;
	@FindBy (xpath="//button[@class='btn']") WebElement getStarted;
	@FindBy(xpath = "//input[@value='Login']") WebElement loginBtn;
	@FindBy(xpath = "//a[@class='list-group-item']") WebElement implQueBtn;
	@FindBy(linkText="Implementation of Queue in Python") WebElement impBtn;
	@FindBy(linkText="Implementation using collections.deque") WebElement deque;
	@FindBy(linkText="Implementation using array") WebElement impArray;
	@FindBy(linkText="Practice Questions") WebElement pracQtn;
	//@FindBy(xpath = "//div[@class='dropdown-menu show']") WebElement queueBtn;
	@FindBy(xpath = "//div[@class='bg-secondary text-white']") WebElement successMsg;
	@FindBy(xpath = "//ul/a[@href='implementation-lists' and @class='list-group-item']") WebElement trySubmit;
	@FindBy(xpath = "//a[@class='btn btn-info']") WebElement queueLink;
	@FindBy(xpath = "//button[text()='Run' and @type='button' and @onclick='runit()']") WebElement buttonElement;
	@FindBy(xpath = "//div[@class='CodeMirror-scroll']") WebElement codeArea;
	@FindBy(xpath = "//button[text()='Run' and @type='button' and @onclick='runit()']") WebElement buttonElement1;
	@FindBy(xpath = "//div[@class='bg-secondary text-white']") WebElement stringDeque;
	@FindBy(linkText="Try here>>>") WebElement dequeTry;
	 final By fileInput = By.id("fileInput");
	//@FindBy(xpath="//*[@id='answer_form']/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre") WebElement textEditor;
	ArrayList<String> errorlist=new ArrayList<String>();
	private WebDriver driver;
	public TestQueueImpPom(WebDriver driver) {
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

	public void dropDownClick() throws InterruptedException 
	{
		dropdown.click();
		Thread.sleep(3000);
		WebElement queueBtn = driver.findElement(By.xpath("//div[@class='dropdown-menu show']//a[4]"));
		queueBtn.click();
	}
	public WebDriver pageLand() throws InterruptedException {
		Thread.sleep(3000);
		//WebElement successMsg=driver.findElement(By.xpath("//div[@class='bg-secondary text-white']"));
		System.out.println("Success Message="+successMsg.getText());
		return driver;
	}
	public void clickImp() throws InterruptedException {
	
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(1000);
        WebElement queueLink = driver.findElement(By.xpath("//ul/a[@href='implementation-lists' and @class='list-group-item']"));
        queueLink.click();
      
	}
	public void tryHere() throws InterruptedException {
		Thread.sleep(3000);
		WebElement trySubmit=driver.findElement(By.xpath("//a[@class='btn btn-info']"));
		trySubmit.click();
		
	}
	public void dataProviding() throws InterruptedException {
		Thread.sleep(3000);
	//	 WebElement ed = driver.findElement(By.xpath("//*[@id='answer_form']/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre\""));
		//ed.sendKeys("hello");
		//("print(\"Hello\")");
		System.out.println("Success Message=Sridhar1");
	}
	public void runButton() throws InterruptedException {
		Thread.sleep(3000);
	//WebElement buttonElement = driver.findElement(By.xpath("//button[text()='Run' and @type='button' and @onclick='runit()']"));
	buttonElement.click();
	System.out.println("Success Message=Sridhar2");
	}
	public void output() throws InterruptedException {
		Thread.sleep(3000);
	//WebElement out = driver.findElement(By.xpath("//div[id='output']"));
	//String ss=out.getText();
	System.out.println("Output=");
	//+ss);
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
	public void uploadWordDocumentDeque() throws InterruptedException {
		 try {
	         File file = new File("documents/words.docx"); // Path to the Word document
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
	public void uploadWordDocumentArray() throws InterruptedException {
		 try {
	         File file = new File("documents/wordss.docx"); // Path to the Word document
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
	public void goBack() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().back();
	}
	public void collectionsDeque() throws InterruptedException {
		Thread.sleep(2000);
		deque.click();
	}
	public void stringCheckDeque() throws InterruptedException {
		Thread.sleep(2000);
		String gg=stringDeque.getText();
		System.out.println("gg"+gg);
	}
	public void dequeTryHere() throws InterruptedException {
		Thread.sleep(2000);
		trySubmit.click();
	}
	public void array() throws InterruptedException {
		Thread.sleep(2000);
		impArray.click();
	}
	public void practiceClick() throws InterruptedException {
		Thread.sleep(2000);
		pracQtn.click();
	}
	}