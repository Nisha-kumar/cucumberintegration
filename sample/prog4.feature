Feature: test background keyword

Background: display welcome
When testme displays welcome message

Scenario: login
When user performs login operation
When user clicks login button

Scenario: search function
When user searching for product available in cart

 Scenario: cart
 When  user validating the cart
 
  Scenario: proceed to payment
   When user performs payment
   
    Scenario: logout
    When user performs logout