Feature: change UI language

Rule: It is possible to change the language of the UI to Hungarian or to English

Background:
Given that the page is open
And I accept privacy policy

Scenario1:  Change the language to Hungarian
    Given the selected language is in "English"
    And the "Hungarian" flag is visible
    When I click on the Hungarian flag
    Then main panel title is labelled "Utazástervezés"

Scenario2:  Change the language to English
    Given the selected language is in Hungarian
    And the English flag is visible
    When I click on the English flag
    Then main panel title is labelled "Trip Planner"

