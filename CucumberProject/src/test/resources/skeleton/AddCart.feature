Feature: Item add to cart Feature
Scenario: Adding item to cart
    Given Select  one item 
    When checkcart and Bill paying
    Then order successsful