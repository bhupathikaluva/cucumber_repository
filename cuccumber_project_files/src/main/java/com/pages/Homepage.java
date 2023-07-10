package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	//public static final By AgreeButtonBy = By.xpath("//a[text()='Agree']");
	public static final By profileLoginButtonBy=By.xpath("//div[@id='loginSection']//a[@id='HlLogin']");
	
	
	//webElements
//	static WebElement AgreeButton() {
//		return Basepage.getDriver().findElement(AgreeButtonBy);
//	}
    static WebElement profileLoginButton() {
		
    	return Basepage.getDriver().findElement(profileLoginButtonBy);
	}
    
    public static void profile_login() throws Exception {
    	profileLoginButton().click();
    }

}
