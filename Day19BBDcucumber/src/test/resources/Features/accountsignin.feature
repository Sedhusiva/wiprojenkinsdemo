#Feature: Store Signin
#https://www.rediff.com/
#Scenario Outline: Login with correct username and correct password
 
#    Given I navigate to login page
#    When I clicked signin link
#    When I entered "<userName>" and "<passWord>"
#   Then I clicked signin button
    
#    Examples:
#    | userName | passWord |
#    | user1    | pass12   |


Feature: Store SignUp
https://www.rediff.com/
Scenario: Login with correct username and correct password
 
    Given I navigate to website page
    When  I clicked signin link
    When  I clicked create account link
    And   I entered the details
    Then  I clicked the create account button

