@Web @Credential
Feature: Submit visa for bussiness trip

  Background:
    Given User is open phptravels page
    When User click on my account button
    And User click on myacclogin button
    And User see login page
    And User input "user@phptravels.com" on phptravel email field
    And User input "demouser" on phptravel password field
    And User click LOGIN button on phptravel login page
    Then User see my Account page


  Scenario Outline: User submit visa from one country to another
    When User open visa request url from "<Origin>" to "<Destination>" on "<Date>"
    And User input "firstname" on the visa firstname field
    And User input "lastname" on the visa lastname field
    And User input "email@mail.com" visa on the email field
    And User input "email@mail.com" on the visa email confirmation field
    And User input "080989999" on visa contact number field
    And User click Booking button on visa page
    And User click view invoice button
    Then User see visa booking details page
    Examples:
      | Origin    | Destination | Date       |
      | Indonesia | Australia   | 01-12-2020 |
      | Indonesia | Japan       | 02-12-2020 |
      | Japan     | Indonesia   | 03-12-2020 |
      | Japan     | Australia   | 04-12-2020 |
      | Australia | Japan       | 05-12-2020 |
