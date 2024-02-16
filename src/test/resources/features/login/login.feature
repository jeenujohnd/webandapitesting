Feature: Login Test Case

Scenario: Login with Valid Credentials
    Given the user opens the website
    When the user provides credentials "jjd@gmail.com" and "abcd@1234"
    Then the user should be able to see the homepage