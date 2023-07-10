package stepdef;

import com.pages.Homepage;
import com.pages.Playlist_page;
import com.pages.constants;
import com.pages.dashboardPage;
import com.pages.libraryPage;
import com.pages.logOut;
import com.pages.login_page;

import common_methods.common_Methods;
import common_methods.validations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class playlist_Operations_steps {
	
	@Given("I am at the audiodigest home page to login as prerequsite")
	public void i_am_at_the_audiodigest_home_page_to_login_as_prerequsite() throws Exception {
		validations.IsTrue(common_Methods.CurrentUrl(), constants.HomePageUrl, "home page url is not displayed");
		Homepage.profile_login();
		validations.IsTrue(common_Methods.CurrentUrl(), constants.LoginPageUrl, "login page url is not displayed");
		login_page.enterEmailId(constants.emailId);
		login_page.enterPassword(constants.password);
		login_page.ClickOnLoginBtn();
		validations.IsTrue(common_Methods.CurrentUrl(), constants.DashBoardPageUrl, "Dashboard page url is not displayed");
	}

	@Given("I click on playlist tab and validate")
	public void i_click_on_playlist_tab_and_validate() throws Exception {
		dashboardPage.NavigateToPlaylist();
		validations.IsTrue(common_Methods.CurrentUrl(), constants.PlayListUrl, "playlist page url is not displayed");
	
	}

	@Given("I click on myplaylist and rename playlist")
	public void i_click_on_myplaylist_and_rename_playlist() throws Exception {
		Playlist_page.ClickOnMyplaylist();
		Playlist_page.renamePlaylistBtn();
		
	}

	@Then("I validate the playlistpop is displayed")
	public void i_validate_the_playlistpop_is_displayed() throws Exception {
		validations.IsDsiplayed(Playlist_page.updatePlaylistPopUp(),"update play list is popup is not displayed");
	}

	@Then("I enter playlist name and update")
	public void i_enter_playlist_name_and_update() throws Exception {
		Playlist_page.UpdatedplaylistName(constants.updated_Playlist_Name);
		Playlist_page.clickOnUpadte();
	}

	@Then("I validate the updated playlistname")
	public void i_validate_the_updated_playlistname() throws Exception {
		validations.IsDsiplayed(Playlist_page.updatedplaylistName(),"updated playlist name is not displayed");
	}

	@Then("I logout user")
	public void i_logout_user() throws Exception {
		logOut.clickProfiledrpDown();
	    logOut.profileDrpDwnListDisplayed();
	    logOut.LogoutBtn();
	    validations.IsTrue(common_Methods.CurrentUrl(), constants.HomePageUrl, "home page url is not displayed");
	}

//	@Given("I click on playlist button and validate")
//	public void i_click_on_playlist_button_and_validate() {
//	    
//	}

	@Given("I create playlist and validate")
	public void i_create_playlist_and_validate() throws Exception {
		Playlist_page.ClickOnMyplaylist();
		Playlist_page.ClickOnCreatePlaylist();
		validations.IsDsiplayed(Playlist_page.create_playlist_Popup(),"updated playlist name is not displayed");
		Playlist_page.enterPlaylist(constants.playlist_Name);
		Playlist_page.CreatePlaylist();
		validations.IsDsiplayed(Playlist_page.vdt_created_Playlist(),"playlist name is not displayed");
	}

	
	
	@Given("I navigate to library tab and add course to playlist")
	public void i_navigate_to_library_tab_and_add_course_to_playlist() throws Exception {
		Playlist_page.Library_tab();
		validations.IsTrue(common_Methods.CurrentUrl(), constants.libraryUrl, "library page url is not displayed");
		libraryPage.Course_add_ToPlaylist();
		libraryPage.checkBoxAndSave();
	}

	@Given("I navigate to dasboard page and validate playlist")
	public void i_navigate_to_dasboard_page_and_validate_playlist() throws Exception {
		libraryPage.dashboard_Tab();
		validations.IsDsiplayed(dashboardPage.validateplaylist(), "playlist is not created");
	}


	@Given("I click on My playlist")
	public void i_click_on_my_playlist() throws Exception {
		Playlist_page.ClickOnMyplaylist();
		
	}

	@Given("I delete playlist and validate")
	public void i_delete_playlist_and_validate() throws Exception {
		Playlist_page.delete_playlist();
		
	}
}
