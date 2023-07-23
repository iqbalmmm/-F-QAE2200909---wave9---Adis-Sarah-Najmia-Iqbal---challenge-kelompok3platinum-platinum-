package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class transaction {
	@Then("click product {int}")
	public void click_product(Integer int1) {
		WebUI.click(findTestObject('QA-Audyna/Transaction - Audyna/Product 1'))
	}

	@Then("click button for negotiation")
	public void click_button_for_negotiation() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Transaction - Audyna/Click Button for Negotiation'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("input bid price")
	public void input_bid_price() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Transaction - Audyna/Input Bid Price'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("click button send bid price")
	public void click_button_send_bid_price() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Transaction - Audyna/Click Button Send Bid Price'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user click button for click notification")
	public void user_click_button_for_click_notification() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Transaction - Audyna/Button for Click Notification'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user click button for accept bidding")
	public void user_click_button_for_accept_bidding() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Transaction - Audyna/Button for Accept Bidding'), [:], FailureHandling.OPTIONAL)
	}

	@Then("click button for click notification")
	public void click_button_for_click_notification() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Transaction - Audyna/Button for Click Notification'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("click notif product {int}")
	public void click_notif_product(Integer int1) {
		WebUI.click(findTestObject('QA-Audyna/Transaction - Audyna/Notif Product 2'))
	}

	@Then("click button accept bidding")
	public void click_button_accept_bidding() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Transaction - Audyna/Button for Accept Bidding'), [:], FailureHandling.OPTIONAL)
	}

	@Then("click button for contact via WhatsApp")
	public void click_button_for_contact_via_WhatsApp() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Transaction - Audyna/Button for Contact via WhatsApp'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("click button for reject bidding product {int}")
	public void click_button_for_reject_bidding_product(Integer int1) {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Transaction - Audyna/Button for Contact via WhatsApp'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("click button for status product {int}")
	public void click_button_for_status_product(Integer int1) {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Transaction - Audyna/Button for Status Product Product 4'), [:], FailureHandling.OPTIONAL)
	}

	@Then("click button for status sold succesfully {int}")
	public void click_button_for_status_sold_succesfully(Integer int1) {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Transaction - Audyna/Button for Status Sold Successfully Product 4'), [:],
		FailureHandling.OPTIONAL)
	}

	@Then("click button for send status product")
	public void click_button_for_send_status_product() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Transaction - Audyna/Button for Send Status Product'), [:], FailureHandling.OPTIONAL)
	}

	@Then("click button for transaction cancel status product")
	public void click_button_for_transaction_cancel_status_product() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Transaction - Audyna/Button for Transaction Cancel Status Product 5'),
				[:], FailureHandling.OPTIONAL)
	}
}