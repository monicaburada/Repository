Feature: Add product and do payment
Scenario: Atleast add one product to cart and perform payment
Given the URL of TestMeApp
When Larry a headphone to  cart
And checkout for the payment
And fills transaction details
Then the product is successfully added