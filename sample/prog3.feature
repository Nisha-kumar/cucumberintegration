Feature: Test login functionality


Scenario Outline: Test login with valid credentials
Given users open testmeapp
When user enters username as "<username>"
And user enters password as "<password>"
When user clicks login button
And verify login success
Then close testmeapp

Examples:|
|username|password|
|moni|password123|
|preti|preti123|
|parvati|parvati123|