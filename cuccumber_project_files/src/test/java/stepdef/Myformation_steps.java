package stepdef;

import com.pages.constants;
import com.pages.dashboardPage;
import com.pages.myInformationPage;

import common_methods.common_Methods;
import common_methods.validations;
import io.cucumber.java.en.Given;

public class Myformation_steps {
	
	@Given("I navigate to my information page and validate")
	public void i_navigate_to_my_information_page_and_validate() throws Exception {
		dashboardPage.navigate_to_myformation();
		validations.IsTrue(common_Methods.CurrentUrl(), constants.Myinformation_Url, "myinformation page is not displayed");
	}

	@Given("I fill the required data info")
	public void i_fill_the_required_data_info() throws Exception {
		
	    myInformationPage.Salutation();
	    myInformationPage.enter_credential();
	    myInformationPage.enter_address();
	    myInformationPage.enter_address2();
	    myInformationPage.country_select();
	    myInformationPage.enter_city();
	    myInformationPage.state_select();
	    myInformationPage.Zipcode_textbox();
	    myInformationPage.phone_textbox();
	    }

	@Given("I click on save button and validate")
	public void i_click_on_save_button_and_validate() throws Exception {
	    
		myInformationPage.Save_btn();
	}

	@Given("I refresh the page")
	public void i_refresh_the_page() throws Exception {
		common_Methods.refresh_page();
	    
	}

	@Given("I validate the all the feilds data not corrupt after refresh")
	public void i_validate_the_all_the_feilds_data_not_corrupt_after_refresh() throws Exception {
		
		validations.IsTrue(myInformationPage.city_textbox().getText(),constants.city, "city is not displayed");
		validations.IsTrue(myInformationPage.phone_textboxBy().getText(),constants.phone, "phone number is not displayed");
		validations.IsDsiplayed(myInformationPage.Vdt_country_selected(), "country name is not displayed");
		validations.IsTrue(myInformationPage.zipcode_textbox().getText(),constants.zipcode, "zip code name is not displayed");
	}


}
