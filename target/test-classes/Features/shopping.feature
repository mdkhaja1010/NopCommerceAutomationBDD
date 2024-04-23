Feature: As a user I want to validate NopCommerceApplication
  Background:
   Given Launch Nop Commerce Application
   And Enter the valid credentials for accessing NopCommerceApplication
    
  @ShoppingToCart
    Scenario: Verify the user able to shop the product in the application
    And Enter the Customer Module
    And Click on the Customers button
    And Click on the add new button
    And Click on the enter new user details
    Then Click on the save button
  @ShoppingToCart
    Scenario: Verify the user able to shop the promotions in the application
    And Enter the promotions Module
    And Click on the discountsbtn
    And Click on the affilaties button
    And Click on the news letter button
    Then Clik on the compaings button
  @ShoppingToCart
    Scenario: Verify the user able to shop the contents in the application
    And Enter the contents modules
    And Click on the topics button
    And Click on the message button
    And Click on the newsitem button
    And Click on the newscomments button
    And Click on the blogspot button
    And Click on the blogscomments button
    And Click on the polls button
    Then Click on the forums button
    
    
