Feature: Home page



Scenario: Checking the result for under 16
Given Initialise browser with chrome
And Navigate to "sevices.nhsbsa.nhs.uk" site
And click on start now button
When User into checker tool
And enters circumstances into tool
Then User should get results

Scenario: Checking the result for under over 18
Given Initialise browser with chrome
And Navigate to "sevices.nhsbsa.nhs.uk" site
And click on start now button
When User into checker tool
And enters circumstances into tool
Then User should get results