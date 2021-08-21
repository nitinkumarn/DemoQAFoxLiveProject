Feature: End to end scenario for placing orders

@Orders @One
 Scenario: Verify whether user is able to place orders
  Given I login to the application
  When I add a product to bag and check
  And I place a order 
  Then I should see that the order is placed successfully
 
  
