Feature: Login feature

  Background:
    Given I navigate to the homepage

  @smoke @positive
  Scenario: Login with valid credentials
    When I enter valid login credentials
    Then I should be able to login and land on Welcome Page

  @smoke
    Scenario: Login with invalid credentials
      When I enter invalid login credentials
      Then I should not be able to login


  @smoke @noCredentials
  Scenario: Login with no credentials
    When I enter no login credentials
    Then I should not be able to login

    @fail
  Scenario: Login with valid credentials parametrized
    Given I navigate to the homepage
    When I enter login credentials as "revifon371@pamawebdf.com" and "Automation1234!"
    Then I should be able to login and land on Welcome Page