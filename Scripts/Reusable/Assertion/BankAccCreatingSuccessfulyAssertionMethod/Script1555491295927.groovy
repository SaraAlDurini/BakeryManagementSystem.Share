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

WebUI.click(findTestObject('BankAccDataField/Page_ (1)/span_   791'))

String SuccessfulMessage = WebUI.getText(findTestObject('BankAccDataField/Page_ (1)/div_     791'))

// تم التنفيذ بنجاح رقم الطلب : 792
println(SuccessfulMessage)

// Assert this is a Successful Message
assert SuccessfulMessage.contains('تم التنفيذ بنجاح')

//Remove any non-digits from a string 
String ReqCode = SuccessfulMessage.replaceAll('[^\\d]', '')

// Save the Req code in Cash 
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\ReqCode.txt')

file.write(ReqCode)

