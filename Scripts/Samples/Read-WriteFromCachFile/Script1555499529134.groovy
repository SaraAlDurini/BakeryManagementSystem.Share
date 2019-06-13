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

// // Write 

// file = new File(File path in my project )
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem\\Cash\\ValidPassword.txt')

// Write "123" in my cash file  
file.write( "123")

// read the data from CSV :'BakeryDataFileDirectorateEmployee' with column 2 and row 1 
// save this data in cash file  
file.write( findTestData('BakeryDataFileDirectorateAndCommodityEmployee').getValue(2, 1))


// // Read 

// file = new File(File path in my project )
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem\\Cash\\ValidPassword.txt')

// read the data from cah file and save it in string to use it in my code 
String ValidPassword = file.readLines()