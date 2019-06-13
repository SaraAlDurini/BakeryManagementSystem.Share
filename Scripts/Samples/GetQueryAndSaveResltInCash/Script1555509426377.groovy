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


String Query 


// Write your Get query in Query = 
// Example of Get Query =  'select * from base_bakery where BAKERY_CODE not in (select bakery_code from bakery_ach_data) and base_bakery.governorate_code=03'
Query = 'select * from base_bakery where BAKERY_CODE not in (select bakery_code from bakery_ach_data) and base_bakery.governorate_code=03'

// Call the connection (UserName , Password , Query , The cash file to save the query result on it )
CustomKeywords.'dataBaseConnection.GetOracleQueryResult.conectsql'('SupplyCard', 'smart999', Query,"GetQueryResult.txt")

