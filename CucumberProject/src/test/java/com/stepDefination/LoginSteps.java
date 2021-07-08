package com.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver driver;

	@Given("The user is a registered user")
	public void the_user_is_a_registered_user() {
		System.out.println("Step 1: User is on Login page");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://samuneersol-trials71.orangehrmlive.com/");
	}

	@When("users enters username and password")
	public void users_enters_username_and_password() {
		System.out.println("Step 2: user enters username and password");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("@P0SvXIcj7"); 
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		System.out.println("Step 3: user clicks on login button");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("OrangeHrm renders Homepage")
	public void orange_hrm_renders_homepage() {
		System.out.println("User is in Homepage");
		driver.close();
	}
}