import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable



// Open Browser
WebUI.openBrowser('')

// navigate To Bakery Url
WebUI.navigateToUrl('http://81.29.102.138:7001/bakeriessystem/login.jsf')

// Maximize window
WebUI.maximizeWindow()

// read valid user name from CSV
WebUI.setText(findTestObject('Object Repository/Login/Page_/input__username'), findTestData('BakeryDataFileDirectorateAndCommodityEmployee').getValue(1, 1))

// read valid password from CSV ,encrypted password : '4nvbrPglk7k='
WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_/input__password'),  findTestData('BakeryDataFileDirectorateAndCommodityEmployee').getValue(2, 1))

// Click on login button
WebUI.click(findTestObject('Object Repository/Login/Page_/span_'))

//
WebUI.waitForPageLoad(3)
