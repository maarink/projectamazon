package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class loginpage {
	WebDriver driver;
	@Given("The user should be in facebook home page")
	public void the_user_should_be_in_facebook_home_page() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@When("The user has to fill username and password")
	public void the_user_has_to_fill_username_and_password() {

		WebElement txtusername = driver.findElement(By.id("txtUsername"));
		txtusername.sendKeys("maari");
		WebElement txtpassword = driver.findElement(By.id("txtPassword"));
		txtpassword.sendKeys("876765");  
	}

	@When("The fill has to click the sign-in button")
	public void the_fill_has_to_click_the_sign_in_button() {
	   WebElement click = driver.findElement(By.id("btnLogin"));
	click.click();
	}

	@Then("The should navigate to the invalid login page")
	public void the_should_navigate_to_the_invalid_login_page() throws InterruptedException {
		Thread.sleep(5000);
	   String url = driver.getCurrentUrl();
	   boolean ct = url.contains("php");
Assert.assertTrue("valid and invalid credentials", ct);	
System.out.println("navigate the invalid login page");
	driver.quit();
	}

//	private void assertTrue(String string, boolean ct) {
//		// TODO Auto-generated method stub
		
//	}


}
