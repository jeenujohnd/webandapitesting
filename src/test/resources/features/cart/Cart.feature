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

    Scenario: Verifying the order is placed successfully while user logged in
      Given the user opens the website
      When the user provides credentials "jjd@gmail.com" and "abcd@1234"
      Then the user should be able to see the homepage
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
      Then the user sees the Proceed to checkout option
      When the user clicks the Proceed to checkout link
      Then the user sees the delivery address
      Then the user sees the billing address
      Then the user sees the Review order section
      Then the user sees the total amount
      Then the user provides comments
      Then the user sees the Place order option
      When the user clicks the Place order button
      Then the user is redirected to payment page
      Then the user provides card name "abcdefg"
      Then the user provides card number 123456789
      Then the user provides CVV 999
      Then the user provides Expiration month 12
      Then the user provides Expiration year 2067
      When the user clicks pay and confirm order link
      Then the user sees order placed message
      When the user clicks the continue button
      Then the user should be able to see the homepage



