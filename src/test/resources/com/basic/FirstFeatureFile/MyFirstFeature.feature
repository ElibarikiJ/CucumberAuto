Feature: Create account of facebook
  As user u need to open facebook home page and do the validation

  Scenario: Validate first name field
    Given User need to be on Facebook login page
    When User enters user first name
    Then User checks user first name is present


#  Scenario: Validate create user multiple field
#    Given User need to be on Facebook login page
#    When User enters user first name
#    And user enters user surname
#    Then User checks user first name is present
#    But User mobile field should be blank
