package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class login_page {
	
	//xpath
	public static final By EmailTextBoxBy =By.xpath("//input[@id='TxtUserName']");
	public static final By PwdTextBoxBy =By.xpath("//input[@id='TxtPassword']");
	public static final By LoginButtonBy=By.xpath("//input[contains(@id,'LbLogin')]");
	
	//web Elements
	static WebElement EmailTextBox() {
    	return Basepage.getDriver().findElement(EmailTextBoxBy);
	}
    static WebElement PwdTextBox() {
		
    	return Basepage.getDriver().findElement(PwdTextBoxBy);
	}
    static WebElement LoginButton() {
		
    	return Basepage.getDriver().findElement(LoginButtonBy);
	}
    
    //actions
    public static void enterEmailId(String emailId) throws Exception {
    Thread.sleep(5000);
	EmailTextBox().sendKeys(emailId);
	
    }
	
	public static void enterPassword(String password) throws Exception {
	Thread.sleep(6000);
	PwdTextBox().sendKeys(password);
    }
	public static void ClickOnLoginBtn() throws Exception {
		Thread.sleep(5000);
		LoginButton().click();
		Thread.sleep(3000);
	}

}
