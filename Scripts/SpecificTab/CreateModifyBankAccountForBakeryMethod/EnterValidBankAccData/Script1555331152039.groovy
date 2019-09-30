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


File file
String FileText

WebUI.click(findTestObject('BankAccDataField/Page_ (1)/span__ui-icon ui-icon-triangle-1-s ui-c_1-Select'))

WebUI.click(findTestObject('BankAccDataField/Page_ (1)/li_   -'))

WebUI.click(findTestObject('BankAccDataField/Page_ (1)/div__ui-SelectBranch'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BankAccDataField/Page_ (1)/div__ui-SelectBranch'))

WebUI.click(findTestObject('BankAccDataField/Page_ (1)/li_ (DokkiBranch)'))

// acc numb , read it from cash , convert to string , Remove all punctuation marks 
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\AccNumber.txt')
FileText = file.readLines()
WebUI.setText(findTestObject('CreateMdifyBankAcc/Page_/input_ _formj_idt37j_idt55'), file.readLines().toString().replaceAll("\\p{P}",""))

//acc name , read it from cash , convert to string , Remove all punctuation marks 
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\AccName.txt')
WebUI.setText(findTestObject('BankAccDataField/Page_ (1)/input_ _formj_idt37j_idt57'), file.readLines().toString().replaceAll("\\p{P}",""))

// NID Number, read it from cash , convert to string , Remove all punctuation marks 
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\NIDNumber.txt')

WebUI.setText(findTestObject('BankAccDataField/Page_ (1)/input_   _formj_idt37j_idt59'),file.readLines().toString().replaceAll("\\p{P}",""))

// Note
WebUI.setText(findTestObject('BankAccDataField/Page_ (1)/textarea_ _formj_idt37j_idt61'), 'ملاحظات', FailureHandling.CONTINUE_ON_FAILURE)

// Button click 
WebUI.click(findTestObject('BankAccDataField/Page_ (1)/span__1'))

