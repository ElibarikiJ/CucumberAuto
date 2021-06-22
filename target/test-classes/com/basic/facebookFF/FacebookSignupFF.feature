Feature: Facebook signup feature
  In this feature will signup to facebook website.

  Scenario: Signup to facebook
    Given I navigate to facebook page
    Then I enter all required details
      | Elibariki                 |
      | John                      |
      | elibarikijohn10@gmail.com |
      | brkjohn.3                 |
      | 21-10-1996                |
      | Male                      |
    Then I click on Signup button