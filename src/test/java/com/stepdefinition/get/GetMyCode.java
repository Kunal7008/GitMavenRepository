package com.stepdefinition.get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GetMyCode {
	WebDriver driver;
	@Given("^Go to login Page$")
	public void go_to_login_Page() throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUNAL BHATTA\\Downloads\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("https://www.cricbuzz.com");
	 driver.findElement(By.linkText("Schedule"));
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
	    System.out.println("Run my program");
	}

	@Then("^Login should be sucessful$")
	public void login_should_be_sucessful() throws Throwable {
	   System.out.println("Schedule page should be displayed"); 
	}


}
