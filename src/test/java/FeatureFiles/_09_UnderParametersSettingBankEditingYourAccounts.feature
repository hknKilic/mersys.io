Feature:BankAccounts

  Background:
    Given Navigate to campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: User should be able to create BankAccount.
    When A new Bank Accounts is created
    Then the Bank Account  should appear in the list

  Scenario:User should be able to edit bank account so user can make changes.
    When edited an existing bank account
    Then the bank account should have changed


  Scenario:User should be able to delete Bank Accounts.
    When an existing bank account deleted
    Then the bank account should be removed from the list
