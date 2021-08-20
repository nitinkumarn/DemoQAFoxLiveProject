Feature: Search Functionality Scenarios

@Search @One
Scenario: Verify whether the user is able to search for the product
 Given I launch the application
 When I search for a product "samsung SyncMaster 941BW"
 Then I should see the products in search results
 
 
 @Search @Two
Scenario: Verify whether the user is informed when product being searched is not available
 Given I launch the application
 When I search for a product "Apple Iphone"
 Then I should see a message informing "There is no product that matches the search criteria."
 
