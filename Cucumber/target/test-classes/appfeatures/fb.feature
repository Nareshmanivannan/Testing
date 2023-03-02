Feature: To validate the login functionality

  Scenario: to validate with invalid username and invalid password
    Given User has to launch the browser and max the browser
    When user has to launch the fb applications in browser
    And to pass the email id
    And to pass the password
    Then Iclik the login button
    And close the browser

  Scenario Outline: to validate with invalid username and invalid password
    Given to launch the browser
    When launch the url
    Then user has to pass"<name>" the email value
    And user has to pass"<value>" the password value
    And press login
    And quit

    Examples: 
      | name             | value   | status  |
      | naresh@gmail.com |  135135 | success |
      | nasg@gmail.com   | 5465867 | Fail    |
