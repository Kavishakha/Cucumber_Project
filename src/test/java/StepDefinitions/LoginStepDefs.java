package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
	
	WebDriver driver = Hooks.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    //Remove - throw new io.cucumber.java.PendingException();
		
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				
		//Launch the application
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
	}
	
	//@Given and @And are similar annotation
	
	@And("I click on Login link")
	public void i_click_on_Login_link() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  
		Thread.sleep(4000);
		WebElement LoginLink= driver.findElement(By.linkText("Log in"));
		LoginLink.click();
	}

	@When("I enter the correct username and password")
	public void i_enter_the_correct_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user_login"));		
		UserName.sendKeys("vishakhanikam@yahoo.com");
		
		WebElement Password= driver.findElement(By.id("password"));		
		Password.sendKeys("Vishakha@2990");    
	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I enter the incorrect username and password")
	public void i_enter_the_incorrect_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement UserName=driver.findElement(By.name("user_login"));		
		UserName.sendKeys("abc@xyz.com");
		
		WebElement Password=driver.findElement(By.id("password"));		
		Password.sendKeys("Abc@12345");
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String ExpError) {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement Error = driver.findElement(By.id("msg_box"));
	 
		String ActError = Error.getText();
		Assert.assertEquals(ExpError, ActError);		
	}
	
	@When("I click on Login Button")
	public void i_click_on_Login_Button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
		Thread.sleep(5000);
		WebElement Loginbtn=driver.findElement(By.name("btn_login"));
		Loginbtn.click();
	}
	
	@When("I enter the username as {string} and password as {string}")
	public void i_enter_the_and(String UsernameVal, String PassVal) {
	    // Write code here that turns the phrase above into concrete actions
	   
		WebElement UserName=driver.findElement(By.name("user_login"));		
		UserName.sendKeys(UsernameVal);
		
		WebElement Password=driver.findElement(By.id("password"));		
		Password.sendKeys(PassVal);
	}

/*	
	@And("I close the browser")
	public void i_close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	  
		driver.close();
	}
*/
}
