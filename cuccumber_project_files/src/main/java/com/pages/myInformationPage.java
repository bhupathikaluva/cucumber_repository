package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common_methods.common_Methods;

public class myInformationPage {
	//xpath
	
	public static final By salutation_testbox_By=By.xpath("//select[@id='container_1_profiletabs_0_ddlSalutation']");
	public static final By credentials_textbox_By=By.xpath("//input[@id='container_1_profiletabs_0_txtCredentials']");
	public static final By address_textbox_By=By.xpath("//input[@id='container_1_profiletabs_0_txtAddress']");
	public static final By address2_textboxBy=By.xpath("//input[@id='container_1_profiletabs_0_txtAddress2']");
	public static final By country_drpdwnBy=By.xpath("//select[@id='container_1_profiletabs_0_ddlCountry']");
	public static final By city_textboxBy=By.xpath("//input[@id='container_1_profiletabs_0_txtCity']");
	public static final By select_stateBy=By.xpath("//select[@id='selState']");
	public static final By zipcode_textboxBy=By.xpath("//input[@id='txtZipcode']");
	public static final By phone_textboxBy=By.xpath("//input[@id='container_1_profiletabs_0_txtPhone']");
	public static final By save_BtnBy=By.xpath("//input[@id='container_1_profiletabs_0_SaveInformation']");
	public static final By vdt_country_selected=By.xpath("//option[@selected='selected'][text()='AUSTRALIA']");
	
	
	
	
	
	//web elements
	static WebElement salutation() {
		
    	return Basepage.getDriver().findElement(salutation_testbox_By);
	}
	
	static WebElement credentials() {
		
    	return Basepage.getDriver().findElement(credentials_textbox_By);
	}
	static WebElement address() {
		
    	return Basepage.getDriver().findElement(address_textbox_By);
	}
	
	static WebElement address2() {
		
    	return Basepage.getDriver().findElement(address2_textboxBy);
	}
	public static WebElement country_drpdwn() {
		
    	return Basepage.getDriver().findElement(country_drpdwnBy);
	}
	public static WebElement city_textbox() {
		
    	return Basepage.getDriver().findElement(city_textboxBy);
	}
	static WebElement Select_state() {
		
    	return Basepage.getDriver().findElement(select_stateBy);
	}
	
	
	public static WebElement zipcode_textbox() {
		
    	return Basepage.getDriver().findElement(zipcode_textboxBy);
	}
	
	public static WebElement phone_textboxBy() {
		
    	return Basepage.getDriver().findElement(phone_textboxBy);
	}
	static WebElement save_btn() {
		
    	return Basepage.getDriver().findElement(save_BtnBy);
	}
	public static WebElement Vdt_country_selected() {
		
    	return Basepage.getDriver().findElement(vdt_country_selected);
	}
	
	
	
	
	//actions
	public static void Salutation() throws Exception {
		Thread.sleep(5000);
		common_Methods.selectDropDown(salutation(), constants.saluatation);
		
	}
	public static void enter_credential() throws Exception {
		Thread.sleep(3000);
		credentials().clear();
		credentials().sendKeys(constants.credentials);
		
	}
	
	public static void enter_address() throws Exception {
		Thread.sleep(3000);
		address().clear();
		address().sendKeys(constants.address);
	}
	
	public static void enter_address2() {
		
		address2().clear();
		address2().sendKeys(constants.address2);
	}
	
	public static void country_select() throws Exception {
		Thread.sleep(3000);
		common_Methods.selectDropDown(country_drpdwn(), constants.countryOption);
		Thread.sleep(3000);
	}
	
	public static void enter_city() throws Exception {
		Thread.sleep(3000);
		city_textbox().clear();
		city_textbox().sendKeys(constants.city);
	}
	
	public static void state_select() throws InterruptedException {
		Thread.sleep(3000);
		common_Methods.selectDropDown(Select_state(), constants.state);
	}
	
	public static void Zipcode_textbox() throws InterruptedException {
		Thread.sleep(3000);
		zipcode_textbox().clear();
		zipcode_textbox().sendKeys(constants.zipcode);
	}
	
	public static void phone_textbox() throws Exception {
		Thread.sleep(3000);
		phone_textboxBy().clear();
		phone_textboxBy().sendKeys(constants.phone);	
		}
	
	public static void Save_btn() throws Exception {
		Thread.sleep(3000);
		save_btn().click();
		Thread.sleep(3000);
	}
	
	
	
	
	

}
