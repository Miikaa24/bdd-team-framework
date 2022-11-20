Feature: Basic features



  Scenario: Navigate to homepage
    Given I navigate to the homepage
    Then The homepage url should be correct
    And The title should be Login - Loan Application

    Scenario: Navigate to sign up page
      Given I navigate to the homepage
      When I click on sign up link
      Then I should see Please enter your details to sign up and create your account text
      And I should see sign up button