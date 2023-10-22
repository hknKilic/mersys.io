Feature:Discounts Functionality

  Background:

    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Adding Discounts

    Given Navigate to SetUp and Paramater Categories
    When the User clicks on the Discount tab
    And the User fills in the necessary information to add a new discount
    Then the discount should be added

  Scenario: Editing Discounts

    Given Navigate to Set Up Categories
    When the User clicks on the Discount tab
    And the User updates the necessary information for an existing discount
    Then the changes should be saved

  Scenario: Deleting Discounts

    Given Navigate to Set Up Categories
    When the User clicks on the Discount tab
    And the User initiates the process to delete an existing discount
    Then the discount should be deleted, and the User completes the verification step
