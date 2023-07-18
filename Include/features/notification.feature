#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Notification
  As a user want to test login feature

  @positive
  Scenario: NOT-001 user want to click notification 
  	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	And user click notification icon
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
  
  
    @positive
  Scenario: NOT-002 user want to click product notification 
  	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	And user click notification icon
  	And user click product notification
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser
  
      @positive
  Scenario: NOT-002 user want to click product notification 
  	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	And user click notification icon
  	And user click product notification
  	And user click edit product
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser
  
        @positive
  Scenario: NOT-002 user want to delete product notification 
  	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	And user click notification icon
  	And user click product notification
  	And user click delete product
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser
  