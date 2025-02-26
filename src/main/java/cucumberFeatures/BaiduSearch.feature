Feature: browser searching feature
  Background: browser`s first function
  Scenario: Baidu browse usqyn
    Given "open the browser  "
    When enter usqyn, and search
    Then show the result