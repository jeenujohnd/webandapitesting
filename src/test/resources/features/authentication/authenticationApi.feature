# new feature
# Tags: optional

Feature: Authentication feature to validate valid login

  Scenario: Post To Verify Login with valid details
      Given the base URL "https://automationexercise.com"
      When POST request to "https://automationexercise.com/api/verifyLogin" with request parameters keys "email","password" values "jjd@gmail.com","abcd@1234"
      Then the API should return 200 status code
      And the API should have 200 response code
      And the response message should be "User exists!"

  Scenario: Post To Verify Login without email parameter
      Given the base URL "https://automationexercise.com"
      When POST request to "https://automationexercise.com/api/verifyLogin" with request parameter key "password" and value "abcd@1234"
      Then the API should return 200 status code
      And the API should have 400 response code
      And the response message should be "Bad request, email or password parameter is missing in POST request."

  Scenario: Delete To Verify Login
      Given the base URL "https://automationexercise.com"
      When DELETE request to "https://automationexercise.com/api/verifyLogin"
      Then the API should return 200 status code
      And the API should have 405 response code
      And the response message should be "This request method is not supported."
      
  Scenario: Post To Verify Login with invalid details
      Given the base URL "https://automationexercise.com"
      When POST request to "https://automationexercise.com/api/verifyLogin" with request parameters keys "email","password" values "ccd@gmail.com","mmmmm"
      Then the API should return 200 status code
      And the API should have 404 response code
      And the response message should be "User not found!"
      
  Scenario: Post To Create/Register User Account
      Given the base URL "https://automationexercise.com"
      When POST request to "https://automationexercise.com/api/createAccount" with request parameters
      | name     | Jeet     |
      | email    | preet@gmail.com    |
      | password | mmmm1234 |
      | title    |  Mr     |
      | birth_date| 22   |
      |birth_month| 07    |
      |birth_year | 1950   |
      | firstname | Jeetendra  |
      | lastname  |Singh   |
      | company   | Surplus   |
      | address1  | Free   |
      | address2  | Bird   |
      | country   | Canada  |
      | zipcode   | 77889   |
      | state     | Toranto  |
      | city      | Cross   |
      | mobile_number | 998877665|
      Then the API should return 200 status code
      And the API should have 201 response code
      And the response message should be "User created!"






      




    