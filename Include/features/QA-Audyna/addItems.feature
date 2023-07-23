@tag
Feature: add items
  As a user want to test add items feature

  @positive
  Scenario: AD-IT001 As a user I want to add a new items with fills the data required
  	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	Then user click hamburger button
  	And user click button plus for add a new product
  	Then user input product name
  	Then user input product price
  	And user select category
  	Then user fills the description
  	And user click button plus for upload image
  	Then user click button preview product
  	And user click button publish after preview
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
  		
  	@positive
  	Scenario: AD-IT002 As a user I want to delete my product items
  	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login
  	Then user click hamburger button
  	And user click item
  	Then user click delete items
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser
  	
  	@positive
  	 Scenario: AD-IT003 As a user I want to add a new items without fills the name product
  	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	Then user click hamburger button
  	And user click button plus for add a new product
  	Then user input product price
  	And user select category
  	Then user fills the description
  	And user click button plus for upload image
  	And user click button publish product
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
  	
  	 @positive
  Scenario: AD-IT004 As a user I want to add a new items without fills the price product
  	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	Then user click hamburger button
  	And user click button plus for add a new product
  	Then user input product name
  	And user select category
  	Then user fills the description
  	And user click button plus for upload image
  	And user click button publish product
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
  	
  	@positive
  Scenario: AD-IT005 As a user I want to add a new items without fills the category
  	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	Then user click hamburger button
  	And user click button plus for add a new product
  	Then user input product name
  	Then user input product price
  	Then user fills the description
  	And user click button plus for upload image
  	And user click button publish product
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
  	
  	 @positive
  Scenario: AD-IT006 As a user I want to add a new items without fills the description
  	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	Then user click hamburger button
  	And user click button plus for add a new product
  	Then user input product name
  	Then user input product price
  	And user select category
  	And user click button plus for upload image
  	And user click button publish product
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
  	
  	@positive
  Scenario: AD-IT007 As a user I want to add a new items without fills the image
  	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	Then user click hamburger button
  	And user click button plus for add a new product
  	Then user input product name
  	Then user input product price
  	And user select category
  	Then user fills the description
  	And user click button publish product
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 