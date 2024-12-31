Feature: Login page validation
  As a user of the application
  I want to be able to log in with valid credentials
  So that I can access the application dashboard

  @valid-login
  Scenario Outline: Login with valid credentials
    Given the user is on the login page
    When the user enters a valid email "<email>"
    And the user enters a valid password "<password>"
    And the user clicks the login button
    Then the user should be redirected to the dashboard
    And the user name "<username>" should be displayed on the dashboard

    Examples:
      | email         | password | username     |
      | Admin         | admin123 | Dashboard    |

  @invalid-login
  Scenario Outline: Login with invalid credentials
    Given the user is on the login page
    When the user enters an invalid email "<email>"
    And the user enters an invalid password "<password>"
    And the user clicks the login button
    Then an error message "<error_message>" should be displayed

    Examples:
      | email           | password  | error_message       |
      | invalid@test.com| wrongpass | Invalid credentials |

  @empty-fields
  Scenario: Login with empty fields
    Given the user is on the login page
    When the user clicks the login button without entering credentials
    Then an error message should be displayed

  @logout
  Scenario: Successful logout
    Given the user is logged in
    When the user clicks the logout button
    Then the user should be redirected to the login page
    #And a message "You have been successfully logged out." should be displayed
