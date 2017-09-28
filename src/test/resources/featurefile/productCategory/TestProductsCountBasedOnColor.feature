@tag
Feature: ProductCategoryPage1
@tag1
  Scenario: Verify Total Number Of Products based on color filters
    Given navigate to application
    And user click on women navigation menu
    And click on orange color filter
    Then verify total number of products dispalyed as "3"
