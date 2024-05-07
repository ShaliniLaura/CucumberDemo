@PhaseTwo
Feature: Deals CRUD Management

@SmokeTest
Scenario: Create a new Deal
Given User is logged in 
When User create a new Deal

@RegressionTest
Scenario: View Deals
Given User is logged in 
When User view Deals Details

Scenario: Delete a  Deal
Given User is logged in 
When User delete a Deal