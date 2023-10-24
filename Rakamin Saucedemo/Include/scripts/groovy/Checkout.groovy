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

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class Checkout {
	
	@When("User click add to cart item 1")
	def clickAddToCartItem1() {
		println ("\n User Adding item 1 to the cart")
		WebUI.click(findTestObject('Page_Swag Labs/button_Add to cart'))
	}
	
	@And("User click add to cart item 2")
	def clickAddToCartItem2() {
		println ("\n User Adding item 2 to the cart")
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_1'))
	}
	
	@And("User click cart button")
	def clickCartButton() {
		println ("\n User click cart button")
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_2'))
	}
	
	
	@And("User click checkout button")
	def clickCheckout() {
		println ("\n User click checkout button")
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Checkout'))
	}
	
	@And("User input first name")
	def enterFirstName() {
		println ("\n User inside enterFirstName")
		WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_firstName'), 'Steve')
	}
	
	@And("User input last name")
	def enterLastName() {
		println ("\n User inside enterLastName")
		WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_lastName'), 'Gates')
	}
	
	@And("User input postal code")
	def enterZipPostalCode() {
		println ("\n User inside enterZip/PostalCode")
		WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_postalCode'), '199999')
	}
	
	@And("User click continue")
	def clickContinue() {
		println ("\n User clickContinue")
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Cancel_continue'))
	}
	
	@And("User click finish")
	def clickFinish() {
		println ("\n User clickFinish")
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Finish'))
	}
	
	@Then("User can view thank you message")
	def verifyThankYouMessage() {
		println ("\n User can viewThankYoumessage")
		WebUI.click(findTestObject('Object Repository/Page_Swag Labs/h2_Thank you for your order'))
		WebUI.verifyTextPresent('Thank you for your order!', false)
		WebUI.closeBrowser()
	}
}
