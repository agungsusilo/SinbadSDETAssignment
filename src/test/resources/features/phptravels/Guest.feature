@Web @Guest

  Feature: Book hotels as guest
    Background:
      Given User is open phptravels page

  Scenario: User book hotel as a guest on specific country
    When User input "Istanbul" on destination fields
    And User input "17-10-2020" as check in date
    And User input "19-10-2020" as check out date
#   And User click number of adults
    And User click number of child
    And User click search button
    And User see hotel search result
    And User click on the top list hotel
    And User see hotel details
    And User click on the top list rooms
    And User click Book Now button

    And User see Personal Details form
    And User input "firstname" on the firstname field
    And User input "lastname" on the lastname field
    And User input"email@mail.com" on the email field
    And User input "email@mail.com" on the email confirmation field
    And User input "080989999" on contact number field
    And User input "Mantap Street" on Address field
    And User click on country list
    And User click cofirm button
    Then User see booking details page