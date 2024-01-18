package TestPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestHomePom {
	public WebDriver driver;
	@FindBy (xpath="//button[@class='btn']") WebElement getStarted;
	public TestHomePom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickGetstarted() {
		
		getStarted.click();
	}

}
