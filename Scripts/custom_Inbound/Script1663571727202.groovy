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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-plb.gmf.cloud/login')

WebUI.setText(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Username_username'), 'adminPLB')

WebUI.setEncryptedText(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Password_password'), 'SM/KXVj7ZOFtPaxrpzqfFQ==')

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Password_remember'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/button_Masuk'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/p_Dokumen Kepabeanan'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/p_Dokumen Pemasukan PLB'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Tanggal Pengajuan_form-control'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/span_Sep 2022'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/span_2022'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/span_2021'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/span_February'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/span_4'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input__form-control'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/span_Sep 2022'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/span_2022'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/span_2021'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/span_February'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/span_2'))

WebUI.setText(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Nomor Pengajuan_form-control'), 
    '55')

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Jenis Dokumen_16'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Jenis Dokumen_27IN'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/button_Filter'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/button_Reset'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/button_Filter'))

WebUI.setText(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Lampiran_vgt-input text-center'), 
    '16')

WebUI.setText(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Lampiran_vgt-input text-center_1'), 
    '12')

WebUI.setText(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Lampiran_vgt-input text-center_1_2'), 
    '55')

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Lampiran_vgt-input text-center_1_2_3'))

WebUI.setText(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Lampiran_vgt-input text-center_1_2_3'), 
    'a')

WebUI.setText(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Lampiran_vgt-input text-center_1_2_3_4'), 
    'f')

WebUI.setText(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Lampiran_vgt-input text-center_1_2_3_4_5'), 
    '5')

WebUI.setText(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Lampiran_vgt-input text-center_1_2_3_4_5_6'), 
    '1')

WebUI.setText(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Lampiran_vgt-input text-center_1_2_3_4_5_6_7'), 
    'g')

WebUI.setText(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Lampiran_vgt-input text-center_1_2_3_4_5_6_7_8'), 
    '1')

WebUI.setText(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Lampiran_vgt-input text-center_1_2_3_4_5_6_7_8_9'), 
    '1')

WebUI.setText(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Lampiran_vgt-input text-center_1_2_3_4_5_6_7_8_9_10'), 
    '1')

WebUI.setText(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Search_vgt-input vgt-pull-left'), 
    'garuda')

WebUI.selectOptionByValue(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/select_10 25 50 100'), '25', 
    true)

WebUI.setText(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/input_Nomor Pengajuan_form-control'), 
    '2')

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/span_page'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/span_Next'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/span_Rows per page_chevron left'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/span_Next_chevron right'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/button_Dokumen Pemasukan PLB_btn btn-tool'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/button_Dokumen Pemasukan PLB_btn btn-tool'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/button_CSV'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/button_Excel'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/i_PDF_fa-solid fa-file-pdf'))

WebUI.click(findTestObject('Object Repository/CustomsInbound/Page_GMF PLB REPORT/a_Dashboard'))

