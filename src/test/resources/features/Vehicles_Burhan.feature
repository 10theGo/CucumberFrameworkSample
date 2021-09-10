Feature: Fleet Module
  As a PosManager I should be able to navigate to the fleet module

  Background:
    Given The user is on the login page
    And The user logs in as "posmanager"

  @brhn
  Scenario: PosManager should successfully land on Vehicles page
    When The user navigates to "Fleet" tab_brhn
    Then The user should be on the Vehicles Page_brhn

  Scenario: PosManager should be able to navigate between Vehicle modules