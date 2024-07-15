Feature: Plan a trip with customized parameters

Rule: It is possible to plan a trip between any two locations with custized details

Background:
Given that the page is open
and the language is set to English

Scenario1:  Plan an immediate trip between "Margaret Island" and "Városliget"
When I fill out the "From" input with: "Margaret Island"
and I fill out the "To" input with: "Népliget"
and I click on the "Planning options" header
and I select the "bicycle" as a nontransit mode
and I deselect "subway"
and I deselect "suburban railway"
and I deselect "trolleybus"
and I deselect "ferry"
and I deselect "rail"
and I deselect "regional bus"
and I select "Least Transfers" from the "planner optimize" dropdown
and I click on the "Plan" button
Then the "Suggested itineraries" panel is visible

