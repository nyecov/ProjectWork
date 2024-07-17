Feature: Exchange the from and to markers

  Rule: It is possible to plan a trip between any two locations without filling any other details

    Background:
      Given that the page is open
      And I accept privacy policy
      And the selected language is "English"


    Scenario:  Echange the to and from landmarks with the reverse direction button
      When I fill out the "From" input with: "Margaret Island"
      And I fill out the "To" input with: "Népliget"
      And I click on the Reverse direction button
      Then the "From" field is filled with "Népliget"
      And the "To" field is filled with "Margaret Island"
      And I select the "Start now" option from the "arriveby" dropdown
      And I click on the "Plan" button
      Then the "Suggested itineraries" panel is visible


