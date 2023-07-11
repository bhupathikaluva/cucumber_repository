package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common_methods.validations;

public class libraryPage {
	
	public static final By addtoPlaylistBy=By.xpath("//a[contains(@id,'container_2_rgLibrary_ctl00_ctl04_AddToPlaylistButton')]");
	public static final By courseAddtoPlaylistBy=By.xpath("//a[contains(@id,'container_2_rgLibrary_ctl00_ctl04_AddToPlaylist')]");
	public static final By addCourseToPlayListPopupBy=By.xpath("//div[@id='pmSingleSearch']");
	public static final By checkboxBy=By.xpath("//div[@id='mCSB_1_container']/div[12]/span/label");
	public static final By dashboardBy=By.xpath("//span[normalize-space()='Dashboard']");
	public static final By vdt_blankplylist_error_MsgBy=By.xpath("//div[contains(text(),'Please select an existing playlist or create a new playlist')]");
	
	
	public static final By SaveButtonBy=By.xpath("//input[@id='submitbutmodal']");
	
	
	
	public static WebElement courseAddtoPlaylist() {
		return Basepage.getDriver().findElement(courseAddtoPlaylistBy);
	}
	public static WebElement addCourseToPlayListPopup() {
		return Basepage.getDriver().findElement(addCourseToPlayListPopupBy);
	}
	
	public static WebElement checkbox() {
		return Basepage.getDriver().findElement(checkboxBy);
	}
	
	public static WebElement dashboard_tab() {
		return Basepage.getDriver().findElement(dashboardBy);
	}
	
	public static WebElement vdt_blankPlylist() {
		return Basepage.getDriver().findElement(vdt_blankplylist_error_MsgBy);
	}
	
	public static WebElement saveButton() {
		return Basepage.getDriver().findElement(SaveButtonBy);
	}
	
	
	
	public static void Course_add_ToPlaylist() throws Exception {
		Thread.sleep(3000);
		courseAddtoPlaylist().click();
		Thread.sleep(5000);
		validations.IsDsiplayed(addCourseToPlayListPopup(), "add course to playlist popup is not displayed");
	}
	
	public static void create_balnk_playlist() {
		
		saveButton().click();
	}
	
//	public static void addcourse() throws Exception {
//		Thread.sleep(3000);
//		courseAddtoPlaylist().click();
//		Thread.sleep(3000);
//		validations.IsDsiplayed(addCourseToPlayListPopup(), "add course to playlist popup is not displayed");
//		
//	}
	
	
	public static void checkBoxAndSave() throws Exception {
		Thread.sleep(3000);
		checkbox().click();
		Thread.sleep(5000);
		saveButton().click();
	}
	
	public static void dashboard_Tab() throws Exception {
		Thread.sleep(3000);
		dashboard_tab().click();
		Thread.sleep(3000);
	}

}
