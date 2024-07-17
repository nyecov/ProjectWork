Feature: change UI language

  Rule: It is possible to change the language of the UI to Hungarian or to English

    Background:
      Given that the page is open
      And I accept privacy policy

    Scenario:  Change the language to Hungarian
      Given the selected language is"English"
      And the "Hungarian" flag is visible
      When I select the "Hungarian" language
      Then main panel title is labelled "Utazástervezés"

    Scenario:  Change the language to English
      Given the selected language is "English"
      And the "Hungarian" flag is visible
      And I select the "Hungarian" language
      And the selected language is "Hungarian"
      And the "English" flag is visible
      When I select the "English" language
      Then main panel title is labelled "Trip Planner"

