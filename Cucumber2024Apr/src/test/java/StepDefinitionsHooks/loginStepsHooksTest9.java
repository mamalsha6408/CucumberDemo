package StepDefinitionsHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class loginStepsHooksTest9 {

	WebDriver driver=null;
	
	@Before
	public void browserSetup() {
		System.out.println("=== Inside Before Step ===");
		
		String projectPath=System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	
	@After
	public void teardown() {
		System.out.println("=== Inside After Step ===");
		
		driver.close();
		driver.quit();
		
	}
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("--- Inside Before Step ---");
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("*-- Inside After Step --*");
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
	}
	
	@When("user enter username and password")
	public void user_enter_username_and_password() {
	    
	}

	@And("user click login button")
	public void user_click_login_button() {
	    
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    
	}

	
}
