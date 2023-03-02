package org.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoM {
	
	WebDriver driver =new ChromeDriver();
	public PojoM() {
		
		PageFactory.initElements(driver, this);
		
	}
     
     @FindBy(id="email")
     private WebElement emailtxt;
	
	
     @FindBy(name="pass")
     private WebElement passtxt;
	
	
     @FindBy(name="login")
     private WebElement loginbtn;


	public WebElement getEmailtxt() {
		return emailtxt;
	}


	public WebElement getPasstxt() {
		return passtxt;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}
}
