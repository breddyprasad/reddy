Feature: My first sample cucumber feature

  Scenario Outline: Title of your scenario
    Given I want to write a step with precondition
    When I login as user "<username>" and password "<password>"
    And I validate the outcomes
    Then check more outcomes

    Examples: 
      | username | password |
      | user1    | pwd1     |
      | user2    | pwd2     |
      | user3    | pwd3     |

      
      