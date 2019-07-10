
@tag
Feature:  Adding prodcut to cart & proceed to payment
Background:registered user

  @tag1
  Scenario: Add to cart
    Given user launches the testmeapp browser
    And clicks on sign in
    When user enters valid credentials
    And clicks on sign in button
    Then user is directed to home page of testme app
    And user checks for the product 
    And clicks on the find details button
    And user adds the product to the cart
    And user clicks on the cart button
    And user clicks on checkout button for payment
    And user enters the address details
    And user clicks on Proceed to pay button
    And user clicks on the desired bank for payment
    And clicks on continue button
    And user enters valid credentials
    And clicks on login button
    
    
    

