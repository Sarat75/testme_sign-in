package Stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testMe_reg {
	private WebDriver driver;
	
	
	@Given("^User shall launch testme app url$")
	public void user_shall_launch_testme_app_url() throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_H2A.05.18\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
		
		
	    
	   // throw new PendingException();
	}

	@Given("^user clicks on sign up$")
	public void user_clicks_on_sign_up() throws Throwable {
	    driver.findElement(By.linkText("SignUp")).click();
	
		
	   // throw new PendingException();
	}

	@When("^user provides data$")
	public void user_provides_data() throws Throwable {
	    
		
		driver.findElement(By.name("userName")).click();
		driver.findElement(By.name("userName")).sendKeys("sarat123");
		driver.findElement(By .name("firstName")).click();
		driver.findElement(By .name("firstName")).sendKeys("sarat");
		driver.findElement(By .name("lastName")).click();
		driver.findElement(By .name("lastName")).sendKeys("mutta");
		driver.findElement(By .name("password")).click();
		driver.findElement(By .name("password")).sendKeys("pass123");
		driver.findElement(By .name("confirmPassword")).click();
		driver.findElement(By .name("confirmPassword")).sendKeys("pass123");
		driver.findElement(By .xpath("//input[@value='Male']")).click();
		driver.findElement(By .name("emailAddress")).click();
		driver.findElement(By .name("emailAddress")).sendKeys("sarat97@gmail.com");
		driver.findElement(By .name("mobileNumber")).click();
		driver.findElement(By .name("mobileNumber")).sendKeys("9876543210");
		driver.findElement(By .name("dob")).click();
		driver.findElement(By .name("dob")).sendKeys("20/11/1997");
		driver.findElement(By.id("address")).click();
		driver.findElement(By.id("address")).sendKeys("hyderabad");
		//driver.findElement(By .name("securityQuestion")).click();
		driver.findElement(By .name("securityQuestion")).sendKeys("What is your Birth Place?");
		//driver.findElement(By .name("answer")).click();
		driver.findElement(By .name("answer")).sendKeys("vizag");
	   // throw new PendingException();
	}

	@When("^user clicks on register$")
	public void user_clicks_on_register() throws Throwable {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
		
		driver.findElement(By .name("Submit")).click();
		driver.findElement(By .xpath("//input[@name='Submit']")).click();
	   // throw new PendingException();
	}

	//@Then("^user is directed to testme app login page$")
	//public void user_is_directed_to_testme_app_login_page() throws Throwable {
		
	//	Assert.assertArrayEquals(get , actuals);
	    
	    
	   // throw new PendingException();
	}




