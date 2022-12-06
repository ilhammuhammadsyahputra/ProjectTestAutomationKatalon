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

WebUI.navigateToUrl('https://www.ruparupa.com/')

WebUI.click(findTestObject('Object Repository/Page_Ruparupa  No.1 Home, Living  Furniture_5df54e/button_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Ruparupa  No.1 Home, Living  Furniture_5df54e/input_Daftar_email'), 
    'imsyahputra5396@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Ruparupa  No.1 Home, Living  Furniture_5df54e/input_Daftar_password'), 
    '2KHI+S/QeR+7q+aUBpr5sA==')

WebUI.click(findTestObject('Object Repository/Page_Ruparupa  No.1 Home, Living  Furniture_5df54e/button_Masuk_1'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa  No.1 Home, Living  Furniture_5df54e/img_concat(id(, , close-btn, , ))_close-btn'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa  No.1 Home, Living  Furniture_5df54e/button_Beli 1 Gratis 1'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa  No.1 Home, Living  Furniture_5df54e/img_Last Chance To Buy_homepagePromoBrandPr_379fdb'))

WebUI.click(findTestObject('Object Repository/Page_Jual Susino Payung Lipat 53 5 Cm Terba_ef6c75/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Jual Susino Payung Lipat 53 5 Cm Terba_ef6c75/button_Tambah ke keranjang'))

WebUI.click(findTestObject('Object Repository/Page_Jual Susino Payung Lipat 53 5 Cm Terba_ef6c75/button_Lanjut Ke Keranjang'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa  No.1 Home, Living  Furniture_5df54e/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa  No.1 Home, Living  Furniture_5df54e/button_Lanjutkan ke Pembayaran'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ruparupa.com Payment/select_jktjktjkt Tambah Alamat Baru'), 
    'add', true)

WebUI.setText(findTestObject('Object Repository/Page_Ruparupa.com Payment/input_Tambah Alamat_first_name'), 'IMS')

WebUI.setText(findTestObject('Object Repository/Page_Ruparupa.com Payment/input_Tambah Alamat_address_name'), 'Jakarta')

WebUI.setText(findTestObject('Object Repository/Page_Ruparupa.com Payment/input_Tambah Alamat_phone'), '085265545599')

WebUI.setText(findTestObject('Object Repository/Page_Ruparupa.com Payment/textarea_Jakarta'), 'Jakarta')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ruparupa.com Payment/select_-- Provinsi --BALIBANGKA BELITUNGBAN_85ab2f'), 
    '490', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ruparupa.com Payment/select_-- Kota --KAB. KEPULAUAN SERIBUKOTA._50e171'), 
    '571', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ruparupa.com Payment/select_-- Kecamatan --TANAH ABANGSENENSAWAH_293385'), 
    '6982', true)

WebUI.setText(findTestObject('Object Repository/Page_Ruparupa.com Payment/input_Jakarta_post_code'), '12345')

WebUI.click(findTestObject('Object Repository/Page_Ruparupa.com Payment/button_Simpan'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa.com Payment/button_Pilih Metode Pemesanan'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa.com Payment/i_Pilih Jenis Pengiriman_anticon icon-down'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa.com Payment/td_regular'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa.com Payment/button_Pilih Metode Pembayaran'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa.com Payment/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa.com Payment/label_Bank Transfer'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa.com Payment/label'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa.com Payment/button_Bayar Sekarang'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa.com Payment/button_Lanjut'))

WebUI.click(findTestObject('Object Repository/Page_Ruparupa.com Payment/button_Mengerti'))

WebUI.closeBrowser()

