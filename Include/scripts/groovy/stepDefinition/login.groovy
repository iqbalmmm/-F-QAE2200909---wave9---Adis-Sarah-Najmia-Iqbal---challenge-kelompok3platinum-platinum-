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


class login {

	@When("user click button masuk")
	public void user_click_button_masuk() {
		WebUI.callTestCase(findTestCase('pages/QA-Najmia/User Login/Masuk'), [:], FailureHandling.STOP_ON_FAILURE)
	}


	@When("user input email with {string}")
	public void user_input_email_with(String email) {
		WebUI.callTestCase(findTestCase('pages/QA-Najmia/User Login/Input Email'), [('email') : GlobalVariable.username], FailureHandling.STOP_ON_FAILURE)
	}

	@When("user input password with {string}")
	public void user_input_password_with(String password) {
		WebUI.callTestCase(findTestCase('pages/QA-Najmia/User Login/Input Password'), [('password') : GlobalVariable.password], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user click button login")
	public void user_click_button_login() {
		WebUI.callTestCase(findTestCase('pages/QA-Najmia/User Login/Click Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("user verify url should be equals with {string}")
	public void user_verify_url_should_be_equals_with(String string) {
		// Write code here that turns the phrase above into concrete actions

	}
}