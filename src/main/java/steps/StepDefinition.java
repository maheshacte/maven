package steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	private PageObjects page;
	
	@Before()
	public void startup(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		page = new PageObjects(driver);
	
	}
	
	@After()
	public void quit() throws IOException{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Selenium_mahesh\\images\\screenshot.png"));
		driver.quit();
	}
	
	
	@Given("url is provided")
	public void url_is_provided() {
		    driver.get(Constants.ulr);
		
	}

	@Given("print the title and url of application")
	public void print_the_title_and_url_of_application() {
	    String title = driver.getTitle();
	   
	    
	    System.out.println(title);
	    Assert.assertEquals(title, Constants.expectedTitle);
//	    if(title.contains(Constants.expectedTitle)){
//	    	System.out.println("test case passed");
//	    }else{
//	    	System.out.println("Test case failed");
//	    }
	    
	}
	
	@Given("mercury travels url is provided")
	public void mercury_travels_url_is_provided() {
	    driver.get(Constants.mercuryurl);
			}

	@Then("scroll down")
	public void scroll_down() throws InterruptedException {
	Thread.sleep(3000);  
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
//	js.executeScript("scrollBy(0,250)");
	Thread.sleep(3000);  
	
//	 or 
	js.executeScript("window.scrollBy(0,250)");
	
	}

	@Then("scroll up")
	public void scroll_up() throws InterruptedException {
		Thread.sleep(3000);  
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0, -250)");
//		 or

		js.executeScript("window.scrollBy(0,-250)");
		
				Thread.sleep(3000);  

	}

	@Then("click on sign on")
	public void click_on_sign_on() {
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", page.sign_on);
//		page.sign_on.click();
	
	}

	@Then("take screenshot")
	public void take_screenshot() throws IOException {
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("D:\\Selenium_mahesh\\images\\screenshot.png"));
////		
	}




}
