Feature: Amazon Login

  Scenario: Login into Amazon
    Given User is on amazon login page
    When Title of webpage is Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in
    Then User hovers cursor on Hello, sign in
    And User clicks on Signin
    When Title of webpage is Amazon Sign In
    Then User enters email or mobile no
    And Clicks on Continue

