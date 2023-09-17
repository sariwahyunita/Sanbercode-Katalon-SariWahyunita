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

WebUI.verifyElementPresent(findTestObject('navbar/a_contact'), 0)

WebUI.click(findTestObject('navbar/a_contact'))

WebUI.verifyElementPresent(findTestObject('modal_contact/h5_titleContact'), 0)

WebUI.setText(findTestObject('modal_contact/input_contactEmail'), email)

WebUI.setText(findTestObject('modal_contact/input_contactName'), name)

WebUI.setText(findTestObject('modal_contact/input_message'), message)

WebUI.click(findTestObject('modal_contact/btn_sendMessage'))

if (WebUI.verifyAlertPresent(0) == true) {
    alertText = WebUI.getAlertText()

    WebUI.verifyMatch(alertText, 'Thanks for the message!!', false)

    WebUI.delay(3)
}

WebUI.refresh()

