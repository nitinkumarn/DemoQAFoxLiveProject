package com.tutorialsninja.automation.stepdef;


import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccessPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register{
	
	HeadersSection headerSection = new HeadersSection();
	RegisterPage registerPage = new RegisterPage();
	AccountSuccessPage accountSuccessPage = new AccountSuccessPage();
	
	
	@Given("^I launch the application$")
	public void i_launch_the_application(){
	    Base.driver.get(Base.reader.getUrl());
	    
	}

	@And("^I navigate to Account registeration page$")
	public void i_navigate_to_Account_registeration_page(){
	    Elements.click(HeadersSection.myAccountLink);
	    Elements.click(HeadersSection.Register);
	}

	@When("^I provide all the below details$")
	public void i_provide_all_the_below_details(DataTable datatable){
		
		RegisterPage.enterAllDetails(datatable,"unique");
	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy(){
		
		Elements.click(RegisterPage.privacyPolicy);
	    
	}

	@And("^I click on continue button$")
	public void i_click_on_continue_button(){
		
		Elements.click(RegisterPage.continueButton);
	    
	}

	@Then("^I should see that the user account has been created successfully$")
	public void i_should_see_that_the_user_account_has_been_created_successfully(){
		
		Assert.assertTrue(Elements.isDisplayed(AccountSuccessPage.successBreadCrumb));
		
	    
	}
	
	@Then("^I should see that the user account is not be cretaed$")
	public void i_should_see_that_the_user_account_is_not_be_cretaed(){
		
		Assert.assertTrue(Elements.isDisplayed(RegisterPage.registerBreadcrumb));
	    
	}

	@Then("^I should see the error messages informing the user to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields(){
		
		
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.firstNameWarning));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.lastNameWarning));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.emailWarning));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.telephoneWarning));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.passwordWarning));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.mainWarning));
	}
	
	@And("^I  subscribe to Newsletter$")
	public void i_subscribe_to_Newsletter(){
		
	    Elements.click(RegisterPage.yesToNewsLetter);
	   
	}
	
	@When("^I provide the below  duplicate details$")
	public void i_provide_the_below_duplicate_details(DataTable datatable){
		
		RegisterPage.enterAllDetails(datatable,"duplicate");
	    
	}

	@Then("^I should see that the user is restricted from creating duplicate account$")
	public void i_should_see_that_the_user_is_restricted_from_creating_duplicate_account(){
		
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.mainWarning, "Warning: E-Mail Address is already registered!"));
	    
	}



}
