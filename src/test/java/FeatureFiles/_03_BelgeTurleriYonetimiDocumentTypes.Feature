
Feature: Document Types Management

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario:
    Given Navigate to Setup
    When Create a new Parameters
    Then success message should be succesfully displayed

    And user edit documents
    And user execute documents
    Then user delete documents
    Then success message should be succesfully displayed