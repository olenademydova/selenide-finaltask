Feature: Cart functionality

  Scenario Template: Add item to cart with size charts
    Given user opens main page
    When user searches by '<keyword>' keyword
    Then user should see '<keyword>' in search results
    When user choose '<keyword>' from list of products
    When user adds item to cart from the product page
    Then user sees that item was added to cart

    Examples:
      | keyword   |
      | superstar |
      | Old Skool |

  Scenario: Add item to cart without size charts
    Given user opens main page
    When user searches by 'glasses' keyword
    Then user should see 'glasses' in search results
    When user choose 'glasses' from list of products
    When user clicks add to cart button
    Then user sees that item was added to cart

  Scenario Template: Remove item from cart
    Given user opens main page
    When user searches by '<keyword>' keyword
    Then user should see '<keyword>' in search results
    When user choose '<keyword>' from list of products
    When user adds item to cart from the product page
    When user navigates to cart from product page
    When user deletes item from cart
    Then user sees empty cart

    Examples:
      | keyword   |
      | Ozweego   |
      | Old Skool |

  Scenario: Add item to cart when size is not selected
    Given user opens main page
    When user searches by 'Ozweego' keyword
    Then user should see 'Ozweego' in search results
    When user choose 'Ozweego' from list of products
    When user clicks add to cart button
    Then user sees message that user should choose the size


