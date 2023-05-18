@Staging
Feature: Login Feature - Staging
  In order to perform successful login
  As a User
  I have to enter correct username and password

  Background: 
    Given user navigates to the facebook website
    When user validates the homepage title

  Scenario Outline: Login to the Facebook Website as a valid user on Staging
    Then user enters "valid" username
    And user enters "valid" password
    And user validates capcha image
    And user clicks on the singin button

  Scenario Outline: Login to the Facebook Website as a valid user on Staging
    Then user enters "Invalid" username
    And user enters "Invalid" password
    And user validates capcha image
    And user clicks on the singin button
