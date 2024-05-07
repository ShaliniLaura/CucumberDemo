@PhaseOne
Feature: Contacts CRUD Management

@SmokeTest
Scenario: Create a new Contact
Given User is logged in 
When User create a new Contact

@RegressionTest
Scenario: View Contact
Given User is logged in 
When User view Contact Details

@SmokeTest @RegressionTest
Scenario: Delete a  Contact
Given User is logged in 
When User delete a Contact