import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//katalon cura health service
//steps
//open browser

WebUI.openBrowser("")

//Give the url

WebUI.navigateToUrl("https://katalon-demo-cura.herokuapp.com")

//click on make appointment

WebUI.click(findTestObject('Object Repository/Cura-OR/Page_CURA Healthcare Service/h2_Make Appointment'))

//set USer name

WebUI.setText(findTestObject('Object Repository/Cura-OR/Page_CURA Healthcare Service/input_Username_username'),null)

//set password

WebUI.setText(findTestObject('Object Repository/Cura-OR/Page_CURA Healthcare Service/input_Password_password'),null)

//click on login button

WebUI.click(findTestObject('Object Repository/Cura-OR/Page_CURA Healthcare Service/button_Login'))

//verify the make appointment element is present

WebUI.verifyElementPresent()findTestObject('Object Repository/Cura-OR/Page_CURA Healthcare Service/h2_Make Appointment'),0)

//close browser

WebUI.closeBrowser()






