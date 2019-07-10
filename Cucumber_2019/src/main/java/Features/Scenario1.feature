
@tag
Feature: Register to testme app
  

  @tag1
  Scenario: Successful registration
    Given User shall launch testme app url
    And user clicks on sign up
    When user provides data
    And user clicks on register
    #Then user is directed to testme app login page
   

 # @tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
      | name  | value | status  |
     