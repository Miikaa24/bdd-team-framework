@db
Feature: database testing

  Scenario: Verify if new customer information added to the Database
    Given I navigate to the homepage
    And I click on sign up link
    Then I enter customer information and click sugnUp button
    Then The information I entered should match the information in the database



