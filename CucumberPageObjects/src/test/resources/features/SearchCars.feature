@Search-Cars
Feature: Acceptance testing to validate Search cars page is working fine
  In order to validate that
  The search car page is working fine
  we will do teh acceptancce testing

  @Search-Cars-Positive
  Scenario: Validate search cars page
    Given I am on Home Page "https://www.otomoto.pl/" of Otomoto website
    And I click on "Wyszukiwanie zaawansowane" link
    And Select carbrand as "Volkswagen" from MarkaPojazdu dropdown
    And Select carmodel as "Golf" from ModelPojazdu dropdown
    And Select fuel as "Benzyna" from RodzajPaliwa dropdown
    And type price as "25000" from CenaDo
    And click on Uzywane button
    Then i should see list of searched cars
    And the page title should be "Volkswagen Golf - Używane osobowe - otomoto.pl"
