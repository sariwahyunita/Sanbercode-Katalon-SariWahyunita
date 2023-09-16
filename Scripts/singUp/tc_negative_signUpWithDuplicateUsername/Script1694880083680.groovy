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

WebUI.verifyElementPresent(findTestObject('navbar/a_signUp'), 0)

WebUI.click(findTestObject('navbar/a_signUp'))

WebUI.verifyElementPresent(findTestObject('modal_signUp/h5_titleSignUp'), 0)

WebUI.setText(findTestObject('modal_signUp/input_username'), existingUsername)

WebUI.setText(findTestObject('modal_signUp/input_password'), 'password')

WebUI.click(findTestObject('modal_signUp/btn_signUp'))

if (WebUI.verifyAlertPresent(0) == true) {
    alertText = WebUI.getAlertText()

    WebUI.verifyMatch(alertText, 'This user already exist.', false)

    WebUI.delay(3)

    WebUI.dismissAlert()
}

WebUI.refresh()

