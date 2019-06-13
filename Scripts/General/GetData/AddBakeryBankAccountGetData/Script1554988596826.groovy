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
import com.sun.xml.internal.org.jvnet.mimepull.DataFile as DataFile
import internal.GlobalVariable as GlobalVariable
import sun.swing.BakedArrayList as BakedArrayList
import org.openqa.selenium.Keys as Keys

String Query

File file

// Get Bakery Code Dose not have bank account then save it in BakeryDosenotHaveBankAccount
Query = 'select * from base_bakery where BAKERY_CODE not in (select bakery_code from bakery_ach_data) and base_bakery.governorate_code=03'

println(Query)

CustomKeywords.'dataBaseConnection.GetOracleQueryResult.conectsql'('bdistribute', '12345678', Query, 'C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem\\Cash\\BakeryDosenotHaveBankAccount.txt')

// read  User name from CSV then save it  in cash 
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem\\Cash\\ValidUserName.txt')

file.write( findTestData('BakeryDataFileDirectorateAndCommodityEmployee').getValue(1, 1))

// read  password from CSV then save it  in cash

file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem\\Cash\\ValidPassword.txt')

file.write( findTestData('BakeryDataFileDirectorateAndCommodityEmployee').getValue(2, 1))


// read  Acc number  from CSV then save it  in cash

file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem\\Cash\\AccNumber.txt')

file.write( findTestData('BakeryDataFileDirectorateAndCommodityEmployee').getValue(6, 1))

// read  Acc Name  from CSV then save it  in cash

file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem\\Cash\\AccName.txt')

file.write( findTestData('BakeryDataFileDirectorateAndCommodityEmployee').getValue(7, 1))

// read  NID Number  from CSV then save it  in cash

file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem\\Cash\\NIDNumber.txt')
file.write("28502063200094")
// Or get it from CSV 
//file.write( findTestData('BakeryDataFileDirectorateAndCommodityEmployee').getValue(8, 4))