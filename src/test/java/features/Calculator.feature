Feature: This feature would be calculating Addition and Subtraction of two numbers

  @sanity
  Scenario: This scenario is to add the numbers
    Given I have a calculator
    When I add the numbers 4 and 5
    Then I should get the result as 9

  @Test
  Scenario Outline: This scenario is to add the list of numbers
    Given I have a calculator
    When I add the numbers <num1> and <num2>
    Then I should get the result as <result>

    Examples: 
      | num1 | num2 | result |
      |    2 |    3 |      5 |
      |    7 |    9 |     16 |

  Scenario: This scenario is to add the numbers
    Given I have a calculator
    When I add the numbers
      | 3 |
      | 2 |
      | 5 |
      | 4 |
      | 9 |
    Then I should get the result as 23
