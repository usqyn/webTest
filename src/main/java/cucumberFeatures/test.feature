Feature: User Registration

  Scenario: Register a new user
    Given the user provides the following details:
      | First Name | Last Name  |
      | John       | Doe        |
      | Jane       | Smith      |
    When the user submits the registration form
    Then the user should be successfully registered