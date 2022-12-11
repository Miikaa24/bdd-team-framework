package com.duobank.stepDefinitions;

import com.duobank.utilities.DButils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.Collections;
import java.util.List;
import java.util.Map;


public class TableDataIntegrityCheckSteps {

        List<String> columnNames = null;
        List<List<Object>> resultSet = null;
        String email = "mumuumum@mumuumum.com";

        @When("I query tbl_user table's column information")
        public void i_query_tbl_user_table_s_column_information() {
            columnNames = DButils.getColumnNames("SELECT * FROM tbl_user LIMIT 1;");
        }

        @Then("id, email, password, first name, last name fields should contain in tbd_user table")
        public void id_email_password_first_name_last_name_fields_should_contain_in_tbd_user_table(Map<String, String> dataTable) {
            Collections.sort(columnNames);

            for (String s : dataTable.keySet()) {
                Assert.assertTrue(Collections.binarySearch(columnNames, s) >= 0);
            }
        }

         @When("I send request to retrieve duplicate emails from tbl_user table")
         public void i_send_request_to_retrieve_duplicate_emails_from_tbl_user_table() {
        resultSet = DButils.getQueryResultAsListOfLists("SELECT email FROM loan.tbl_user GROUP BY email HAVING (COUNT(*) > 1);");
         }

          @Then("the result of duplicate emails list from tbl_user should return two")
          public void the_result_of_duplicate_emails_list_from_tbl_user_should_return_two() {
            Assert.assertTrue(resultSet.get(0).size() == 1);
         }

         @When("I will send query to database to get data types for realtor_info, purpose_loan, b_firstName from tbl_mortagage table")
         public void i_will_send_query_to_database_to_get_data_types_for_realtor_info_purpose_loan_b_first_name_from_tbl_mortagage_table() {
         resultSet = DButils.getQueryResultAsListOfLists("SHOW FIELDS FROM tbl_mortagage where Field ='realtor_info' OR FIELD = 'purpose_loan' OR FIELD = 'b_firstName';");
         }

        @Then("Then the data types needs to match with the following table for on tbl_mortagage table's realtor_info, purpose_loan, b_firstName columns")
         public void then_the_data_types_needs_to_match_with_the_following_table_for_on_tbl_mortagage_table_s_realtor_info_purpose_loan_b_first_name_columns(List<List<String>> dataTypes) {
        for (int i = 0; i < dataTypes.size(); i++) {
            Assert.assertEquals(dataTypes.get(i).get(0), resultSet.get(i).get(1));
        }
    }















}
