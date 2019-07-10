package Stepdefs;

//import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
//import org.openqa.selenium.By.ByClassName;
//import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logindemowebshop {
private WebDriver driver;



/*//@Given("^User shall launch the demowebshop url$")
//public void user_shall_launch_the_demowebshop_url() throws Throwable {
	// System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_H2A.05.18\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	//driver=new ChromeDriver();
    //driver.get("http://demowebshop.tricentis.com/register");
    //throw new PendingException();
//}

@Given("^user clicks on sign in$")
public void user_clicks_on_sign_in() throws Throwable {
	driver.findElement(By .linkText("Log in")).click();
    
  //  throw new PendingException();
}

@When("^User provides login credentials$")
public void user_provides_login_credentials() throws Throwable {
	//driver.findElement(By.name("Email")).click();
    driver.findElement(By.name("Email")).sendKeys("daviddob@gmail.com");
    //driver.findElement(By.name("Password")).click();
    driver.findElement(By .name("Password")).sendKeys("pass123");
    
    
   // throw new PendingException();
}

@When("^User clicks on Login$")
public void user_clicks_on_Login() throws Throwable {
	driver.findElement(By .xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
    
    //throw new PendingException();
}


@Then("^User shall be directed to Demowebshop page$")
public void user_shall_be_directed_to_Demowebshop_page() throws Throwable {
    String expected2="Demo Web Shop";
    String actual2=driver.getTitle();
    if(expected2==actual2)
    {
    	System.out.println("Demo web shop page directed");
    }

}
*/

@Given("^user launched the browser$")
public void user_launched_the_browser() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_H2A.05.18\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
	driver=new ChromeDriver();
    driver.get("http://demowebshop.tricentis.com/register");
	
}

@Given("^is on the demo web shop page$")
public void is_on_the_demo_web_shop_page() throws Throwable {
	String res = driver.getTitle();
	if (res == "Demo Web Shop. Login")
		System.out.println("IS ON DEMO PAGE");
   
}

@When("^user clicks on login$")
public void user_clicks_on_login() throws Throwable {
	driver.findElement(By .linkText("Log in")).click();
}

@When("^user provides \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_provides_and(String Email, String pwd) throws Throwable {
	driver.findElement(By.name("Email")).sendKeys(Email);
	driver.findElement(By.name("Password")).sendKeys(pwd);
	//driver.findElement(By.className("button-1 login-button")).click();
	//driver.findElement(By .xpath("//input[contains(text(),'Log in')]"));
	driver.findElement(By .xpath("html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

//@When("^user provides <email> and hello(\\d+)$")
//public void user_provides_email_and_hello(int arg1) throws Throwable {
	//driver.findElement(By.name("Email"
   
}


