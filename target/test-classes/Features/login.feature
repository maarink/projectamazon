Feature: To validate facebook login funtionality

Scenario: To valid the login functinality invalid credentials
Given The user should be in facebook home page
When The user has to fill username and password
And The fill has to click the sign-in button
Then The should navigate to the invalid login page
