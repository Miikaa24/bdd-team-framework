Feature: Preapproval page feature


  Background:
    Given I navigate to the homepage
    Then I enter valid login credentials
    And I click on Mortgage Application button
    Then I should be able to direct to the Preapproval Details page




    Scenario: Direct to the Personal Information page

#    Positive test case, It should land on next page after valid credentials, It does. So TEST PASSED
  Scenario: Direct to the Personal Information page

    When I enter required information for Preapproval Details page and click on Next button
    Then I should be able to direct to the next page and see Personal Information text



      #  // -------------------------  ========================  -------------------------  =======================


#    Positive test case, It should land on next page after valid credentials, It does. So TEST PASSED
  Scenario: Check required fields with valid credentials

    When I enter required information for Preapproval Details page and click on Next button
    And I enter valid credentials for application form on Personal Information page
    Then I check Privacy Policy box and click on next
    Then I should land on Expenses as a Current page


    #  // -------------------------  ========================  -------------------------  ========================



#    Negative test case, but it passes to the next page. So this is a bug
  Scenario: Check required fields with invalid credentials

    When I enter required information for Preapproval Details page and click on Next button
    And I enter invalid credentials for application form on Personal Information page
    Then I check Privacy Policy box and click on next
    Then I should not be able to land on Expenses as a Current page



    #  // -------------------------  ========================  -------------------------  ========================


  Scenario: Check required fields with invalid credentials

    When I enter required information for Preapproval Details page and click on Next button
    And I enter invalid credentials for application form on Personal Information page
    Then I click on next
    Then I should no be able to land on Expenses page and see Current Monthly Housing Expenses text
    Then I check Privacy Policy box and click on next
    Then I should not be able to land on Expenses page



#    Negative test case, it shouldn't passes to the next page. it does not. So TEST PASSED
  Scenario: Check required fields with no-credentials

    When I enter required information for Preapproval Details page and click on Next button
    Then I click on next button on Personal Information page without entering any credentials
    Then I should be able to see an error message of This field is required.

