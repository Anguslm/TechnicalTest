@FactorFinder
Feature: Factor Finder

  Scenario: Input a multiple of 3
    When I input the number 6 to the factor finder
    Then The factor finder returns the string Pling

  Scenario: Input a multiple of 5
    When I input the number 20 to the factor finder
    Then The factor finder returns the string Plang

  Scenario: Input a multiple of 7
    When I input the number 49 to the factor finder
    Then The factor finder returns the string Plong

  Scenario: Input a number that is not a multiple of 3, 5 or 7
    When I input the number 4 to the factor finder
    Then The factor finder returns the string 4

  Scenario: Input a multiple of 3 and 5
    When I input the number 30 to the factor finder
    Then The factor finder returns the string PlingPlang

  Scenario: Input a multiple of 3 and 7
    When I input the number 42 to the factor finder
    Then The factor finder returns the string PlingPlong

  Scenario: Input a multiple of 5 and 7
    When I input the number 70 to the factor finder
    Then The factor finder returns the string PlangPlong

  Scenario: Input a multiple of 3, 5 and 7
    When I input the number 105 to the factor finder
    Then The factor finder returns the string PlingPlangPlong

  Scenario: Input zero
    When I input the number 0 to the factor finder
    Then The factor finder returns the string PlingPlangPlong

  Scenario: Input a negative multiple of 3, 5 and 7
    When I input the number -105 to the factor finder
    Then The factor finder returns the string PlingPlangPlong

  Scenario: Input a negative number that is not a multiple of 3, 5 or 7
    When I input the number -16 to the factor finder
    Then The factor finder returns the string -16

