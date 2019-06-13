package dataBaseConnection

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import groovy.sql.Sql
import java.sql.*

public class ExecuteOracleQueryWithExpectedResult {
	@Keyword

	def  conectsql(String usr, String pass , String Quy , String ExpectedResult) {

		String connectionString
		String[] arr = null
		connectionString = "jdbc:oracle:thin:@10.30.96.151:1521:scbase"
		def sql = Sql.newInstance(connectionString, usr ,pass)

		try {

			sql.eachRow(Quy){  row ->
				println row[0]
				assert ExpectedResult == row[0]
				println "Assertion Pass"
			}
		}
		catch(Exception e) {
		}
		finally {


			sql.close()
		}
	}
}
