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

public class Orange_login {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Given("ouser is in login page")
	public void user_is_in_login_page() {
	String projpath = System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", "D:/rashi/workspace/cucumber/src/test/resources/Driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	String title=driver.getTitle();
	Assert.assertEquals(title, "OrangeHRM");
	}

	@When("oenters correct (.*) and (.*)")
	public void enters_correct_if_and_password(String username, String password) throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
	}

	@When("oclicks on login")
	public void clicks_on_login() {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("othey should be able to logins")
	public void they_should_be_able_to_login() {
	 String landingpage=  driver.findElement(By.xpath("//div//h1")).getText();
	   if(landingpage.equals("Dashboard")) {
		   System.out.println("Correct landing page");
	   }
	}

}
