Feature: Registered user of demowebshop

  // Scenario: Successful user login
   // Given User shall launch the demowebshop url
   // And user clicks on sign in
   // When User provides login credentials
    //And User clicks on Login
    //Then User shall be directed to Demowebshop page

  @tag1
  Scenario Outline: login functionality of demoweb shop
    Given user launched the browser
    And is on the demo web shop page
    When user clicks on login
    And user provides "<Email>" and "<pwd>"
    
    

    Examples: 
      | Email                   | pwd      |
      | daviddob@gmail.com      | pass123  |
      | navya.mamidi0@gmail.com | hello123 |
