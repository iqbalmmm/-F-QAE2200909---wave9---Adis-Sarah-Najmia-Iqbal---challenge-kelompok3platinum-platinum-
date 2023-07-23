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



class filter {
	@Then("user click button filter for hobby")
	public void user_click_button_filter_for_hobby() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Filter - Audyna/Filter for Hobby Products'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("user click button filter for vehicles")
	public void user_click_button_filter_for_vehicles() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Filter - Audyna/Filter for Vehicles Products'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	@Then("user click button filter for clothes")
	public void user_click_button_filter_for_clothes() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Filter - Audyna/Filter for Clothes Products'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user click button filter for electronic")
	public void user_click_button_filter_for_electronic() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Filter - Audyna/Filter for Electronic Products'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user click button filter for health")
	public void user_click_button_filter_for_health() {
		WebUI.callTestCase(findTestCase('pages/QA-Audyna/Filter - Audyna/Filter for Health Products'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}