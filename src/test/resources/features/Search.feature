Feature: Search functionality

  Scenario Template: Search by different parameters
    Given user opens main page
    When user searches by '<keyword>' keyword
    Then user should see '<keyword>' in search results

    Examples:
      | keyword |
      | pants   |
      | boots   |

