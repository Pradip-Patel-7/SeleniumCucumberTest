Feature: Login page automatiom

  @smoke
  Scenario: Check login is successful with valid credentials
    Given User is on Login page
    When User enters uername as "standard_user" and password as "secret_sauce"
    And Click on Login button
    Then User is navigated to Home page
    
  @smoke
  Scenario Outline: Check login is successful with different credentials
    Given User is on Login page
    When User enters "<uername>" and "<password>"
    And Click on Login button
    Then User is navigated to Home page

    Examples: 
      | uername  | password |
      | standard_user |     secret_sauce | 
      | locked_out_user |     secret_sauce | 