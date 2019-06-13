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


String TargetStinig
String[] SplitArrResult

// Remove all punctuation marks that include all brackets from TargetStinig
 TargetStinig = TargetStinig.replaceAll("\\p{P}","")
 
 // Remove all space
 TargetStinig = TargetStinig.replaceAll(" ","");
 
 // Remove all numbers 
 TargetStinig = TargetStinig.replaceAll("[^0-9]", "")
 
 // Remove all Charachter 
 TargetStinig = TargetStinig.replaceAll("[^A-Z]","")
 
 //Remove any non-digits from a string 
 TargetStinig = TargetStinig.replaceAll("[^\\d]", "" )
 
 // Split the target string in each ':' 
 SplitArrResult = TargetStinig.split(':')
 
String Res1 = SplitArrResult[0] 

String Res2 =SplitArrResult[1]
