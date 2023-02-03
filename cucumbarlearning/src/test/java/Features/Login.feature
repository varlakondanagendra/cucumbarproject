Feature: Login

Scenario: Login by using valid credentials 

Given browser is open 
And Application is displayed 
When user clicks on login link 
And user enters valid credentials
And user clicks on login button 
Then user must be successfully logged in 
And browser closes 
 

