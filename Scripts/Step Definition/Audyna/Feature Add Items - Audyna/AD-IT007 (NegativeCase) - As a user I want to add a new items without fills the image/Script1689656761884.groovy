import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('common/Launch Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('common/Navigate To Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('pages/QA-Najmia/User Login/Masuk'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('pages/QA-Najmia/User Login/Input Email'), [('email') : GlobalVariable.username], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('pages/QA-Najmia/User Login/Input Password'), [('password') : GlobalVariable.password], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('pages/QA-Najmia/User Login/Click Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('pages/QA-Audyna/Add Items - Audyna/Click Hamburger Button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('pages/QA-Audyna/Add Items - Audyna/Click Button Plus for Add a New Product'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Audyna/Add Items - Audyna/input_Product Name'), '[Audyna] Tas Tory Burch')

WebUI.setText(findTestObject('Audyna/Add Items - Audyna/input_Product Price'), '16000000')

WebUI.callTestCase(findTestCase('pages/QA-Audyna/Add Items - Audyna/Select Category'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Audyna/Add Items - Audyna/textarea_Description'), 'Tory Burch Blue')

WebUI.callTestCase(findTestCase('pages/QA-Audyna/Add Items - Audyna/Click Button Publish Product'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

