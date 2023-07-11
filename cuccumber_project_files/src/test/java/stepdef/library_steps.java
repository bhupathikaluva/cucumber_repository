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
	public void i_click_on_delete_button_lecture_and_validate_popup() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I click on archive button and validate")
	public void i_click_on_archive_button_and_validate() throws Exception {
	    libraryPage.delete_lecture();
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


	


}
