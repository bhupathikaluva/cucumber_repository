package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class myworkprofilePage {
	
	
	public static final By licensure_addBtn_by=By.xpath("//input[@value='ADD']");
	public static final By state_licensure_drpdwn=By.xpath("//input[@id='container_1_profiletabs_0_userstates_0_ddlStateT_Input']");
	public static final By state_By=By.xpath("//li[@class='rcbHovered']");
	
	public static final By State_error_msgBy=By.xpath("//span[@id='container_1_profiletabs_0_userstates_0_reqddlStateT']");
	
	
	//web elements
	static WebElement licensure_addBtn() {
		
    	return Basepage.getDriver().findElement(licensure_addBtn_by);
	}
	
		static WebElement State_licensure_drpdwn() {
		
    	return Basepage.getDriver().findElement(state_licensure_drpdwn);
	}
	
		static WebElement state_select() {
			
	    	return Basepage.getDriver().findElement(state_By);
		}
		public static WebElement State_error_msg() {
			
	    	return Basepage.getDriver().findElement(State_error_msgBy);
		}
	
	
	
	//actions
	public static void state_Licensure_drpdwn() throws Exception {
		Thread.sleep(3000);
		State_licensure_drpdwn().click();
	}
	
	public static void State_select() throws InterruptedException {
		Thread.sleep(3000);
		state_select().click();
	}
	
	
	public static void Licensure_addBtn() throws Exception {
		Thread.sleep(3000);
		licensure_addBtn().click();
	}
	
	

}
