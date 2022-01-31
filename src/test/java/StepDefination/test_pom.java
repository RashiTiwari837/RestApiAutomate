package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.Testproject;

public class test_pom{
	
	WebDriver driver=null;
	Testproject ob ;
	@SuppressWarnings("deprecation")
	@Given("user is in login page")
	public void user_is_in_login_page() {
		System.out.println("Correct");
		
//	String projpath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", "C:/Users/rashi.tiwari/git/bdd/src/test/resources/Driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://example.testproject.io/web/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("^enters correct (.*) and (.*)$")
	public void enters_correct_if_and_password(String username, String password) throws InterruptedException {
		ob = new Testproject(driver);
		ob.enter_username("Rashi");
		ob.enter_password("12345");
		Thread.sleep(4000);
	}

	@And("clicks on login")
	public void clicks_on_login() {
		ob = new Testproject(driver);
		ob.clickloginbtn();
	
		
	}

	@Then("they should be able to login")
	public void logout() throws InterruptedException {
	ob.logoutbutton();
	driver.close();
	driver.quit();
	Thread.sleep(4000);
	   }
	}


