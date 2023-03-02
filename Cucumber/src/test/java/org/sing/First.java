package org.sing;

import org.baseclasses.CucumberBaseClass;
import org.maven.PojoM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class First extends CucumberBaseClass{
	


	
	@Given("User has to launch the browser and max the browser")
	public void user_has_to_launch_the_browser_and_max_the_browser() {
	   browserLaunch();
	}

	@When("user has to launch the fb applications in browser")
	public void user_has_to_launch_the_fb_applications_in_browser() {
	   launchUrl("https://www.facebook.com/");
	}

	@When("to pass the email id")
	public void to_pass_the_email_id() {
		
		WebElement a = driver.findElement(By.id("email"));
	  passText(a, "rdgrdder");
	}

	@When("to pass the password")
	public void to_pass_the_password() {
		WebElement b = driver.findElement(By.id("pass"));
	    passText(b, "1234");
	}

	@Then("Iclik the login button")
	public void iclik_the_login_button() {
		
		WebElement c = driver.findElement(By.name("login"));
		click(c);
		
	}

	@Then("close the browser")
	public void close_the_browser() {
		
	}



@Given("to launch the browser")
public void to_launch_the_browser() {
	 browserLaunch();
}

@When("launch the url")
public void launch_the_url() {
	 launchUrl("https://www.facebook.com/");
}

@Then("user has to pass{string} the email value")
public void user_has_to_pass_the_email_value(String es) {
	WebElement a = driver.findElement(By.id("email"));
	  passText(a, es);
}

@Then("user has to pass{string} the password value")
public void user_has_to_pass_the_password_value(String em) {
	WebElement b = driver.findElement(By.id("pass"));
    passText(b, em);
}

@Then("press login")
public void press_login() {
	WebElement c = driver.findElement(By.name("login"));
	click(c);
}

@Then("quit")
public void quit() {
}

	
	
	
	
	
	
	
	
	
	

}
