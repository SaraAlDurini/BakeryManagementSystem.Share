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

def name = "John"
def list = [5, 10, 15, 20]

// Assert if equal without error message 
assert name == "John"

//  Assert if equal with display Error message when fail : 
assert name == "Peter" : "Name should be John"

// Assert if list equal list 
assert list == [35, 44, 67, 88]

// Assert if String contains String 
assert name.contains(" ")

// == equal
assert 1 + 2 == 3

// != different
assert 3 != 4

// < less than 
assert -2 < 3

// <=  less than or equal
assert 2 <= 2

// >   greater than
assert 5 > 1

// >=  greater than or equal
assert 5 >= -2