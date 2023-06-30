Feature: Signup to OpenCart

  Scenario Outline: User Signup
    Given User on signup screen
    When User signup with following details
      | Field    |  | Value      |
      | UserName |  | <username> |
      | Email    |  | <email>    |
      | Phone    |  | <phone>    |
      | Age      |  | <age>      |
      | Address  |  | <address>  |
      | Gender   |  | <gender>   |
    Then User should be redirected to dashbord successfully
    Examples:
      | username | email       | phone      | age | address | gender |
      | sk1      | sk@test.com | 8588811111 | 19  | delhi   | female |









