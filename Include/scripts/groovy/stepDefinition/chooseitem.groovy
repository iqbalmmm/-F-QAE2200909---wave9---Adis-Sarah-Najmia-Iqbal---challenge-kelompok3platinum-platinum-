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



class chooseitem {
	@Then("input text in search bar")
	public void input_text_in_search_bar() {
		WebUI.callTestCase(findTestCase('pages/QA-Najmia/Search Bar/Search Bar'), [('searchitem') : GlobalVariable.search], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Enter keys")
	public void enter_keys() {
		WebUI.callTestCase(findTestCase('pages/QA-Najmia/Search Bar/Enter Keys'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Click item list")
	public void click_item_list() {
		WebUI.callTestCase(findTestCase('pages/QA-Najmia/Search Bar/Click List'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Click on Saya Tertarik dan Ingin Nego button")
	public void click_on_Saya_Tertarik_dan_Ingin_Nego_button() {
		WebUI.callTestCase(findTestCase('pages/QA-Najmia/Choose Item/Saya Tertarik dan Ingin Nego'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Input harga tawar")
	public void input_harga_tawar() {
		WebUI.callTestCase(findTestCase('pages/QA-Najmia/Choose Item/Harga Tawar'), [('hargatawar') : GlobalVariable.Hargatawar1], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Click kirim tawaran button")
	public void click_kirim_tawaran_button() {
		WebUI.callTestCase(findTestCase('pages/QA-Najmia/Choose Item/Kirim Tawaran'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}