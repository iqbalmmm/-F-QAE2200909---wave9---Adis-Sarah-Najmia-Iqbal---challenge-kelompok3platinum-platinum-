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
  Scenario: EDT-001 user want to click navbar menu
  	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When As a user click button masuk
  	When As a user input email with "sitinajmiaihvasyani@gmail.com"
  	And As a user input password with "studentqa123"
  	Then As a user click button login 
  	And As a user click navbar menu
  	And As a user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
 
  @positive
  Scenario: EDT-001 user want to click edit product
  	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When As a user click button masuk
  	When As a user input email with "sitinajmiaihvasyani@gmail.com"
  	And As a user input password with "studentqa123"
  	Then As a user click button login 
  	And As a user click navbar menu
  	And As a user want to click product
  	And As a user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 