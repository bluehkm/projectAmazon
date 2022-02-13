Feature: Searching Shoes on the Amazon Website
  User Story: As a user
  I should be able to select a shoe by searching on Amazon Website
  and the selected shoe should be displayed.



  @search
  Scenario: Searching item on the Amazon website
    Given user is on the home page
    When user clicks the search box
    When user enters "Shoes" on search box
    When user clicks search button
    Then the searched items should be displayed
    Then user clicks the on the second shoe
    Then the selected shoe should be displayed





