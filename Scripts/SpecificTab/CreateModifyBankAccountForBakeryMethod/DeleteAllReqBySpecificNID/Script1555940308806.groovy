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

// Query example
Query = "begin for ch in (select REQ_CODE from REQ_BAKERY_ACH_DATA  where ACC_OWNER_NID='28502063200094') loop  delete   REQ_ACTIVITY where REQ_CODE =ch.REQ_CODE ; delete from REQ_BAKERY_ACH_DATA where REQ_CODE = ch.REQ_CODE; delete from REQUESTS   where REQ_CODE = ch.REQ_CODE;commit; end loop; end;"

// Call Update Query with connection (UserName , Password , Query )
CustomKeywords.'dataBaseConnection.UpdateOracleQuery.conectsql'('bdistribute', '12345678', Query)