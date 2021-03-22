package stepsAndRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

	WebDriver driver;

	@Before

	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

	}

	@Given("^I visit the-internet.herokuapp.com/login$")
	public void i_visit_httptheinternetherokuappcomlogin() {

		driver = new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/");

	}

	@When("^I enter user in the user name correct$")
	public void i_enter_user_in_the_user_name_correct() {

		driver.findElement(By.xpath("//a[normalize-space()='Form Authentication']")).click();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");

	}

	@And("^I enter user in the password field$")
	public void i_enter_user_in_the_password_field() throws Throwable {

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("moez");

	}

	@And("^I press the login button$")
	public void i_press_the_login_button() throws Throwable {

		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();

	}

	@Then("^I should see the Your username is invalid!$")
	public void i_should_see_the_your_username_is_invalid() throws Throwable {
		String actualURL = driver.getCurrentUrl();

		String expectedURL = "http://the-internet.herokuapp.com/login";

	//	String expectedURL = "http://the";

		Assert.assertEquals(expectedURL, actualURL);

	}

}
