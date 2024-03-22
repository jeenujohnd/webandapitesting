# new feature
# Tags: optional

Feature: Products API feature

  Scenario: Get All Products List
      Given the base URL "https://automationexercise.com"
      When GET request to "https://automationexercise.com/api/productsList"
      Then the API should return 200 status code
      And the size of the "products" element have more than 10 times

  Scenario: Post To All Products List
    Given the base URL "https://automationexercise.com"
    When POST request to "https://automationexercise.com/api/productsList"
    Then the API should return 200 status code
    And the API should have 405 response code
    And the response message should be "This request method is not supported."









