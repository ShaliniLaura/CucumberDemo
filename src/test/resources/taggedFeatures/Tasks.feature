@PhaseThree
Feature: Tasks CRUD Management

Background: User Login
Given User is logged in

@SmokeTest
Scenario: Create a new Task
When User create a new Task


@RegressionTest
Scenario: View Tasks
When User view Tasks Details

Scenario: Delete a  Task
When User delete a Task