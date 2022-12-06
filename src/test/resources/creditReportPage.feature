Feature: Mortgage Application

  Background:
    Given I navigate to the homepage
    When I enter valid login credentials
    And I click on Mortgage Application button
    Then I should be able to direct to the Preapproval Details page
    When I enter required information for Preapproval Details page and click on Next button
    Then I should be able to direct to the next page and see Personal Information text
    And I enter valid credentials for application form on Personal Information page
    Then I check Privacy Policy box and click on next
    When I enter rent amount
    And click next
    Then I should be able to direct to the Employment page
    When I enter following info for required fields
    Then I choose state
    Then I enter following info for monthly income
    Then Click the next button
    Then I should be able to direct to the next page and see PreApproval Inquiry


  @smoke
  Scenario: Check Yes Checkbox under PreApproval Inquiry
      Then I click Next Button
      And I should See the eConsent Title

  @smoke
  Scenario: Check No Checkbox under PreApproval Inquiry
      Then Click on Next
      And I should See eConsent Title

  Scenario: Check Both Yes and No Checkbox under PreApproval Inquiry
      Then Check Yes Checkbox under PreApproval Inquiry
      Then Check No Checkbox under PreApproval Inquiry
      Then Click on Next
      And I should See eConsent






