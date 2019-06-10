Feature: Test login functionality
Description: Registered user can use login credentials to  get logged in to
username- moni
Password- password123

Scenario: Test login with valid credentials
Given users open testmeapp
When user enters username as "moni"
And user enters password as "password123"
When user clicks login button
And verify login success
Then close testmeapp