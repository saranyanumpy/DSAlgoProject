package TestPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestSigninPom {
	public WebDriver driver;
	@FindBy(xpath="//input[@id='id_username']") WebElement userNameLocator;
	@FindBy(xpath="//input[@id = 'id_password1']") WebElement pwd;
	@FindBy(xpath = "//input[@value='Login']") WebElement loginBtn;
	public TestSigninPom(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void passingValues(String username,String password) throws InterruptedException 
	{
		Thread.sleep(5000);
		WebElement userNameLocator=driver.findElement(By.xpath("//input[@id='id_username']"));
		userNameLocator.sendKeys(username);
		WebElement passwordLocator=driver.findElement(By.xpath("//input[@id='id_password']"));
		passwordLocator.sendKeys(password);
		
	}
	public void clickLoginBtn() throws InterruptedException {
		
		loginBtn.click();
		
	}
	public void printSuccess() {
		WebElement successMsg=driver.findElement(By.xpath("//div[@class='alert alert-primary']"));
		System.out.println("Success Message="+successMsg.getText());
	}
	
}
