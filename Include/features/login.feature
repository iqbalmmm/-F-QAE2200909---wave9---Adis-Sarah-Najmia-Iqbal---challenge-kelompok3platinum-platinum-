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
Feature: Edit Item
  As a user want to test edit item feature

  @positive
  Scenario: LOG-001 username want login with you1@gmail.com
  	Given user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "sitinajmiaihvasyani@gmail.com"
  	And user input password with "studentqa123"
  	Then user click button login 
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And user close browser 
 