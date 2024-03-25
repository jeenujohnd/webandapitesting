# new feature
# Tags: optional

Feature: Brands feature

  Scenario: Get All Brands List
      Given the base URL "https://automationexercise.com"
      When GET request to "https://automationexercise.com/api/brandsList"
      Then the API should return 200 status code
      And the API should have 200 response code
      And the number of brands should be greater than 0
      And the brands element should have attributes "id" and "brand"

  Scenario: Put To All Brands List
      Given the base URL "https://automationexercise.com"
      When PUT request to "https://automationexercise.com/api/brandsList"
      Then the API should return 200 status code
      And the API should have 405 response code
      And the response message should be "This request method is not supported."

    

