@tag
Feature: Login
  As a user want to test login feature

  @positive
  Scenario: LOG-001 username want login with you1@gmail.com
  	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
 