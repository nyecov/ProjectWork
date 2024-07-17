Feature: Plan an immediate trip

  Rule: It is possible to plan a trip between any two locations without filling any other details

    Background:
      Given that the page is open
      And I accept privacy policy
      And the selected language is "English"

    Scenario:  Plan an immediate trip between "Margaret Island" and "Városliget"
      When I fill out the "From" input with: "Margaret Island"
      And I fill out the "To" input with: "Népliget"
      And I select the "Start now" option from the "arriveby" dropdown
      And I click on the Plan button
      Then the results panel is visible


