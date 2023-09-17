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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

if (filter == 'categories') {
    WebUI.verifyElementPresent(findTestObject('home/sidebar/a_categories'), 0)

    WebUI.click(findTestObject('home/sidebar/a_categories'))

    WebUI.verifyElementPresent(findTestObject('home/p_article'), 0)

    countOfElements = WebUiCommonHelper.findWebElements(findTestObject('home/p_article'), 5).size()

    WebUI.verifyEqual(countOfElements, countDataInFirstPage)
} else if (filter == 'phone') {
    WebUI.verifyElementPresent(findTestObject('home/sidebar/a_Phones'), 0)

    WebUI.click(findTestObject('home/sidebar/a_Phones'))
	
	WebUI.verifyElementPresent(findTestObject('home/p_article'), 0)
	
	countOfElements = WebUiCommonHelper.findWebElements(findTestObject('home/p_article'), 5).size()
	
	WebUI.verifyEqual(countOfElements, countDataInFirstPage)
} else if (filter == 'monitor') {
    WebUI.verifyElementPresent(findTestObject('home/sidebar/a_Monitors'), 0)

    WebUI.click(findTestObject('home/sidebar/a_Monitors'))
	
	WebUI.verifyElementPresent(findTestObject('home/p_article'), 0)
	
	countOfElements = WebUiCommonHelper.findWebElements(findTestObject('home/p_article'), 5).size()
	
	WebUI.verifyEqual(countOfElements, countDataInFirstPage)
} else if (filter == 'laptop') {
    WebUI.verifyElementPresent(findTestObject('home/sidebar/a_Laptops'), 0)

    WebUI.click(findTestObject('home/sidebar/a_Laptops'))
	
	WebUI.verifyElementPresent(findTestObject('home/p_article'), 0)
	
	countOfElements = WebUiCommonHelper.findWebElements(findTestObject('home/p_article'), 5).size()
	
	WebUI.verifyEqual(countOfElements, countDataInFirstPage)
}

