Feature: Create account of a facebook

  Scenario Outline:Validate create user multiple fields
    Given User need to be on Facebook login page
    When User enters user "<user>" first name
    And user enters user "<surname>" surname
    Then User checks user "<user>" first name is present
    But User mobile field should be blank
    Then Close browser

    Examples:
      | user  | surname |
      | Tonny | Jerry   |
      | Jack  | Mbezi   |
      | Hope  | Titus   |
      | James | Mpanga  |