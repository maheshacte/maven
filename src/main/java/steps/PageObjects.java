package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	WebDriver driver;
	
	public PageObjects(WebDriver driver){
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name ="userName")
	public WebElement username;

	@FindBy(id ="password")
	public WebElement password;
	
	@FindBy(linkText="SIGN-ON")
	public WebElement sign_on;

}
