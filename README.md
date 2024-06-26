# Web and API Automation Testing  

# Automation Exercise Home Page
![homepage](https://github.com/jeenujohnd/webandapitesting/assets/144407851/cd12ff13-1ad3-4d38-852f-7c0ce1b3cc37)

## About the Project
The project is based on automating UI test cases of an e-commerce website https://www.automationexercise.com/.   
The tests have been run on Chrome browser. 

The website also includes a list of API's that have been automated using RESTAssured.

Project Modules included are :
- Authentication
- Cart
- Products
- Brands
- Category
- Search
- Contact Us Form

Note: This website includes ads, which have been blocked using AdBlock plugin.

## Tools  
Conducted a Web and API automation testing project using:  

|Tool   |Version    |
|-------|-----------|
|IntelliJ IDEA |2023.3.3|
|Selenium WebDriver|4.16.1 |
|Serenity BDD|4.0.43|
|Cucumber|7.14.0 |
|Gradle|8.4|
|Java|17|
|RestAssured|5.3.2|



## Automated UI Test case 

| #  | Feature  | Scenario                     |
|----|----|------------------------------|
| 1. | Authentication | Login with Valid Credentials |
| 2. |Authentication |Login with Invalid Credentials |
|3. |Authentication |Logout from user account |
|4.|Authentication|Signing up with existing email that is already used before|
|5.|Cart|Product added to the cart|
|6.|Cart|Products added to the cart by clicking continue shopping|
|7.|Cart|Verifying the product quantity|
|8.|Cart|Verifying the order is placed successfully while user logged in |
|9.|Cart|Remove products from the cart|
|10.|Cart|View category products|
|11.|Cart|View brand products|
|12.|Cart|Add to cart from Recommended items|
|13.|Cart|Verify address details in checkout page|
|14.|Cart|Download invoice after purchase order|
|15.|Cart|Verify scroll down to subscription section and scroll up|
|16.|Products|Validating all the products are listed|
|17.|Products|Validating the product details are visible to the user|
|18.|Products|Validating the product being searched is visible to the user|
|19.|Products|Search products and Verify Cart after login|
|20.|Products|Adding review on product|
|21.|Contact Us|Validating the Contact us form|



## Automated API's

| #    | Scenario                  | API URL                                        |
|------|---------------------------|--------------------------------------------------|
| 1.   | GET All Products List                                |https://automationexercise.com/api/productsList |
| 2.   | POST To All Products List                               |https://automationexercise.com/api/productsList|
| 3.   | GET All Brands List                                     |https://automationexercise.com/api/brandsList|
| 4.   | PUT To All Brands List                                  |https://automationexercise.com/api/brandsList|
| 5.   | POST To Search Product                                  |https://automationexercise.com/api/searchProduct|
| 6.   | POST To Search Product without search_product parameter |https://automationexercise.com/api/searchProduct|
| 7.   |POST To Verify Login with valid details                  |https://automationexercise.com/api/verifyLogin|
|8.    |POST To Verify Login without email parameter             |https://automationexercise.com/api/verifyLogin|
|9.    |DELETE To Verify Login                                   |https://automationexercise.com/api/verifyLogin|
|10.   |POST To Verify Login with invalid details                |https://automationexercise.com/api/verifyLogin|
|11.   |POST To Create/Register User Account                     |https://automationexercise.com/api/createAccount|
|12.   |DELETE METHOD To Delete User Account                     |https://automationexercise.com/api/deleteAccount|
|13.   |PUT METHOD To Update User Account                        |https://automationexercise.com/api/updateAccount|
|14.   |GET user account detail by email                         |https://automationexercise.com/api/getUserDetailByEmail|





 













