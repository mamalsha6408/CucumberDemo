package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver=null;
	
	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("Inside Step - browser is open");
	    String projectPath=System.getProperty("user.dir");
	    
	    System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
	    
	    driver=new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	    
	    
	}

	@And("user in google search page")
	public void user_in_google_search_page() {
		System.out.println("Inside Step - user in google search page");
		
		driver.get("https://www.google.lk/");
		
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("Inside Step - user enters a text in search box");
		
		driver.findElement(By.name("q")).sendKeys("Diy Tech Hub");
		
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Inside Step - hits enter");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search result page")
	public void user_is_navigated_to_search_result_page() {
		System.out.println("Inside Step - user is navigated to search result page");
		
		driver.getPageSource().contains("Diy Tech Hub");
		driver.close();
		driver.quit();
		
	}



	
}
