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

WebUI.callTestCase(findTestCase('page_Home/tc_positive_addToCart'), [:], FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('cart/btn_placeOrder'), 0)

WebUI.click(findTestObject('cart/btn_placeOrder'))

WebUI.verifyElementPresent(findTestObject('cart/modal_placeOrder/h5_titlePlaceOrder'), 0)

WebUI.clearText(findTestObject('cart/modal_placeOrder/input_name'), FailureHandling.OPTIONAL)

WebUI.clearText(findTestObject('cart/modal_placeOrder/input_country'), FailureHandling.OPTIONAL)

WebUI.clearText(findTestObject('cart/modal_placeOrder/input_city'), FailureHandling.OPTIONAL)

WebUI.clearText(findTestObject('cart/modal_placeOrder/input_creditCard'), FailureHandling.OPTIONAL)

WebUI.clearText(findTestObject('cart/modal_placeOrder/input_month'), FailureHandling.OPTIONAL)

WebUI.clearText(findTestObject('cart/modal_placeOrder/input_year'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('cart/modal_placeOrder/btn_purchase'))

if (WebUI.verifyAlertPresent(0) == true) {
    alertText = WebUI.getAlertText()

    WebUI.verifyMatch(alertText, 'Please fill out Name and Creditcard.', false)

    WebUI.delay(3)

    WebUI.acceptAlert()
}

WebUI.refresh()

