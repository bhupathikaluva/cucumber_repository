package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common_methods.common_Methods;
import common_methods.validations;
import io.cucumber.core.options.Constants;

public class libraryPage {
	
	public static final By addtoPlaylistBy=By.xpath("//a[contains(@id,'container_2_rgLibrary_ctl00_ctl04_AddToPlaylistButton')]");
	public static final By courseAddtoPlaylistBy=By.xpath("//a[contains(@id,'container_2_rgLibrary_ctl00_ctl04_AddToPlaylist')]");
	public static final By addCourseToPlayListPopupBy=By.xpath("//div[@id='pmSingleSearch']");
	public static final By checkboxBy=By.xpath("//div[@id='mCSB_1_container']/div[12]/span/label");
	public static final By dashboardBy=By.xpath("//span[normalize-space()='Dashboard']");
	public static final By vdt_blankplylist_error_MsgBy=By.xpath("//div[contains(text(),'Please select an existing playlist or create a new playlist')]");
	
	
	public static final By SaveButtonBy=By.xpath("//input[@id='submitbutmodal']");
	
	public static final By delete_lecture_BtnBy=By.xpath("//input[@id='container_2_rgLibrary_ctl00_ctl04_gbcOpenWindow']");
	public static final By vdt_delete_lecture_PopupBy=By.xpath("//div[@id='container_2_RadWindow3_C']");
	public static final By archive_BtnBy=By.xpath("//input[@id='container_2_RadWindow3_C_Btn_ArchiveLibrary3']");
	public static final By archive_tabBy=By.xpath("//span[@class='rtsTxt'][normalize-space()='Archive']");
	public static final By vdt_archive_lectureBy=By.xpath("//span[@id='container_2_rgLibrary_ctl00_ctl04_HyperLink11']");
	//
	public static final By playlistPopupTitle=By.xpath("//span[text()='This course is in your Library ']");
    public static final By createPlaylistTxtbox=By.xpath("//input[@placeholder='Create new playlist']");
	public static final By clickOnSaveBtn=By.xpath("//input[@id='submitbutmodal']");
	public static final By closePopup=By.xpath("//a[@ng-click='Close()']");
	public static final By popupTextbox=By.xpath("//input[@placeholder='Create new playlist']");
	public static final By popupMsgg=By.xpath("//div[text()='The lecture has been succesfully added.']");
	public static final By clickSearchBySpecialty=By.xpath("//a[text()='Search By Specialty ']");
	public static final By selectSpeciatly=By.id("header_0_rpSearchSpecialty_btoSearchLink_14");
	public static final By selectSortByDP=By.xpath("//select[@id='container_2_ddlSortingBy']");
	public static final String selectspecality="//a[text()='Search By Specialty '] /parent::div//div/a[text()='%s']";
	//
	public static final By librarybn=By.xpath("//span[text()='Library']");
	public static final By practiceaddplaylistBnBy =By.xpath("//a[@id='container_2_rgLibrary_ctl00_ctl04_AddToPlaylistButton_hlModal']");
	public static final By librarypopupBy= By.xpath("//p[text()='You can also add this course to a Playlist:']");
	public static final By selectcourseBy= By.xpath("//input[@id='cb3436451']");
	public static final By SaveBtnBy= By.xpath("//input[@value='SAVE']");
	public static final By stateaddplaylist =By.xpath("//td[@class='title']//a[@id='container_2_rgLibrary_ctl00_ctl06_AddToPlaylistButton_hlModal']");
	public static final By selectingcourse2By= By.xpath("//input[@id='cb3437040']");
	public static final By AllcoursesBy= By.xpath("//table[@id='container_2_rgLibrary_ctl00']");
	public static final By playButtonBy= By.xpath("//div[@id='container_2_rgLibrary_ctl00_ctl04_LibraryPlayButton_divPlayContainer']");
	public static final By HibuttonBy = By.xpath("//a[@class='dropdown profile top-head-link']");
	public static final By logoutButtonBy = By.xpath("//a[text()='Logout']");
	public static final By creditsButtonBy = By.xpath("//a[text()='Credits']");
	
	
	
	
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
	
	public static WebElement delete_lecture_Btn() {
		return Basepage.getDriver().findElement(delete_lecture_BtnBy);
	}
	
	public static WebElement vdt_delete_lecture_Popup() {
		return Basepage.getDriver().findElement(vdt_delete_lecture_PopupBy);
	}
	
	public static WebElement archive_BtnBy() {
		return Basepage.getDriver().findElement(archive_BtnBy);
	}
	
	public static WebElement archive_tab() {
		return Basepage.getDriver().findElement(archive_tabBy);
	}
	
	public static WebElement vdt_archive_lecture() {
		return Basepage.getDriver().findElement(vdt_archive_lectureBy);
	}
	
	public static WebElement addPlaylist() 
	{
		return Basepage.getDriver().findElement(addtoPlaylistBy);

	}
	public static WebElement popupTitleOfPlaylist() 
	{
		return Basepage.getDriver().findElement(playlistPopupTitle);

	}
	public static WebElement playlistTextBox() 
	{
		return Basepage.getDriver().findElement(createPlaylistTxtbox);

	}
	public static WebElement clickOnSaveBtn() 
	{
		return Basepage.getDriver().findElement(clickOnSaveBtn);

	}
	public static WebElement clickOnClosePopup() 
	{
		return Basepage.getDriver().findElement(closePopup);

	}
	public static WebElement popupTextBox() 
	{
		return Basepage.getDriver().findElement(popupTextbox);

	}
	public static WebElement popupMessage() 
	{
		return Basepage.getDriver().findElement(popupMsgg);

	}
	public static WebElement clickSearchSpecialty() 
	{
		return Basepage.getDriver().findElement(clickSearchBySpecialty);

	}
	public static WebElement clickSelectSpecialty() 
	{
		return Basepage.getDriver().findElement(selectSpeciatly);

	}
	public static WebElement selectSortByDrpdwn() 
	{
		return Basepage.getDriver().findElement(selectSortByDP);

	}
	
	public static WebElement library()
	{
		return Basepage.getDriver().findElement(librarybn);
	}
	public static WebElement PracticeAddplaylist()
	{
		return Basepage.getDriver().findElement(practiceaddplaylistBnBy);
	}
	public static WebElement Libarypopup()
	{
		return Basepage.getDriver().findElement(librarypopupBy);
	}
	public static WebElement courseSelecting()
	{
		return Basepage.getDriver().findElement(selectcourseBy);
	}
	public static WebElement SaveButton()
	{
		return Basepage.getDriver().findElement(SaveBtnBy);
	}
	public static WebElement StateAddPlaylist()
	{
		return Basepage.getDriver().findElement(stateaddplaylist);
	}
	public static WebElement selectcourse2()
	{
		return Basepage.getDriver().findElement(selectingcourse2By);
	}
	
	public static WebElement allcourses()
	{
		return Basepage.getDriver().findElement(AllcoursesBy);
	}
	public static WebElement playBtn()
	{
		return Basepage.getDriver().findElement(playButtonBy);
	}
	public static WebElement HiBtn()
	{
		return Basepage.getDriver().findElement(HibuttonBy);
	}
	public static WebElement logoutBtn()
	{
		return Basepage.getDriver().findElement(logoutButtonBy);
	}
	
	public static WebElement creditBtn()
	{
		return Basepage.getDriver().findElement(creditsButtonBy);
	}
	
	
	//actions
	
	public static void Course_add_ToPlaylist() throws Exception {
		Thread.sleep(3000);
		courseAddtoPlaylist().click();
		Thread.sleep(5000);
		validations.IsDsiplayed(addCourseToPlayListPopup(), "add course to playlist popup is not displayed");
	}
	
	public static void create_balnk_playlist() {
		saveButton().click();
	}
	
	public static void delete_lecture() throws Exception {
		Thread.sleep(3000);
		delete_lecture_Btn().click();
		validations.IsDsiplayed(addCourseToPlayListPopup(), "add course to playlist popup is not displayed");
		
	}
	
	public static void archive_lecture() throws Exception {
		Thread.sleep(3000);
		archive_BtnBy().click();
	}
	
	public static void archive_section() throws  Exception{
		Thread.sleep(3000);
		archive_tab().click();
		Thread.sleep(3000);
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
	
	public static void addToPlaylist() throws Exception
	{

		addPlaylist().click();
		Thread.sleep(3000);

	}
	public static void createPlaylistTextbox() throws Exception
	{

		playlistTextBox().click();
		Thread.sleep(3000);

	}
	public static void clickOnSaveBtnOnPopup() throws Exception
	{

		clickOnSaveBtn().click();
		Thread.sleep(3000);

	}
	public static void clickPopupCloseBtn() throws Exception
	{

		clickOnClosePopup().click();
		Thread.sleep(3000);

	}
	public static void enterPopupTextBox() throws Exception
	{

		popupTextBox().sendKeys(constants.newplaylist_name);
		Thread.sleep(3000);

	}
	public static void clickOnSearchBySpecialty() throws Exception
	{

		clickSearchSpecialty().click();
		Thread.sleep(3000);

	}
	
	public static void ClickOnlibrary() throws Exception
	{
		library().click();
		Thread.sleep(3000);
	}
	public static void AddplaylistButton() throws Exception
	{
		PracticeAddplaylist().click();
		Thread.sleep(3000);
	}
	public static void SelectCourse() throws Exception
	{
		courseSelecting().click();
		Thread.sleep(3000);
	}
	public static void Save() throws Exception
	{
		SaveButton().click();
		Thread.sleep(3000);
	}
	public static void stateaddplaylistButton() throws Exception
	{
		StateAddPlaylist().click();
		Thread.sleep(3000);
	}
	public static void SelectingCourse2() throws Exception
	{
		selectcourse2().click();
		Thread.sleep(3000);
	}
	
	public static void clickonplayButton() throws Exception
	{
		playBtn().click();
		Thread.sleep(3000);
	}
	public static void clickonHiButton() throws Exception
	{
		HiBtn().click();
		Thread.sleep(3000);
	}
	public static void logout() throws Exception
	{
		logoutBtn().click();
		Thread.sleep(3000);
	}
	
	public static void credit() throws Exception
	{
		creditBtn().click();
		Thread.sleep(3000);
	}
	
	public static void selectSpecialtyByDropdown() throws Exception
	{


		Thread.sleep(3000);
		System.out.println(common_Methods.clickSearchMenuAndTypeOption(libraryPage.selectspecality,"Orthopaedics"));
		WebElement s=Basepage.getDriver().findElement(By.xpath(common_Methods.clickSearchMenuAndTypeOption(libraryPage.selectspecality,"Orthopaedics")));
		s.click();

	}

}
