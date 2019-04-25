Feature: Login Feature
Scenario Outline:  Valid User Scenario
    Given The URL of TestMe App
    When user enters <username> as username
      And  user enters <password> as password
    Then user is in <page>
    
 Examples:   
 |username|password|page|
 |Lalitha|Password123|Home|
 |admin|Password456|Admin Home|
 
 
 
  @Invalid  
  Scenario:  Invalid User Scenario
      Given The URL of TestMe App
      When user enters the invalid data
       |aaa|Password123|
       |Lalitha|yyy|
       |123|456|
      Then user is in loginpage
    |1|
    |1|
    |1|