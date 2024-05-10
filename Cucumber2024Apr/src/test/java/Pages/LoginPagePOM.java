package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {

	protected WebDriver driver;
	
	private By txt_username=By.id("username");
	
	private By txt_password=By.id("password");
	
	private By btn_login=By.xpath("//*[@id=\"login\"]/button");
	
	public LoginPagePOM(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLoginButton() {
		driver.findElement(btn_login).click();
	}
	
	public void userLogin(String username,String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}
	
	
}
