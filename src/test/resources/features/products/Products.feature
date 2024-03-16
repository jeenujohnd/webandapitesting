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

Scenario: Search products and Verify Cart after login
    Given the user opens the website
    When the user clicks products link
    Then the user is redirected to All Products page
    When the user searches in Search Product field for "Top"
    Then the user is navigated to Searched products page
    Then the user sees all products corresponding to the search
    When the user adds a product to the cart
    When the user clicks the Continue Shopping link
    When the user adds another product to the cart
    When the user clicks View Cart link
    Then the user should see all the products added
    When the user provides credentials "jjd@gmail.com" and "abcd@1234"
    Then the user should be able to see the homepage
    When the user clicks Cart link
    Then the user should see all the products added

Scenario: Adding review on product
    Given the user opens the website
    When the user clicks products link
    Then the user is redirected to All Products page
    When the user clicks view product link
    Then the user sees write your review section
    When the user provides name "Peter Paul"
    When the user provides email "Peter.Paul@pp.com"
    When the user provides review "Great product"
    When the user clicks the submit button
#    Then the user should see Thanks for review message


