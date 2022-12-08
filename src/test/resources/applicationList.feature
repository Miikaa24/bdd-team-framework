Feature: Application List page feature


  Background:
    Given I navigate to the homepage
    Then I enter valid login credentials
    And I click on Application List button


  Scenario: Check search box

    Then I type applicant name on the search box
    And I should be able to see searched applicant name on the page
