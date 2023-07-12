package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common_methods.validations;

public class dashboardPage {
	
	public static final By PlaylistsBy=By.xpath("//span[text()='Playlists']");
	public static final By dashboardBtnBy=By.xpath("//span[text()='Dashboard']");
	public static final By LibraryBtnBy=By.xpath("//span[text()='Library']");
	public static final By vdt_playlist=By.xpath("//span[text()='myplaylist']");
	
	public static final By search_textBy=By.xpath("//input[@id='header_0_txtKeywordsTop']");
	public static final By search_btnBy=By.xpath("//i[@class='fa fa-search']");
	public static final By vdt_search_results_By=By.xpath("//a[contains(text(),'Mood Disorders (Behavioral Neurology and Psychiatr')]");
	
	public static final By search_speciality_btnBy=By.xpath("//a[@class='button text-left']");
	public static final By familyMedicine_BtnBy=By.xpath("//a[@id='header_0_rpSearchSpecialty_btoSearchLink_5']");
	public static final By searchByspl_drpdwn_By=By.xpath("//div[@id='drop2']//div[@class='row']");
	
	public static final By crs_icon_filtered_keywrd=By.xpath("//input[@id='container_2_rptSpecialty_btoRemoveSpecialty_0']");
	
	public static final By ProfileDrpDwnBtnBy=By.xpath("//div[@id='loginSection']");
	public static final By ProfileDrpDwnListVdtBy=By.xpath("//ul[@id='drop1']");
	public static final By myInformation_tabBy=By.xpath("//a[@id='MyInformationTab']");
	public static final By PlaylistsTab=By.xpath("//span[text()='Playlists']");
	public static final By dashboardTab=By.xpath("//span[text()='Dashboard']");
	public static final By LibraryTab=By.xpath("//span[text()='Library']");
	public static final By enterOnSearchBox=By.xpath("//input[@id='header_0_txtKeywordsTop']");
	public static final By clickSearchIcon=By.xpath("//a[@id='header_0_btnSearchTop']"); 
	public static final By enterOntopicFilter=By.xpath("//input[@id='container_2_racbTopic_Input']");
	public static final By topicFilter=By.xpath("//input[@id='container_2_racbTopic_ClientState']");
	
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
	public static WebElement validateplaylist() {
		return Basepage.getDriver().findElement(vdt_playlist);
	}
	public static WebElement search_text() {
		return Basepage.getDriver().findElement(search_textBy);
	}
	
	public static WebElement search_btn() {
		return Basepage.getDriver().findElement(search_btnBy);
	}
	
	public static WebElement Vdt_search_result() {
		return Basepage.getDriver().findElement(vdt_search_results_By);
	}
	//
	public static WebElement search_speciality_btn() {
		return Basepage.getDriver().findElement(search_speciality_btnBy);
	}
	
	public static WebElement familyMedicine_Btn() {
		return Basepage.getDriver().findElement(familyMedicine_BtnBy);
	}
	
	public static WebElement searchByspl_drpdwn() {
		return Basepage.getDriver().findElement(searchByspl_drpdwn_By);
	}
	
	public static WebElement cross_icon_filtered_keywrd() {
		return Basepage.getDriver().findElement(crs_icon_filtered_keywrd);
	}
	
	public static WebElement ProfileDrpDwn_Btn() {
		return Basepage.getDriver().findElement(ProfileDrpDwnBtnBy);
	}
	public static WebElement Profile_DrpDwnList_Vdt() {
		return Basepage.getDriver().findElement(ProfileDrpDwnListVdtBy);
	}
	public static WebElement myInformation_tab() {
		return Basepage.getDriver().findElement(myInformation_tabBy);
	}
	
	
	public static WebElement LibraryTab() 
	{

		return Basepage.getDriver().findElement(LibraryTab);
	}
	
	public static WebElement textOnSearchBox() 
	{
		return Basepage.getDriver().findElement(enterOnSearchBox);

	}
	public static WebElement clickOnSearchIconBtn() 
	{
		return Basepage.getDriver().findElement(clickSearchIcon);

	}
	public static WebElement textOnTopicFilter() 
	{
		return Basepage.getDriver().findElement(enterOntopicFilter);

	}
	public static WebElement OnTopicFilter() 
	{
		return Basepage.getDriver().findElement(topicFilter);

	}
	public static WebElement Dashboardbtn()
	{
		return Basepage.getDriver().findElement(dashboardBtnBy);
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
	
	public static void NavigateToLibraryTab() throws Exception {
		Thread.sleep(5000);
		LibraryBtn().click();
		Thread.sleep(3000);
	}
	
	public static void search_speciality(String speciality) throws Exception {
		Thread.sleep(3000);
		search_text().sendKeys(speciality);
		search_btn().click();
	}
	
	public static void search_familymedicine() throws Exception {
		Thread.sleep(3000);
		search_speciality_btn().click();
		Thread.sleep(3000);
		validations.IsDsiplayed(searchByspl_drpdwn(), "search by speciality dropdown is not displayed");
		familyMedicine_Btn().click();
		
		}
	public static void cross_icon_filterd_splty() throws Exception {
		Thread.sleep(3000);
		cross_icon_filtered_keywrd().click();
	}
	
	public static void navigate_to_myformation() throws Exception {
		Thread.sleep(3000);
		ProfileDrpDwn_Btn().click();
		Thread.sleep(3000);
		validations.IsDsiplayed(Profile_DrpDwnList_Vdt(), "profile dropdown is not displayed");
		myInformation_tab().click();
		
	}
	
	public static void navigateToPlaylistpage() throws Exception
	{

		PlaylistTab().click();
		Thread.sleep(3000);

	}
	
	public static void  navigatetoLibrary() throws Exception 
	{
		LibraryTab().click();
		Thread.sleep(5000);

	}
	
	public static void enterTextOnSearchBox() throws Exception
	{

		textOnSearchBox().sendKeys(constants.coursename);
		Thread.sleep(3000);

	}
	public static void clickOnSearchIconButton() throws Exception
	{
		clickOnSearchIconBtn().click();
		Thread.sleep(3000);

	}
	public static void enterTextOnTopicFilter() throws Exception
	{

		textOnTopicFilter().sendKeys(constants.typeOfDisease);
		Thread.sleep(6000);

	}
	public static void ClickOnDashboard() throws Exception
	{
		Dashboardbtn().click();
		Thread.sleep(3000);
	}

}
