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



class addItems {
	@Then("user click hamburger button")
	public void user_click_hamburger_button() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Add Items - Audyna/Click Hamburger Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user click button plus for add a new product")
	public void user_click_button_plus_for_add_a_new_product() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Add Items - Audyna/Click Button Plus for Add a New Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user input product name")
	public void user_input_product_name() {
		WebUI.setText(findTestObject('QA-Audyna/Add Items - Audyna/input_Product Name'), '[Audyna] Tas Tory Burch')
	}

	@Then("user input product price")
	public void user_input_product_price() {
		WebUI.setText(findTestObject('QA-Audyna/Add Items - Audyna/input_Product Price'), '16000000')
	}

	@Then("user select category")
	public void user_select_category() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Add Items - Audyna/Select Category'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user fills the description")
	public void user_fills_the_description() {
		WebUI.setText(findTestObject('QA-Audyna/Add Items - Audyna/textarea_Description'), 'Tory Burch Blue')
	}

	@Then("user click button plus for upload image")
	public void user_click_button_plus_for_upload_image() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Add Items - Audyna/Click Button Plus for Upload Image'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user click button preview product")
	public void user_click_button_preview_product() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Add Items - Audyna/Click Button Preview Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user click button publish after preview")
	public void user_click_button_publish_after_preview() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Add Items - Audyna/Click Button Publish after Preview'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("user click item")
	public void user_click_item() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Add Items - Audyna/Click Item'), [:], FailureHandling.OPTIONAL)
	}

	@Then("user click delete items")
	public void user_click_delete_items() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Add Items - Audyna/Delete Items'), [:], FailureHandling.OPTIONAL)
	}
	@Then("user click button publish product")
	public void user_click_button_publish_product() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Add Items - Audyna/Click Button Publish Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}

