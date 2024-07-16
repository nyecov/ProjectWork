Feature: test

  Background:
    Given that the page is open
    And I accept privacy policy

  Scenario:Placeholder
    Given the selected language is in "English"
    And the "Hungarian" flag is visible
    When I select the "Hungarian" language
    Then main panel title is labelled "Utazástervezés"