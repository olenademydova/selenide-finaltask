Feature: Login and Logout functionality

  Scenario: User can login with valid credentials
    Given user opens main page
    When user login with credentials - 'asostest3@gmail.com' / 'Qwerty1234'
    Then user sees greetings message

  Scenario: User can logout
    Given user opens main page
    When user login with credentials - 'asostest3@gmail.com' / 'Qwerty1234'
    When user logouts
    Then user sees that user is logged out

  Scenario: User cant login with invalid credentials
    Given user opens main page
    When user login with credentials - 'asostest@gmail.com' / 'Qwerty12346'
    Then user sees error message about unsuccessful login
