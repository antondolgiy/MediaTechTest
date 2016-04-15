Feature: Check that header eqwls smthng

  Scenario:  test
    Given Open page by url "https://www.google.ru" in browser
    Given Type to search input "adsterra"
    When Press button search
    Then Header search snippet "1" text equals "Adsterra"