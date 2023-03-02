Feature: To valid the Login functoinality of Amazon Application

  Background: 
    Given User  has to launch the chrome browser and max the window

  Scenario: To validate login with valid username and invalid password
    When To launch the amz application
    And To pass valid user name in email field
      | surya@gmail.com | kanagu@gmail.com | nettil@gmail.com |
    And To click the continue button
    And To enter the invalid password in password field
      | 1234 | 1234 | 1234 |
      | 4321 | 4321 | 4321 |
      | 0987 | 0987 | 0987 |
    And To click the signin button
    Then close the browser
