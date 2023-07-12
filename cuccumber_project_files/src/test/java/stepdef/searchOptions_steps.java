package stepdef;

import com.pages.constants;
import com.pages.dashboardPage;

import common_methods.common_Methods;
import common_methods.validations;
import io.cucumber.java.en.Given;

public class searchOptions_steps {
	
	@Given("I enter speciality in search by speciality option")
	public void i_enter_speciality_in_search_by_speciality_option() throws Exception {
		dashboardPage.search_speciality(constants.speciality);
	}

	@Given("I validate search results")
	public void i_validate_search_results() throws Exception {
		validations.IsDsiplayed(dashboardPage.Vdt_search_result(), "search results are not displayed");
	}

	@Given("I search by family medicine speciality and validate results")
	public void i_search_by_family_medicine_speciality_and_validate_results() throws Exception {
		dashboardPage.search_familymedicine();
	}

	@Given("I click on cross icon user keyword and validate")
	public void i_click_on_cross_icon_user_keyword_and_validate() throws Exception {
		dashboardPage.cross_icon_filterd_splty();
	    
	}
	
	//
	@Given("enter coursename on searchbox and validate courses panel")
	public void enter_coursename_on_searchbox_and_validate_courses_panel() throws Exception {
		dashboardPage.enterTextOnSearchBox();
		Thread.sleep(3000);
		dashboardPage.clickOnSearchIconButton();
		Thread.sleep(3000);
		validations.IsTrue(common_Methods.CurrentUrl(), constants.coursespanelurl, "courses panel page is not displayed");
		Thread.sleep(3000);
		
	}

	@Given("enter type of disease on topic filter and validate")
	public void enter_type_of_disease_on_topic_filter_and_validate() throws Exception {
		dashboardPage.enterTextOnTopicFilter();
		Thread.sleep(3000);
		validations.IsDsiplayed(dashboardPage.textOnTopicFilter(), "Textbox of topic filter is not displayed");
		Thread.sleep(3000);
	}

	@Given("select type of disease on search results and validate")
	public void select_type_of_disease_on_search_results_and_validate() {
		common_Methods.selectDropDown(dashboardPage.OnTopicFilter(),constants.selectDisease);
	}

	@Given("click on cross icon and verify the results")
	public void click_on_cross_icon_and_verify_the_results() {
	    
	}


}
