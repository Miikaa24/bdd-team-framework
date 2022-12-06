Feature: Mortgage Application

  Background:
    Given I navigate to the homepage
    When I login
    And I click on Mortgage Application


  @smoke
  Scenario: Click next without entering any information
    Then I click Next Button
    And I should see THIS FIELD IS REQUIRED. text


  @smoke
  Scenario: No checkbox
    When Check No Checkbox under Are You Working With realtor
    Then Enter purchase price
    And Enter amount of the down payment
    And Click on next button
    Then I should be on personal information page


  @smoke
  Scenario: Yes checkbox with realtor name
    When Check Yes Checkbox under Are You Working With realtor
    Then I enter realtor name
    Then Enter purchase price
    And Enter amount of the down payment
    And Click on next button
    Then I should be on personal information page


  Scenario: Yes checkbox with no realtor name
    When Check Yes Checkbox under Are You Working With realtor
    Then Enter purchase price
    And Enter amount of the down payment
    And Click on next button
    Then I should see THIS FIELD IS REQUIRED. text


  Scenario: Enter Down Payment greater than purchase price
    Then I enter realtor name
    Then Enter purchase price
    And Enter amount of the down payment that is greater than purchase price
    And Click on next button
    Then I should see THIS FIELD IS REQUIRED. text




  Scenario: Search for loan purpose
    Then Click on Purpose of loan
    And Search "Student loan"
    Then Loan I should see No Result Found text.







