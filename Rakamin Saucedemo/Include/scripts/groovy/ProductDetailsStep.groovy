import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class ProductDetailsStep {
	@Given("User is on Homepage")
	def navigateToHomePage() {
		println ("\n User inside navigateToLoginPage")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.saucedemo.com/')
		WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'), 'standard_user')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button'))
	}
	
	@When("User click a product")
	def navigateToProduct() {
		println ("\n User click a product")
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Sauce Labs Backpack'))
	}

	@Then("User can view product details")
	def verifyProductDetails() {
		println ("\n User view product details")
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_carry.allTheThings() with the sleek, st_6ae692'))
		WebUI.verifyTextPresent('carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.',
		false)
		WebUI.closeBrowser()
	}
}
