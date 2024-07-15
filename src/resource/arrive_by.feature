Feature: Plan a trip with arrival time

Rule: It is possible to plan a trip between any two locations so I arrive by a certain date

Background:
Given that the page is open
and the language is set to English

Scenario1:  Plan an immediate trip between "Margaret Island" and "Városliget"
When I fill out the "From" input with: "Margaret Island"
and I fill out the "To" input with: "Népliget"
and I select the "Arrive Time" option from the "arriveby" dropdown
and I select a tomorrow from the "date planner" calendar
and I fill the "time planner" input with "15:30"
and I click on the "Plan" button
Then the "Suggested itineraries" panel is visible
The fastest routes arrival time is sooner then "15:30"

