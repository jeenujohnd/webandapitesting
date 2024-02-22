# new feature
# Tags: optional
    
Feature: Authentication feature to validate valid login, invalid login and logout
    
Scenario: Login with Valid Credentials
    Given the user opens the website
    When the user provides credentials "jjd@gmail.com" and "abcd@1234"
    Then the user should be able to see the homepage

Scenario: Login with Invalid Credentials
    Given the user opens the website
    When the user provides credentials "cc@gmail.com" and "dd@12"
    Then the user should be unable to login

Scenario: Logout from user account
    Given the user opens the website
    When the user provides credentials "jjd@gmail.com" and "abcd@1234"
    When the user clicks the logout button
    Then the user should be logged out

Scenario: Signing up with existing email that is already used before
     Given the user opens the website
     When the user provides sign up credentials as "cici" and "jjd@gmail.com"
     Then the user is unable to sign up