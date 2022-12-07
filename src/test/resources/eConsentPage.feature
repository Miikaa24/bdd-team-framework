@Econsent
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
    When I enter following info for required fields
      | Name     | Position | City      |
      | John Doe | Director | Arlington |
    Then I choose state
    Then I enter following info for monthly income
      | Income | Overtime | Bonus | Commission | Interest |
      | 120000 | 35000    | 20000 | 12000      | 10       |
    And Click the next button
    When Check Yes Checkbox under PreApproval Inquiry
    Then I Click on Next
    And I should See the eConsent Title

  @smoke
  Scenario: I Consent
    Then I Click on Agree and Next
    And I should See the eConsent Title

  @smoke
  Scenario: I don't Consent
    Then I Click on Disagree and Next
    And I should See eConsent Title

  @smoke
  Scenario: I Consent but don't Enter my First Name
    Then I Click on Agree and Next
    And I should See the Field Required Error

  @smoke
  Scenario: I don't Consent but don't Enter my First Name
    Then I Click on Disagree and Next
    And I should See First Name Field Required Error

  @smoke
  Scenario: I Consent but don't  Enter my Email Address
    Then I Click on Agree and Next
    And I should See Email Field Required Error

  @smoke
  Scenario: I don't Consent but don't Enter my Email Address
    Then I Click on Disagree and Next
    And I should See the Email Field Required Error





