package StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Feature2_paths;
import pages.Testproject;

public class Feature_2_def {
	WebDriver driver;
	Feature2_paths ob1;

	@Given("User is in login page")
	public void user_is_in_login_page() {
		System.out.println("Correct");
	
		System.setProperty("webdriver.chrome.driver", "C:/Users/rashi.tiwari/git/bdd/src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://example.testproject.io/web/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	
	@When("user enters loginid and password")
	public void user_enters_loginid_and_password(DataTable de) throws Exception {
		List<List<String>> b = de.cells();
		ob1 = new Feature2_paths(driver);
		
	ob1.enter_username(b.get(0).get(0));
	ob1.enter_password(b.get(0).get(1));	
	Thread.sleep(2000);
	}

	@When("clicks on submit button")
	public void clicks_on_submit_button() {
			ob1 = new Feature2_paths(driver);
			ob1.clickloginbtn();	
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
	  ob1.verifypage();  
	}
	@Then("user enters detail")
	public void user_enters_detail(DataTable db) throws Exception {
		List<List<String>> ds = db.cells();
	   
	   driver.findElement(By.xpath("//div//select[@id='country']")).sendKeys(ds.get(0).get(0));
		driver.findElement(By.id("address")).sendKeys(ds.get(0).get(1));;
		driver.findElement(By.id("email")).sendKeys(ds.get(0).get(2));;
		driver.findElement(By.id("phone")).sendKeys(ds.get(0).get(3));;
		Thread.sleep(2000);
	}

	@Then("user clicks on save")
	public void user_clicks_on_save() {
	   ob1.save();
	}

	@Then("user closes the browser")
	public void user_closes_the_browser() {
	   driver.close();
	   driver.quit();
	}
}
