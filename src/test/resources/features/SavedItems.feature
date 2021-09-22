Feature: Saved items functionality

  Scenario: Add items to Saved items from Search results
    Given user opens main page
    When user searches by 'glasses' keyword
    Then user should see 'glasses' in search results
    When user saves 'Jack & Jones blue light filter glasses with clear frames' from search results page
    When user navigates to saved items page
    Then user sees item 'Jack & Jones blue light filter glasses with clear frames' on the saved list

  Scenario: Add items to Saved items from Products page
    Given user opens main page
    When user searches by 'glasses' keyword
    Then user should see 'glasses' in search results
    When user choose 'Jack & Jones blue light filter glasses with clear frames' from list of products
    When user saves item from products page
    When user navigates to saved items page
    Then user sees item 'Jack & Jones blue light filter glasses with clear frames' on the saved list

  Scenario: Remove item from Saved items
    Given user opens main page
    When user searches by 'glasses' keyword
    Then user should see 'glasses' in search results
    When user saves 'Jack & Jones blue light filter glasses with clear frames' from search results page
    When user navigates to saved items page
    When user removes item 'Jack & Jones blue light filter glasses with clear frames' from saved list
    Then user sees empty saved list
