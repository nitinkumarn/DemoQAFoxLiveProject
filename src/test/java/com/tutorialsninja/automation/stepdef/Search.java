package com.tutorialsninja.automation.stepdef;




import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.SearchResultsPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {
	HeadersSection headersSection = new HeadersSection();
	SearchResultsPage searchResultsPage = new SearchResultsPage();
	
	@When("^I search for a product \"([^\"]*)\"$")
	public void i_search_for_a_product(String product){
		
		Elements.TypeText(HeadersSection.SearchBoxField, product);
		Elements.click(HeadersSection.SearchButton);
	    
	}

	@Then("^I should see the products in search results$")
	public void i_should_see_the_products_in_search_results(){
		
		Assert.assertTrue(Elements.isDisplayed(SearchResultsPage.samsungSyncMasterSearchResult));
	    
	}
	
	
	@Then("^I should see a message informing \"([^\"]*)\"$")
	public void i_should_see_a_message_informing(String message){
		
		Assert.assertTrue(Elements.VerifyTextEquals(SearchResultsPage.noresultsmessage, message));
	    
	}

}
