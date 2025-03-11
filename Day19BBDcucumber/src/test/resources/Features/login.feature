Feature: Store Signin
#https://www.rediff.com/

Background: 
    Given I navigate to login page
    When I clicked signin link
    
@SC1
Scenario Outline: Login with correct username and correct password
 
   And I entered "<userName>" and "<passWord>"
   Then I clicked signin button
    
   Examples:
   | userName | passWord |
   | user1    | pass12   |

@SC2
Scenario Outline: Login fails with invalid username
 
    But User enters invalid "<userName>" and correct "<passWord>"
    Then I clicked signin button
    
    Examples:
   | userName | passWord |
   | $%12-     | pass12   |
   
 
@SC3
Scenario Outline: Login fails with invalid password
 
    But User enters Correct "<userName>" and invalid "<passWord>"
    Then I clicked signin button
    
    Examples:
   | userName | passWord |
   | user12     | $%12-   |