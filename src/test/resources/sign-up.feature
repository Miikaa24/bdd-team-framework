@signUp
Feature: Sign Up feature

  Background:
    Given I navigate to the homepage
    And I click on sign up link

  @fake
  Scenario: Sign up with random valid info
    When I enter valid random info to sign up
    And click on the sign up button
    Then I should be able to see Welcome Back, Automation Testers! text

#  Scenario: Sign up with invalid info
#    When I enter invalid random info to sign up
#    Then I should not be able to login

#  @test @noCredentials @smoke
#  Scenario: Sign up no info
#    When I enter no info to sign up
#    Then I should not be able to login


  @dataTable
  Scenario: Sign up with datatable info
    When I enter the following info to sign up
      | Firstname | Lastname | Email             | Password   |
      | Stephen   | Curry    | StepCur@yahoo.com | Stepcur123 |
    And click on the sign up button
    Then I should be able to see Welcome Back, Automation Testers! text



  @outline
  Scenario Outline: Sign up with valid info from examples tables
    When I enter the following info to sign up
      | Firstname | Lastname | Email   | Password |
      | <FIRST>   | <LAST>   | <EMAIL> | <PASS>   |
    And click on the sign up button
    Then I should be able to see Welcome Back, Automation Testers! text
    Examples:
      | FIRST    | LAST    | EMAIL               | PASS         |
      | Harry    | Potter  | HarryP@gmail.com    | Harry2022    |
      | Ron      | Weasly  | RonW@gmail.com      | Ron2022      |
      | Hermoine | Granger | HermoineG@gmail.com | Hermoine2022 |
      | Draco    | Malfoy  | DracoM@gmail.com    | DracoM2022   |