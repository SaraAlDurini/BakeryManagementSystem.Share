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
File file
String ExpectedResult

// file = new File(File path in my project )
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\ReqCode.txt')

// read the ReqCode from cash file and save it in string to use it in my query -> the result = [ReqNumber]
String ReqCode = file.readLines()

// Remove all punctuation marks that include all brackets from Req Code 
 ReqCode = ReqCode.replaceAll("\\p{P}","");

// Get REQ_STATUS and verify = 'FR_APRV'
Query = ((('SELECT REQ_STATUS from requests where REQ_CODE = ' + '\'') + ReqCode ) + '\'')
CustomKeywords.'dataBaseConnection.ExecuteOracleQueryWithExpectedResult.conectsql'('bdistribute', '12345678', Query, 'FR_APRV')

// Get REQ_OPERATION and verify = 'ADD'
Query =  ((('SELECT REQ_OPERATION from requests where REQ_CODE = ' + '\'') + ReqCode ) + '\'')
CustomKeywords.'dataBaseConnection.ExecuteOracleQueryWithExpectedResult.conectsql'('bdistribute', '12345678', Query, 'ADD')

// Get EBC_REVIEW_STATUS and verify = '0'
Query = ((('SELECT EBC_REVIEW_STATUS from requests where REQ_CODE = ' + '\'') + ReqCode ) + '\'')
CustomKeywords.'dataBaseConnection.ExecuteOracleQueryWithExpectedResult.conectsql'('bdistribute', '12345678', Query, '0')
