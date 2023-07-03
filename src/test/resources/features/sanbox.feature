@test
Feature: Test different actions on a sanbox page.

  Rule: The user can return values from the table and validat them.

    Background: Navigate to Table Web App.
      Given I navigate to the static table

    Scenario: As a Test Engineer, I wan to retrieve the value of an static table.
      Then I can return the value I want

    Scenario: As a Test Engineer, I wan to validate the static table is displayed
      Then I can validate the table is displayed
