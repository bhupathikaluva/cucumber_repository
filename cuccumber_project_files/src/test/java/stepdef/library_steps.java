package stepdef;

import com.pages.Homepage;
import com.pages.constants;
import com.pages.dashboardPage;
import com.pages.libraryPage;
import com.pages.login_page;

import common_methods.common_Methods;
import common_methods.validations;
import io.cucumber.java.en.Given;

public class library_steps {
	
	@Given("I click on library tab and validate")
	public void i_click_on_library_tab_and_validate() throws Exception {
		dashboardPage.NavigateToLibraryTab();
		validations.IsTrue(common_Methods.CurrentUrl(), constants.libraryUrl, "library page url is not displayed");
	    
	}

	@Given("I click on add to playlist link and validate popup")
	public void i_click_on_add_to_playlist_link_and_validate_popup() throws Exception {
	   
		libraryPage.Course_add_ToPlaylist();
	}

	@Given("I click on save button without playlist name and validate")
	public void i_click_on_save_button_without_playlist_name_and_validate() throws Exception {
		
	  libraryPage.create_balnk_playlist();
	  validations.IsDsiplayed(libraryPage.vdt_blankPlylist(),"error message is not displayed");
		
	}
	
	@Given("I click on delete button lecture and validate popup")
	public void i_click_on_delete_button_lecture_and_validate_popup() throws Exception {
		libraryPage.delete_lecture();
	}

	@Given("I click on archive button and validate")
	public void i_click_on_archive_button_and_validate() throws Exception {
	    
	    libraryPage.archive_lecture();
		
	}

	@Given("I click on archive tab under library page")
	public void i_click_on_archive_tab_under_library_page() throws Exception {
	    
		libraryPage.archive_section();
	}

	@Given("I validate archived lecture displyed")
	public void i_validate_archived_lecture_displyed() throws Exception {
		validations.IsDsiplayed(libraryPage.vdt_archive_lecture(),"archived lecture is not displayed");
		
	}
	
	@Given("I click on library tab on dashboard page")
	public void i_click_on_library_tab_on_dashboard_page() throws Exception
	{
		dashboardPage.navigatetoLibrary();
	}

	@Given("I validate Audio Digest library page")
	public void i_validate_audio_digest_library_page() throws Exception 
	{
		validations.IsTrue(common_Methods.CurrentUrl(), constants.libraryUrl, "Librarypage is not displayed");
	}


	@Given("click on save button and observe the popup message")
	public void click_on_save_button_and_observe_the_popup_message() throws Exception 
	{
		libraryPage.clickOnSaveBtnOnPopup();
	}

	@Given("I click on add to playlist link and validate displayed popup")
	public void i_click_on_add_to_playlist_link_and_validate_displayed_popup() throws Exception {
		libraryPage.addToPlaylist();
		validations.IsDsiplayed(libraryPage.popupTitleOfPlaylist(), "course add to playlist popup is not displayed");

	}

	@Given("I click on close button on popup and validate")
	public void i_click_on_close_button_on_popup_and_validate() throws Exception {
		libraryPage.clickPopupCloseBtn();
	}

	@Given("enter the playlist name in the textbox and click on save button")
	public void enter_the_playlist_name_in_the_textbox_and_click_on_save_button() throws Exception {
		libraryPage.enterPopupTextBox();
		Thread.sleep(3000);
		libraryPage.clickOnSaveBtnOnPopup();
	}

	@Given("validate display popup and dismiss popup")
	public void validate_display_popup_and_dismiss_popup() throws Exception {
		validations.IsDsiplayed(libraryPage.popupMessage(), "popup message is not displayed");
	}

	@Given("I click on search by specialty and select specialty")
	public void i_click_on_search_by_specialty_and_select_specialty() throws Exception {
		libraryPage.clickOnSearchBySpecialty();
	   Thread.sleep(3000);
	   libraryPage.selectSpecialtyByDropdown();
	   Thread.sleep(3000);

	}

	@Given("I click on sortby dropdown and select newest option and observe results")
	public void i_click_on_sortby_dropdown_and_select_newest_option_and_observe_results() throws InterruptedException 
	{
		common_Methods.selectDropDown(libraryPage.selectSortByDrpdwn(), constants.selectNewTextByDrpdwn);
		Thread.sleep(5000);
	}

	@Given("I click on sortby dropdown and select oldest option and observe results")
	public void i_click_on_sortby_dropdown_and_select_oldest_option_and_observe_results() throws InterruptedException 
	{
		common_Methods.selectDropDown(libraryPage.selectSortByDrpdwn(), constants.selectOldTextByDrpdwn);
		Thread.sleep(9000);

	}
	
	//
	
	@Given("I click on mydashboard tab")
	public void i_click_on_mydashboard_tab() throws Exception
	{
		Homepage.profile_login();
		validations.IsTrue(common_Methods.CurrentUrl(), constants.LoginPageurl, "login page url is not displayed");
		login_page.enterEmailId(constants.emailId);
		login_page.enterPassword(constants.password);
		login_page.ClickOnLoginBtn();
		

	}

	@Given("validate courses under my library section")
	public void validate_courses_under_my_library_section() throws Exception
	{
		libraryPage.ClickOnlibrary();
		validations.IsDsiplayed(libraryPage.allcourses(),"Allcourses is not displayed");
		//validations.IsTrue(common_methods.CurrentUrl(), constant.libraryUrl, "library page url is not displayed");
	}

	@Given("click on play icon of any course")
	public void click_on_play_icon_of_any_course() throws Exception 
	{
		libraryPage.clickonplayButton();
	}

	@Given("click on hi and click on logout")
	public void click_on_hi_and_click_on_logout() throws Exception 
	{
		libraryPage.clickonHiButton();
		libraryPage.logout();
		

	}
	
	@Given("click on my library")
	public void click_on_my_library() throws Exception
	{
		libraryPage.ClickOnlibrary();
	}

	@Given("I select credits option")
	public void i_select_credits_option() throws Exception 
	{
		libraryPage.credit();
	}

	@Given("verify sort by option as credits and select speciality from specialty dropdown")
	public void verify_sort_by_option_as_credits_and_select_speciality_from_specialty_dropdown() throws Exception
	{
		libraryPage.credit();
	}


	


}
