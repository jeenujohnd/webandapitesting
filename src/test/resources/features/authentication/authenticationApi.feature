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
      | name | email            | password | title  | birth_date    | birth_month   | birth_year    | firstname | lastname  | company   | address1  | address2  | country   | zipcode   | state     | city  | mobile_number |
      | Anika | Anika@gmail.com  | mmmm1234 | Mr     | 22            | 07            |  1950         | Anika    | Malik     | Surplus   | Free      | Bird      | Canada    | 77889     | Toranto   | Cross | 998877665     |
      Then the API should return 200 status code
      And the API should have 201 response code
      And the response message should be "User created!"

  Scenario: Delete method To Delete User Account
      Given the base URL "https://automationexercise.com"
      When DELETE request to "https://automationexercise.com/api/deleteAccount" with request parameters keys "email","password" values "Mon@gmail.com", "mmmm1234"
      Then the API should return 200 status code
      And the API should have 200 response code
      And the response message should be "Account deleted!"

  Scenario: PUT METHOD To Update User Account
      Given the base URL "https://automationexercise.com"
      When PUT request to "https://automationexercise.com/api/updateAccount" with request parameters
          | name | email            | password | title  | birth_date    | birth_month   | birth_year    | firstname | lastname  | company   | address1  | address2  | country   | zipcode   | state     | city  | mobile_number |
          | Anika | Anika@gmail.com  | mmmm1234 | Miss     | 31            | 08            |  1984         | Anika    | Malik     | Surplus   | Free      | Bird      | Canada    | 77889     | Toranto   | Cross | 998877665     |
      Then the API should return 200 status code
      And the API should have 200 response code
      And the response message should be "User updated!"

    Scenario: GET user account detail by email
        Given the base URL "https://automationexercise.com"
        When GET request to "https://automationexercise.com/api/getUserDetailByEmail" with request parameter key "email" and value "Anika@gmail.com"
        Then the API should return 200 status code
        And the API should have 200 response code
        And the response should be the user details

        






      




    