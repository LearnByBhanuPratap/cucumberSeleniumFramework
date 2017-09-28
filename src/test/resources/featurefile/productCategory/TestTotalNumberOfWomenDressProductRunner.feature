@tag
Feature: ProductCategoryPage
@tag
  Scenario: Verify Total Number Of Women Dress Products
    Given navigate to application
    And user click on women navigation menu
    Then verify total number of women products dispalyed as "8"
