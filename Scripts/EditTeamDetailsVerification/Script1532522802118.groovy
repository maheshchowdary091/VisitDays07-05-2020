import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

CustomKeywords.'com.CommonUtilities.LoginAsDifferentUserPermissions.NavigateToHomePage'()

WebUI.click(findTestObject('HomePageElements/MyTeamLeftNav'))

WebUI.click(findTestObject('TeamManagement/TeamsTab'))

if (!(WebUI.verifyElementPresent(findTestObject('TeamManagement/Teams/CommonObjectForAllTeamsInTheList'), 0, FailureHandling.OPTIONAL))) {
	WebUI.callTestCase(findTestCase('CreateTeamUserFlowToNotSetTeamPhoto'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.waitForElementPresent(findTestObject('TeamManagement/Teams/CommonObjectForAllTeamsInTheList'), 0)

WebUI.click(findTestObject('TeamManagement/Teams/CommonObjectForAllTeamsInTheList'))

TeamNameBeforeEdit = WebUI.getText(findTestObject('TeamManagement/Teams/TeamNameInTeamDetailsPage'))

WebUI.click(findTestObject('TeamManagement/Teams/EditButtonInTeamNameField'))

WebUI.clearText(findTestObject('TeamManagement/Teams/TeamNameTextBoxInTeamDetailsPage'))

//WebUI.click(findTestObject('TeamManagement/Teams/TeamNameTextBoxInTeamDetailsPage'))
Random var = new Random()

int random_number = var.nextInt(1000)

WebUI.sendKeys(findTestObject('TeamManagement/Teams/TeamNameTextBoxInTeamDetailsPage'), TeamNameBeforeEdit + random_number)

WebUI.waitForElementClickable(findTestObject('TeamManagement/Teams/SaveButtonInTeamDetailsPage'), 0)

WebUI.click(findTestObject('TeamManagement/Teams/SaveButtonInTeamDetailsPage'))

WebUI.verifyElementText(findTestObject('TeamManagement/Teams/TeamNameInTeamDetailsPage'), TeamNameBeforeEdit + random_number)

TeamBioBeforeEdit = WebUI.getText(findTestObject('TeamManagement/Teams/TeamBioNameInTeamDetailsPage'))

WebUI.click(findTestObject('TeamManagement/Teams/EditButtonInTeamBioField'))

WebUI.clearText(findTestObject('TeamManagement/Teams/TeamBioTextFieldInTeamDetailsPage'))

WebUI.sendKeys(findTestObject('TeamManagement/Teams/TeamBioTextFieldInTeamDetailsPage'), TeamBioBeforeEdit + random_number)

WebUI.click(findTestObject('TeamManagement/Teams/SaveButtonInTeamDetailsPage'))

WebUI.verifyElementText(findTestObject('TeamManagement/Teams/TeamBioNameInTeamDetailsPage'), TeamBioBeforeEdit + random_number)

if (WebUI.verifyElementPresent(findTestObject('TeamManagement/Teams/ImageFieldInTeamPhotoDivisionInTeamDetailsPage'), 8,
FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('TeamManagement/Teams/EditButtonInTeamPhotoDivisionInTeamDetailsPage'))

	WebUI.click(findTestObject('TeamManagement/Teams/UploadNewButtonInTeamPhotoDivisionInTeamDetailsPage'))

	String userDir = System.getProperty('user.dir')

	WebUI.uploadFile(findTestObject('Object Repository/TeamManagement/Teams/UploadZoneInTeamPhotoDivisionInTeamDetailsPage'),
			userDir + '\\VisitTypePhoto\\AdminProfilePicture.png')

	WebUI.waitForElementVisible(findTestObject('TeamManagement/Teams/ApplyButtonInTeamPhotoDivisionInTeamDetalsPage'), 5)

	WebUI.click(findTestObject('TeamManagement/Teams/ApplyButtonInTeamPhotoDivisionInTeamDetalsPage'))

	WebUI.click(findTestObject('TeamManagement/Teams/SaveButtonInTeamDetailsPage'))

	WebUI.waitForElementPresent(findTestObject('TeamManagement/Teams/ImageFieldInTeamPhotoDivisionInTeamDetailsPage'), 0)
} else {
	WebUI.click(findTestObject('TeamManagement/Teams/EditButtonInTeamPhotoDivisionInTeamDetailsPage'))

	WebUI.click(findTestObject('TeamManagement/Teams/AddNowButonInTeamPhotoDivision'))

	String userDir = System.getProperty('user.dir')

	println(userDir + '\\VisitTypePhoto\\AdminProfilePicture.png')

	WebUI.uploadFile(findTestObject('Object Repository/ElementsUnderProfileAvatar/My Profile/UploadZoneInAdminProfilePhoto'),
			userDir + '\\VisitTypePhoto\\AdminProfilePicture.png')

	WebUI.waitForElementVisible(findTestObject('TeamManagement/Teams/ApplyButtonInTeamPhotoDivisionInTeamDetalsPage'), 5)

	WebUI.click(findTestObject('TeamManagement/Teams/ApplyButtonInTeamPhotoDivisionInTeamDetalsPage'))

	WebUI.click(findTestObject('TeamManagement/Teams/SaveButtonInTeamDetailsPage'))

	WebUI.waitForElementPresent(findTestObject('TeamManagement/Teams/ImageFieldInTeamPhotoDivisionInTeamDetailsPage'), 0)
}

WebUI.click(findTestObject('TeamManagement/Teams/EditButtonInMembersFieldDivisionInTeamDetailsPage'))

WebDriver driver = DriverFactory.getWebDriver()

int NumberofExistingUsersBeforeAdd = driver.findElements(By.xpath('//div[text()="Members"]/../../..//div[@class="avatar margin-r-5"]')).size()

WebUI.click(findTestObject('TeamManagement/Teams/UpdateMembersButtonInMembersDivisionInTeamDetailsPage'))

WebUI.delay(3)

int CountOfUsersInTheList = driver.findElements(By.xpath('//i[text()=\'add_circle_outline\']')).size()

Random refvar = new Random()

int random = refvar.nextInt(CountOfUsersInTheList)

if (random == 0) {
	random = (random + 1)
}

driver.findElement(By.xpath(('(//i[text()=\'add_circle_outline\'])[' + random) + ']')).click()

WebUI.click(findTestObject('TeamManagement/Teams/DoneButtonInUpdateTeamMembersModal'))

WebUI.waitForElementNotPresent(findTestObject('TeamManagement/Teams/DoneButtonInUpdateTeamMembersModal'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('TeamManagement/Teams/SaveButtonInTeamDetailsPage'))

WebUI.waitForElementPresent(findTestObject('TeamManagement/Teams/EditButtonInMembersFieldDivisionInTeamDetailsPage'), 0)

int NumberofusersafterAddingaMember = driver.findElements(By.xpath('//div[text()=\'Members\']/..//div[@class=\'avatar margin-r-5\']')).size()

WebUI.verifyMatch(NumberofusersafterAddingaMember.toString(), (NumberofExistingUsersBeforeAdd + 1).toString(), false)

