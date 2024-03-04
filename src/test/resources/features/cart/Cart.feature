# new feature
# Tags: optional

Feature: Cart feature

  Scenario: Product added to the cart
      Given the user opens the website
      When the user clicks products link
      When the user adds a product to the cart
      Then the user sees the Added message
      Then the user sees the View Cart option
      When the user clicks View Cart link
      Then the user can view the added product in cart
