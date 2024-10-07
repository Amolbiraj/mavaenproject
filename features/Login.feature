Feature: Login
@ignore
#Scenario: Succesful login with valid credential
   # Given user launch chrome browser
   # When user open url "https://demo.guru99.com/v4/index.php"
   #And User enter email as "mngr595032" and password as "yhEmava"
    #And click on login
   #Then Page url Should Be "https://demo.guru99.com/v4/manager/Managerhomepage.php"
    #When user click on logout link
    #And close browser
    
    Scenario Outline: Succesful login with valid credintial DDT
    
    Given user launch chrome browser
    When user open url "https://demo.guru99.com/v4/index.php"
    And User enter email as "<email>" and password as "<password>"
    And click on login
  

    Examples:
    |email||password|
    |mngr595032||yhEmava|
    |zkkzxbz||kbkbzz|
    |bbbjz||znbmbz|
    
    
    