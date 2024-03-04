# new feature
# Tags: optional
    
Feature: Products feature
    
Scenario: Validating all the products are listed
    Given the user opens the website
    When the user clicks products link
    Then the user is able to view all the products

Scenario: Validating the product details are visible to the user
    Given the user opens the website
    When the user clicks products link
    When the user clicks view product link
    Then the user is navigated to the product details page

Scenario: Validating the product being searched is visible to the user
    Given the user opens the website
    When the user clicks products link
    When the user searches in Search Product field for "Winter Top"
    Then the user is able to see the respective product
