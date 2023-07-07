package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class dashboardPage {
	
	public static final By PlaylistsBy=By.xpath("//span[text()='Playlists']");
	public static final By dashboardBtnBy=By.xpath("//span[text()='Dashboard']");
	public static final By LibraryBtnBy=By.xpath("//span[text()='Library']");
	public static final By validateplaylistBy=By.xpath("//span[text()='title1']");

	//web Element

	static WebElement PlaylistTab() {

	return Basepage.getDriver().findElement(PlaylistsBy);

	}
	static WebElement dashboardBtn() {

	return Basepage.getDriver().findElement(dashboardBtnBy);
	}
	
	static WebElement LibraryBtn() {

		return Basepage.getDriver().findElement(LibraryBtnBy);
	}
	static WebElement validateplaylist() {
		return Basepage.getDriver().findElement(validateplaylistBy);
	}
	

	//Action

	public static void NavigateToPlaylist() throws Exception

	{
		Thread.sleep(5000);
		PlaylistTab().click();
		Thread.sleep(3000);
		
	}
	public static void  NavigatetoDashboard() throws Exception {
		dashboardBtn().click();
		Thread.sleep(5000);
	}
	
	public static void NavigateToLibrary() throws Exception {
		Thread.sleep(5000);
		LibraryBtn().click();
		Thread.sleep(3000);
	}
	
//	public static void ValidateplayList() throws Exception {
//		Common_Methods.IsDsiplayed(validateplaylist(), "playlist is not displayed on dashboard page");
//	}

}
