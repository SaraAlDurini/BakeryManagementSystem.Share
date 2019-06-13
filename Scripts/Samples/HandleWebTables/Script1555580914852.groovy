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
import groovy.time.TimeCategory

// Assume that there is only one row  

// Check DynamicWebTables in Object Repository
// 'To locate table'  :::
//  (By.xpath('//table/tbody')

// 'To locate rows of table  :::
// role = row
// tagName= 'tr' , tag = tr
// xpath =//table/tbody/tr

//'To locate columns data  :::
// role = gridcell
// tagName= 'td' , tag = td
// xpath =//table/tbody/tr/td


//'To locate columns header :::
//tagName = 'th'  , tag = th

//Example :::  

//Click first Coulmn value 
WebUI.click(findTestObject('ReviewAddBankAcc/Page_/DynamicWebColumn'))

//Get first Coulmn value
String FirstCoulmnValue = WebUI.getText(findTestObject('ReviewAddBankAcc/Page_/DynamicWebColumn'))

//Click Row Value 
WebUI.click(findTestObject('DynamicWebTables/DynamicWebRow'))

//Get Row Value
String  RowValue = WebUI.getText(findTestObject('DynamicWebTables/DynamicWebRow'))


