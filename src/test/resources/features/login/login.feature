Feature: Valid Login Test Case

Scenario: Login with Valid Credentials
    Given the user opens the website
    When the user provides credentials "abc" and "xyz"
    Then the user should be able to see the homepage