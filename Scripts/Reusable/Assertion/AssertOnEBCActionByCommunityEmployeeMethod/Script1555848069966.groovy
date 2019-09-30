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

String EBCTableData

File file

//Get Actual Account number from Cash File
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\BankAccountReviewStatus.txt')

String BankAccountReviewstatus = file.readLines()

//Get Actual Account number from Cash File
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\ResultOfAccountNameReview.txt')

String ActualAccountNameStatus = file.readLines()

//Get Actual Account number from Cash File
file = new File('C:\\Users\\smart\\Katalon Studio\\BakeryManagementSystem.Share\\Cash\\ResultOfAccountnumberReview.txt')

String ActualAccountNumberStatus = file.readLines()

// Click on the result table 
//WebUI.click(findTestObject('ReviewAddBankAcc/Page_/TableConfirmationData'))

// Get all data and save it in string EBCTableData
EBCTableData = WebUI.getText(findTestObject('ReviewAddBankAcc/Page_/TableConfirmationData'))

// Split the data on each new line 
String[] SplitArrResult = EBCTableData.split('\n')

//SplitArrResult : [حالة مراجعة الحساب البنكى, تمت المراجعة, نتيجة مراجعة أسم الحساب, صحيح, نتيجة مراجعة رقم الحساب, صحيح] = [5,4,3,2,1,0 ]
// Verify each displayed element by actual action " EBC action " 
// verify حالة مراجعة الحساب البنكى
String BankAccountReviewStatus = SplitArrResult[1]

assert BankAccountReviewstatus.contains(BankAccountReviewStatus)

// verify نتيجة مراجعة أسم الحساب
String ResultOfAccountNameReview = SplitArrResult[3]

assert ActualAccountNameStatus.contains(ResultOfAccountNameReview)

// verify نتيجة مراجعة رقم الحساب
String ResultOfAccountnumberReview = SplitArrResult[5]

assert ActualAccountNumberStatus.contains(ResultOfAccountnumberReview)

// verify button موافقه is clickable 
WebUI.verifyElementClickable(findTestObject('ReviewAddBankAcc/Page_/AcceptButton'))

// verify button رفض is clickable
WebUI.verifyElementClickable(findTestObject('ReviewAddBankAcc/Page_/RejectButton'))

