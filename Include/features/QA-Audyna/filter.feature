@tag
Feature: filter
  As a user want to test filter feature

  @positive
  Scenario: FLT001 As a user I want to filter products by hobby
 	 	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	And user click button filter for hobby
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
  	
  	 @positive
  Scenario: FLT002 As a user I want to filter products by vehicles
 	 	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	And user click button filter for vehicles
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
  	
  	 @positive
  Scenario: FLT003 As a user I want to filter products by clothes
 	 	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	And user click button filter for clothes
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
  	
  	 @positive
  Scenario: FLT004 As a user I want to filter products by electronic
 	 	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	And user click button filter for electronic
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
  	
  	 @positive
  Scenario: FLT005 As a user I want to filter products by health
 	 	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	And user click button filter for health
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 