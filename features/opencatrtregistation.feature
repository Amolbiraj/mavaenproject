Feature: Registration
Background:Given user open chrome browser
    When user open url as "https://demo.opencart.com/"
    When user click on MyAccount dropdown
  @sanity 
  Scenario: succesfully done registration page
    
    And user click on register on dropdown
    Then page currenturl should be "https://demo.opencart.com/en-gb?route=account/register"
    When user filling personal information in registration page
    And user click on privacy policy button
    And user click on continue
    Then user title should be "Your Account Has Been Created!"
    
     @regression
  Scenario: user should login succesfully and buy the product
    
    And user click on login   dropdown
    And user enter email as "efg123@gmail.com" and password as "test@123"
    And user click on login button
    Then page title shuld be "My Account"
    When user move to mp3player tab
    And click on test16(0)
    And user click on continue button
    Then page titile should be "Your Store"
    When user click on iphone
    And user click on addToCart
