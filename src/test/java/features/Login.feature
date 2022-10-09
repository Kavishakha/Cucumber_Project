Feature: Login Feature Scenario

  Background: 
    Given I have launched the application
    And I click on Login link

  Scenario: This scenario is to define the login happy path
    #    Given I have launched the application
    #    And I click on Login link
    When I enter the correct username and password
    And I click on Login Button
    Then I should land on the home page
  	#		And I close the browser
  	
  @Regression	
  Scenario: This scenario is to define the failure path
    #    Given I have launched the application
    #    And I click on Login link
    When I enter the incorrect username and password
    And I click on Login Button
    Then I should get the error message "The email or password you have entered is invalid."
  	#		And I close the browser
  	
  @Sanity	
  Scenario: This scenario is to define the parameterized path
    #    Given I have launched the application
    #    And I click on Login link
    When I enter the username as "abc@xyz.com" and password as "Abc@12345"
    And I click on Login Button
    Then I should get the error message "The email or password you have entered is invalid."
  	# 		And I close the browser
  Scenario Outline: This scenario is to define list of examples
    #    Given I have launched the application
    #    And I click on Login link
    When I enter the username as "<uname>" and password as "<pwd>"
    And I click on Login Button
    Then I should get the error message "The email or password you have entered is invalid."
    #    And I close the browser
    Examples: 
      | uname        | pwd        |
      | test@abc.com | Test@7890  |
      | xyz@test.com | Xabc@12345 |
