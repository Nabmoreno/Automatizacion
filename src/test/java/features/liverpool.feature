Feature: Liverpool login options

Scenario: Liverpool login steps 
Given the user is located at the liverpool page
When the user click on Login button 
And the user enters "paco@liv.com" the username
And the user enters "q1w2e3r4" the userpwd
Then the user name is correctly displayed  