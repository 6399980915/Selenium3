Feature: validate the login Functionality

  @reg
  Scenario: Validate the username and password with valid details
  
  When user validate the username "standard_user" and password "secret_sauce"
  And click the login button
  Then Scusessfully login
  @reg
  Scenario Outline: Validate the  username and password with valid details
    When user validate the username "<username>" and password "<password>"
    And click the login button
    Then Scusessfully login

    Examples: 
      | username       | password       |
      | standard_user  | Wrong password |
      | wrong username | secret_sauce   |
      | standard_user  | secret_sauce   |
      | Hrithik123     | Hrthk123       |
