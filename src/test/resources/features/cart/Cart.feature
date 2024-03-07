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

  Scenario: Products added to the cart by clicking continue shopping
      Given the user opens the website
      When the user clicks products link
      When the user adds a product to the cart
      Then the user sees the Continue Shopping option
      When the user clicks the Continue Shopping link
      Then the user is redirected to All Products page
      When the user adds another product to the cart
      Then the user sees the Added message
      Then the user sees the View Cart option
      When the user clicks View Cart link
      Then the user should see all the products added

      Scenario: Verifying the product quantity
      Given the user opens the website
      When the user clicks products link
      When the user adds a product to the cart
      Then the user sees the Added message
      Then the user sees the View Cart option
      When the user clicks View Cart link
      Then the user should see the correct quantity in the cart


