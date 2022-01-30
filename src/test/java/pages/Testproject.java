package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Testproject {
	WebDriver driver;
	By uusername = By.id("name");
	By ppassword = By.id("password");
	By submit = By.id("login");
	By logout = By.id("logout");
	
	public Testproject(WebDriver driver) {
		this.driver=driver;
	}
	public void enter_username(String username) {
		driver.findElement(uusername).sendKeys(username);	
	}
	public void enter_password(String password) {
	//	String p = String.valueOf(password);
		driver.findElement(ppassword).sendKeys(password);	
	}
	public void clickloginbtn() {
		driver.findElement(submit).click();
	}
	public void logoutbutton() {
		driver.findElement(logout).isDisplayed();
	}
}

