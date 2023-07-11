package stepdef;

import com.pages.Playlist_page;
import com.pages.constants;
import com.pages.dashboardPage;
import com.pages.libraryPage;

import common_methods.common_Methods;
import common_methods.validations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class library_steps {
	
	@Given("I click on library tab and validate")
	public void i_click_on_library_tab_and_validate() throws Exception {
		dashboardPage.NavigateToLibraryTab();
		validations.IsTrue(common_Methods.CurrentUrl(), constants.libraryUrl, "library page url is not displayed");
	    
	}

	@Given("I select start date and end date validate date filtered results displayed")
	public void i_select_start_date_and_end_date_validate_date_filtered_results_displayed() {
	    
		
	}

	@Then("I enter title or issue id and validate filtered results displayed")
	public void i_enter_title_or_issue_id_and_validate_filtered_results_displayed() {
	   
		
	}

	@Then("I select valid speciality and validate filtered results displayed")
	public void i_select_valid_speciality_and_validate_filtered_results_displayed() {
	    
		
	}

	@Then("I Select valid status and validate filtered results displayed")
	public void i_select_valid_status_and_validate_filtered_results_displayed() {
	    
		
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

	@Given("I select existing playlists and save")
	public void i_select_existing_playlists_and_save() {
		
		
	}


}
