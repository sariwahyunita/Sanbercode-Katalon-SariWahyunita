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

WebUI.verifyElementPresent(findTestObject('navbar/a_navbarTitle'), 0)

WebUI.callTestCase(findTestCase('login/verifyUserHaveNotLogin'), [:], FailureHandling.OPTIONAL)

WebUI.click(findTestObject('navbar/a_logIn'))

WebUI.verifyElementPresent(findTestObject('modal_logIn/h5_titleLogin'), 0)

WebUI.setText(findTestObject('modal_logIn/input_username'), username)

WebUI.setText(findTestObject('modal_logIn/input_password'), password)

WebUI.click(findTestObject('modal_logIn/btn_logIn'))

WebUI.verifyElementPresent(findTestObject('navbar/a_nameofuser'), 0)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('navbar/a_nameofuser'), WebUI.concatenate(((['Welcome ', username]) as String[]), 
        FailureHandling.STOP_ON_FAILURE))

