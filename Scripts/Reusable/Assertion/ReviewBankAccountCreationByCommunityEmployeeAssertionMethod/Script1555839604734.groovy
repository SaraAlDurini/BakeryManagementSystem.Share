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

String [] SplitArrResult
String FileData
File file
today = new Date()

// Assume that ther is only one row   -   Get first Coulmn value
//Get Row Value
WebUI.click(findTestObject('DynamicWebTables/DynamicWebRow'))

String  RowValue = WebUI.getText(findTestObject('DynamicWebTables/DynamicWebRow'))
println(RowValue)

// رقم الطلب	تاريخ إنشاء الطلب	أسم المخبز
SplitArrResult = RowValue.split(" ")
println(SplitArrResult)

//Get and assert on Actual Req Code
String ActualReqCode = SplitArrResult[0]
println(ActualReqCode)
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\ReqCode.txt')
FileData = file.readLines().toString().replaceAll("\\p{P}","")
assert ActualReqCode.contains(FileData)


//Get and assert on Actual Creation Date
String ActualCreationDate = SplitArrResult[1]
println(ActualCreationDate)
assert ActualCreationDate == today.format('MM/dd/yyyy')


//Get and assert on Actual bakery Name
String ActualbakeryName = SplitArrResult[2]
println(ActualbakeryName)
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\AccName.txt')
FileData =file.readLines().toString().replaceAll("\\p{P}","")
assert ActualbakeryName.contains(FileData)
