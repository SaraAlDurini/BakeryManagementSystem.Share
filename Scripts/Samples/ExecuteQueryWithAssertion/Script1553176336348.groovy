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

String ExpectedResult

// Write your Get query in Query =
// Example of Select Query
Query = ((('SELECT CARD_CODE FROM accounts_blocked WHERE INSIDE_CODE = ' + '\'') + '011101E2002775D9') + '\'')


// Example of Expected result ' hard code' 
ExpectedResult = '112002522461'

// Example of Expected result ' read from Cash '
file = new File('cash path')
ExpectedResult = file.readLines()


// Example of Expected result ' read from CSV '
ExpectedResult = ( findTestData('BakeryDataFileDirectorateAndCommodityEmployee').getValue(2, 1))

// Call the cnnection (UserName , Password , Query , The Expected Result to copare it with actual query result  )
CustomKeywords.'dataBaseConnection.ExecuteOracleQueryWithExpectedResult.conectsql'('SupplyCard', 'smart999', Query, ExpectedResult)

