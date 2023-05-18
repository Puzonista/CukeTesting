@datatable
Feature: Login Feature - Production
  In order to perform successful login
  As a User
  I have to enter correct username and password

  Scenario: Login to the Facebook Website as a user on Production
    Given user navigates to the facebook website
    When user validates the homepage title
    Then user enters "valid" username
    And user enters "valid" password
    And user validates capcha image
    And user enters firstname and lastname
      | FirstName | LastName  |
      | Krzysztof | Wodkowski |
      | Adam      | Kulig     |
    And user clicks on the singin button
