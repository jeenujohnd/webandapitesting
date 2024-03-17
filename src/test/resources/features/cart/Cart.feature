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

    Scenario: Remove products from the cart
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
      When the user clicks the cross button next to products displayed
      Then Cart is empty message should be displayed
      When the user clicks HERE link
      Then the user is redirected to All Products page

    Scenario: View category products
      Given the user opens the website
      When the user clicks products link
      Then the user sees category section in the left side bar
      Then the user sees various categories
      When the user expands a category
      Then the user sees the sub category
      When the user clicks a sub category
      Then the user sees the sub category page with the corresponding title
      When the user clicks another category
      Then the user sees the corresponding sub category
      When the user clicks another sub category
      Then the user sees the other sub category page with the corresponding title

    Scenario: View brand products
      Given the user opens the website
      Then the user sees brands section in the left side bar
      Then the user sees various brands
      When the user clicks a brand
      Then the user sees the brand page with the corresponding page title
      Then the user sees same count of products displayed
      When the user views a product
      Then the user sees the brand of the product as same

    Scenario: Add to cart from Recommended items
      Given the user opens the website
      When the user scrolls down to the bottom of the page
      Then the user sees the RECOMMENDED ITEMS section
      When the user adds a product to the cart
      Then the user sees the Added message
      Then the user sees the View Cart option
      When the user clicks View Cart link
      Then the user can view the added product in cart

    Scenario: Verify address details in checkout page
      Given the user opens the website
      When the user provides credentials "jjd@gmail.com" and "abcd@1234"
      Then the user should be able to see the homepage
      When the user clicks products link
      Then the user is redirected to All Products page
      When the user adds a product to the cart
      Then the user sees the Added message
      Then the user sees the View Cart option
      When the user clicks View Cart link
      Then the user can view the added product in cart
      Then the user sees the Proceed to checkout option
      When the user clicks the Proceed to checkout link
      Then the user's delivery address appears

  Scenario: Download invoice after purchase order
    Given the user opens the website
    When the user clicks products link
    Then the user is redirected to All Products page
    When the user adds a product to the cart
    Then the user sees the Added message
    Then the user sees the View Cart option
    When the user clicks View Cart link
    Then the user can view the added product in cart
    Then the user sees the Proceed to checkout option
    When the user clicks the Proceed to checkout link
    Then the user sees the Checkout message
    Then the user sees the Register login option
    When the user clicks the Register login link
    Then the user is redirected to the login page
    When the user provides credentials "jjd@gmail.com" and "abcd@1234"
    Then the user should be able to see the homepage
    When the user clicks Cart link
    When the user clicks the Proceed to checkout link
    When the user scrolls down to place order
    When the user clicks the Place order button
    Then the user provides card name "abcdefg"
    Then the user provides card number 123456789
    Then the user provides CVV 999
    Then the user provides Expiration month 12
    Then the user provides Expiration year 2067
    When the user clicks pay and confirm order link
    Then the user sees order placed message
    Then the user sees the Download invoice option
    When the user clicks the Download invoice link
    Then the user is able to access the downloaded invoice





  Scenario: Verify scroll down to subscription section and scroll up
    Given the user opens the website
    Then the user scrolls down to the subscription section
    Then the user scrolls up back














