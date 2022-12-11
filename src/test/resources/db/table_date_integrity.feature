@Sprint5
Feature: Create query to verify column names are same as given input, check for duplicate information and business rule verification for password

  Scenario: Check given input with tbl_user table's column names
    When I query tbl_user table's column information
    Then id, email, password, first name, last name fields should contain in tbd_user table
      | id         |
      | email      |
      | password   |
      | first_name |
      | last_name  |

  Scenario: Verify tbl_user table for the duplicate emails
    When I send request to retrieve duplicate emails from tbl_user table
    Then the result of duplicate emails list from tbl_user should return two

  Scenario: Create a query to check data types of realtor_info, purpose_loan, b_firstName on tbl_mortagage table
    When I will send query to database to get data types for realtor_info, purpose_loan, b_firstName from tbl_mortagage table
    Then Then the data types needs to match with the following table for on tbl_mortagage table's realtor_info, purpose_loan, b_firstName columns
      | text       |
      | varchar(300) |
      | varchar(300) |


