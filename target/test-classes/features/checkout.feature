Feature: Checkcout funtionality
@reg
Scenario: Validate the checkout
  When user validate the username "standard_user" and password "secret_sauce"
  And click the login button
And Click  the bagpack picture
And click the addtocart button
And Click the Basket icon 
And Click the checkout button


@reg
Scenario: Validate the checkout Information with valid Details
  When user validate the username "standard_user" and password "secret_sauce"
  And click the login button
And Click  the bagpack picture
And click the addtocart button
And Click the Basket icon 
And Click the checkout button
And Enter the Firstname 
And Enter the Lastname
And Enter the Zipcode
And Click the continue button
And Validate the Finsh Button

@reg
Scenario: Validate the checkout Information with valid Details
  When user validate the username "standard_user" and password "secret_sauce"
  And click the login button
And Click  the bagpack picture
And click the addtocart button
And Click the Basket icon 
And Click the checkout button
And Enter the Firstname 
And Enter the Lastname
And Enter the Zipcode
And Click the continue button
And click the Finish button
And Validate the order confirmation 

@reg
Scenario: Validate the checkout Information with Invalid Details
  When user validate the username "standard_user" and password "secret_sauce"
  And click the login button
And Click  the bagpack picture
And click the addtocart button
And Click the Basket icon 
And Click the checkout button
And Enter the Firstname 
And Click the continue button
And validate the error message



@reg
Scenario: Validate the checkout Information with Invalid Details
  When user validate the username "standard_user" and password "secret_sauce"
  And click the login button
And Click  the bagpack picture
And click the addtocart button
And Click the Basket icon 
And Click the checkout button
And Enter the Firstname 
And Enter the Lastname
And Click the continue button
And validate the error message