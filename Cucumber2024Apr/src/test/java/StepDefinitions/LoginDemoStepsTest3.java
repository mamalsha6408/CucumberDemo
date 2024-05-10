package StepDefinitions;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemoStepsTest3 {

	WebDriver driver=null;
	
	@Given("browser is open test3")
	public void browser_is_open_test3() {
	    
		String projectPath=System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	}

	@And("user is on login page test3")
	public void user_is_on_login_page_test3() {
	    
		driver.navigate().to("https://practice.expandtesting.com/login");
		
	}

	@When("user enters username and password test3")
	public void user_enters_username_and_password_test3() {
	    
		driver.findElement(By.id("username")).sendKeys("practice");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		
	}

	@And("user click login button test3")
	public void user_click_login_button_test3() {
	    
		//absolute xpath = /html/body/main/div[2]/div/div[2]/div/div/div/form/button
		//relative xpath = //*[@id="login"]/button
		
		driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
		
	}

	@Then("user is navigated to home page test3")
	public void user_is_navigated_to_home_page_test3() {
	    
		//driver.getPageSource().contains("L3ogout1");
		Assertions.assertTrue(driver.getPageSource().contains("Logout"));
		driver.close();
		driver.quit();
	}
	
}
