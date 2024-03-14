Feature: Feature to verify login page

  @Login
  Scenario Outline: Verify the login Functionality
    Given User should land in login page
    When User click on Login button
    Then User enters the <Username> and <Password> Field
    And Click on Login button
    Then User will land in Home Page

    Examples: 
      | Username             | Password      |
      | zudregipsu@gufum.com | Pathology@123 |
      #| femlajorde@gufum.com | Pathology@123 |
      #| jostumepse@gufum.com | Pathology@123 |

  @Support
  Scenario Outline: Verify the Support page
    Given User should land in Login page
    When User click on Support page
    Then Search for the <Qurries> in the search box
    And Click on Enter

    Examples: 
      | Qurries  |
      | SMS      |
      | Cogmento |
