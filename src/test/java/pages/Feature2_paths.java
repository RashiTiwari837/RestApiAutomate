package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Feature2_paths {
	WebDriver driver;
	By uusername = By.id("name");
	By ppassword = By.id("password");
	By submit = By.id("login");
	By logout = By.id("logout");
	By msg = By.xpath("//div[@id='jumbo']/following-sibling::div/child::div/child::h1");
	By contry = By.xpath("//div//select[@id='country']");
	By address = By.id("address");
	By email = By.id("email");
	By ph = By.id("phone");
	By save = By.id("save");
	
	public Feature2_paths(WebDriver driver) {
		this.driver=driver;
	}
	public void enter_username(String username) {
		driver.findElement(uusername).sendKeys(username);	
	}
	public void enter_password(String password) {
		driver.findElement(ppassword).sendKeys(password);	
	}
	public void clickloginbtn() {
		driver.findElement(submit).click();
	}
	public void verifypage() {
		driver.findElement(msg).getText();
	}
	public void save() {
		driver.findElement(save).click();;
	}
	public void logoutbutton() {
		driver.findElement(logout).click();;
	}
}
