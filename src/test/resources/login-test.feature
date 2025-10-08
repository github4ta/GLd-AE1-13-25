Feature: Test Login form
  User can open home page, and clickLogin, and fill Email and Submit form.

  Scenario: User can fill Email and submit form
    Given User opens site
    And User clicks button Login
    When User fills Email
    And User clicks button Submit

  Scenario: User can fill empty Email and submit for
    Given User opens site
    And User clicks button Login
    When User fills Email
    And User clicks button Submit