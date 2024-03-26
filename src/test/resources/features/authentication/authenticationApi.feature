# new feature
# Tags: optional

Feature: Authentication feature to validate valid login

  Scenario: Post To Verify Login with valid details
      Given the base URL "https://automationexercise.com"
      When POST request to "https://automationexercise.com/api/verifyLogin" with request parameters keys "email","password" values "jjd@gmail.com","abcd@1234"
      Then the API should return 200 status code
      And the API should have 200 response code
      And the response message should be "User exists!"
    