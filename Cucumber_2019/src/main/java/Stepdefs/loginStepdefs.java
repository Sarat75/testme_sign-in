package Stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import org.junit.Assert;

public class loginStepdefs {
	private WebDriver driver;
	@Given("^User shall launch the test me app url$")
	public void user_shall_launch_the_test_me_app_url() throws Throwable {
	    
	
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_H2A.05.18\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@Given("^user clicks on sign-in$")
	public void user_clicks_on_sign_in() throws Throwable {
		driver.findElement(By.linkText("SignIn"));
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^user provides valid credentials$")
	public void user_provides_valid_credentials() throws Throwable {
	    driver.findElement(By.id("userName")).click();
	    driver.findElement(By.id("userName")).sendKeys("Lalitha");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).sendKeys("Password123");
	    driver.findElement(By.name("Login")).click();
	    //throw new PendingException();
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
	    driver.findElement(By.name("value"));
	}

	@Then("^user shall be directed to home page$")
	public void user_shall_be_directed_to_home_page() throws Throwable {
		String expected1="Home";
		String actual1=driver.getTitle();
	    //Assert.assertequals("Home"1,actual1);
		if(expected1==actual1)
		{
			System.out.println("Home page directed");
		}
	}


}
