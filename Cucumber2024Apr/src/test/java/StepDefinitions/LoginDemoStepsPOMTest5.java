package StepDefinitions;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPagePOM;
import io.cucumber.java.en.*;

public class LoginDemoStepsPOMTest5 {
	
	WebDriver driver=null;
	
	LoginPagePOM loginPage;
	
	@Given("browser is open test5")
	public void browser_is_open_test5() {
	    
		String projectPath=System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
	}

	@And("user is on login page test5")
	public void user_is_on_login_page_test5() {
	    
		driver.navigate().to("https://practice.expandtesting.com/login");
		loginPage=new LoginPagePOM(driver);
		
	}

	@When("^user enters (.*) and (.*) test5$")
	public void user_enters_username_and_password_test5(String username, String password) {
	   
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		
	}

	@And("user click login button test5")
	public void user_click_login_button_test5() {
		loginPage.clickLoginButton();
	}

	@Then("user is navigated to home page test5")
	public void user_is_navigated_to_home_page_test5() {
		Assertions.assertTrue(driver.getPageSource().contains("Logout"));
		driver.close();
		driver.quit();
	}
	
}
