@logout @smoke
Feature: log out

  Scenario Outline: <userType> users can logout

    Given the <userType> is logged in
    When the user clicks the logout button
    Then the user should be logged out
    Examples:
      | userType               |
      | Sales Manager          |
      | Point of Sales Manager |
      | Inventory Manager      |
      | Expenses Manager       |
      | Manufacturing User     |
