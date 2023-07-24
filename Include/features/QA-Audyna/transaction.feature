@tag
Feature: transaction
  As a user want to test transcation feature

  @positive
  Scenario: TRX001 As a user I interested with product and will negotiation
 	 	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	And click product 1
  	Then click button for negotiation
  	And input bid price
  	Then click button send bid price
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
  	
  	 @positive
  Scenario: TRX002 As a user I want to accept bidding price from customer
 	 	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	And user click button for click notification
  	Then click product 2
  	Then user click button for accept bidding 
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
  	
  	 @positive
  Scenario: TRX003 As a user I want to contact my customer via WhatsApp
 	 	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	And click button for click notification
  	Then click notif product 2
  	And click button accept bidding
  	Then click button for contact via WhatsApp
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
  	
  	@positive
  Scenario: TRX004 As a user I want to reject bidding price from customer
 	 	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	And click button for click notification
  	Then click notif product 3
  	Then click button for reject bidding product 3
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
  	
  	 @positive
  Scenario: TRX005 As a user I want to choose my status product as a sold successfully sold
 	 	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	And user click button for click notification
  	Then click notif product 4
  	Then user click button for accept bidding 
  	And click button for status product 4
  	Then click button for status sold succesfully 4
  	And click button for send status product
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 
  	
  	@positive
  Scenario: TRX006 As a user I want to choose my status product as a transaction cancel
 	 	Given As a user launch browser and navigate to url "https://secondhand.binaracademy.org/"
  	When user click button masuk
  	When user input email with "you1@gmail.com"
  	And user input password with "123456"
  	Then user click button login 
  	And user click button for click notification
  	Then click notif product 5
  	Then user click button for accept bidding 
  	And click button for status product 5
  	Then click button for transaction cancel status product
  	And click button for send status product
  	And user verify url should be equals with "https://secondhand.binaracademy.org/"
  	And As a user close browser 