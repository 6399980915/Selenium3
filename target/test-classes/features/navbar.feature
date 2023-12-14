@reg
Feature: Check the navbar funtionality
  

Scenario: validate the all item product
When user validate the username "standard_user" and password "secret_sauce"
  And click the login button
 And click the all item 
 
 
 Scenario: validate the about product
When user validate the username "standard_user" and password "secret_sauce"
  And click the login button
 And click the about

 
  Scenario: validate the logout product
When user validate the username "standard_user" and password "secret_sauce"
  And click the login button
 And click the logout
 
 
  
  Scenario: validate the reset app state product
When user validate the username "standard_user" and password "secret_sauce"
  And click the login button
 And click the reset app state
 