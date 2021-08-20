
Feature: Logout from application


@login
  Scenario: user logout from application through avatar button
    Given the user is on the login page
    And enter valid credentials "salesmanager15@info.com" and "salesmanager"
    And user enters to "#Inbox" page
    And click on "dropdawn" button
    Then a drop down many is displayed
    And user clicks on "logout" button
    Then users navigate to "Login | Best solution for startups" page


