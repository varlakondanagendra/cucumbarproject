package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}

	@And("Application is displayed")
	public void application_is_displayed() {
		driver.get("https://demowebshop.tricentis.com/");
	}

	@When("user clicks on login link")
	public void user_clicks_on_login_link() {
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
	
	}

	@And("user enters valid credentials")
	public void user_enters_valid_credentials() {
		driver.findElement(By.id("Email")).sendKeys("vbnagendra19@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password@12345");
	
		
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[contains(@value,'Log in')]")).click();
	
	}

	@Then("user must be successfully logged in")
	public void user_must_be_successfully_logged_in() {
		if(driver.findElement(By.className("account")).getText().contains("vbnagendra19@gmail.com")) {
			System.out.println("user Successfully logged in");
		}
	}

	@And("browser closes")
	public void browser_closes() {
		driver.quit();
	
	}

}
