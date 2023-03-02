package org.sing;

import java.util.List;

import org.baseclasses.CucumberBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import  io.cucumber.datatable.DataTable;
public class AmazonTask extends CucumberBaseClass {
	
	@Given("User  has to launch the chrome browser and max the window")
	public void user_has_to_launch_the_chrome_browser_and_max_the_window() {
		browserLaunch();
	   
	}

	@When("To launch the amz application")
	public void to_launch_the_amz_application() {
	   launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fie%3DUTF8%26tag%3Dgoogmantxtmob50-21%26ascsubtag%3D_k_Cj0KCQiAmaibBhCAARIsAKUlaKRcGqmcGigH-xYUQGZA0MKUekK0WbgIrYYeC-zg9VevXFmBWwoRUyQaArcNEALw_wcB_k_%26gclid%3DCj0KCQiAmaibBhCAARIsAKUlaKRcGqmcGigH-xYUQGZA0MKUekK0WbgIrYYeC-zg9VevXFmBWwoRUyQaArcNEALw_wcB%26ref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&Ff");
	}

	@When("To pass valid user name in email field")
	public void to_pass_valid_user_name_in_email_field(DataTable d) {
		
	WebElement k = driver.findElement(By.id("ap_email"));
	List<String> a = d.asList();
	passText(k, a.get(2));
	
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
		WebElement s = driver.findElement(By.id("continue-announce"));
		click(s);
	   
	}

	@When("To enter the invalid password in password field")
	public void to_enter_the_invalid_password_in_password_field(DataTable d) {
		WebElement v = driver.findElement(By.id("password"));
		List<List<String>> i = d.asLists();
	    passText(v, i.get(1).get(2));
	}

	@When("To click the signin button")
	public void to_click_the_signin_button() {
		WebElement x = driver.findElement(By.id("submit"));
		click(x);
	  	}



}
