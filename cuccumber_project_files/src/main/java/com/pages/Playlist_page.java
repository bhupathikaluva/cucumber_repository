package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common_methods.common_Methods;
import common_methods.validations;

public class Playlist_page {
	
	public static final By CreatePlaylistBtnBy = By.xpath("//a[@title='Create playlist']");
	public static final By CPpopupBy =By.xpath("//div[@id='CreateModal']");
	public static final By searchBoxTextBy = By.xpath("//input[@id='txtPlaylistName']");
	public static final By MyPlaylistBy = By.xpath("//a[@id='lnkMPCM']");
	public static final By CreateBtnBy =By.xpath("//input[@value='CREATE']");
	public static final By create_playlist_popup=By.xpath("//span[normalize-space()='Create Playlist']");
	public static final By MyplaylistBtnBy=By.xpath("//a[@id='lnkMPCM']");
	public static final By renamePlalylistBtnBy=By.xpath("//div[@id='tab-3']//div[contains(@ng-repeat,'playlist in MyPlayList')][1]//a[@data-reveal-id='UpdateModal']");
	public static final By vdt_created_playlist=By.xpath("//a[contains(@class,'ng-binding')]//span[contains(@class,'ng-binding')][normalize-space()='myplaylist']");
	public static final By delete_playlist=By.xpath("//div[@id='tab-3']//div[contains(@ng-repeat,'playlist in MyPlayList')][4]//a[@title='Delete Playlist']");
	public static final By delete_Plylist_Btn=By.xpath("//div[@id='DelModalArchive']//input[@value='DELETE']");
	public static final By delete_plylist_popup=By.xpath("//div[@id='DelModalArchive']");
	public static final By updatePlaylistPopUpBy=By.xpath("//div[@id='UpdateModal']");
	public static final By CurrentNamePlaylistTextboxBy=By.xpath("//input[@ng-model='CurrentPlaylist.PlayListName']");
	public static final By PlaylistUpdateBtnBy=By.xpath("//input[@value='UPDATE']");
	public static final By updatedplaylistNameBy=By.xpath("//span[text()='playlist01']");
	public static final By ToNavigateRepectivePlaylistpageBy=By.xpath("//body/form[@id='form1']/div[@id='pnlMainContainer']/div[9]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]");
	public static final By NavigateToNextPlaylistBy=By.xpath("//span[@title='Next Playlist']");
	public static final By NavigateTopreviousPlayListBy=By.xpath("//span[@title='Previus Playlist']");
	public static final By validateNextPlaylistBy=By.xpath("//span[contains(text(),'title1')]");
	public static final By lastPlaylistTextBy=By.xpath("//span[contains(text(),'Anesthesiology Platinum Membership 1 year MP3')]");
	public static final By existing_playlist_errorBy=By.xpath("//div[@id='alCreationError']");
	public static final By poup_cross_btnBy=By.xpath("//div[@id='CreateModal']//a[normalize-space()='×']");
	public static final By library_tab_By=By.xpath("//span[normalize-space()='Library']");
	
	//
	public static final By CreatePlaylistBtn = By.xpath("//a[@title='Create playlist']");
	public static final By CPpopupTitle=By.xpath("//span[text()='Create Playlist']");
	public static final By CPTextbox=By.xpath("//input[@id='txtPlaylistName']");
    public static final By CreateButton=By.xpath("//input[@value='CREATE']");
    public static final By playlistPopupTitle=By.xpath("//div[@id=\"CreateModal\"]/span");
    public static final By ClickAnyPlaylist=By.xpath("//a[@class='ng-binding']//span[text()='Oncology']");
    public static final By ClickMyPlaylistTab=By.xpath("//a[@id='lnkMPCM']");
    public static final By ClickAudioDigestPlaylistTab=By.xpath("//a[@id='lnkByADCM']");
    
    //
    
    public static final By PlaylistsBy=By.xpath("//span[text()='Playlists']");
	public static final By enternameBy=By.xpath("//input[@id='txtPlaylistName']");
	public static final By createButtonBy = By.xpath("//input[@value='CREATE']");
	public static final By clickonAllBy= By.xpath("//a[@id='lnkAllCM']");
	public static final By backtoplaylisttabBy= By.xpath("//span[text()='Playlists']");

	
	
	//web elements
	public static WebElement CreatePlaylistBtn()
	{
	return Basepage.getDriver().findElement(CreatePlaylistBtnBy);
	}
	
	static WebElement CPpopupBy()
	{
	return Basepage.getDriver().findElement(CPpopupBy);
	}
	
	static WebElement searchTextBox()
	{
	return Basepage.getDriver().findElement(searchBoxTextBy);
	}
	
	static WebElement CreateBtn()
	{
	return Basepage.getDriver().findElement(CreateBtnBy);
	}
	static WebElement MyplaylistBtn()
	{
	return Basepage.getDriver().findElement(MyplaylistBtnBy);
	}
	
	public static WebElement create_playlist_Popup()
	{
	return Basepage.getDriver().findElement(create_playlist_popup);
	}
	
	public static WebElement vdt_created_Playlist() {
		return Basepage.getDriver().findElement(vdt_created_playlist);
	}
	
	static WebElement renameplalylistBtn()
	{
	return Basepage.getDriver().findElement(renamePlalylistBtnBy);
	}
	
	public static WebElement updatePlaylistPopUp()
	{
	return Basepage.getDriver().findElement(updatePlaylistPopUpBy);
	}
	
	public static WebElement CurrentNamePlaylistTextbox()
	{
	return Basepage.getDriver().findElement(CurrentNamePlaylistTextboxBy);
	}
	
	public static WebElement PlaylistUpdateBtn() {
		return Basepage.getDriver().findElement(PlaylistUpdateBtnBy);
	}
	public static WebElement updatedplaylistName() {
		return Basepage.getDriver().findElement(updatedplaylistNameBy);
	}
	
	public static WebElement delete_Playlist() {
		return Basepage.getDriver().findElement(delete_playlist);
	}
	public static WebElement delete_Playlist_popup() {
		return Basepage.getDriver().findElement(delete_plylist_popup);
	}
	
	
	public static WebElement delete_Plylist_Btn() {
		return Basepage.getDriver().findElement(delete_Plylist_Btn);
	}
	
	public static WebElement NavigateToRepectivePlaylistpage() {
		return Basepage.getDriver().findElement(ToNavigateRepectivePlaylistpageBy);
	}
	public static WebElement NavigateToNextPlaylist() {
		return Basepage.getDriver().findElement (NavigateToNextPlaylistBy);
			
	}
	
	public static WebElement library_Tab() {
		return Basepage.getDriver().findElement (library_tab_By);
			
	}
	
	
	public static WebElement validateNextPlaylist() {
		return Basepage.getDriver().findElement (validateNextPlaylistBy);
		
	}
	
	public static WebElement NavigateTopreviousPlayList() {
		return Basepage.getDriver().findElement (NavigateTopreviousPlayListBy);
	}
	
	public static WebElement NavigateTolastPlaylist() {
		return Basepage.getDriver().findElement(lastPlaylistTextBy);
	}
	
	public static WebElement existing_playlist_error() {
		return Basepage.getDriver().findElement(existing_playlist_errorBy);
	}
	
	public static WebElement poup_cross_btn() {
		return Basepage.getDriver().findElement(poup_cross_btnBy);
	}
	
	public static WebElement createPlaylistBtn()
	{

		return Basepage.getDriver().findElement(CreatePlaylistBtn);

	}
	
	public static WebElement createPlaylistPopupTitle()
	{

		return Basepage.getDriver().findElement(CPpopupTitle);

	}
	public static WebElement playlistTextBox()
	{

		return Basepage.getDriver().findElement(CPTextbox);

	}
	public static WebElement playlistCreateBtn()
	{

		return Basepage.getDriver().findElement(CreateButton);

	}
	public static WebElement playlistTitle()
	{

		return Basepage.getDriver().findElement(playlistPopupTitle);

	}
	public static WebElement clickOnPlaylist()
	{

		return Basepage.getDriver().findElement(ClickAnyPlaylist);

	}
	public static WebElement clickOnMyPlaylist()
	{

		return Basepage.getDriver().findElement(ClickMyPlaylistTab);

	}
	public static WebElement clickOnAudioDigestPlaylist()
	{

		return Basepage.getDriver().findElement(ClickAudioDigestPlaylistTab);

	}
	
	public static WebElement PlaylistTab()
	{
		return Basepage.getDriver().findElement(PlaylistsBy);
	}
	
	public static WebElement nameEnter()
	{
		return Basepage.getDriver().findElement(enternameBy);
	}
	public static WebElement CreateBn()
	{
		return Basepage.getDriver().findElement(createButtonBy);
	}
	public static WebElement Allbtn()
	{
		return Basepage.getDriver().findElement(clickonAllBy);
	}
	public static WebElement Backplaylist()
	{
		return Basepage.getDriver().findElement(backtoplaylisttabBy);
	}
	

	
	//action
	public static void ClickOnCreatePlaylist() throws Exception
	{
	CreatePlaylistBtn().click();
	Thread.sleep(5000);
	}
	public static void enterPlaylist(String playlistName) throws Exception
	{
	Thread.sleep(5000);
	searchTextBox().sendKeys(playlistName);
	Thread.sleep(5000);
	}
	public static void CreatePlaylist() throws Exception
	{
	CreateBtn().click();
	Thread.sleep(5000);
	}
	public static void ClickOnMyplaylist() throws Exception {
		Thread.sleep(5000);
		MyplaylistBtn().click();
		Thread.sleep(6000);
	}
	public static void navigateTorespectivePlaylist() throws Exception {
		Thread.sleep(5000);
		NavigateToRepectivePlaylistpage().click();
		Thread.sleep(5000);
		}
	public static void navigateToNextplaylistAndValidate() throws Exception {
		Thread.sleep(5000);
		NavigateToNextPlaylist().click();
		validations.IsDsiplayed(validateNextPlaylist(), "next playlist is not displayed");
		
	}
	public static void LastlaylistAndValidate() throws Exception {
		Thread.sleep(5000);
		NavigateTopreviousPlayList().click();
		validations.IsDsiplayed(NavigateTolastPlaylist(),"previous playlist is not displayed");
	}

	
	public static void renamePlaylistBtn() throws Exception {
		renameplalylistBtn().click();
		Thread.sleep(5000);
	}
	
	public static void UpdatedplaylistName(String name) throws Exception {
		CurrentNamePlaylistTextbox().clear();
		Thread.sleep(3000);
		CurrentNamePlaylistTextbox().sendKeys(name);
	}
	
	public static void clickOnUpadte() throws Exception {
		Thread.sleep(3000);
		PlaylistUpdateBtn().click();
		//Thread.sleep(3000);
		//Basepage.getDriver().navigate().refresh();
	}
	
	public static void delete_playlist() throws Exception {
		delete_Playlist().click();
		Thread.sleep(3000);
		validations.IsDsiplayed(Playlist_page.delete_Playlist_popup(),"delete play list is popup is not displayed");
		delete_Plylist_Btn().click();
		
	}
	
	public static void Library_tab() throws Exception {
		Thread.sleep(3000);
		library_Tab().click();
	}
	
	public static void plylist_popup_cross_Btn() throws InterruptedException {
		Thread.sleep(3000);
		poup_cross_btn().click();
	}
	
	public static void clickOnCreatePlaylist() throws Exception
	{
		createPlaylistBtn().click();
		Thread.sleep(3000);
	}
	public static void CPlaylistPopupTitle() throws Exception
	{
		createPlaylistPopupTitle().click();
		Thread.sleep(3000);
	}
	public static void enterplaylistTextbox() throws Exception
	{
		playlistTextBox().sendKeys(constants.newplaylistname);
		Thread.sleep(3000);
	}
	public static void playlistCreateButton() throws Exception
	{
		playlistCreateBtn().click();
		Thread.sleep(3000);
	}
	
	public static void clickingAnyPlaylist() throws Exception
	{
		clickOnPlaylist().click();
		Thread.sleep(3000);
	}
	public static void expandMyPlaylist() throws Exception
	{
		clickOnMyPlaylist().click();
		Thread.sleep(3000);
	}
	public static void expandAudioDigestPlaylist() throws Exception
	{
		clickOnAudioDigestPlaylist().click();
		Thread.sleep(3000);
	}

}
