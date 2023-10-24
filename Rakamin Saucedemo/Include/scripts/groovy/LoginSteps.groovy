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
import groovy.swing.impl.DefaultAction



class LoginSteps {

	@Given("User is on Swag Labs login page")
	def navigateToLoginPage() {
		println ("\n User inside navigateToLoginPage")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.saucedemo.com/')
	}

	@When("User input username")
	def enterUsername() {
		println ("\n User inside enterUsername")
		WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')
	}

	@And("User input password")
	def enterPassword() {
		println ("\n User inside enterPassword")
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')
	}

	@And("User click login button")
	def clickLogin() {
		println ("/n User inside clickLogin")
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button'))
	}

	@Then("User navigated to Homepage")
	def verifyHomePage() {
		println ("\n User inside Home Page")
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Swag Labs'))
		WebUI.verifyTextPresent('Swag Labs', false)
		WebUI.closeBrowser()
	}

	@And("User input invalid password")
	def enterInvalidPassword() {
		println ("\n User inside enterInvalidPassword")
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password (1)'), 'qcu24s4901FxU7svjRzB3Q==')
	}

	@Then("User get error message")
	def verifyErrorLoginMessage() {
		println ("\n User view error message")
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/h3_Epic sadface Username and password do no_0e8909'))
		WebUI.verifyTextPresent('Epic sadface: Username and password do not match any user in this service', false)
		WebUI.closeBrowser()
	}
}