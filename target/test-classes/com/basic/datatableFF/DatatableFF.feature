Feature: Search books feature

  Scenario: Correct non-zero number of books found by author
    Given I have the following books in the store
      | title                            | author      |
      | The Devil White City             | Erik Larson |
      | The lion, the witch and Wardrobe | C.S Lewis   |
      | In the Garden of Beasts          | Erik Larson |
    When I search for books by author "Erik Larson"
    Then I find 2 book