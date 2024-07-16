Feature: Plan an immediate trip

Rule: It is possible to plan a trip between any two locations without filling any other details

Background:
Given that the page is open
and the language is set to English

Scenario:  Plan an immediate trip between "Margaret Island" and "Városliget"
When I fill out the "From" input with: "Margaret Island"
and I fill out the "To" input with: "Népliget"
and I select the "Start now" option from the "arriveby" dropdown
and I click on the "Plan" button
Then the "Suggested itineraries" panel is visible


