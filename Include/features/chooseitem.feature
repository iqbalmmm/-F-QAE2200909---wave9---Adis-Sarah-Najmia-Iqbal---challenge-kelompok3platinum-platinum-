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
Feature: Choose Item
  As a user want to choose item to buy

  @positive
  Scenario: CHI-001 username want login with you1@gmail.com
  	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	And input text in search bar 
  	And Enter keys
  	And Click item list
  	And Click on Saya Tertarik dan Ingin Nego button
  	Then Input harga tawar
  	And Click kirim tawaran button 
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
 
  