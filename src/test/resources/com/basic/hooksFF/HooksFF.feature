Feature: Create account of facebook
  As user u need to open facebook home page and do the validation

  Scenario: Validate first name field
    Given User need to be on Facebook login page
    When User enters user "brkjohn.3@gmail.com" first name
    Then User checks user "brkjohn.3@gmail.com" first name is present


  Scenario: Validate create user multiple field
    Given User need to be on Facebook login page
    When User enters user "pmgissa@gmaill.com" first name
    And user enters user "pmgissa" surname
    Then User checks user "pmgissa.3@gmail.com" first name is present
    But User mobile field should be blank
