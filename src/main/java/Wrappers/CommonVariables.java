package Wrappers;

public class CommonVariables {

	public static final String antiCaptchaUrl = "https://6dvmoxagqk.execute-api.ap-south-1.amazonaws.com/dev/captchabreaker";
	public static final String baseUrl = "https://dev-helpdesk.vakilsearch.com";
	public static final String saveFileAsPDF = "E:\\VS-support-tools\\Testing\\Selenium-Java\\VSProcessAutomation\\src\\main\\resources\\SaveAsPDF.exe";
	public static final String fileUpload = "E:\\VS-support-tools\\Testing\\Selenium-Java\\VSProcessAutomation\\src\\main\\resources\\FileUpload.exe";
	public static final String replaceFileAsPDF = "E:\\VS-support-tools\\Testing\\Selenium-Java\\VSProcessAutomation\\src\\main\\resources\\Print_ReplaceAsPDF.exe";
	public static final String customerDBUrl = "" + baseUrl + "/ticket_show_page/";
	public static final String cRMAgentsUrl = "" + baseUrl + "/helpdesk/new_tickets/";
	public static final String mcaUrl = "https://www.mca.gov.in/mcafoportal/viewCompanyMasterData.do";
	public static final String psaUrl = "https://www.psaonline.utiitsl.com/PsaLogin/getquery.do?actionType=getITDQuery";
	public static final String gstRegistrationUrl = "https://reg.gst.gov.in/registration/";
	public static final String filePath = "smb://14.140.167.188/Vakilsearch/";
	public static final String directFilePath = "\\192.168.1.9\\VakilSearch\\";
	public static String gstKarnatakaStateJurisdictionData = "E:\\VS-support-tools\\Testing\\Selenium-Java\\VSProcessAutomation\\src\\main\\resources\\State_Jurisdictions.xls";
	public static final int WAIT_SECONDS = 5;
	public static final int SERVER_TIMEOUT = 3;
	public static final int DISAPPEAR_TIMEOUT = 30;
	public static final double DOWNLOAD_WAIT_SECONDS = 30.0;
	public static final double INC_WAIT_SECONDS = 20.0;
	public static final String userName = "sign_in[email_id]";
	public static final String userPassword = "sign_in[password]";
	public static final String sAgentUserName = "vinod@vakilsearch.com";
	public static final String sAgentPwd = "VakilSearch@@";
	public static final String sSureshBabuAgentPwd = "vakilsearch@vs";
	public static final String sNirmalaAgentPwd = "Nirmala@12";
	public static final String sVijayAgentPwd = "Vijay@123";
	public static final String sManoChitraAgentPwd = "vakil@2019";
	public static final String sAarthiAgentPwd = "vakilsearch@123";
	public static final String sMeenaAgentPwd = "vakilsearch@123";
	public static final String sDevanandhiniAgentPwd = "vakilsearch@123";
	public static final String sRenukaAgentPwd = "Renu@123";
	public static final String loadMoreLink = "//*[contains(text(),'LOAD MORE MESSAGES')]";
	public static String companyRegistrationType_GST;
	public static final String COMMITBUTTON = "commit";
	public static String businessTypeFieldName = "Business Type";
	public static String businessCompanyPanFieldName = "Company PAN";
	public static String authorizedPersonFieldName = "Select Authorized Person";
	public static String authorizedCompanyFieldName = "Company Name";
	public static String authorizedLLPCompanyFieldName = "LLP Name";
	public static String CINFieldName = "CIN Number";
	public static final String businessDetailsTab = "Business Details";
	public static final String authorizedPersonDetailsTab = "Authorized Person";
	public static final String deliverablesTab = "Deliverables";
	public static final String authorisedSignatoryDetailsTab = "Authorised Signatory";
	public static final String PATH_LEFT_MENU_PATH = "@class='nav nav-tabs ticket-tabs'";
	public static final String officeAddressDetailsTab = "Office Address";
	public static final String BTN_ADD_COMPANY_TAB = "@class='nav nav-tabs multistepnav multicompany'";
	public static final String BTN_ADD_applicant_TAB = "@class='nav nav-tabs multistepnav multikeypeople'";

	// Office address details
	public static String buildingTypeFieldName = "Office Building Type";
	public static String addressLine1FieldName = "Address Line 1";
	public static String addressLine2FieldName = "Address Line 2";
	public static String officeAddressDistrictFieldName = "District";
	public static String officeAddressCityFieldName = "City";
	public static String officeAddressStateFieldName = "State";
	public static String officeAddressCountryFieldName = "Country";
	public static String proprietorOfficeAddressCountryFieldName = "Country";
	public static String officeAddressPincodeFieldName = "Pincode";
	public static String PATH_TRN_NUMBER = "//*[@class='alert alert-success']";

	// Key people details
	public static final String applicantDetailsTab = "Applicant Details";
	public static final String proprietorDetailsTab = "Proprietor Detail";
	public static String applicantName = "applicantName";
	public static String applicantNameFieldName = "Name as per PAN";
	public static String applicantNameIfAuthorizedPersonFieldName = "Name as per PAN";
	public static String applicantMobileNoFieldName = "Mobile Number";
	public static String proprietorFirmNameFieldName = "Proprietorship Firm Name";
	public static String proprietorNameFieldName = "Name";
	public static String proprietorMobileNoFieldName = "Mobile ";
	public static String applicantEmailId = "applicantEmailId";
	public static String applicantEmailIdFieldName = "Email ID";
	public static String applicantDOBFieldName = "Date of Birth";
	public static String applicantPan = "applicantPan";
	public static String applicantPanFieldName = "PAN";
	public static String proprietorPanFieldName = "Pan";
	public static String proprietorDesignationFieldName = "Designation";
	public static String applicantAddressLine1 = "applicantAddressLine1";
	public static String applicantAddressLine1FieldName = "Address Line 1";
	public static String applicantAddressLine2 = "applicantAddressLine2";
	public static String applicantAddressLine2FieldName = "Address Line 2";
	public static String applicantCity = "applicantCity";
	public static String applicantCityFieldName = "City";
	public static String applicantState = "applicantState";
	public static String applicantStateFieldName = "State";
	public static String applicantCountry = "applicantCountry";
	public static String applicantCountryFieldName = "Country";
	public static String applicantPincode = "applicantPincode";
	public static String applicantPincodeFieldName = "Pincode";
	public static final String panVerificationFieldName = "//*[contains(text(),' Income Tax Department Level PAN Query ')]/following::input[1]";
	public static final String PANVERIFICATIONSUBMIT = "//*[@value='SUBMIT']";
	public static String applicantPanNoFieldName = "PAN No.";
	public static String applicantFirstNameFieldName = "Applicant First Name";
	public static String applicantMidNameFieldName = "Applicant MidName";
	public static String applicantSurNameFieldName = "Applicant SurName";
	public static String applicantFatherFirstName = "applicantFatherFirstName";
	public static String applicantFatherFirstNameFieldName = "\"Father's First Name\"";
	public static String applicantFatherMidName = "applicantFatherMidName";
	public static String applicantFatherMidNameFieldName = "\"Father\'s MidName\"";
	public static String applicantFatherSurName = "applicantFatherSurName";
	public static String applicantFatherSurNameFieldName = "\"Father\'s SurName\"";
	public static String applicantGenderFieldName = "Gender ";
	public static String mcaCINFieldName = "//*[contains(text(),'Company CIN/FCRN/LLPIN/FLLPIN')]/following::input[1]";
	public static String mcaCaptchaFieldName = "	//*[contains(text(),'Enter Characters shown below')]/following::input[1]";
	public static String PATH_MCA_CAPTCHA = "//img[@id='captcha']";
	public static String PATH_MCA_CAPTCHA_ERROR_OVERLAY = "//div[@id='msg_overlay']";
	public static String PATH_MCA_CAPTCHA_ERROR_OVERLAY_CLOSE = "//a[@id='msgboxclose']";
	public static final String MCASUBMIT = "//*[@value='Submit']";
	public static String PATH_MCADINNOS_PREFIX = "//div[@id='signatories']/table[@class='result-forms']/tbody/tr[not(contains(@class,'table-header'))]";
	public static String PATH_MCADINNOS_SUFFIX = "/td[@id='tdShowDirectorMasterdata']/a[@id='aShowDirectorMasterdata']";
	public static String PATH_MCADIRECTOR_NAME_SUFFIX = "/td[2]";
	public static String dateOfIncorporationFieldName = " Date of Incorporation";
	public static String rocCodeFieldName = "ROC Code";
	public static String regNoFieldName = " Registration Number";
	public static String companyCatFieldName = " Company Category";
	public static String companySubCatFieldName = " Company SubCategory";
	public static String companyClassFieldName = " Class of Company ";
	public static String authCapitalFieldName = "Authorised Capital(Rs)";
	public static String paidUpCapitalFieldName = "Paid up Capital(Rs)";
	public static String noOfMembersFieldName = "Number of Members(Applicable in case of company without Share Capital)";
	public static String regAddressFieldName = "Registered Address";
	public static String otherAddressFieldName = "Address other than R/o where all or any books of account and papers are maintained";
	public static String emailIdFieldName = "Email Id";
	public static String listedOrNotFieldName = "Whether Listed or not";
	public static String activeComplianceFieldName = "ACTIVE compliance";
	public static String isSuspendedFieldName = "Suspended at stock exchange";
	public static String agmDateFieldName = " Date of last AGM";
	public static String balSheetDateFieldName = " Date of Balance Sheet";
	public static String companyStatusFieldName = " Company Status(for efiling)";
	public static String noOfPartnersFieldName = "Number of Partners";
	public static String noOfDesignatedPartnersFieldName = "Number of Designated Partners";
	public static String previousCompanyDetailsFieldName = "Previous firm/ company details, if applicable";
	public static String totOblContFieldName = "Total Obligation of Contribution";
	public static String mainDivisionFieldName = "Main division of business activity to be carried out in India";
	public static String mainDivisionDescFieldName = "Description of main division";
	public static String solvencyFieldName = "Date of last financial year end date for which Statement of Accounts and Solvency filed";
	public static String annualReturnFieldName = "Date of last financial year end date for which Annual Return filed";
	public static String llpStatusFieldName = "LLP Status";
	public static String gstSucessPopup = "//*[@id=\"newRegForm\"]/h4/span";

	// GST registration home page
	public static String PATH_HOME_FORWHOM = "//*[contains(text(),'I am a')]/following::select[1]";
	public static String PATH_HOME_OFFICEADDRESS_STATE = "//*[contains(text(),'State / UT')]/following::select[1]";
	public static String PATH_HOME_OFFICEADDRESS_DISTRICT = "//*[contains(text(),'District')]/following::select[1]";
	public static String PATH_HOME_OFFICEADDRESS_DISTRICT_TEXT = "//*[@id=\"dst\"]";
	public static String PATH_HOME_BUSINESSNAME = "//*[contains(text(),'Legal Name of the Business')]/following::input[1]";
	public static String PATH_HOME_PAN = "//*[contains(text(),'Permanent Account Number')]/following::input[1]";
	public static String PATH_HOME_EMAILID = "//*[contains(text(),'Email Address')]/following::input[1]";
	public static String PATH_HOME_MOBILENO = "//*[contains(text(),'Mobile Number')]/following::input[1]";
	public static String PATH_HOME_TRN_CHECKBOX = "//*[contains(text(),'Temporary Reference Number (TRN)')]";
	public static String PATH_HOME_TRN_TEXTBOX = "//*[contains(text(),'Temporary Reference Number (TRN)')]/following::input[@placeholder='Enter Temporary Reference Number (TRN)'][1]";
	public static String PATH_HOME_TRN_CAPTCHA_TEXTBOX = "//*[contains(text(),'Type the characters you see in the image below')]/following::input[1]";
	public static String PATH_HOME_TRN_PROCEED = "/html/body/div[2]/div[2]/div/div[2]/div/div[2]/div/div[2]/div/a";
	// Business details page
	public static String LNK_BUSINESS_TAB = "auth/newappl/business";
	public static String BTN_LOGOUT = "//a[text()='Logout']";
	public static String PATH_BUSINESS_PAGE_EDIT_DRAFT = "//button[@title='Edit']";
	public static String PATH_BUSINESS_PAGE_BUSINESS_DETAILS_TAB = "//li[@data-ng-class='statusClass(1)']";
	public static String PATH_BUSINESS_PAGE_TRADE_NAME = "//*[contains(text(),'Trade Name')]/following::input[1]";
	public static String PATH_BUSINESS_PAGE_TRADE_NAME_TEXT = "/html/body/div[2]/div/div/div[3]/form/fieldset/div[1]/div[2]/div/div[1]/input";
	public static String PATH_BUSINESS_PAGE_BUSINESS_TYPE = "//*[contains(text(),'Constitution of Business (Select Appropriate)')]/following::select[1]";
	public static String PATH_BUSINESS_PAGE_BUSINESS_TYPE_TEXT = "//*[@id=\"bd_ConstBuss\"]";
	public static String PATH_BUSINESS_PAGE_STATE_JURISDICTION = "//*[contains(text(),'State Jurisdiction')]/following::select[1]";
	public static String PATH_BUSINESS_PAGE_COMMISSIONERATE = "//*[contains(text(),'Commissionerate')]/following::select[1]";
	public static String PATH_BUSINESS_PAGE_DIVISION = "//*[contains(text(),'Division')]/following::select[1]";
	public static String PATH_BUSINESS_PAGE_RANGE = "//*[contains(text(),'Range')]/following::select[1]";
	public static String PATH_BUSINESS_PAGE_REGISTRATION_REASON = "//*[contains(text(),'Reason to obtain registration')]/following::select[1]";
	public static String PATH_BUSINESS_PAGE_BUSINESS_COMMENCEMENT_DATE = "//*[contains(text(),'Date of commencement of Business')]/following::input[1]";
	public static String PATH_BUSINESS_PAGE_BUSINESS_COMMENCEMENT_DATE_TEXT = "//*[@id=\"bd_cmbz\"]";
	public static String PATH_BUSINESS_PAGE_REGISTRATION_TYPE = "//*[contains(text(),'Type of Registration')]/following::select[1]";
	public static String PATH_BUSINESS_PAGE_REGISTRATION_TYPE_TEXT = "//*[@id=\"newRegForm\"]/fieldset/div[1]/div[8]/div/div/div/div/table/tbody/tr/td[1]";

	public static String PATH_BUSINESS_PAGE_REGISTRATION_NO = "//*[contains(text(),'Registration No.')]/following::input[1]";
	public static String PATH_BUSINESS_PAGE_REGISTRATION_NO_TEXT = "//*[@id=\"newRegForm\"]/fieldset/div[1]/div[8]/div/div/div/div/table/tbody/tr/td[2]";
	public static String PATH_BUSINESS_PAGE_INCORPORATION_DATE = "//*[contains(text(),'Date of Registration')]/following::input[1]";
	public static String PATH_BUSINESS_PAGE_INCORPORATION_DATE_TEXT = "//*[@id=\"newRegForm\"]/fieldset/div[1]/div[8]/div/div/div/div/table/tbody/tr/td[3]";
	public static String BTN_BUSINESS_PAGE_INCORPORATION_ADD = "//*[@id=\"newRegForm\"]/fieldset/div[1]/div[7]/div/div[4]/button[1]";
	public static String PATH_BUSINESS_PAGE_CONSTITUTION_OF_BUSINESS = "//*[contains(text(),'Proof of Constitution of Business')]/following::select[1]";
	public static String PATH_BUSINESS_PAGE_APPLICANT_PROOF_OF_CONSTITUTION_UPLOAD = "//input[@id='bd_upload']";
	public static String BTN_CANCEL_UPLOAD = "//button[text()='Cancel Upload']";
	public static String PATH_UPLOAD_PROGRESS = "//div[@class='progress' and @data-ng-show='uploading']";
	public static String PATH_DROPDOWN_LOADING = "//button[text()='Loading..']";
	public static String PATH_BUSINESS_PAGE_DROPDOWN_LOADING = "//button[contains(text(),'OADING..']";
	public static String PATH_FILE_UPLOAD_ERROR = "//*[contains(text(),'Errors encountered while uploading the file']";
	public static String PATH_FILE_UPLOAD_SIZE_ERROR = "//*[contains(text(),'Maximum file size for upload is']";
	public static String BTN_FILE_DELETE = "//*[contains(text(),'Delete']";
	public static String BTN_DATE_OF_COMMENCEMENT_CALENDAR = "//*[contains(text(),'Date of commencement of Business')]/following::span[1]";
	public static String BTN_DATE_OF_REGISTRATION_CALENDAR = "//*[contains(text(),'Date of Registration')]/following::span[1]";
	public static String BTN_CALENDAR_SELECTDATE_ICON = "//a[@class='dtp-select-day selected']";

	// Promoter Or Partner Details page
	public static String LNK_PROMOTERS_TAB = "auth/newappl/promoters";
	public static String PATH_PROMOTERS_PAGE_PROMOTER_TAB1 = "//*[contains(text(),'Promoter / Partners')]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_FIRST_NAME = "//*[contains(text(),'Name of Person')]/following::input[@placeholder='Enter First Name'][1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_MIDDLE_NAME = "//*[contains(text(),'Name of Person')]/following::input[@placeholder='Enter Middle Name'][1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_LAST_NAME = "//*[contains(text(),'Name of Person')]/following::input[@placeholder='Enter Last Name'][1]";
	public static String PATH_PROMOTERS_PAGE_FATHER_FIRST_NAME = "//*[contains(text(),'Name of Father')]/following::input[@placeholder='Enter First Name'][1]";
	public static String PATH_PROMOTERS_PAGE_FATHER_MIDDLE_NAME = "//*[contains(text(),'Name of Father')]/following::input[@placeholder='Enter Middle Name'][1]";
	public static String PATH_PROMOTERS_PAGE_FATHER_LAST_NAME = "//*[contains(text(),'Name of Father')]/following::input[@placeholder='Enter Last Name'][1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_DOB = "//*[contains(text(),'Date of Birth')]/following::input[1]";
	public static String BTN_PROMOTERS_PAGE_APPLICANT_DOB_CALENDOR_ICON = "//*[contains(text(),'Date of Birth')]/following::span[1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_MOBILENO = "//*[contains(text(),'Mobile Number')]/following::input[1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_EMAILID = "//*[contains(text(),'Email Address')]/following::input[1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_GENDER_MALE = "//label[@for='radiomale']";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_GENDER_FEMALE = "//label[@for='radiofemale']";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_GENDER_OTHERS = "//label[@for='radiotrans']";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_DESIGNATION = "//*[contains(text(),'Designation / Status')]/following::input[@placeholder='Enter Designation'][1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_DIN = "//*[contains(text(),'Director Identification Number')]/following::input[1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_PAN = "//*[contains(text(),'Permanent Account Number (PAN)')]/following::input[1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_AADHAR_NO = "//*[contains(text(),'Aadhaar Number')]/following::input[1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_ADDRESSLINE1 = "//*[contains(text(),'Building No. / Flat No.')]/following::input[1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_DECLERATION = "//*[@id='pd_adhar_dec']";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_ADDRESSLINE2 = "//*[contains(text(),'Road / Street')]/following::input[1]";

	public static String PATH_PROMOTERS_PAGE_APPLICANT_BUILDING_NUMBER = "//*[@id=\"pd_bdnum\"]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_FLOOR_NUMBER = "//*[@id=\"pd_flrnum\"]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_BUILDING_NAME = "//*[@id=\"pd_bdname\"]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_ROAD_STREET = "//*[@id=\"pd_road\"]";

	public static String PATH_PROMOTERS_PAGE_ADDRESS_BUILDINGNAME = "//*[contains(text(),'Name of the Premises / Building')]/following::input[1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_CITY = "//*[contains(text(),'City / Town / Locality / Village')]/following::input[1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_COUNTRY = "//*[contains(text(),'Country')]/following::select[1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_STATE_IF_INDIA = "//*[@id='pd_state']";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_STATE_IF_NOT_INDIA = "//*[contains(text(),'State')]/following::input[@placeholder='Enter State Name'][1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_DISTRICT_IF_INDIA = "//*[contains(text(),'District')]/following::select[1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_DISTRICT_IF_NOT_INDIA = "//*[contains(text(),'District')]/following::input[@placeholder='Enter District Name'][1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_PINCODE = "//*[contains(text(),'PIN Code')]/following::input[1]";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_ZIPCODE = "//*[contains(text(),'ZIP Code')]/following::input[1]";
	public static String PATH_PINCODE_DISTRICT = "//div[@class='articles']/b[3]/following::a[1]";
	public static String BTN_PROMOTERS_PAGE_APPLICANT_ADD_NEW = "//*[@id='newRegForm']/div[2]/div[2]/div/button[2]";
	public static String BTN_PROMOTERS_PAGE_APPLICANT_ADD_NEW_SHOW_LIST = "//*[@id='newRegForm']/div[1]/div[2]/div/button";
	public static String BTN_PROMOTERS_PAGE_APPLICANT_SHOW_LIST = "//*[contains(text(),'Show List')]";
	public static String PATH_PROMOTERS_PAGE_IS_AUTHORIZED_PERSON = "//*[@for='pri_auth']";
	public static String PATH_PROMOTERS_PAGE_IS_AUTHORIZED_PERSON_CHECKED = "//div[@class='switch round']//input[@id='pri_auth' and @checked='checked']";
	public static String PATH_PROMOTERS_PAGE_APPLICANT_IMAGE_UPLOAD = "//*[@id='pd_upload']";
	public static String PATH_PROMOTERS_PAGE_SAVE_AND_CONTINUE = "//*[contains(text(),'Save & Continue')]";
	public static String PATH_GST_SAVE_AND_CONTINUE = "//*[@id=\"newRegForm\"]/div/div[2]/div/div/button";

	// Authorized signatory details page
	public static String LNK_AUTHORIZED_SIGNATORY_TAB = "auth/newappl/authsignatory";
	public static String PATH_AUTHORIZED_SIGNATORY_PAGE_TAB = "//*[contains(text(),'Authorized Signatory')]";
	public static String PATH_AUTHORIZED_SIGNATORY_PAGE_IS_AUTHORIZED_PERSON = "//input[@id='auth_prim']";
	public static String PATH_AUTHORIZED_SIGNATORY_PAGE_AUTHORIZED_PERSON_PROOF = "//select[@id='as_up_type']";
	public static String PATH_AUTHORIZED_SIGNATORY_PAGE_AUTHORIZED_PERSON_IMAGE_UPLOAD = "//*[@id='as_upload_sign']";

	// Authorized representative details page
	public static String LNK_AUTHORIZED_REPRESENTATIVE_TAB = "auth/newappl/authrepresentative";
	public static String PATH_AUTHORIZED_REPRESENTATIVE_PAGE_TAB = "//*[contains(text(),'Authorized Representative')]";
	public static String PATH_AUTHORIZED_REPRESENTATIVE_PAGE_IS_AUTHORIZED_REPRESENTATIVE = "//label[@for='as_cit_ind']";

	// Principle Place of Business page
	public static String LNK_BUSINESS_PAGE_TAB = "auth/newappl/business/place";
	public static String PATH_BUSINESS_PAGE_BUSINESS_TAB = "//*[contains(text(),'Principal Place of Business')]";
	public static String PATH_BUSINESS_PAGE_BUSINESS_ADDRESSLINE1 = "//*[contains(text(),'Building No. / Flat No.')]/following::input[1]";
	public static String PATH_BUSINESS_PAGE_BUSINESS_ADDRESSLINE2 = "//*[contains(text(),'Road / Street')]/following::input[1]";
	public static String PATH_BUSINESS_PAGE_BUSINESS_BUILDING_NUMBER = "//*[@id=\"bno\"]";
	public static String PATH_BUSINESS_PAGE_BUSINESS_FLAT_NUMBER = "//*[@id=\"bp_flrnum\"]";
	public static String PATH_BUSINESS_PAGE_BUSINESS_BUILDING_NAME = "//*[@id=\"bp_bdname\"]";
	public static String PATH_BUSINESS_PAGE_BUSINESS_ROAD_STREET = "//*[@id=\"st\"]";

	public static String PATH_BUSINESS_PAGE_BUSINESS_CITY = "//*[contains(text(),'City / Town / Locality / Village')]/following::input[1]";
	public static String PATH_BUSINESS_PAGE_BUSINESS_DISTRICT = "//*[contains(text(),'District')]/following::select[1]";
	public static String PATH_BUSINESS_PAGE_BUSINESS_PINCODE = "//*[contains(text(),'PIN Code')]/following::input[1]";
	public static String PATH_BUSINESS_PAGE_BUSINESS_PROPERTY_TYPE = "//select[@id='bp_buss_poss']";
	public static String PATH_BUSINESS_PAGE_BUSINESS_PROPERTY_TYPE_PROOF = "//select[@id='bp_up_type']";
	public static String PATH_BUSINESS_PAGE_BUSINESS_PROPERTY_TYPE_PROOF_UPLOAD = "//input[@id='bp_upload']";
	public static String PATH_BUSINESS_PAGE_IS_ADDITIONAL_PLACE = "//*[@for='bp_add']";
	public static String PATH_BUSINESS_PAGE_NATURE_RECIPIENT = "//input[@id='bp_ck_SRE']";
	public static String PATH_BUSINESS_PAGE_NATURE_RETAILS = "//input[@id='bp_ck_RBU']";
	public static String PATH_BUSINESS_PAGE_NATURE_SOS = "//input[@id='bp_ck_SOS']";

	// Goods and services details
	public static String LNK_GST_PAGE_TAB = "auth/newappl/goodsservices";
	public static String LNK_GST_PAGE_GOODS_TAB = "//a[text()='Goods']";
	public static String LNK_GST_PAGE_SERVICES_TAB = "//a[text()='Services']";
	public static String PATH_GST_PAGE_GST_HSN_CODE = "//input[@id='gs_hsn_value']";
	public static String PATH_GST_PAGE_GST_SSN_CODE = "//input[@id='gs_ssn_value']";
	public static String PATH_GST_PAGE_AUTOCOMPLETE_DROPDOWN = "//div[@class='autocomplete-dropdown']";
	public static String PATH_GST_PAGE_AUTOCOMPLETE_DROPDOWNLIST = "//div[@class='autocomplete-row']";
	public static String PATH_GST_PAGE_AUTOCOMPLETE_RESULT_NOT_FOUND = "//div[@id='gs_hsn_dropdown']//div[@class='autocomplete-searching'][contains(text(),'No Results Found')]";
	public static String BTN_GST_PAGE_GST_DELETE = "//button[@class='btn btn-sm btn-danger']";

	// Aadhar Authentication
	public static String LNK_AADHAR_TAB = "auth/newappl/aadhar";
	public static String BTN_SAVE_AND_CONTINUE_AADHAR = "//*[@id=\"newRegForm\"]/div/div[2]/div/div/button";
	public static String BTN_AADHAR_AUTHENTICATION_TOGGLE = "//span[contains(text(),'Yes')]";
	public static String BTN_AADHAR_WARNING_OK = "//*[@id=\"adhrInfoMdl\"]/div/div/div[2]/button";
	public static String BTN_AADHAR_SAVE_AND_CONTINUE = "//button[contains(text(),'Save & Continue')]";
	public static String LNK_VERIFICATION_TAB = "auth/newappl/verify";

	// Others Vakilsearch CRM related
	public static final String PATH_NHD_SPINNER = "//*[contains(@class,'nprogress-busy')]";
	public static final String LNK_CRITICAL_NOTE = "//span[contains(text(),'Critical Notes')]";
	public static final String PATH_CRITICAL_NOTE_BODY = "html/body";
	public static final String BTN_CRITICAL_NOTE_SUBMIT = "//div[@class='modal-body displayinline']//input[@name='commit']";
	public static String PATH_TRN = "//*[@id='trn_number_trn_number']";
	public static String BTN_TRN_SAVE = "//input[@id='name_change_submit_trn']";
	public static String BTN_REMOVE_TRN = "	//a[@class='remove-navtab trn_numbers_remove']";
	public static String BTN_TRN_FINAL_SAVE = "//div[@class='form-group']//input[@name='commit']";
	public static final String PATH_BOOTSTRAP_MODAL_WINDOW = "//div[@class='bootbox modal fade in']//div[@class='modal-body']";
	public static final String PATH_MODAL_OK = "//div[@class='bootbox modal fade in']//button[@type='button'][contains(text(),'Ok')]";
	public static final String expensesUrl = "" + baseUrl + "/ticket_expenses/index/";
	public static final String BTN_ADD_EXPENSE = "//*[contains(text(),'Add Expense')]";
	public static final String PATH_EXPENSE_AMOUNT = "//*[@id='ticket_expense_amount']";
	public static final String PATH_EXPENSE_PROOF_FILE = "//span[text()='Choose file']";
	public static final String BTN_CREATE_EXPENSE = "//*[@value='Create Ticket Expense']";
	public static final String PATH_IEC_DELIVERABLE_CERTIFICATE_NAME = "//*[contains(text(),'IEC certificate')]/following::input[@id='other_document_detail_name']";
	public static final String PATH_IEC_DELIVERABLE_CHOOSE_FILE = "//*[contains(text(),'IEC certificate')]/following::span[contains(text(),'Choose file')]";
	public static String PATH_IEC_DELIVERABLE_CERTIFICATE = "//span[contains(text(),'Choose file')]/preceding::input[1]";
	public static String BTN_IEC_DELIVERABLE_SAVE = "//*[contains(text(),'IEC certificate')]/following::input[@value='Save']";
	public static final String PATH_IEC_CERTIFICATE_DOWNLOAD = "//*[contains(text(),'IEC certificate')]/following::a[contains(text(),'DOWNLOAD')]";
	public static final String BTN_ADD_NOTE = "//input[@placeholder='Add Note']";
	public static final String LNK_ADD_NOTE_CANNED_RESPONSE = "//a[@id='add_note_can_response']";
	public static final String PATH_CANNED_RESPONSE_TEXTAREA = "//textarea[@class='form-control modal-titleSearchTxtBox_take_action']";
	public static final String PATH_CANNED_RESPONSE_FILTERED_LIST = "//div[@id='ui_tabs_search']/div//a/h4";
	public static final String PATH_ADD_NOTE_ATTACHMENT = "//div[@id='email_template_attachment_add_note']/preceding-sibling::input[@id='attachment-field']";
	public static final String PATH_ADD_NOTE_IFRAME = "iframe[title='Rich Text Editor, content_html']";
	public static final String BTN_ADD_NOTE_SEND = "//button[text()='Send']";
	public static final String BTN_TAKE_ACTION = "//div[@id='take_action_show']";
	public static final String LNK_TAKE_ACTION_CANNED_RESPONSE = "//a[@id='can_response']";
	public static final String PATH_TAKE_ACTION_IFRAME = "iframe[title='Rich Text Editor, content_html_take_action']";
	public static final String PATH_IFRAME_BODY = "html body.cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders";
	public static final String BTN_TAKE_ACTION_UPDATE = "//button[@id='take_action_submit_button']";
	public static final String PATH_TAKE_ACTION_ATTACHMENT = "//div[@id='take_action_show']/following::input[contains(@id,'attachment-field')][1]";
	public static final String PATH_EVENT_NAME = "name";
	public static final String PATH_EVENT_TIME = "from_date_time";
	public static final String PATH_EVENT_DESCRIPTION = "description";
	public static final String PATH_EXISTING_NEXT_EVENT = "//*[contains(text(),'Next Event Scheduled On ')]";
	public static final String BTN_SUBMILESTONE_UPDATE = "//strong[text()='Update Sub-Milestone']/following::input[@value='Update']";

	// Proprietor related
	public static String PATH_PROPRIETOR_FIRM_NAME = "//*[@id='company_firm_name']";
	public static String PATH_PROPRIETOR_MOBILE_NO = "//*[@id='company_firm_mobile_number']";
	public static String PATH_PROPRIETOR_PAN = "//*[@id='company_firm_pan']";
	public static String PATH_PROPRIETOR_ADDRESS_LINE_1 = "//*[@id='company_firm_addressLine1']";
	public static String PATH_PROPRIETOR_ADDRESS_LINE_2 = "//*[@id='company_firm_addressLine2']";
	public static String PATH_PROPRIETOR_PINCODE = "//*[@name='company_firm[pincode]']";

	// IEC Registration
	public static final String iecRegistrationUrl = "http://dava.gov.in:8080/dgftiec/panSearch.jsp";
	public static String PATH_IEC_REGISTRATION_PAN = "//*[contains(text(),'Enter Your PAN')]/following::input[1]";
	public static String BTN_IEC_REGISTRATION_PAN_SEARCH = "//*[contains(text(),'Enter Your PAN')]/following::button[1]";
	public static String PATH_IEC_COMPANY_OR_APPLICANT_NAME = "//*[contains(text(),'As mentioned on PAN Card')]/following::input[1]";
	public static String PATH_IEC_DOB_OR_DOI = "//*[contains(text(),'Date of Birth/Incorporation')]/following::input[1]";
	public static String PATH_IEC_REGISTRATION_CAPTCHA = "//div[@class='col-sm-2']//img";
	public static String PATH_IEC_REGISTRATION_CAPTCHA_FIELD = "//*[contains(text(),'Date of Birth/Incorporation')]/following::input[@placeholder='Type Captcha Here'][1]";
	public static String BTN_IEC_REGISTRATION_PANSEARCH_SUBMIT = "//button[@class='btn btn-primary']";
	public static String BTN_IEC_REGISTRATION_NEXT = "//*[@id='next_btn']";
	public static String PATH_IEC_REGISTRATION_AUTH_MOBILE = "//*[@id='mob']";
	public static String PATH_IEC_REGISTRATION_AUTH_EMAIL = "//*[@id='email']";
	public static String PATH_IEC_REGISTRATION_CAPTCHA_INPUT = "txtInput";
	public static String PATH_IEC_REGISTRATION_MAIN_CAPTCHA = "//input[@id='mainCaptcha']";
	public static String BTN_IEC_REGISTRATION_GENERATE_OTP = "//input[@id='btn_val']";
	public static String PATH_IEC_REGISTRATION_MOBILE_OTP = "//input[@id='mob_tk']";
	public static String PATH_IEC_REGISTRATION_SUBMIT = "//td[@class='td_text']//td[1]//input[1]";

	// Entity details
	public static String LNK_IEC_REGISTRATION_ENTITY_DETAILS = "//a[contains(text(),'Entity Details')]";
	public static String PATH_IEC_REGISTRATION_ENTITY_NAME = "//*[@id='i_name']";
	public static String PATH_IEC_REGISTRATION_ENTITY_ADDRESS_LINE1 = "//*[@id='i_add1']";
	public static String PATH_IEC_REGISTRATION_ENTITY_ADDRESS_LINE2 = "//*[@id='i_add2']";
	public static String PATH_IEC_REGISTRATION_ENTITY_CITY = "//*[@id='i_city']";
	public static String PATH_IEC_REGISTRATION_ENTITY_STATE = "//*[@id='i_state']";
	public static String PATH_IEC_REGISTRATION_ENTITY_DISTRICT = "//*[@id='i_dist']";
	public static String PATH_IEC_REGISTRATION_ENTITY_PINCODE = "//*[@id='i_pin']";
	public static String PATH_IEC_REGISTRATION_ENTITY_NATUREOF_CONCERN = "//*[@id='i_noc']";
	public static String PATH_IEC_REGISTRATION_ENTITY_PREFERRED_ACTIVITY = "//*[@id='i_act']";
	public static String PATH_IEC_REGISTRATION_ENTITY_BANK_ACC_NO = "//*[@id='i_ac']";
	public static String PATH_IEC_REGISTRATION_ENTITY_BANK_ACC_HOLDER_NAME = "//*[@id='i_acholder']";
	public static String PATH_IEC_REGISTRATION_ENTITY_BANK_NAME = "//*[@id='i_acbank']";
	public static String PATH_IEC_REGISTRATION_ENTITY_BRANCH_NAME = "//*[@id='i_acbranch']";
	public static String PATH_IEC_REGISTRATION_ENTITY_IFSC = "//*[@id='i_ifsc']";
	public static String PATH_IEC_REGISTRATION_ENTITY_CIN = "//*[@id='i_cin']";
	public static String PATH_IEC_REGISTRATION_ENTITY_REG_CERTIFICATE_NO = "//*[@id='i_rc']";
	public static String PATH_IEC_REGISTRATION_ENTITY_APPLICANT_NAME = "//*[@id='i_applname']";
	public static String PATH_IEC_REGISTRATION_ENTITY_APPLICANT_DESIGNATION = "//*[@id='i_appldesg']";
	public static String PATH_IEC_REGISTRATION_ENTITY_APPLICANT_ADDRESS = "//*[@id='i_appladdr']";
	public static String PATH_IEC_REGISTRATION_ENTITY_APPLICANT_MOBILE = "//*[@id='i_appltele']";
	public static String PATH_IEC_REGISTRATION_ENTITY_APPLICANT_EMAIL = "//*[@id='i_applemail']";
	public static String PATH_IEC_REGISTRATION_ENTITY_APPLICANT_PAN = "//*[@id='i_applpan']";
	public static String PATH_IEC_REGISTRATION_ENTITY_APPLICANT_DOS = "//*[@id='i_sdate']";
	public static String PATH_IEC_REGISTRATION_ENTITY_APPLICANT_DOS_CALENDAR = "//*[@class='ui-state-default ui-state-highlight']";
	public static String PATH_IEC_REGISTRATION_ENTITY_APPLICANT_POS = "//*[@id='i_splace']";
	public static String BTN_IEC_REGISTRATION_ENTITY_APPLICANT_UPDATE_SAVE = "//input[@value='UPDATE and SAVE']";

	// Branch details
	public static String LNK_IEC_REGISTRATION_BRANCH_DETAILS = "//a[contains(text(),'Branch Details')]";

	// Director/Partner etc. details
	public static String LNK_IEC_REGISTRATION_DIRECTOR_DETAILS = "//a[contains(text(),'Director/Partner etc.')]";
	public static String PATH_IEC_REGISTRATION_ENTITY_DIRECTOR_DIN = "//input[@id='d_din']";
	public static String PATH_IEC_REGISTRATION_ENTITY_DIRECTOR_TITLE = "//select[@id='d_title']";
	public static String PATH_IEC_REGISTRATION_ENTITY_DIRECTOR_NAME = "//input[@id='d_name']";
	public static String PATH_IEC_REGISTRATION_ENTITY_DIRECTOR_PAN = "//input[@id='d_pan']";
	public static String PATH_IEC_REGISTRATION_ENTITY_DIRECTOR_PANNAME = "//input[@id='d_panname']";
	public static String PATH_IEC_REGISTRATION_ENTITY_DIRECTOR_DOB = "//input[@id='d_dob']";
	public static String PATH_IEC_REGISTRATION_ENTITY_DIRECTOR_FATHERNAME = "//input[@id='d_fname']";
	public static String PATH_IEC_REGISTRATION_ENTITY_DIRECTOR_ADDRESSLINE1 = "//input[@id='d_add1']";
	public static String PATH_IEC_REGISTRATION_ENTITY_DIRECTOR_ADDRESSLINE2 = "//input[@id='d_add2']";
	public static String PATH_IEC_REGISTRATION_ENTITY_DIRECTOR_CITY = "//input[@id='d_city']";
	public static String PATH_IEC_REGISTRATION_ENTITY_DIRECTOR_STATE = "//select[@id='d_state']";
	public static String PATH_IEC_REGISTRATION_ENTITY_DIRECTOR_DISTRICT = "//select[@id='d_dist']";
	public static String PATH_IEC_REGISTRATION_ENTITY_DIRECTOR_PIN = "//input[@id='d_pin']";
	public static String PATH_IEC_REGISTRATION_ENTITY_DIRECTOR_MOBILE = "//input[@id='d_mobile']";
	public static String PATH_IEC_REGISTRATION_ENTITY_DIRECTOR_AADHARNO = "//input[@id='d_aadhar']";
	public static String BTN_IEC_REGISTRATION_ENTITY_DIRECTOR_ADD = "//input[@id='d_button']";

	// Upload Documents details
	public static String LNK_IEC_REGISTRATION_UPLOAD_DOCUMENTS_DETAILS = "//a[contains(text(),'Upload Documents')]";
	public static String PATH_IEC_REGISTRATION_UPLOAD_DOCUMENTS_DOC_CATEGORY = "//select[@name='doccode']";
	public static String PATH_IEC_REGISTRATION_UPLOAD_DOCUMENTS_DOC_TYPE = "//select[@name='doctype']";
	public static String PATH_IEC_REGISTRATION_UPLOAD_DOCUMENTS = "//input[@name='uploadedFile']";
	public static String BTN_IEC_REGISTRATION_UPLOAD_DOCUMENTS = "//input[@name='fsubmit']";
	public static String PATH_IEC_REGISTRATION_UPLOAD_ACK = "//div[contains(text(),'File has been uploaded successfully .')]";

	// Fee Payment details
	public static String LNK_IEC_REGISTRATION_FEE_PAYMENT_DETAILS = "//a[contains(text(),' Fee Payment ')]";
	public static String BTN_IEC_REGISTRATION_FEE_PAYMENT_SUBMIT = "//input[@id='subclick']";
	public static String BTN_IEC_REGISTRATION_FEE_PAYMENT_PROCEED = "//input[@value='PROCEED']";
	public static String PATH_IEC_REGISTRATION_FEE_PAYMENT_APP_NAME = "//input[@id='APLN']";
	public static String PATH_IEC_REGISTRATION_FEE_PAYMENT_APP_FEE = "//input[@id='txn_amt']";
	public static String PATH_IEC_REGISTRATION_FEE_PAYMENT_MAKE_PAYMENT = "//button[@id='proceedForm']";
	public static String PATH_IEC_REGISTRATION_FEE_PAYMENT_INTERNET_BANKING = "//span[contains(text(),'Internet Banking')]";
	public static String PATH_IEC_REGISTRATION_FEE_PAYMENT_HDFC_DIRECT = "//input[@id='HDFCNet']";
	public static String PATH_IEC_REGISTRATION_FEE_PAYMENT_HDFC_USERID = "//input[@name='fldLoginUserId']";
	public static String PATH_IEC_REGISTRATION_FEE_PAYMENT_HDFC_PWD = "//input[@name='fldPassword']";
	public static String PATH_IEC_REGISTRATION_FEE_PAYMENT_HDFC_CONTINUE = "//img[@src='/gif/continue.gif']";
	public static String PATH_IEC_REGISTRATION_FEE_PAYMENT_HDFC_SELECT_ACCOUNT = "//*[contains(text(),'From Account')]/following::select[1]";
	public static String PATH_IEC_REGISTRATION_FEE_PAYMENT_HDFC_CONFIRM = "//img[@src='gif/confirm.png']";
	public static String PATH_IEC_REGISTRATION_FEE_PAYMENT_HDFC_OTP = "//*[contains(text(),'One Time Password')]";
	public static String BTN_IEC_REGISTRATION_FEE_PAYMENT_HDFC_OTP_SUBMIT = "//*[contains(text(),'Submit')]";
	public static String PATH_IEC_REGISTRATION_FEE_PAYMENT_HDFC_TRANSACTION_ACK = "//*[contains(text(),'Your transaction is successful.')]";

	// Preview
	public static String LNK_IEC_REGISTRATION_PREVIEW = "//a[contains(text(),'Preview &')]";
	public static String PATH_IEC_REGISTRATION_PREVIEW_FILENNO = "//*[contains(text(),'File No')]/following::td[1]";

	// Submit
	public static String LNK_IEC_REGISTRATION_SUBMIT = "//a[contains(text(),'Submit')]";
	public static String PATH_IEC_REGISTRATION_SUBMIT_CONFIRM = "//*[contains(text(),'Do You Finally Confirm:')]/following::select[1]";
	public static String BTN_IEC_REGISTRATION_SUBMIT = "//input[contains(text(),'Continue')]";
	public static String BTN_IEC_REGISTRATION_CONTINUE = "//input[contains(text(),'Continue')]";
	public static String BTN_IEC_REGISTRATION_SUBMIT_AND_CONTINUE = "//input[contains(text(),'Submit and Generate IEC Certificate')]";
	public static String BTN_IEC_REGISTRATION_PRINT = "//*[@id='phrame2']";
	public static String PATH_DOWNLOAD_DIRECTORY_IEC = "E:\\IEC_CERTIFICATES\\";

	// MSME
	public static final String msmeRegistrationUrl = "https://udyogaadhaar.gov.in/ua/uam_registration.aspx";
	public static String PATH_AADHAR_NO = "//*[contains(text(),'Aadhaar Number')]/following::input[@placeholder='Your Aadhaar No'][1]";
	public static String PATH_NAME_OF_ENTERPRENEUR = "//*[contains(text(),'Name of Entrepreneur')]/following::input[@placeholder='Name as per Aadhaar'][1]";
	public static String BTN_VALIDATE_AADHAR = "//*[@value='Validate & Generate OTP']";
	public static String PATH_SOCAIL_CATEGORY_GENERAL = "//label[contains(text(),'General')]";
	public static String PATH_SOCAIL_CATEGORY_SC = "//label[contains(text(),'SC')]";
	public static String PATH_SOCAIL_CATEGORY_ST = "//label[contains(text(),'ST')]";
	public static String PATH_SOCAIL_CATEGORY_OBC = "//label[contains(text(),'OBC')]";
	public static String PATH_GENDER_MALE = "//label[contains(text(),'Male')]";
	public static String PATH_GENDER_FEMALE = "//label[contains(text(),'Female')]";
	public static String PATH_PHYSICALLY_HANDICAPPED_YES = "//label[contains(text(),'Yes')]";
	public static String PATH_PHYSICALLY_HANDICAPPED_NO = "//label[contains(text(),'No')]";
	public static String PATH_NAME_OF_ENTERPRISE = "//*[contains(text(),'Name of Enterprise')]/following::input[@placeholder='Name of Enterprise'][1]";
	public static String PATH_TYPE_OF_ORGANIZATION = "//*[@id='ctl00_ContentPlaceHolder1_ddlTypeofOrg']";
	public static String PATH_PANNO = "//*[@id='ctl00_ContentPlaceHolder1_txtPan']";
	public static String PATH_DOORNO = "//*[@id='ctl00_ContentPlaceHolder1_txtPFlat']";
	public static String PATH_BUILDINGNAME = "//*[@id='ctl00_ContentPlaceHolder1_txtPBuilding']";
	public static String PATH_ROAD = "//*[@id='ctl00_ContentPlaceHolder1_txtPStreet']";
	public static String PATH_AREA = "//*[@id='ctl00_ContentPlaceHolder1_txtPArea']";
	public static String PATH_CITY = "//*[@id='ctl00_ContentPlaceHolder1_txtPCity']";
	public static String PATH_PIN = "//*[@id='ctl00_ContentPlaceHolder1_txtPpin']";
	public static String PATH_STATE = "//select[contains(@name,'ddlPState')]";
	public static String PATH_DISTRICT = "//select[contains(@name,'ddlPDistrict')]";
	public static String BTN_ADD_PLANT = "//input[contains(@name,'BtnPAdd') and @value='Add Plant']";
	public static String PATH_ADDRESS_OF_COMMUNICATION = "//*[@id='ctl00_ContentPlaceHolder1_txtaddress']";
	public static String PATH_STATE_DROPDOWN = "//select[contains(@name,'ddlstate')]";
	public static String PATH_DISTRICT_DROPDOWN = "//select[contains(@name,'ddlDistrict')]";
	public static String PATH_PINCODE = "//*[@id='ctl00_ContentPlaceHolder1_txtPin']";
	public static String PATH_MOBILENO = "//*[@id='ctl00_ContentPlaceHolder1_txtmobile']";
	public static String PATH_EMAIL = "//*[@id='ctl00_ContentPlaceHolder1_txtemail']";
	public static String PATH_DATE_OF_COMMENCEMENT_CALENDAR = "//input[@src='cal/calendar.png']";
	public static String PATH_DATE_OF_COMMENCEMENT_CALENDAR_TITLE = "//*[@id='ctl00_ContentPlaceHolder1_ceFollowUpDate_title']";
	public static String PATH_DATE_OF_COMMENCEMENT_CALENDAR_PREV_ARROW = "//*[@id='ctl00_ContentPlaceHolder1_ceFollowUpDate_prevArrow']";
	public static String PATH_DATE_OF_COMMENCEMENT_CALENDAR_YEAR_TABLE = "//table[@id='ctl00_ContentPlaceHolder1_ceFollowUpDate_yearsTable']";
	public static String PATH_PREVIOUS_REGISTRATIONS_NA = "//label[contains(text(),'N/A')]";
	public static String PATH_PREVIOUS_REGISTRATIONS_EM1 = "//label[contains(text(),'EM 1')]";
	public static String PATH_PREVIOUS_REGISTRATIONS_EM2 = "//label[contains(text(),'EM 2')]";
	public static String PATH_PREVIOUS_REGISTRATIONS_SSI = "//label[contains(text(),'SSI')]";
	public static String PATH_PREVIOUS_REGISTRATIONS_UAM = "//label[contains(text(),'Previous UAM')]";
	public static String PATH_DATE_OF_COMMENCEMENT = "//label[contains(text(),'Date of commencement')]";
	public static String PATH_IFSC_CODE = "//*[@id='ctl00_ContentPlaceHolder1_txtifsccode']";
	public static String PATH_BANK_DETAILS = "//*[@id='ctl00_ContentPlaceHolder1_txtaccountno']";
	public static String PATH_MAJOR_ACTIVITY_MANUFACTURING = "//label[not(contains(@for,'rdbCatggMultiple')) and contains(text(),'Manufacturing')]";
	public static String PATH_MAJOR_ACTIVITY_SERVICES = "//label[not(contains(@for,'rdbCatggMultiple')) and contains(text(),'Services')]";
	public static String PATH_NIC_MANUFACTURING = "//input[contains(@name,'rdbCatggMultiple') and @value='1']";
	public static String PATH_NIC_SERVICES = "//input[contains(@name,'rdbCatggMultiple') and @value='2']";
	public static String PATH_NIC_CODE = "//*[@id='ctl00_ContentPlaceHolder1_txtsearchNic']";
	public static String PATH_NIC_2_DIGIT_CODE = "//*[contains(text(),'NIC 2 Digit Code')]/following::select[1]";
	public static String PATH_NIC_4_DIGIT__CODE = "//*[contains(text(),'NIC 4 Digit Code')]/following::select[1]";
	public static String PATH_NIC_5_DIGIT__CODE = "//*[contains(text(),'NIC 5 Digit Code')]/following::select[1]";
	public static String PATH_PERSONS_EMPLOYED = "//*[@id='ctl00_ContentPlaceHolder1_txttotalemp']";
	public static String PATH_INVESTMENT = "//*[@id='ctl00_ContentPlaceHolder1_txtInvestmentammount']";
	public static String PATH_DISTRICT_INDUSTRY_CENTER = "//*[@id='ctl00_ContentPlaceHolder1_ddlDIC']";
	public static String BTN_ADD_ACTIVITY = "//*[@name='ctl00$ContentPlaceHolder1$btnAddMore']";
	public static String BTN_MSME_SUBMIT = "//input[@value='Submit']";
	public static String PATH_MSME_AADHAR_NO = "//*[@id='ssi_msme_aadharnum']";
	public static String PATH_MSME_NAME_OF_FIRM = "//*[@id='ssi_msme_company_name']";
	public static String PATH_MSME_SOCIAL_CATEGORY = "//*[@id='ssi_msme_social_category']/option[@selected='selected']";
	public static String PATH_MSME_APPLICANT_NAME = "//*[@id='ssi_msme_applicant_name']";
	public static String PATH_MSME_ORGANIZATION_TYPE = "//*[@id='ssi_msme_organization_type']/option[@selected='selected']";
	public static String PATH_MSME_PANN0 = "//*[@id='ssi_msme_pan_num']";
	public static String PATH_MSME_ADDRESS_AREA = "//*[@id='ssi_msme_address']";
	public static String PATH_MSME_MOBILE_NUMBER = "//*[@id='ssi_msme_mob_no']";
	public static String PATH_MSME_EMAIL = "//*[@id='ssi_msme_email_id']";
	public static String PATH_MSME_DOC = "//*[@id='ssi_msme_doc']";
	public static String PATH_MSME_IFSC = "//*[@id='ssi_msme_bank_ifsc']";
	public static String PATH_MSME_BANK_DETAILS = "//*[@id='ssi_msme_bank_acc']";
	public static String PATH_MSME_MAJOR_ACTIVITES = "//select[@id='ssi_msme_activity_service_']/following::span[1]//ul/li";
	public static String PATH_MSME_PERSON_EMPLOYED = "//*[@id='ssi_msme_person']";
	public static String PATH_MSME_INVESTMENT = "//*[@id='ssi_msme_investment']";
	public static String BTN_FINAL_SUBMIT = "//input[@id='ctl00_ContentPlaceHolder1_btn_finalsubmit']";
	public static String BTN_PRINT_UAM = "//body/form[@id='form1']/table[1]";
	public static String BTN_GENERATE_MSME_CERTIFICATE = "//*[@id='btnBack']";
	public static String BTN_PRINT_CERTIFICATE = "//body/form[@id='form1']/table[1]";
	public static String PATH_DOWNLOAD_DIRECTORY_MSME = "E:\\MSME_CERTIFICATES\\";
	public static String PATH_NOT_VERIFIED_MOBILE_TEXT = "//*[text()='OTP Error Code:- 111 - Aadhaar number does not have verified mobile']";
	public static String PATH_VALID_MOBILE_OTP = "//*[contains(text(),'OTP has been sent to')]";
	public static String PATH_MOBILE_OTP = "//input[contains(@id,'txtOtp')]";
	public static String LNK_LOGINWITHOU_MOBILE = "//a[@id='ctl00_ContentPlaceHolder1_lbtnUAMRegWithoutOTP']";
	public static String PATH_MSME_DELIVERABLE_UAM_NAME = "//*[contains(text(),'Udyog Aadhar Memorandum (Acknowledgment)')]/following::input[@id='form_sub_detail_name']";
	public static String PATH_MSME_UAM_CHOOSE_FILE = "//*[contains(text(),'Udyog Aadhar Memorandum (Acknowledgment)')]/following::span[contains(text(),'Choose file')][1]";
	public static String PATH_MSME_DELIVERABLE__UAM = "//span[contains(text(),'Choose file')]/preceding::input[1]";
	public static String BTN_MSME_UAM_SAVE = "//*[contains(text(),'Udyog Aadhar Memorandum (Acknowledgment)')]/following::input[@value='Save'][1]";
	public static String PATH_MSME_UAM_DOWNLOAD = "//*[contains(text(),'Udyog Aadhar Memorandum (Acknowledgment)')]/following::a[contains(text(),'DOWNLOAD')]";
	public static String PATH_MSME_DELIVERABLE_CERTIFICATE_NAME = "//*[contains(text(),'Registration certificate')]/following::input[@id='other_document_detail_name']";
	public static String PATH_MSME_CERTIFICATE_CHOOSE_FILE = "//*[contains(text(),'Registration certificate')]/following::span[contains(text(),'Choose file')][1]";
	public static String PATH_MSME_DELIVERABLE_CERTIFICATE = "//span[contains(text(),'Choose file')]/preceding::input[1]";
	public static String BTN_MSME_CERTIFICATE_SAVE = "//*[contains(text(),'Registration certificate')]/following::input[@value='Save']";
	public static String PATH_MSME_CERTIFICATE_DOWNLOAD = "//*[contains(text(),'Registration certificate')]/following::a[contains(text(),'DOWNLOAD')]";
	public static String PATH_MSME_ID_PROOF_NO = "//*[contains(text(),'ID Proof Number')]/following::input[1]";
	public static String PATH_MSME_ID_PROOF = "//*[contains(text(),'ID proof Approved by')]/following::input[1]";
	public static String PATH_MSME_MAIL_OTP = "//input[@id='ctl00_ContentPlaceHolder1_txtOtp']";
	public static String PATH_MSME_VERIFICATION_CODE = "//*[contains(text(),'Verification Code')]/following::input[1]";

	public static String PATH_MSME_REGISTERED_MSME = "ctl00_ContentPlaceHolder1_btnNumberofUnit";
	public static String PATH_MSME_REGISTERED_MSME_TABLE = "ctl00_ContentPlaceHolder1_gvDatat";
	public static String PATH_MSME_REGISTERED_MSME_APPLICATION_NO = "//span[@id='lblApplicationNumber']";
	public static String PATH_MSME_REGISTERED_MSME_EMAIL_IDS = "//span[@id='lblEmailId']";
	public static final String msmeUAMUrl = "https://udyogaadhaar.gov.in/ua/PrintApplication_Pub.aspx";
	public static final String msmeCertificateUrl = "https://udyogaadhaar.gov.in/ua/PrintAcknowledgement_Pub.aspx";
	public static String PATH_MSME_UAM = "//input[@id='ctl00_ContentPlaceHolder1_txtUANNumber']";
	public static String PATH_MSME_UAM_MOBILE_NO = "//input[@id='ctl00_ContentPlaceHolder1_txtmobile']";
	public static String BTN_MSME_UAM_PRINT_SUBMIT = "//input[@id='ctl00_ContentPlaceHolder1_btnLogin']";
	public static final String msmeUpdateUAMUrl = "https://udyogaadhaar.gov.in/ua/UA_EntrepreneurLogin.aspx";

	public static String PATH_MSME_MAIL_OTP_LOGIN = "//input[@id='ctl00_ContentPlaceHolder1_rdbOTP_1']";
	public static String PATH_MSME_LOGIN_CAPTCHA_IMG = "//img[@id='ctl00_ContentPlaceHolder1_imgCaptcha']";
	public static String PATH_MSME_LOGIN_CAPTCHA = "//input[@id='ctl00_ContentPlaceHolder1_txtCaptcha']";
	public static String BTN_MSME_LOGIN_GENERATE_OTP = "//input[@id='ctl00_ContentPlaceHolder1_btnsendotp']";
	public static String PATH_MSME_LOGIN_EMAIL_OTP = "//input[@id='ctl00_ContentPlaceHolder1_txtOtp']";
	public static String PATH_MSME_LOGIN_CAPTCHA_IMG_1 = "//img[@id='ctl00_ContentPlaceHolder1_imgCaptcha1']";
	public static String PATH_MSME_LOGIN_CAPTCHA_1 = "//input[@id='ctl00_ContentPlaceHolder1_txtCaptcha1']";
	public static String BTN_MSME_LOGIN_VALIDATE = "//input[@id='ctl00_ContentPlaceHolder1_btnValidate']";
	public static String BTN_MSME_EDIT_UAM = "//input[@value='Edit Udyog Aadhaar']";
	public static String BTN_MSME_UPDATE = "//input[@value='Update']";

	// TM related
	public static final String tmBaseUrl = "https://ipindiaonline.gov.in/trademarkefiling/";
	public static final String tmRegistrationUrl = "user/frmloginNew.aspx";
	public static final String tmWelcomeUrl = "online/welcomeForm.aspx";
	public static String tmUserName = "poojashree";
	public static String tmUserPassword = "Ls123vs32!";
	public static String PATH_TM_HOME_USERNAME = "TBUserName";
	public static String PATH_TM_HOME_PWD = "TBPassword";
	public static String PATH_TM_HOME_CAPTCHA = "txtCaptcha";
	public static String PATH_TM_HOME_CAPTCHA_IMAGE = "//input[@id='TBPassword']/following::img";
	public static String BTN_TM_HOME_LOGIN = "LnkSubmitLogin";
	public static String LNK_TM_WELCOME_FORM_NEW_FORM_FILING = "New Form Filing";
	public static String LNK_TM_WELCOME_FORM_FILE_TMA = "File TM-A";
	public static String PATH_TM_NEW_FORM_APP_INDIVIDUAL = "//*[contains(@id,'ContentPlaceHolder2_rdbatype') and @value='I']";
	public static String PATH_TM_NEW_FORM_APP_STARTUP = "//*[contains(@id,'ContentPlaceHolder2_rdbatype') and @value='S']";
	public static String PATH_TM_NEW_FORM_APP_ENTERPRISE = "//*[contains(@id,'ContentPlaceHolder2_rdbatype') and @value='E']";
	public static String PATH_TM_NEW_FORM_APP_OTHERS = "//*[contains(@id,'ContentPlaceHolder2_rdbatype') and @value='O']";
	public static String PATH_TM_CLASS_CODE = "//*[contains(@id,'ContentPlaceHolder2_txtClassCode')]";
	public static String LNK_TM_CLASS_CODE_SUBMIT = "//a[contains(@id,'LnkSubmit')]";
	public static String PATH_TEMP_NO = "//input[contains(@id,'txtapplicationNumber')]";
	public static String LNK_TM_NEW_FORM_ADD_PROPRIETOR = "//*[contains(@id,'btnpropaddnew') and @value='Add New Proprietor']";
	public static String PATH_TM_NEW_FORM_PROPRIETOR_NAME = "//*[contains(@id,'tbproprietorname')]";
	public static String PATH_TM_NEW_FORM_PROPRIETOR_CATEGORY = "//*[contains(@id,'ddlpropCategory')]";
	public static String PATH_TM_NEW_FORM_PROPRIETOR_ADDRESS = "//*[contains(@id,'tbpropriatorAddress')]";
	public static String PATH_TM_NEW_FORM_PROPRIETOR_NATION = "//*[contains(@id,'proprietorNation')]";
	public static String PATH_TM_NEW_FORM_PROPRIETOR_STATE = "//*[contains(@id,'proprietorstate')]";
	public static String PATH_TM_NEW_FORM_PROPRIETOR_DISTRICT = "//*[contains(@id,'proprietordistrict')]";
	public static String PATH_TM_NEW_FORM_PROPRIETOR_EMAIL = "//*[contains(@id,'proprietorEmail')]";
	public static String PATH_TM_NEW_FORM_PROPRIETOR_PHONENO = "//*[contains(@id,'txtproptelephone')]";
	public static String PATH_TM_NEW_FORM_PROPRIETOR_LEGAL_STATUS = "//*[contains(@id,'proprietorRegdesc')]";
	public static String PATH_TM_NEW_FORM_PROPRIETOR_PARTNERS = "//*[contains(@id,'txtpartnerlist')]";
	public static String BTN_TM_NEW_FORM_PROPRIETOR_SUBMIT = "//*[contains(@id,'btnpropSubmit')]";
	public static String PATH_TM_NEW_FORM_WATERMARK_TYPE = "//*[contains(@id,'wordMarkType')]";
	public static String PATH_TM_NEW_FORM_WORDMARK = "//*[contains(@id,'wordMark') and not(contains(@name,'wordMarkType'))]";
	public static String BTN_TM_NEW_FORM_DEVICE_UPLOAD = "//*[contains(@id,'deviceUpload')]";
	public static String PATH_TM_NEW_FORM_DEVICEMARK_DESC = "//*[contains(@id,'txtdevicemarkdesc')]";
	public static String PATH_TM_NEW_FORM_UPLOAD_PATH = "//*[contains(@id,'imagefile')]";
	public static String BTN_TM_NEW_FORM_UPLOAD = "//*[contains(@id,'btnUpload')]";
	public static String BTN_TM_NEW_FORM_DELETE_UPLOAD = "//input[@type='submit' and @value='Delete']";
	public static String BTN_TM_NEW_FORM_UPLOAD_DONE = "//*[contains(@id,'uploadBack')]";
	public static String PATH_TM_NEW_FORM_TRADEMARK_LANGUAGE = "//*[contains(@id,'languageWordMark')]";
	public static String PATH_TM_NEW_FORM_TRADEMARK_LANGUAGE_TRANSLITERATION = "//*[contains(@id,'transliteration')]";
	public static String PATH_TM_NEW_FORM_TRADEMARK_LANGUAGE_TRANSLATION = "//*[contains(@id,'translation')]";
	public static String LNK_TM_NEW_FORM_TRADEMARK_CLASS_DESC_EDIT = "//*[contains(@id,'lnkEdit')]";
	public static String PATH_TM_NEW_FORM_TRADEMARK_CLASS_DESC = "//*[contains(@id,'txt_goods_service')]";
	public static String LNK_TM_NEW_FORM_TRADEMARK_CLASS_DESC_UPDATE = "//*[contains(@id,'lnkUpdate')]";
	public static String PATH_TM_NEW_FORM_TRADEMARK_PROPOSEDTOUSE = "//*[contains(@id,'proposedToBeUsed')]";
	public static String PATH_TM_NEW_FORM_TRADEMARK_IS_EXISTING = "//*[@id=\"ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_chksince\"]";
	public static String PATH_TM_NEW_FORM_TRADEMARK_EXISTING_DATE = "//*[contains(@id,'usedSince')]";
	public static String LNK_TM_WELCOME_FORM_NEW_FORM_ATTACH_DOCS = "Attach Documents";
	public static String PATH_TM_NEW_FORM_TRADEMARK_DOC_TYPES = "//*[contains(@id,'documentType')]";
	public static String PATH_TM_NEW_FORM_TRADEMARK_UPLOADED_DOCS = "//table[contains(@id,'imagegrid')]";
	public static String PATH_TM_NEW_FORM_TRADEMARK_SUCCESS_ALERT = "//*[@id='programmaticModalPopupBehavior_foregroundElement']";
	public static String PATH_TM_NEW_FORM_TRADEMARK_SUCCESS_ALERT_CLOSE = "//div[@id='programmaticModalPopupBehavior_foregroundElement']//tr[1]//td[1]/a";
	public static String PATH_TM_NEW_FORM_TRADEMARK_SUCCESS_ALERT_MESSAGE = "//div[@id='programmaticModalPopupBehavior_foregroundElement']//tr[2]//td[1]";
	public static String LNK_TM_WELCOME_FORM_NEW_FORM_SAVE_AND_EXIT = "Save & Exit";
	public static String PATH_TM_DELIVERABLE = "//*[contains(text(),'Temporary Number Till Payment')]/following::input[@placeholder='Enter Temporary Number Till Payment']";
	public static String PATH_TM_DELIVERABLE_TRN_SAVE = "//input[@id='name_change_submit_arn']";
	public static String PATH_TM_DELIVERABLE_TRN_SAVE_ACK = "//button[@class='btn btn-success']";
	public static String PATH_TM_APPLICANT_PARTNER_ADDRESS = "//select[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_ddlPartyAddress']";

	// TM Objection
	public static String LNK_TM_MISC_REPLY = "Miscellaneous Reply";
	public static String PATH_TM_OBJECTION_EXAMINATION_REPORT = "//input/preceding::label[contains(text(),'REPLY TO EXAMINATION REPORT(MIS-R)')]";
	public static String PATH_TM_OBJECTION_APPLICATION_NO = "//*[contains(@id,'TBApplicationnumber')]";
	public static String LNK_TM_OBJECTION_PROCEED = "//*[contains(@id,'btnProceed')]";
	public static String PATH_TM_OBJECTION_MODE = "//*[contains(@id,'ddlhearingmode')]";
	public static String PATH_TM_OBJECTION_REPLY = "//*[contains(@id,'chkReply')]";
	public static String LNK_TM_OBJECTION_UPLOAD = "//*[contains(@id,'LnkUpload')]";
	public static String PATH_TM_OBJECTION_DOC_TYPE = "//*[contains(@id,'DDLDocType')]";
	public static String PATH_TM_OBJECTION_POA_DOC = "//table/tbody/tr[2]/td[3]/text()";
	public static String PATH_TM_OBJECTION_EXAMREPORT_DOC = "//table/tbody/tr[3]/td[3]/text()";
	public static String PATH_TM_OBJECTION_DOC_ATTACHMENT = "//*[contains(@id,'AFUAttachments')]";
	public static String LNK_TM_OBJECTION_DOC_ATTACHMENT_UPLOAD = "//*[contains(@id,'lblAddMore')]";
	public static String BTN_TM_OBJECTION_DOC_ATTACHMENT_DELETE = "//*[contains(@id,'deleteButton')]";
	public static String PATH_TM_OBJECTION_DOC_ATTACHMENT_AUTH = "//*[contains(text(),'POA.pdf')]";
	public static String PATH_TM_OBJECTION_DOC_ATTACHMENT_EXAM_REPORT = "//*[contains(text(),'ExamReport.pdf')]";
	public static String LNK_TM_OBJECTION_DOC_ATTACHMENT_CLOSE = "//a[text()='Close']";
	public static String LNK_TM_OBJECTION_DOC_SUBMIT = "Submit";
	public static String PATH_TM_OBJECTION_DRAFT_TABLE = "//table[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_GVFiledForms']";
	public static String PATH_TM_OBJECTION_UPLOADED_DELETE1 = "//input[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_FormUpload1_GVFiledForms_ctl02_deleteButton']";
	public static String PATH_TM_OBJECTION_UPLOADED_DELETE2 = "//input[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_FormUpload1_GVFiledForms_ctl03_deleteButton']";
	public static String PATH_TM_OBJECTION_APPNUMBER_INVALID = "//span[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_lbPopmsg']";
	// TM Opposition
	public static String LNK_TM_OPPOSITION = "File TM-O";
	public static String LNK_TM_OPPOSITION_COUNTER_STMT = "//input/preceding::label[contains(text(),'COUNTER STATEMENT')]";
	public static String PATH_TM_OPPOSITION_OPPO_NO_OPTION = "//input/preceding::label[contains(text(),'OPPOSITION NO')]";
	public static String PATH_TM_OPPOSITION_OPPO_NO = "//*[contains(@id,'txt_counter_opposition_no')]";
	public static String BTN_TM_OPPOSITION_APPLY = "//input[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_Button2']";
	public static String PATH_TM_OPPOSITION_OPPO_DETAILS = "//input/preceding::label[contains(text(),'Detailed counter statement is attached separately')]";
	public static String PATH_TM_OPPOSITION_DOC_ANNEXURE_OPPO_NOTICE_ATTACHMENT = "//*[contains(text(),'Annexure_Oppo_Notice.pdf')]";
	public static String PATH_TM_OPPOSITION_DOC_ANNEXURE_COUNTER_STMT_ATTACHMENT = "//*[contains(text(),'Annexure_Counter_Stmt.pdf')]";
	public static String PATH_TM_OPPOSITION_DOC_ANNEXURE_45_ATTACHMENT = "//*[contains(text(),'Annexure_45.pdf')]";
	public static String PATH_TM_OPPOSITION_DOC_ANNEXURE_46_ATTACHMENT = "//*[contains(text(),'Annexure_46.pdf')]";
	public static String PATH_TM_OPPOSITION_DOC_ANNEXURE_47_ATTACHMENT = "//*[contains(text(),'Annexure_47.pdf')]";
	public static String PATH_TM_OPPOSITION_DOC_AUTH_ATTACHMENT_CS = "//*[contains(text(),'Authorization_Document_CS.pdf')]";
	public static String PATH_TM_OPPOSITION_DOC_AUTH_ATTACHMENT_NOO = "//*[contains(text(),'Authorization_Document_NOO.pdf')]";
	public static String PATH_TM_OPPOSITION_DOC_AUTH_ATTACHMENT_45 = "//*[contains(text(),'Authorization_Document_45.pdf')]";
	public static String PATH_TM_OPPOSITION_DOC_AUTH_ATTACHMENT_46 = "//*[contains(text(),'Authorization_Document_46.pdf')]";
	public static String PATH_TM_OPPOSITION_DOC_AUTH_ATTACHMENT_47 = "//*[contains(text(),'Authorization_Document_47.pdf')]";
	public static String LNK_TM_OPPOSITION_NOTICE_OF_OPPOSITION = "//input/preceding::label[contains(text(),'NOTICE OF OPPOSITION')]";
	public static String PATH_TM_OPPOSITION_APPLICATION = "//*[contains(text(),'APPLICATION NO')]/following::input[1]";
	public static String BTN_TM_OPPOSITION_NOTICE_OF_OPPOSITION_APPLY = "//input[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_btnForOpposition']";
	public static String PATH_TM_OPPOSITION_APPLICANT_TYPE = "//*[contains(@id,'ddlAPPLICANT')]";
	public static String BTN_TM_OPPOSITION_APPLICANT_ADDNEW = "//input[@value='ADD NEW']";
	public static String PATH_TM_OPPOSITION_APPLICANT_NAME = "//*[contains(@id,'textname')]";
	public static String PATH_TM_OPPOSITION_APPLICANT_ADDRESS = "//*[contains(@id,'txtaddress')]";
	public static String PATH_TM_OPPOSITION_APPLICANT_SERVICE_ADDRESS = "//*[contains(@id,'txtaddressForService')]";
	public static String PATH_TM_OPPOSITION_APPLICANT_STATE = "//*[contains(@id,'ddl_applicant_state')]";
	public static String PATH_TM_OPPOSITION_APPLICANT_MOBILENO = "//*[contains(@id,'txtmobno')]";
	public static String PATH_TM_OPPOSITION_APPLICANT_EMAILADDRESS = "//*[contains(@id,'txtemailaddr')]";
	public static String PATH_TM_OPPOSITION_OPPO_ATTACHMENT_DETAILS = "//input/preceding::label[contains(text(),'Grounds of opposition are attached separately')]";
	public static String LNK_TM_OPPOSITION_MISR45 = "//input/preceding::label[contains(text(),'EVIDENCE IN SUPPORT OF OPPOSITION RULE45 (MISR45)')]";
	public static String LNK_TM_OPPOSITION_MISR46 = "//input/preceding::label[contains(text(),'EVIDENCE IN SUPPORT OF APPLICATION RULE46 (MISR46)')]";
	public static String LNK_TM_OPPOSITION_MISR47 = "//input/preceding::label[contains(text(),'EVIDENCE IN SUPPORT REPLY BY OPPONENT RULE47 (MISR47)')]";
	public static String PATH_TM_OPPOSITION_MISR_APP_NO = "//input[contains(@id,'TBApplicationnumber')]";
	public static String PATH_TM_OPPOSITION_MISR_CHECK_ATTACHMENT = "//input/preceding::label[contains(text(),'Reply attached seperately')]";
	public static String PATH_TM_OPPOSITION_NOTICE_SUCCESS_ALERT = "//span[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_LblMessage']";
	public static final String tmFormDraftUrl = "Online/frmfiledforms.aspx?formType=O";

	// INCOPORATION LLP/PVT

	public static final String mcaLoginUrl = "http://www.mca.gov.in/mcafoportal/login.do";
	public static String PATH_DOWNLOAD_DIRECTORY_INC_RUN = "E:\\INC_RUN_CERTIFICATES\\";
	public static final String mcaIncLLPRegistrationUrl = "http://www.mca.go.in/mcafoportal/runLLPService.do";
	public static final String mcaIncPvtRegistrationUrl = "http://www.mca.gov.in/mcafoportal/runService.do";
	public static String PATH_MCA_HOME_USERNAME = "userName";
	public static String PATH_MCA_HOME_PWD = "password";
	public static String PATH_MCA_HOME_CAPTCHA_RESET = "//tbody/tr[7]/td[1]/p[1]/a[1]/img[1]";
	public static String PATH_MCA_HOME_CAPTCHA_IMAGE = "//*[@id=\"captcha\"]";
	public static String PATH_MCA_HOME_CAPTCHA = "//*[@id='userEnteredCaptcha']";
	public static String BTN_MCA_HOME_LOGIN = "//*[@value='Sign In' and @type='submit']";
	public static String PATH_MCA_HOME_ALREADY_LOGIN_ALERT = "//li[contains(text(),'already logged in from other machine')]";
	public static String PATH_MCA_HOME_CAPTCHA_ALERT = "//li[contains(text(),'Please enter letters shown.')]";
	public static String PATH_MCA_HOME_INVALID_CAPTCHA_ALERT = "//li[contains(text(),'Enter valid Letters shown.')]";
	public static String PATH_MCA_HOME_INVALID_CREDENTIALS_ALERT = "//li[contains(text(),'Invalid Username/Password.')]";
	public static String PATH_INC_RUN_FORM_FORM_OPTION = "//input[contains(@name,'runOption') and contains(text(),'New Request')]";
	public static String PATH_INC_RUN_FORM_PVT_ALERT_CLOSE = "//button[@class='close']";
	public static String PATH_INC_RUN_FORM_FORM_TYPE_LLP = "//*[contains(text(),'New Incorporation/Conversion')]/following::select[1]";
	public static String PATH_INC_RUN_FORM_FORM_TYPE = "//*[contains(text(),'Entity Type')]/following::select[1]";
	public static String PATH_INC_RUN_FORM_LLPIN = "//*[@name='llpin']";
	public static String PATH_INC_RUN_FORM_PROPOSEDNAME1 = "//*[@name='proposedName1']";
	public static String PATH_INC_RUN_FORM_PROPOSEDNAME2 = "//*[@name='proposedName2']";
	public static String PATH_INC_RUN_FORM_COMMENTS_ATTACHMENT = "//*[@name='pdfFile']";
	public static String PATH_INC_RUN_FORM_COMMENTS = "//*[@name='comments']";

	public static String BTN_INC_RUN_FORM_NAME_CONFIRMATION_PROOF = "//form[@class='form-style ng-valid ng-dirty ng-touched']";
	public static String BTN_INC_RUN_FORM_AUTOCHECK = "//*[text()='Auto Check']";
	public static String BTN_INC_RUN_FORM_OBJECTIVE_UPLOAD_PATH = "//*[@name='pdfFile']";
	public static String BTN_INC_RUN_FORM_SUBMIT = "//*[contains(@class,'imgButton') and contains(text(),'Submit')]";
	public static String PATH_INC_RUN_FORM_ALERT_MESSAGE_NOT_AVAILABLE = "//*[text()='Proposed name is already applied for/ issued to any company/LLP. Please enter a new name.']";
	public static String PATH_INC_RUN_FORM_ALERT_MESSAGE_AVAILABLE = "//*[contains(text(),'Based on a preliminary check conducted by the system, it appears that the name applied for is not identical to an existing name in the electronic registry.')]";
	public static String PATH_INC_RUN_FORM_NAME_AVAILABILITY_ALERT_FALSE = "//div[@class='alert alert-danger alert-dismissable fade in']";
	public static String PATH_INC_RUN_FORM_NAME_AVAILABILITY_ALERT_TRUE = "//div[@class='alert alert-success alert-dismissable fade in']";
	public static String PATH_INC_RUN_FORM_CONFIRM_SUBMIT_MODAL = "//div[@class='modal modal-message modal-success fade in']";
	public static String BTN_INC_RUN_FORM_CONFIRM_SUBMIT_MODAL_YES = "//button[contains(text(),'Yes')]";
	public static String BTN_INC_RUN_FORM_CONFIRM_SUBMIT_MODAL_NO = "//button[contains(text(),'No')]";
	public static String PATH_INC_RUN_FORM_PAYMENT_PAGE = "//div[@class='panel-heading' and text()='Payment Details']";
	public static String PATH_INC_RUN_FORM_SRN = "//table[@class='table']//tbody/tr[1]/td[1]";
	public static String PATH_INC_RUN_FORM_PAYMENT_AMOUNT = "//table[@class='table']//tbody/tr[1]/td[5]";
	public static String BTN_INC_RUN_FORM_PAYNOW = "//button[@class='pull-right btn-radious imgButton']";
	public static String BTN_INC_RUN_FORM_NETBANKING_OPTION = "//input[@value='Online Internet Banking']";
	public static String PATH_INC_RUN_FORM_NETBANKING_BANK_OPTION = "//select[@id='internet_Bank_error']";
	public static String BTN_INC_RUN_FORM_NETBANKING_SUBMIT = "//input[@id='submitBtn']";
	public static String BTN_INC_RUN_FORM_NETBANKING_DECLARATION = "//*[@id='acceptBtn']";
	public static String PATH_INC_RUN_FORM_NETBANKING_TRANSACTION_ACK = "//*[contains(text(),'Transaction Successful')]";
	public static String LNK_INC_RUN_FORM_PAYMENT_RECEIPT = "/PaymentResponseShowReceipt.do";
	public static String PATH_INC_RUN_FORM_NETBANKING_SUBMIT_OTP = "//img[@src='/gif/submit.gif']";
	public static final String mcaSRNTrackUrl = "http://www.mca.gov.in/mcafoportal/TrackSRNStatusAction.do";
	public static String PATH_INC_RUN_TRACK_SRN_FIELD = "//input[@id='srn']";
	public static String PATH_INC_RUN_TRACK_SRN_SUBMIT = "//input[@id='TrackSRNStatusAction_0']";
	public static String PATH_INC_RUN_TRACK_SRN_RECEIPT_COPY = "//input[@id='screen_button_ViewFormChallan']";
	public static String PATH_INC_RUN_TRACK_SRN_PAYMENT_STATUS = "//table[@id='results']//td[3]";
	public static String PATH_INC_RUN_TRACK_SRN_PAYMENT_RECEIPT_LINK = "//table[@id='results']//td[3]//a[1]";

	// TM Hearing
	public static String PATH_TM_HEARING_SHOW_CAUSE_HEARING = "//input/preceding::label[contains(text(),'DOCUMENTS IN SUPPORT OF SHOW-CAUSE-HEARING (SCH)')]";
	public static String PATH_TM_HEARING_DOC_ATTACHMENT_AUTH = "//*[contains(text(),'Hearing_Document.pdf')]";

	// INC DSC - Sify
	public static final String sifyDSCUrl = "https://dsc.safescrypt.com/ankitdsc/1000.html?code=0&type=I";
	public static String PATH_SIFY_FIRST_NAME = "//input[@id='DNFields1_1']";
	public static String PATH_SIFY_PAN_NUMBER = "//input[@id='DNFields3_1']";
	public static String PATH_SIFY_MOBILE_NUMBER = "//input[@id='DNFields6_1']";
	public static String PATH_SIFY_STATE = "//select[@id='DNFields7_1']";
	public static String PATH_SIFY_PINCODE = "//input[@id='DNFields8_1']";
	public static String PATH_SIFY_COUNTRY = "//select[@id='DNFields10_1']";
	public static String PATH_SIFY_ADDRESS1 = "//textarea[@id='Address1_nml']";
	public static String PATH_SIFY_ADDRESS2 = "//textarea[@id='Address2_nml']";
	public static String PATH_SIFY_LOCALITY = "//input[@id='Address1Locality_nml']";
	public static String PATH_SIFY_CITY = "//input[@id='Address1City_nml']";
	public static String PATH_SIFY_CHALLENGE_PASSPHRASE = "//input[@id='chalPhrase']";
	public static String PATH_SIFY_CONFIRM_PASSPHRASE = "//input[@id='ConfirmchalPhrase']";
	public static String PATH_SIFY_REGISTRATION_NO = "//input[@id='regNo']";
	public static String PATH_SIFY_EMAIL_ID = "//input[@id='gnFields1']";
	public static String PATH_SIFY_COMMENTS = "//textarea[@id='RegFields2_1']";
	public static String BTN_SIFY_REGISTER = "//input[@id='reg_submit']";
	public static String BTN_SIFY_CONFIRM = "//div[@id='PAGE_reg_Conf']//input[1]";// input[@id='reg_submit']

	public static final String sifyDSCEraUrl = "https://dsc.safescrypt.com:9100/";
	public static String BTN_SIFY_QUEUE = "//div[@id='queue']";
	public static String BTN_SIFY_VIEW_QUEUE = "//input[@id='ViewQueue']";

	public static String BTN_SIFY_QUEUE_TABLE_ROW = "//table[@id='QueueReportTable_V2.0']//tbody[@id='QueueReportTable_Body']//tr[not(contains(@style,'display: none;'))]";

	// Sify DSC Download
	public static final String sifyDSCDownloadUrl = "https://dsc.safescrypt.com/ankitdsc/6000.html?code=0&type=I";
	public static String PATH_SIFY_SEARCH = "//div[@id='mn_sear']";
	public static String PATH_SIFY_SOFTWARE_ALERT = "//div[@id='progPrompt']";
	public static String PATH_SIFY_PROCEED_DOWNLOAD = "//span[@id='updatewsnorkletlink']";
	public static String PATH_SIFY_EMAIL_SEARCH = "//input[@id='searchEID']";
	public static String BTN_SIFY_EMAIL_SEARCH = "//input[@id='RegSub']";
	public static String PATH_SIFY_SEARCH_PROGRESS = "//img[@id='progress_image']";
	public static String PATH_SIFY_SEARCH_TABLE = "//table[@id='CertReportTable_aserpttbl']/tbody//tr";

	// GST Filing
	public static final String gstFilingUrl = "https://services.gst.gov.in/services/login";
	public static String PATH_GST_LOGIN_USERNAME = "//*[@id='username']";
	public static String PATH_GST_LOGIN_PWD = "//*[@id='user_pass']";
	public static String PATH_GST_LOGIN_CAPTCHA_IMAGE = "//*[@id='imgCaptcha']";
	public static String PATH_GST_LOGIN_CAPTCHA = "//*[@id='captcha']";
	public static String BTN_GST_LOGIN = "//button[contains(@class,'btn-primary')]";
	public static String BTN_GST_RETURN_DASHBOARD = "//span[contains(text(),'Return Dashboard')]";
	public static String BTN_GST_FILE_ADAMENT_BUTTON = "//*[@id=\"confirmDlg\"]/div/div/div[2]/a";
	public static String PATH_GST_FIN_YEAR = "//select[@name='fin']";
	public static String PATH_GST_FIN_MONTH = "//select[@name='mon']";
	public static String BTN_GST_FILING_SEARCH = "//button[contains(text(),'Search')]";
	public static String BTN_GST_GSTR3B_PREPARE_ONLINE = "//p[contains(text(),'GSTR3B')]/following::button[1]";
	public static String BTN_GST_GSTR3B_PREPARE_OFFLINE = "//p[contains(text(),'GSTR3B')]/following::button[2]";
	public static String BTN_GST_GSTR1_PREPARE_ONLINE = "//p[contains(text(),'GSTR1')]/following::button[1]";
	public static String BTN_GST_GSTR1_PREPARE_OFFLINE = "//p[contains(text(),'GSTR1')]/following::button[2]";
	public static String PATH_GST_OFFLINE_UPLOAD = "//input[@id='offline_file']";
	public static String PATH_GST_OFFLINE_JSON_TABLE = "//div[@class='table-responsive']";
	public static String PATH_GST_BACK_TO_FILE_RETURNS = "//span[contains(text(),'BACK TO FILE RETURNS')]";
	public static String BTN_GST_GSTR3B_PREPARE_ONLINE_OK = "//div[@class='modal-dialog']//button[@class='btn btn-primary'][contains(text(),'OK')]";
	public static String BTN_GST_GENERATE_GSTR1_SUMMARY = "//*[contains(text(),'Generate GSTR1 Summary')]";
	public static String BTN_GST_GSTR1_SUBMIT_CHECK = "//input[@id='submitCheckbox']";
	public static String BTN_GST_GSTR1_SUBMIT = "//button[contains(text(),'SUBMIT')]";
	public static String PATH_GST_QUES_NIL_YES = "//input[@id='nilyes']";
	public static String PATH_GST_QUES_NIL_NO = "//input[@id='nilno']";
	public static String PATH_GST_QUES_OUTWARD_YES = "//input[@id='outwardyes']";
	public static String PATH_GST_QUES_OUTWARD_NO = "//input[@id='outwardno']";
	public static String PATH_GST_QUES_INTERSTATE_YES = "//input[@id='interstateyes']";
	public static String PATH_GST_QUES_INTERSTATE_NO = "//input[@id='interstateno']";
	public static String PATH_GST_QUES_ITC_YES = "//input[@id='itcyes']";
	public static String PATH_GST_QUES_ITC_NO = "//input[@id='itcno']";
	public static String PATH_GST_QUES_EXEMPT_YES = "//input[@id='exemptyes']";
	public static String PATH_GST_QUES_EXEMPT_NO = "//input[@id='exemptno']";
	public static String PATH_GST_QUES_INTEREST_YES = "//input[@id='interestyes']";
	public static String PATH_GST_QUES_INTEREST_NO = "//input[@id='interestno']";
	public static String PATH_GST_QUES_LATEFEES_YES = "//input[@id='latefeeyes']";
	public static String PATH_GST_QUES_LATEFEES_NO = "//input[@id='latefeeno']";

	// Incometax

	public static final String incometaxLoginUrl = "https://www.incometaxindiaefiling.gov.in/";
	public static String PATH_CONTINUE_HOME_PAGE = "//button[contains(text(),'Continue to Homepage')]";
	public static String BTN_LOGIN_HERE = "//*[@value='  Login Here  ']";
	public static String PATH_LOGIN_USERNAME = "//*[contains(text(),'User ID')]/following::input[1]";
	public static String PATH_LOGIN_PWD = "//*[contains(text(),'Password')]/following::input[1]";
	public static String PATH_CAPTCHA_IMAGE = "//img[@id='captchaImg']";
	public static String PATH_CAPTCHA = "//*[contains(text(),'Enter Captcha')]/following::input[1]";
	public static String BTN_LOGIN = "//input[@id='button1']";
	public static String BTN_FORCED_LOGIN = "//form[@id='ForcedLogin']";
	public static String PATH_INVALID_LOGIN_ALERT = "//span[contains(text(),'User ID or Password is invalid.')]";
	public static String PATH_MY_ACC = "//*[text()='My Account']";
	public static String LNK_DWLD_XML = "//*[text()='Download Pre-filled XML']";
	public static String PATH_DWLD_PAN_RDONLY = "//input[@id='userId' and @readonly='readonly']";
	public static String PATH_DWLD_PAN = "//input[@name='panNo']";
	public static String PATH_FISCAL_YEAR = "//select[@id='asYear']";
	public static String PATH_RETURN_TYPE = "//select[@id='returnType']";
	public static String BTN_CONTINUE = "//input[@id='continueButton']";
	public static String BTN_DWLD_XML = "//div[@id='dynamicContent']//input[@value='Download XML']";
	public static String PATH_ADD_UPDATE_ALERT = "//div[@id='AddressUpdate']";
	public static String BTN_UPDATE_ALERT_CONTINUE = "//div[@id='AddressUpdate']//input[@value='Continue']";
	public static String BTN_UPDATE_ALERT_SKIP = "//input[@id='UpdateContactDtls_2']";
	public static String PATH_CA_TABLE = "//table[@id='listOfCA']";
	public static String PATH_DWLD_XML_ALERT = "//input[@id='prefillConcentFlag']";
	public static String PATH_DWLD_XML_CONTINUE = "//div[@id='prefillConcentDialog']//input[@value='Continue']";

	// SpicePlus Part A

	public static String PATH_MCA_SERVICES = "//a[contains(text(),'MCA SERVICES')]";
	public static String PATH_SPICE_PLUS = "//li[@class='navborder']//ul//li//a[contains(text(),'SPICe+')]";

	public static String PATH_NEW_APPLICATION_BTN = "//h6[contains(text(),'New Application')]";
	public static String PATH_TYPE_OF_COMPANY_DROPDOWN = "//select[@name='companyType']";
	public static String PATH_CLASS_OF_COMPANY_DROPDOWN = "//select[@id='companyClass']";
	public static String PATH_CATEGORY_OF_COMPANY_DROPDOWN = "//select[@id='companyCategory']";
	public static String PATH_SUBCATEGORY_OF_COMPANY_DROPDOWN = "//select[@id='subCompanyCategory']";
	public static String PATH_MAIN_DIVISION_OF_COMPANY_TBX = "//input[@name='mainDivision']";
	public static String PATH_DESCRIPTION_OF_MAIN_DIVISION = "//textarea[@id='mainDivDescription']";
	public static String PATH_PARTICULARS_OF_PROPOSED_NAME_1 = "//input[@name='proposedName1']";
	public static String PATH_PARTICULARS_OF_PROPOSED_NAME_2 = "//input[@name='proposedName2']";
	public static String PATH_SUMMARY_OF_THE_OBJECTS = "//*[@id=\"companiesact1\"]/section/app-spiceparta/form/div/div/div[5]/div[2]/div[8]/textarea";
	public static String PATH_Attachment_PartA = "//*[@id=\"pdfFile\"]";
	public static String PATH_AUTOCHECK_BTN = "//button[@id='autocheckDetails']";
	public static String PATH_SAVE_BTN = "//button[@id='saveDetails']";
	public static String PATH_SUBMIT_BTN = "//button[@id='submitDetails']";
	public static String PATH_PROCEED1_BTN = "/html[1]/body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceparta[1]/form[1]/div[1]/div[1]/div[6]/div[4]/button[1]";

	// SpicePlus Part A LLP

	public static String PATH_NEW_INCORPORATION_DRN = "//select[@name='incorpType']";
	public static String PATH_PARTICULARS_OF_PROPOSED_NAME_1_LLP = "//input[@name='proposedName1']";
	public static String PATH_PARTICULARS_OF_PROPOSED_NAME_2_LLP = "//input[@name='proposedName2']";
	public static String PATH_SUMMARY_OF_THE_OBJECTS_LLP = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-runllp[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[9]/textarea[1]";
	public static String PATH_Attachment_PartA_LLP = "//*[@name=\"pdfFile\"]";
	public static String PATH_Attachment_PartA_LLP1 = "/html/body/app-root/div/div[5]/div[1]/section/app-runllp/form/div/div/div[5]/div[2]/div[10]/input";
	public static String PATH_AUTOCHECK_BTN_LLP = "//button[contains(text(),'Auto Check')]";
	public static String PATH_AUTOCHECK_MSG_LLP = "/html[1]/body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-runllp[1]/form[1]/div[1]/div[1]/div[3]/span[1]";
	public static String PATH_SUBMIT_BTN_LLP = "//button[contains(text(),'Submit')]";
	public static String PATH_YES_BTN_LLP = "//button[contains(text(),'Yes')]";
	public static String PATH_PAY_NOW_BTN_LLP = "//button[contains(text(),'Pay Now')]";
	public static String PATH_SRN_LLP = "/html[1]/body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-payment[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]";
	public static String PATH_PAYMENT_LLP = "//tbody/tr[1]/td[5]";

	// cancel SRN

	public static String PATH_CANCEL_SRN_SUBMIT_BTN = "//input[@id='TrackSRNStatusAction_0']";
	public static String PATH_CANCEL_SRN_INPUT_TBX = "//input[@id='srn']";
	public static String PATH_CANCEL_SRN_LINK = "//tbody/tr[2]/td[6]/a[1]";
	public static String PATH_CANCEL_SRN_YES = "//button[@id='confirm_yes']";
	public static String PATH_CANCEL_SRN_MESSAGE = "/html[1]/body[1]/div[1]/div[6]/div[1]/section[1]/div[2]/div[1]/ul[1]/li[1]";
	public static String PATH_CANCEL_SRN_MESSAGE_CLOSE = "//a[@id='msgboxclose']";

	public static String PATH_NAME_RESERVATION_BTN = "//*[@id=\"submitNR\"]";
	public static String PATH_PAY_NOW_BTN = "//*[@id=\"companiesact1\"]/section/app-payment/form/div/div/div[3]/button";
	public static String PATH_APPLICATION_NUMBER_LINK = "//*[@id=\"companiesact1\"]/section/app-spice/form/div/div/div[5]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[1]/a";
	public static String PATH_SRN = "//*[@id=\"companiesact1\"]/section/app-payment/form/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]";
	public static String PATH_SIGN_OUT = "//*[@id=\"loginAnchor\"]";
	public static String PATH_SRN_TBX = "//input[@id='srn']";
	public static String PATH_SRN_SUBMIT_BTN = "//input[@id='trackPaymentStatus_0']";
	public static String PATH_EFORM_DOWNLOAD = "//input[@id='screen_button_ViewFormChallan']";
	public static String PATH_EFORM_STATUS = "(//td[@align='center'])[4]";

	public static String PATH_START_DATE = "//*[@id=\"mat-input-0\"]";
	public static String PATH_END_DATE = "//*[@id=\"mat-input-1\"]";
	public static String PATH_DATE_SEARCH_BTN = "//*[@id=\"nextButton1\"]";
	public static String PATH_DATE_SPINNER1 = "/html/body/app-root/div/div[5]/div[1]/section/app-spice/form/div/div/div[6]/div[7]";
	public static String PATH_EDIT_PARTA = "//*[@id=\"companiesact1\"]/section/app-spice/form/div/div/div[5]/div[2]/div[3]/div/table/tbody/tr[1]/td[4]/a/img";
	public static String PATH_EDIT_PARTB = "//*[@id=\"companiesact1\"]/section/app-spice/form/div/div/div[5]/div[2]/div[3]/div/table/tbody/tr[2]/td[4]/a/img";
	public static String PATH_DATE_SPINNER = "//*[@id=\"companiesact1\"]/section/app-spice/form/div/div/div[6]/div[7]";

	public static String PATH_COMPANY_NAME = "//*[@id=\"companiesact1\"]/section/app-spice/form/div/div/div[5]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[2]";

	public static String PATH_EXISTING_APPLICATION = "/html/body/app-root/div/div[5]/div[1]/section/app-spice/form/div/div/div[5]/div[2]/div[1]/div[2]/div/div/h6";

	public static String PATH_AUTOCHECK_MSG = "/html[1]/body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceparta[1]/form[1]/div[1]/div[1]/div[3]/span[1]";
	public static String PATH_SUBMIT_NAME_RSRVTN_BTN = "//button[contains(text(),'Submit for Name Reservation')]";
	public static String PATH_PROCEED_FOR_INCORP_BTN = "//button[contains(text(),'Proceed for Incorporation')]";
	public static String PATH_ARTICLE_ASSOCIATION_RBTN_YES = "//div[@id='page1']//div[1]//div[2]//input[1]";
	public static String PATH_ARTICLE_ASSOCIATION_RBTN_NO = "//div[@id='page1']//div[1]//div[2]//input[2]";
	public static String PATH_HAVING_SHARE_CAPITAL_RBTN = "//div[@id='page1']//div[3]//div[2]//input[1]";
	public static String PATH_NOT_HAVING_SHARE_CAPITAL_RBTN = "//div[@id='page1']//div[3]//div[2]//input[2]";
	public static String PATH_ASC_NUMBER_OF_SHARES__EQUITY_NBX = "//input[@name='partbDtls.authNoOfSharesEq']";
	public static String PATH_ASC_NUMBER_OF_SHARES__PREFERENCE_NBX = "//input[@name='partbDtls.authNoOfSharesPref']";
	public static String PATH_ASC_NOMINAL_AMOUNT_PER_SHARE__EQUITY_NBX = "//input[@name='partbDtls.authNomAmtPerShareEq']";
	public static String PATH_ASC_TOTAL_AMOUNT__EQUITY_NBX = "//input[@name='partbDtls.authTotalAmtEQ']";
	public static String PATH_ASC_TOTAL_AMOUNT__PREFERENCE_NBX = "//input[@name='partbDtls.authTotalAmtPref']";
	public static String PATH_ASC_TOTAL_AMOUNT__UNCLASSIFIED_NBX = "//input[@name='partbDtls.authTotalAmtUnclass']";
	public static String PATH_SSC_NUMBER_OF_SHARES__EQUITY_NBX = "//input[@name='partbDtls.subNoOfSharesEq']";
	public static String PATH_SSC_NUMBER_OF_SHARES__PREFERENCE_NBX = "//input[@name='partbDtls.subNoOfSharesPref']";
	public static String PATH_SSC_NOMINAL_AMOUNT_PER_SHARE__EQUITY_NBX = "//input[@name='partbDtls.subNomAmtPerShareEq']";
	public static String PATH_SSC_TOTAL_AMOUNT__EQUITY_NBX = "//input[@name='partbDtls.subTotalAmtEQ']";
	public static String PATH_STRUCTURE_OF_COMPANY_SAVE_BTN = "//*[@id=\"page1\"]/div[5]/button";
	public static String PATH_CORRES_ADDRESS_LINE_1_TBX = "//input[@name='partbDtls.companyAddress.line1']";
	public static String PATH_CORRES_ADDRESS_LINE_2_TBX = "//input[@name='partbDtls.companyAddress.line2']";
	public static String PATH_CORRES_ADDRESS_CITY_TBX = "//input[@name='partbDtls.companyAddress.city']";
	public static String PATH_CORRES_ADDRESS_STATE_DRN = "//select[@name='partbDtls.companyAddress.state']";
	public static String PATH_CORRES_ADDRESS_PIN_CODE_NBX = "//input[@name='partbDtls.companyAddress.pincode']";
	public static String PATH_CORRES_ADDRESS_DISTRICT_DRN = "//select[@name='partbDtls.companyAddress.district']";
	public static String PATH_CORRES_ADDRESS_PHONE_STD_NBX = "//input[@name='partbDtls.companyAddress.phoneIsd']";
	public static String PATH_CORRES_ADDRESS_PHONE = "//input[@name='partbDtls.companyAddress.phone']";
	public static String PATH_CORRES_ADDRESS_EMAILID_TBX = "//input[@name='partbDtls.companyAddress.emailId']";
	public static String PATH_CORRES_ADDRESS_SAME_COMPANY_ADDRESS_YES_RBTN = "//div[@id='page2']//div[10]//div[2]//input[1]";
	public static String PATH_CORRES_ADDRESS_NAME_OF_OFFICE_DRN = "//select[@name='partbDtls.roc']";
	public static String PATH_ADDRESS_OF_COMPANY_SAVE_BTN = "//*[@id=\"page2NextButton\"]";
	public static String PATH_SUBDIR_TOTAL_NO_FIRST_SUB_HAVING_DIN_TBX = "//input[@id='one']";
	public static String PATH_SUBDIR_TOTAL_NO_FIRST_SUB_NOT_HAVING_DIN_TBX = "//input[@id='two']";
	public static String PATH_SUBDIR_NO_OF_NONIND_NOT_HAVING_DIN = "//input[@id='four']";
	public static String PATH_SUBDIR_NO_OF_IND_HAVING_DIN = "//input[@id='five']";
	public static String PATH_SUBDIR_NO_OF_IND_NOT_HAVING_DIN = "//input[@id='six']";
	public static String PATH_SUBDIR_TOTAL_OF_DIR_HAVING_DIN = "//input[@id='seven']";
	public static String PATH_SUBDIR_TOTAL_OF_DIR_NOT_HAVING_DIN = "//input[@id='eight']";
	public static String PATH_SAVE_AND_CONTINUE3_BTN = "//div[@id='page3']//button[@name='nextButton2'][contains(text(),'Save & Continue')]";
	public static String PATH_ADD_DIR_1 = "//tr[1]//td[2]//a[1]";
	public static String PATH_ADD_DIR_2 = "//tr[2]//td[2]//a[1]";
	public static String PATH_ADD_DIR_3 = "//tr[3]//td[2]//a[1]";
	public static String PATH_DIR_DETAILS_FIRST_NAME = "//div[@id='modalD2']//input[@name='firstName']";
	public static String PATH_DIR_DETAILS_MIDDLE_NAME = "//div[@id='modalD2']//input[@name='middleName']";
	public static String PATH_DIR_DETAILS_LAST_NAME = "//div[@id='modalD2']//input[@name='lastName']";
	public static String PATH_DIR_DETAILS_FATHER_FIRST_NAME = "//div[@id='modalD2']//input[@name='fatherFirstName']";
	public static String PATH_DIR_DETAILS_FATHER_MIDDLE_NAME = "//div[@id='modalD2']//input[@name='fatherMiddleName']";
	public static String PATH_DIR_DETAILS_FATHER_LAST_NAME = "//div[@id='modalD2']//input[@name='fatherLastName']";
	public static String PATH_DIR_DETAILS_GENDER = "//select[@name='currentsection4d2Model.gender']";
	public static String PATH_DIR_DETAILS_DATE_OF_BIRTH = "//input[@id='mat-input-6']";
	public static String PATH_DIR_DETAILS_NATIONALITY = "//div[@id='modalD2']//select[@name='nationality']";
	public static String PATH_DIR_DETAILS_PLACE_OF_BIRTH = "//div[@id='modalD2']//input[@name='placeOfBirth']";
	public static String PATH_DIR_DETAILS_CITIZEN_OF_INDIA_YES = "//body[@class='modal-open']/app-root/div[@id='container']/div[@id='innerContent']/div[@id='companiesact1']/section/app-spicepartb[@class='ng-star-inserted']/div[@class='row']/div[@id='modalD2']/div[@class='modal-content']/div[@class='modal-body']/div[2]/div[1]";
	public static String PATH_DIR_DETAILS_CITIZEN_OF_INDIA_NO = "//body[@class='modal-open']/app-root/div[@id='container']/div[@id='innerContent']/div[@id='companiesact1']/section/app-spicepartb[@class='ng-star-inserted']/div[@class='row']/div[@id='modalD2']/div[@class='modal-content']/div[@class='modal-body']/div[2]/div[2]";
	public static String PATH_DIR_DETAILS_RESIDENT_OF_INDIA_YES = "//body[@class='modal-open']/app-root/div[@id='container']/div[@id='innerContent']/div[@id='companiesact1']/section/app-spicepartb[@class='ng-star-inserted']/div[@class='row']/div[@id='modalD2']/div[@class='modal-content']/div[@class='modal-body']/div[4]/div[1]";
	public static String PATH_DIR_DETAILS_RESIDENT_OF_INDIA_NO = "//body[@class='modal-open']/app-root/div[@id='container']/div[@id='innerContent']/div[@id='companiesact1']/section/app-spicepartb[@class='ng-star-inserted']/div[@class='row']/div[@id='modalD2']/div[@class='modal-content']/div[@class='modal-body']/div[4]/div[2]";
	public static String PATH_DIR_DETAILS_SELF_EMPLOYED = "//body[@class='modal-open']/app-root/div[@id='container']/div[@id='innerContent']/div[@id='companiesact1']/section/app-spicepartb[@class='ng-star-inserted']/div[@class='row']/div[@id='modalD2']/div[@class='modal-content']/div[@class='modal-body']/div[2]/div[1]";
	public static String PATH_DIR_DETAILS_PROFFESIONAL = "//div[6]//div[1]//div[2]//div[10]//div[2]//input[2]";
	public static String PATH_DIR_DETAILS_HOMEMAKER = "//div[6]//div[1]//div[2]//div[10]//div[2]//input[3]";
	public static String PATH_DIR_DETAILS_STUDENT = "//div[6]//div[1]//div[2]//div[10]//div[2]//input[4]";
	public static String PATH_DIR_DETAILS_AREA_OF_OCCUPATION_DRN = "//select[@name='currentsection4d2Model.areaOfOccupaton']";
	public static String PATH_DIR_DETAILS_AREA_OF_OCCUPATION_OTHERS = "//*[@id=\"modalD2\"]/div/div[2]/div[12]/div[2]/input";
	public static String PATH_DIR_DETAILS_EDUCATIONAL_QUALIFICATION_DRN = "//select[@name='currentsection4d2Model.educationQualif']";
	public static String PATH_DIR_DETAILS_PAN_RDBTN = "//*[@id=\"modalD2\"]/div/div[2]/div[14]/div[1]/input[1]";
	public static String PATH_DIR_DETAILS_PAN_TBX = "//input[@name='currentsection4d2Model.panOrPassportText']";
	public static String PATH_DIR_DETAILS_PREFILL_BTN = "//div[@class='col-xs-2 ng-star-inserted']//button[@name='prefillBtn'][contains(text(),'Verify Details')]";
	public static String PATH_DIR_DETAILS_DESIGNATION_DRN = "//select[@name='currentsection4d2Model.designation']";
	public static String PATH_DIR_DETAILS_CATEGORY_DRN = "//select[@name='currentsection4d2Model.category']";
	public static String PATH_DIR_DETAILS_NON_EXECUTIVE_DIRECTOR = "//div[6]//div[1]//div[2]//div[15]//div[2]//input[3]";
	public static String PATH_DIR_DETAILS_EMAIL_ID = "//div[@id='modalD2']//input[@name='emailId']";
	public static String PATH_DIR_DETAILS_ADDRESS_LINE_1 = "//div[@id='modalD2']//div[19]//div[2]//input[1]";
	public static String PATH_DIR_DETAILS_ADDRESS_LINE_2 = "//div[@id='modalD2']//div[20]//div[2]//input[1]";
	public static String PATH_DIR_DETAILS_CITY = "//div[@id='modalD2']//div[21]//div[2]//input[1]";
	public static String PATH_DIR_DETAILS_STATE = "//div[@id='modalD2']//div[22]//div[1]//div[2]//select[1]";
	public static String PATH_DIR_DETAILS_PINCODE = "//input[@name='currentsection4d2Model.permanentAddress.pincode']";
	public static String PATH_DIR_DETAILS_ISO_COUNTRY_CODE = "//div[@id='modalD2']//div[23]//div[1]//div[2]//select[1]";
	public static String PATH_DIR_DETAILS_COUNTRY = "//div[@id='modalD2']//div[23]//div[1]//div[4]//input[1]";
	public static String PATH_COPY_OF_UTILITY_BILLS_UPLOAD_BTN = "//*[@id=\"page8\"]/div[1]/div[3]/div[2]/div/input";
	public static String PATH_PROOF_OF_SUBSCRIBER_UPLOAD_BTN = "//*[@id=\"page8\"]/div[1]/div[4]/div[2]/div/input";
	public static String PATH_PROOF_APPLICANT_ONE_UPLOAD_BTN = "//*[@id=\"page8\"]/div[1]/div[5]/div[2]/div/input";
	public static String PATH_PROOF_APPLICANT_TWO_UPLOAD_BTN = "//*[@id=\"page8\"]/div[1]/div[5]/div[2]/div/input";
	public static String PATH_PROOF_APPLICANT_THREE_UPLOAD_BTN = "//*[@id=\"page8\"]/div[1]/div[5]/div[2]/div/input";
	public static String PATH_OPTIONAL_ATTACHMENTS_UPLOAD_BTN = "//*[@id=\"page8\"]/div[1]/div[6]/div[2]/div/input";

	// PAN/TAN
	public static String PATH_Source_Businsess = "//*[@id=\"page7\"]/div[1]/div[5]/input[1]";
	public static String PATH_Source_Capital = "//*[@id=\"page7\"]/div[1]/div[5]/input[2]";
	public static String PATH_Source_House = "//*[@id=\"page7\"]/div[1]/div[5]/input[3]";
	public static String PATH_Source_Other = "//*[@id=\"page7\"]/div[1]/div[5]/input[4]";
	public static String PATH_Source_NoIncome = "//*[@id=\"page7\"]/div[1]/div[5]/input[5]";
	public static String PATH_Business_code_1 = "//*[@id=\"page7\"]/div[1]/table[3]/tbody/tr/td[1]/input";
	public static String PATH_Business_code_2 = "//*[@id=\"page7\"]/div[1]/table[3]/tbody/tr/td[2]/input";

	// DIR Selection
	public static String PATH_Select_MODB = "//*[@id=\"page4\"]/div[2]/div/table/tbody/tr/td[2]/a";
	public static String PATH_Select_MODC1 = "//*[@id=\"page4\"]/div[4]/div/table/tbody/tr/td[2]/a";
	public static String PATH_Select_MODC2 = "//*[@id=\"page4\"]/div[5]/div/table/tbody/tr/td[2]/a";
	public static String PATH_Select_MODD1 = "//*[@id=\"page4\"]/div[7]/div/table/tbody/tr/td[2]/a";
	public static String PATH_Select_MODD2 = "//*[@id=\"page4\"]/div[8]/div/table/tbody/tr/td[2]/a";
	public static String PATH_Select_MODE1 = "//*[@id=\"page4\"]/div[10]/div/table/tbody/tr/td[2]/a";
	public static String PATH_Select_MODE2 = "//*[@id=\"page4\"]/div[11]/div/table/tbody/tr/td[2]/a";

	// Attachment and Declaration
	public static String PATH_Attachment_Copy_of_Utility_Bill = "//*[@id=\"page8\"]/div[1]/div[3]/div[2]/div/input";
	public static String PATH_Attachment_Proof_of_Subscriber = "//*[@id=\"page8\"]/div[1]/div[4]/div[2]/div/input";
	public static String PATH_Attachment_Proof_of_Applicant_1 = "//*[@id=\"page8\"]/div[1]/div[5]/div[2]/div/input";
	public static String PATH_Attachment_Proof_of_Applicant_2 = "//*[@id=\"page8\"]/div[1]/div[6]/div[2]/div/input";
	public static String PATH_Attachment_Proof_of_Applicant_3 = "//*[@id=\"page8\"]/div[1]/div[7]/div[2]/div/input";
	public static String PATH_Attachment_Proof_of_Applicant_1_withoutShareholder = "//*[@id=\"page8\"]/div[1]/div[4]/div[2]/div/input";
	public static String PATH_Attachment_Proof_of_Applicant_2_withoutShareholder = "//*[@id=\"page8\"]/div[1]/div[5]/div[2]/div/input";
	public static String PATH_Attachment_Proof_of_Applicant_3_withoutShareholder = "//*[@id=\"page8\"]/div[1]/div[6]/div[2]/div/input";
	public static String PATH_Attachment_Optional_attachments = "//*[@id=\"page8\"]/div[1]/div[7]/div[2]/div/input";
	public static String PATH_Declaration_DIN_PAN = "//*[@id=\"page9\"]/div[1]/div/div/div[2]/input";
	public static String PATH_Declaration_Submit = "//*[@id=\"submit\"]";

	// b.Particulars of Director Representing Company
	public static String PATH_MODBPrefillMessage = "//*[@id=\"modalB\"]/div/div[1]/div[2]/span";
	public static String PATH_MODBContinueMessage = "//*[@id=\"modalB\"]/div/div[1]/div[1]/span";
	public static String PATH_MODB_Category_DRN = "//*[@id=\"category\"]";
	public static String PATH_MODB_Corporate_identity_number = "//*[@id=\"modalB\"]/div/div[2]/div[2]/div[2]/input";
	public static String PATH_MODB_Name_of_the_body_corporate = "//*[@id=\"modalB\"]/div/div[2]/div[3]/div[2]/input";

	// Registered office address

	public static String PATH_MODB_OFC_Line_I = "//*[@id=\"modalB\"]/div/div[2]/div[5]/div[2]/input";
	public static String PATH_MODB_OFC_Line_II = "//*[@id=\"modalB\"]/div/div[2]/div[6]/div[2]/input";
	public static String PATH_MODB_OFC_City = "//*[@id=\"modalB\"]/div/div[2]/div[7]/div[2]/input";
	public static String PATH_MODB_OFC_StateUnion_Territory_DRN = "//*[@id=\"modalB\"]/div/div[2]/div[8]/div/div[2]/select";
	public static String PATH_MODB_OFC_Pin_code = "//*[@id=\"modalB\"]/div/div[2]/div[8]/div/div[4]/input";
	public static String PATH_MODB_OFC_ISO_Country_code_DRN = "//*[@id=\"modalB\"]/div/div[2]/div[9]/div/div[2]/select";
	public static String PATH_MODB_OFC_Country = "//*[@id=\"modalB\"]/div/div[2]/div[9]/div/div[4]/input";
	public static String PATH_MODB_OFC_STD_code = "//*[@id=\"modalB\"]/div/div[2]/div[10]/div[2]/input";
	public static String PATH_MODB_OFC_Phone = "//*[@id=\"modalB\"]/div/div[2]/div[10]/div[4]/input";
	public static String PATH_MODB_OFC_Email_ID = "//*[@id=\"modalB\"]/div/div[2]/div[12]/div[2]/input";

	// Particulars of the authorised person

	public static String PATH_MODB_First_Name = "//*[@id=\"modalB\"]/div/div[2]/div[14]/div[2]/input";
	public static String PATH_MODB_Middle_Name = "//*[@id=\"modalB\"]/div/div[2]/div[15]/div[2]/input";
	public static String PATH_MODB_Surname = "//*[@id=\"modalB\"]/div/div[2]/div[16]/div[2]/input";
	public static String PATH_MODB_Father_First_Name = "//*[@id=\"modalB\"]/div/div[2]/div[17]/div[2]/input";
	public static String PATH_MODB_Father_Middle_Name = "//*[@id=\"modalB\"]/div/div[2]/div[18]/div[2]/input";
	public static String PATH_MODB_Father_Surname = "//*[@id=\"modalB\"]/div/div[2]/div[19]/div[2]/input";
	public static String PATH_MODB_Gender_DRN = "//*[@id=\"modalB\"]/div/div[2]/div[20]/div[2]/select";
	public static String PATH_MODB_Date_of_Birth = "//*[@id=\"mat-input-9\"]";
	public static String PATH_MODB_Select_PAN_Radio = "//*[@id=\"modalB\"]/div/div[2]/div[21]/div[1]/input[1]";
	public static String PATH_MODB_Nationality_DRN = "//*[@id=\"modalB\"]/div/div[2]/div[20]/div[6]/select";
	public static String PATH_MODB_PAN = "//*[@id=\"modalB\"]/div/div[2]/div[21]/div[2]/input";
	public static String PATH_MODB_Place_of_birth = "//*[@id=\"modalB\"]/div/div[2]/div[23]/div[2]/input";
	public static String PATH_MODB_Occupation_type_DRN = "//*[@id=\"modalB\"]/div/div[2]/div[24]/div[2]/select";
	public static String PATH_MODB_Area_of_Occupation = "//*[@id=\"modalB\"]/div/div[2]/div[25]/div[2]/input";
	public static String PATH_MODB_Educational_Qualification_DRN = "//*[@id=\"currentsection4bModel.educationQualif\"]";

	public static String PATH_MODB_Line_I = "//*[@id=\"modalB\"]/div/div[2]/div[28]/div[2]/input";
	public static String PATH_MODB_Line_II = "//*[@id=\"modalB\"]/div/div[2]/div[29]/div[2]/input";
	public static String PATH_MODB_City = "//*[@id=\"modalB\"]/div/div[2]/div[30]/div[2]/input";

	public static String PATH_MODB_StateUnion_Territory_DRN = "//*[@id=\"modalB\"]/div/div[2]/div[31]/div/div[2]/select";
	public static String PATH_MODB_Pin_code = "//*[@id=\"modalB\"]/div/div[2]/div[31]/div/div[4]/input";
	public static String PATH_MODB_ISO_Country_code_DRN = "//*[@id=\"modalB\"]/div/div[2]/div[32]/div/div[2]/select";
	public static String PATH_MODB_Country = "//*[@id=\"modalB\"]/div/div[2]/div[32]/div/div[4]/input";
	public static String PATH_MODB_STD_code = "//*[@id=\"modalB\"]/div/div[2]/div[33]/div[2]/input";
	public static String PATH_MODB_Phone = "//*[@id=\"modalB\"]/div/div[2]/div[33]/div[4]/input";
	public static String PATH_MODB_Mobile = "//*[@id=\"modalB\"]/div/div[2]/div[34]/div[2]/input";
	public static String PATH_MODB_Email_ID = "//*[@id=\"modalB\"]/div/div[2]/div[36]/div[2]/input";
	public static String PATH_MODB_Equity_shares_Numbers = "//*[@id=\"modalB\"]/div/div[2]/table/tbody/tr[1]/td[2]/input";
	public static String PATH_MODB_Equity_shares_Amount = "//*[@id=\"modalB\"]/div/div[2]/table/tbody/tr[1]/td[3]/input";
	public static String PATH_MODB_Preference_shares_Numbers = "//*[@id=\"modalB\"]/div/div[2]/table/tbody/tr[2]/td[2]/input";
	public static String PATH_MODB_Preference_shares_Amount = "//*[@id=\"modalB\"]/div/div[2]/table/tbody/tr[2]/td[3]/input";

	public static String PATH_MODB_Prefill = "//*[@id=\"modalB\"]/div/div[2]/div[2]/div[3]/button";
	public static String PATH_MODB_Verify_Details = "//*[@id=\"modalB\"]/div/div[2]/div[21]/div[3]/button";

	public static String PATH_MODB_Continue = "//*[@id=\"modalB\"]/div/div[3]/button";
	public static String PATH_MODB_Close = "//*[@id=\"modalB\"]/div/div[1]/button/span";

	// c. Particulars of individual first subscriber(s) (other than subscriber cum
	// director)

	public static String PATH_MODC2_First_Name = "//*[@id=\"modalC2\"]/div/div[2]/div[1]/div[2]/input";
	public static String PATH_MODC2_Middle_Name = "//*[@id=\"modalC2\"]/div/div[2]/div[2]/div[2]/input";
	public static String PATH_MODC2_Surname = "//*[@id=\"modalC2\"]/div/div[2]/div[3]/div[2]/input";
	public static String PATH_MODC2_Father_First_Name = "//*[@id=\"modalC2\"]/div/div[2]/div[4]/div[2]/input";
	public static String PATH_MODC2_Father_Middle_Name = "//*[@id=\"modalC2\"]/div/div[2]/div[5]/div[2]/input";
	public static String PATH_MODC2_Father_Surname = "//*[@id=\"modalC2\"]/div/div[2]/div[6]/div[2]/input";
	public static String PATH_MODC2_Gender_DRN = "//*[@id=\"modalC2\"]/div/div[2]/div[7]/div[2]/select";
	public static String PATH_MODC2_Date_of_Birth = "//*[@id=\"mat-input-4\"]";
	public static String PATH_MODC2_Nationality_DRN = "//*[@id=\"modalC2\"]/div/div[2]/div[7]/div[6]/select";
	public static String PATH_MODC2_Place_of_birth = "//*[@id=\"modalC2\"]/div/div[2]/div[8]/div[2]/input";
	public static String PATH_MODC2_Occupation_type = "";
	public static String PATH_MODC2_SELFEMPLOYED = "//*[@id=\"modalC2\"]/div/div[2]/div[9]/div[2]/input[1]";
	public static String PATH_MODC2_PROFESSIONAL = "//*[@id=\"modalC2\"]/div/div[2]/div[9]/div[2]/input[2]";
	public static String PATH_MODC2_HOMEMAKER = "//*[@id=\"modalC2\"]/div/div[2]/div[9]/div[2]/input[3]";
	public static String PATH_MODC2_STUDENT = "//*[@id=\"modalC2\"]/div/div[2]/div[9]/div[2]/input[4]";
	public static String PATH_MODC2_SERVICEMAN = "//*[@id=\"modalC2\"]/div/div[2]/div[9]/div[2]/input[5]";
	public static String PATH_MODC2_Area_of_Occupation_DRN = "//*[@id=\"modalC2\"]/div/div[2]/div[10]/div[2]/select";
	public static String PATH_MODC2_If_Others = "//*[@id=\"modalC2\"]/div/div[2]/div[11]/div[2]/input";
	public static String PATH_MODC2_Educational_Qualification_DRN = "//*[@id=\"modalC2\"]/div/div[2]/div[12]/div[2]/select";
	public static String PATH_MODC2_Select_PAN_Radio = "//*[@id=\"modalC2\"]/div/div[2]/div[13]/div[1]/input[1]";
	public static String PATH_MODC2_PAN = "//*[@id=\"modalC2\"]/div/div[2]/div[13]/div[2]/input";
	public static String PATH_MODC2_Email_ID = "//*[@id=\"modalC2\"]/div/div[2]/div[15]/div[2]/input";

	// Permanent address

	public static String PATH_MODC2_Line_I = "//*[@id=\"modalC2\"]/div/div[2]/div[17]/div[2]/input";
	public static String PATH_MODC2_Line_II = "//*[@id=\"modalC2\"]/div/div[2]/div[18]/div[2]/input";
	public static String PATH_MODC2_City = "//*[@id=\"modalC2\"]/div/div[2]/div[19]/div[2]/input";
	public static String PATH_MODC2_StateUnion_Territory_DRN = "//*[@id=\"modalC2\"]/div/div[2]/div[20]/div/div[2]/select";
	public static String PATH_MODC2_Pin_code = "//*[@id=\"modalC2\"]/div/div[2]/div[20]/div/div[4]/input";
	public static String PATH_MODC2_ISO_Country_code_DRN = "//*[@id=\"modalC2\"]/div/div[2]/div[21]/div/div[2]/select";
	public static String PATH_MODC2_Country_DRN = "//*[@id=\"modalC2\"]/div/div[2]/div[21]/div/div[4]/select";
	public static String PATH_MODC2_STD_code = "//*[@id=\"modalC2\"]/div/div[2]/div[22]/div[2]/input";
	public static String PATH_MODC2_Phone = "//*[@id=\"modalC2\"]/div/div[2]/div[22]/div[4]/input";
	public static String PATH_MODC2_Pres_Address_SameAs_PermAddress = "//*[@id=\"modalC2\"]/div/div[2]/div[23]/div[2]/input[1]";
	public static String PATH_MODC2_Duration_Years = "//*[@id=\"modalC2\"]/div/div[2]/div[31]/div[2]/input";
	public static String PATH_MODC2_Duration_Months = "//*[@id=\"modalC2\"]/div/div[2]/div[31]/div[3]/input";
	public static String PATH_MODC2_Proof_of_identity = "//*[@id=\"modalC2\"]/div/div[2]/div[33]/div[2]/select";
	public static String PATH_MODC2_Residential_Proof = "//*[@id=\"modalC2\"]/div/div[2]/div[33]/div[4]/select";
	public static String PATH_MODC2_Equity_shares_Numbers = "//*[@id=\"modalC2\"]/div/div[2]/table/tbody/tr[1]/td[2]/input";
	public static String PATH_MODC2_Equity_shares_Amount = "//*[@id=\"modalC2\"]/div/div[2]/table/tbody/tr[1]/td[3]/input";
	public static String PATH_MODC2_Preference_shares_Numbers = "//*[@id=\"modalC2\"]/div/div[2]/table/tbody/tr[2]/td[2]/input";
	public static String PATH_MODC2_Preference_shares_Amount = "//*[@id=\"modalC2\"]/div/div[2]/table/tbody/tr[2]/td[3]/input";

	public static String PATH_MODC2_Verify_Details = "//*[@id=\"modalC2\"]/div/div[2]/div[13]/div[3]/button";
	public static String PATH_MODC2PrefillMessage = "//*[@id=\"modalC2\"]/div/div[1]/div[2]/span";
	public static String PATH_MODC2ContinueMessage = "//*[@id=\"modalC2\"]/div/div[1]/div[1]/span";
	public static String PATH_MODC2_Continue = "//*[@id=\"modalC2\"]/div/div[3]/button";
	public static String PATH_MODC2_Close = "//*[@id=\"modalC2\"]/div/div[1]/button/span";

//d. Particulars of individual first subscriber(s) cum directors

	public static String PATH_MODD2_First_Name = "//*[@id=\"modalD2\"]/div/div[2]/div[1]/div[2]/input";
	public static String PATH_MODD2_Middle_Name = "//*[@id=\"modalD2\"]/div/div[2]/div[2]/div[2]/input";
	public static String PATH_MODD2_Surname = "//*[@id=\"modalD2\"]/div/div[2]/div[3]/div[2]/input";
	public static String PATH_MODD2_Father_First_Name = "//*[@id=\"modalD2\"]/div/div[2]/div[4]/div[2]/input";
	public static String PATH_MODD2_Father_Middle_Name = "//*[@id=\"modalD2\"]/div/div[2]/div[5]/div[2]/input";
	public static String PATH_MODD2_Father_Surname = "//*[@id=\"modalD2\"]/div/div[2]/div[6]/div[2]/input";
	public static String PATH_MODD2_Gender_DRN = "//*[@id=\"modalD2\"]/div/div[2]/div[7]/div[2]/select";
	public static String PATH_MODD2_Date_of_Birth = "//*[@id=\"mat-input-6\"]";
	public static String PATH_MODD2_Nationality_DRN = "//*[@id=\"modalD2\"]/div/div[2]/div[7]/div[6]/select";
	public static String PATH_MODD2_Place_of_birth = "//*[@id=\"modalD2\"]/div/div[2]/div[8]/div[2]/input";
	public static String PATH_MODD2_Citizen_0f_India_Yes = "//*[@id=\"modalD2\"]/div/div[2]/div[9]/div[2]/input[1]";
	public static String PATH_MODD2_Resident_of_India_Yes = "//*[@id=\"modalD2\"]/div/div[2]/div[9]/div[4]/input[1]";
	public static String PATH_MODD2_Occupation_type = "";
	public static String PATH_MODD2_SELFEMPLOYED = "//*[@id=\"modalD2\"]/div/div[2]/div[10]/div[2]/input[1]";
	public static String PATH_MODD2_PROFESSIONAL = "//*[@id=\"modalD2\"]/div/div[2]/div[10]/div[2]/input[2]";
	public static String PATH_MODD2_HOMEMAKER = "//*[@id=\"modalD2\"]/div/div[2]/div[10]/div[2]/input[3]";
	public static String PATH_MODD2_STUDENT = "//*[@id=\"modalD2\"]/div/div[2]/div[10]/div[2]/input[4]";
	public static String PATH_MODD2_SERVICEMAN = "//*[@id=\"modalD2\"]/div/div[2]/div[10]/div[2]/input[5]";
	public static String PATH_MODD2_Area_of_Occupation_DRN = "//*[@id=\"modalD2\"]/div/div[2]/div[11]/div[2]/select";
	public static String PATH_MODD2_If_Others = "//*[@id=\"modalD2\"]/div/div[2]/div[12]/div[2]/input";
	public static String PATH_MODD2_Educational_Qualification_DRN = "//*[@id=\"modalD2\"]/div/div[2]/div[13]/div[2]/select";
	public static String PATH_MODD2_Select_PAN_Radio = "//*[@id=\"modalD2\"]/div/div[2]/div[14]/div[1]/input[1]";
	public static String PATH_MODD2_PAN = "//*[@id=\"modalD2\"]/div/div[2]/div[14]/div[2]/input";
	public static String PATH_MODD2_Designation_DRN = "//*[@id=\"modalD2\"]/div/div[2]/div[15]/div[2]/select";
	public static String PATH_MODD2_Category_DRN = "//*[@id=\"modalD2\"]/div/div[2]/div[15]/div[4]/select";
	public static String PATH_MODD2_NonExecutiveDirector = "//*[@id=\"modalD2\"]/div/div[2]/div[16]/div[2]/input[3]";
	public static String PATH_MODD2_Email_ID = "//*[@id=\"modalD2\"]/div/div[2]/div[18]/div[2]/input";
	public static String PATH_SPICE_OCC_SELF_EMPLOYED  = "//input[@type='radio' and @value='SELF']";
	public static String PATH_SPICE_OCC_PROFESSIONAL  = "//input[@type='radio' and @value='PROF']";
	public static String PATH_SPICE_OCC_HOMEMAKER  = "//input[@type='radio' and @value='HOME']";
	public static String PATH_SPICE_OCC_STUDENT  = "//input[@type='radio' and @value='STUD']";
	public static String PATH_SPICE_OCC_SERVICEMAN  = "//input[@type='radio' and @value='SERV']";

//Permanent address

	public static String PATH_MODD2_Line_I = "//*[@id=\"modalD2\"]/div/div[2]/div[20]/div[2]/input";
	public static String PATH_MODD2_Line_II = "//*[@id=\"modalD2\"]/div/div[2]/div[21]/div[2]/input";
	public static String PATH_MODD2_City = "//*[@id=\"modalD2\"]/div/div[2]/div[22]/div[2]/input";
	public static String PATH_MODD2_StateUnion_Territory_DRN = "//*[@id=\"modalD2\"]/div/div[2]/div[23]/div/div[2]/select";
	public static String PATH_MODD2_Pin_code = "//*[@id=\"modalD2\"]/div/div[2]/div[23]/div/div[4]/input";
	public static String PATH_MODD2_ISO_Country_code_DRN = "//*[@id=\"modalD2\"]/div/div[2]/div[24]/div/div[2]/select";
	public static String PATH_MODD2_Country = "//*[@id=\"modalD2\"]/div/div[2]/div[24]/div/div[4]/input";
	public static String PATH_MODD2_STD_code = "//*[@id=\"modalD2\"]/div/div[2]/div[25]/div[2]/input";
	public static String PATH_MODD2_Phone = "//*[@id=\"modalD2\"]/div/div[2]/div[25]/div[4]/input";
	public static String PATH_MODD2_Pres_Address_SameAs_PermAddress = "//*[@id=\"modalD2\"]/div/div[2]/div[26]/div[2]/input[1]";
	public static String PATH_MODD2_Duration_Years = "//*[@id=\"modalD2\"]/div/div[2]/div[34]/div[2]/input";
	public static String PATH_MODD2_Duration_Months = "//*[@id=\"modalD2\"]/div/div[2]/div[34]/div[3]/input";
	public static String PATH_MODD2_Proof_of_identity_DRN = "//*[@id=\"modalD2\"]/div/div[2]/div[36]/div[2]/select";
	public static String PATH_MODD2_Residential_Proof_DRN = "//*[@id=\"modalD2\"]/div/div[2]/div[36]/div[4]/select";
	public static String PATH_MODD2_Equity_shares_Numbers = "//*[@id=\"modalD2\"]/div/div[2]/table[1]/tbody/tr[1]/td[2]/input";
	public static String PATH_MODD2_Equity_shares_Amount = "//*[@id=\"modalD2\"]/div/div[2]/table[1]/tbody/tr[1]/td[3]/input";
	public static String PATH_MODD2_Preference_shares_Numbers = "//*[@id=\"modalD2\"]/div/div[2]/table[1]/tbody/tr[2]/td[2]/input";
	public static String PATH_MODD2_Preference_shares_Amount = "//*[@id=\"modalD2\"]/div/div[2]/table[1]/tbody/tr[2]/td[3]/input";
	public static String PATH_MODD2_Number_of_entities = "//*[@id=\"modalD2\"]/div/div[2]/div[40]/div[2]/input";

	public static String PATH_MODD2_Verify_Details = "//*[@id=\"modalD2\"]/div/div[2]/div[14]/div[3]/button";
	public static String PATH_MODD2PrefillMessage = "//*[@id=\"modalD2\"]/div/div[1]/div[2]";
	

	public static String PATH_MODD2ContinueMessage = "//*[@id=\"modalD2\"]/div/div[1]/div[1]/span";
	public static String PATH_MODD2_Continue = "/html/body/app-root/div/div[5]/div[1]/section/app-spicepartb/div/div[7]/div/div[3]/button";
	public static String PATH_MODD2_Close = "//*[@id=\"modalD2\"]/div/div[1]/button/span";

//e. Particulars of directors (other than first subscribers)

	public static String PATH_MODE2_First_Name = "//*[@id=\"modalE2\"]/div/div[2]/div[1]/div[2]/input";
	public static String PATH_MODE2_Middle_Name = "//*[@id=\"modalE2\"]/div/div[2]/div[2]/div[2]/input";
	public static String PATH_MODE2_Surname = "//*[@id=\"modalE2\"]/div/div[2]/div[3]/div[2]/input";
	public static String PATH_MODE2_Father_First_Name = "//*[@id=\"modalE2\"]/div/div[2]/div[4]/div[2]/input";
	public static String PATH_MODE2_Father_Middle_Name = "//*[@id=\"modalE2\"]/div/div[2]/div[5]/div[2]/input";
	public static String PATH_MODE2_Father_Surname = "//*[@id=\"modalE2\"]/div/div[2]/div[6]/div[2]/input";
	public static String PATH_MODE2_Gender_DRN = "//*[@id=\"modalE2\"]/div/div[2]/div[7]/div[2]/select";
	public static String PATH_MODE2_Date_of_Birth = "//*[@id=\"mat-input-8\"]";
	public static String PATH_MODE2_Nationality_DRN = "//*[@id=\"modalE2\"]/div/div[2]/div[7]/div[6]/select";
	public static String PATH_MODE2_Place_of_birth = "//*[@id=\"modalE2\"]/div/div[2]/div[8]/div[2]/input";
	public static String PATH_MODE2_Citizen_0f_India_Yes = "//*[@id=\"modalE2\"]/div/div[2]/div[9]/div[2]/input[1]";
	public static String PATH_MODE2_Resident_of_India_Yes = "//*[@id=\"modalE2\"]/div/div[2]/div[9]/div[4]/input[1]";
	public static String PATH_MODE2_Occupation_type = "";
	public static String PATH_MODE2_SELFEMPLOYED = "//*[@id=\"modalE2\"]/div/div[2]/div[10]/div[2]/input[1]";
	public static String PATH_MODE2_PROFESSIONAL = "//*[@id=\"modalE2\"]/div/div[2]/div[10]/div[2]/input[2]";
	public static String PATH_MODE2_HOMEMAKER = "//*[@id=\"modalE2\"]/div/div[2]/div[10]/div[2]/input[3]";
	public static String PATH_MODE2_STUDENT = "//*[@id=\"modalE2\"]/div/div[2]/div[10]/div[2]/input[4]";
	public static String PATH_MODE2_SERVICEMAN = "//*[@id=\"modalE2\"]/div/div[2]/div[10]/div[2]/input[5]";
	public static String PATH_MODE2_Area_of_Occupation_DRN = "//*[@id=\"modalE2\"]/div/div[2]/div[11]/div[2]/select";
	public static String PATH_MODE2_If_Others = "//*[@id=\"modalE2\"]/div/div[2]/div[12]/div[2]/input";
	public static String PATH_MODE2_Educational_Qualification_DRN = "//*[@id=\"modalE2\"]/div/div[2]/div[13]/div[2]/select";
	public static String PATH_MODE2_Select_PAN_Radio = "//*[@id=\"modalE2\"]/div/div[2]/div[14]/div[1]/input[1]";
	public static String PATH_MODE2_PAN = "//*[@id=\"modalE2\"]/div/div[2]/div[14]/div[2]/input";
	public static String PATH_MODE2_Designation = "//*[@id=\"modalE2\"]/div/div[2]/div[15]/div[2]/select";
	public static String PATH_MODE2_Category = "//*[@id=\"modalE2\"]/div/div[2]/div[15]/div[4]/select";
	public static String PATH_MODE2_Non_Executive_Director = "//*[@id=\"modalE2\"]/div/div[2]/div[16]/div[2]/input[3]";
	public static String PATH_MODE2_Email_ID = "//*[@id=\"modalE2\"]/div/div[2]/div[18]/div[2]/input";

//Permanent address

	public static String PATH_MODE2_Line_I = "//*[@id=\"modalE2\"]/div/div[2]/div[20]/div[2]/input";
	public static String PATH_MODE2_Line_II = "//*[@id=\"modalE2\"]/div/div[2]/div[21]/div[2]/input";
	public static String PATH_MODE2_City = "//*[@id=\"modalE2\"]/div/div[2]/div[22]/div[2]/input";
	public static String PATH_MODE2_StateUnion_Territory_DRN = "//*[@id=\"modalE2\"]/div/div[2]/div[23]/div/div[2]/select";
	public static String PATH_MODE2_Pin_code = "//*[@id=\"modalE2\"]/div/div[2]/div[23]/div/div[4]/input";
	public static String PATH_MODE2_ISO_Country_code_DRN = "//*[@id=\"modalE2\"]/div/div[2]/div[24]/div/div[2]/select";
	public static String PATH_MODE2_Country_DRN = "//*[@id=\"modalE2\"]/div/div[2]/div[24]/div/div[4]/input";
	public static String PATH_MODE2_STD_code = "//*[@id=\"modalE2\"]/div/div[2]/div[25]/div[2]/input";
	public static String PATH_MODE2_Phone = "//*[@id=\"modalE2\"]/div/div[2]/div[25]/div[4]/input";
	public static String PATH_MODE2_Pres_Address_SameAs_PermAddress = "//*[@id=\"modalE2\"]/div/div[2]/div[26]/div[2]/input[1]";
	public static String PATH_MODE2_Duration_Years = "//*[@id=\"modalE2\"]/div/div[2]/div[34]/div[2]/input";
	public static String PATH_MODE2_Duration_Months = "//*[@id=\"modalE2\"]/div/div[2]/div[34]/div[3]/input";
	public static String PATH_MODE2_Proof_of_identity = "//*[@id=\"modalE2\"]/div/div[2]/div[36]/div[2]/select";
	public static String PATH_MODE2_Residential_Proof = "//*[@id=\"modalE2\"]/div/div[2]/div[36]/div[4]/select";
	public static String PATH_MODE2_Number_of_entities = "//*[@id=\"modalE2\"]/div/div[2]/div[40]/div[2]/input";
	public static String PATH_MODE2_Verify_Details = "//*[@id=\"modalE2\"]/div/div[2]/div[14]/div[3]/button";
	public static String PATH_MODE2PrefillMessage = "//*[@id=\"modalE2\"]/div/div[1]/div[2]/span";
	public static String PATH_MODE2ContinueMessage = "//*[@id=\"modalE2\"]/div/div[1]/div[1]/span";
	public static String PATH_MODE2_Continue = "//*[@id=\"modalE2\"]/div/div[3]/button";
	public static String PATH_MODE2_Close = "//*[@id=\"modalE2\"]/div/div[1]/button/span";

//Having DIN

//C. Subscriber

	public static String PATH_MODC1_DIN = "//*[@id=\"modalC1\"]/div/div[2]/div[1]/div[2]/input";
	public static String PATH_MODC1_Prefill = "//*[@id=\"modalC1\"]/div/div[2]/div[1]/div[3]/button";
	public static String PATH_MODC1_Prefill_message = "//*[@id=\"modalC1\"]/div/div[1]/div[2]/span";
	public static String PATH_MODC1ContinueMessage = "//*[@id=\"modalC1\"]/div/div[1]/div[1]/span";
	public static String PATH_MODC1_EquityShare_Number = "//*[@id=\"modalC1\"]/div/div[2]/table/tbody/tr[1]/td[2]/input";
	public static String PATH_MODC1_EquityShare_Amount = "//*[@id=\"modalC1\"]/div/div[2]/table/tbody/tr[1]/td[3]/input";

	public static String PATH_MODC1_PreferenceShare_Number = "//*[@id=\"modalC1\"]/div/div[2]/table/tbody/tr[2]/td[2]/input";
	public static String PATH_MODC1_PreferenceShare_Amount = "//*[@id=\"modalC1\"]/div/div[2]/table/tbody/tr[2]/td[3]/input";
	public static String PATH_MODC1_Continue = "//*[@id=\"modalC1\"]/div/div[3]/button";
	public static String PATH_MODC1_Close = "//*[@id=\"modalC1\"]/div/div[1]/button/span";

//D. Dir and Shareholder

	public static String PATH_MODD1_DIN = "//*[@id=\"modalD1\"]/div/div[2]/div[1]/div[2]/input";

	public static String PATH_MODD1_Prefill = "//*[@id=\"modalD1\"]/div/div[2]/div[1]/div[3]/button";
	public static String PATH_MODD1_Prefill_message = "//*[@id=\"modalD1\"]/div/div[1]/div[2]/span";
	public static String PATH_MODD1ContinueMessage = "//*[@id=\"modalD1\"]/div/div[1]/div[1]/span";
	public static String PATH_MODD1_Gender = "//*[@id=\"modalD1\"]/div/div[2]/div[3]/div[2]/select";
	public static String PATH_MODD1_DateOfBirth = "//*[@id=\"mat-input-5\"]";
	public static String PATH_MODD1_Nationality = "//*[@id=\"modalD1\"]/div/div[2]/div[3]/div[6]/select";

	public static String PATH_MODD1_Designation = "//*[@id=\"modalD1\"]/div/div[2]/div[4]/div[2]/select";
	public static String PATH_MODD1_Category = "//*[@id=\"modalD1\"]/div/div[2]/div[4]/div[4]/select";
	public static String PATH_MODD1_Chairman = "//*[@id=\"modalD1\"]/div/div[2]/div[5]/div[2]/input[1]";
	public static String PATH_MODD1_Executive_Dir = "//*[@id=\"modalD1\"]/div/div[2]/div[5]/div[2]/input[2]";
	public static String PATH_MODD1_NonExecutive_Dir = "//*[@id=\"modalD1\"]/div/div[2]/div[5]/div[2]/input[3]";
	public static String PATH_MODD1_Email_ID = "//*[@id=\"modalD1\"]/div/div[2]/div[7]/div[2]/input";
	public static String PATH_MODD1_EquityShare_Number = "//*[@id=\"modalD1\"]/div/div[2]/table[1]/tbody/tr[1]/td[2]/input";
	public static String PATH_MODD1_EquityShare_Amount = "//*[@id=\"modalD1\"]/div/div[2]/table[1]/tbody/tr[1]/td[3]/input";
	public static String PATH_MODD1_PreferenceShare_Number = "//*[@id=\"modalD1\"]/div/div[2]/table[1]/tbody/tr[2]/td[2]/input";
	public static String PATH_MODD1_PreferenceShare_Amount = "//*[@id=\"modalD1\"]/div/div[2]/table[1]/tbody/tr[2]/td[3]/input";

	public static String PATH_MODD1_NoOfEntities = "//*[@id=\"modalD1\"]/div/div[2]/div[8]/div[2]/input";
	public static String PATH_MODD1_Continue = "//*[@id=\"modalD1\"]/div/div[3]/button";
	public static String PATH_MODD1_Close = "//*[@id=\"modalD1\"]/div/div[1]/button/span";

//E. Director

	public static String PATH_MODE1_DIN = "//*[@id=\"modalE1\"]/div/div[2]/div[1]/div[2]/input";
	public static String PATH_MODE1_Prefill = "//*[@id=\"modalE1\"]/div/div[2]/div[1]/div[3]/button";
	public static String PATH_MODE1_Prefill_message = "/html/body/app-root/div/div[5]/div[1]/section/app-spicepartb/div/div[7]/div/div[1]/div[2]";
	public static String PATH_MODE1ContinueMessage = "//*[@id=\"modalE1\"]/div/div[1]/div[1]/span";
	public static String PATH_MODE1_Gender = "//*[@id=\"modalE1\"]/div/div[2]/div[3]/div[2]/select";
	public static String PATH_MODE1_DateOfBirth = "//*[@id=\"mat-input-7\"]";
	public static String PATH_MODE1_Nationality = "//*[@id=\"modalE1\"]/div/div[2]/div[3]/div[6]/select";
	public static String PATH_MODE1_Designation = "//*[@id=\"modalE1\"]/div/div[2]/div[4]/div[2]/select";
	public static String PATH_MODE1_Category = "//*[@id=\"modalE1\"]/div/div[2]/div[4]/div[4]/select";
	public static String PATH_MODE1_Chairman = "//*[@id=\"modalE1\"]/div/div[2]/div[5]/div[2]/input[1]";
	public static String PATH_MODE1_Executive_Dir = "//*[@id=\"modalE1\"]/div/div[2]/div[5]/div[2]/input[3]";
	public static String PATH_MODE1_NonExecutive_Dir = "//*[@id=\"modalE1\"]/div/div[2]/div[5]/div[2]/input[3]";
	public static String PATH_MODE1_Email_ID = "//*[@id=\"modalE1\"]/div/div[2]/div[7]/div[2]/input";
	public static String PATH_MODE1_NoOfEntities = "//*[@id=\"modalE1\"]/div/div[2]/div[8]/div[2]/input";
	public static String PATH_MODE1_Continue = "//*[@id=\"modalE1\"]/div/div[3]/button";
	public static String PATH_MODE1_Close = "//*[@id=\"modalE1\"]/div/div[1]/button/span";

//AGILE PRO
	public static String PATH_SELECT_CURRENT_APPNO = "//*[@id=\"companiesact1\"]/section/app-spice/form/div/div/div[5]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[1]/a";
	public static String PATH_AGILE_EDIT = "//tbody/tr[3]/td[4]/a[1]/img[1]";
	public static String PATH_AGILE_APPLY_GST_YES = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/input[1]";
	public static String PATH_AGILE_APPLY_GST_NO = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/input[2]";
	public static String PATH_AGILE_ONLEASE_YES = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[1]/div[5]/div[1]/div[2]/input[1]";
	public static String PATH_AGILE_ONLEASE_NO = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[1]/div[5]/div[1]/div[2]/input[2]";
	public static String PATH_AGILE_ESTABLISHMENT_DRN = "//select[@id='estOwnedHired']";
	public static String PATH_AGILE_SAVEANDNEXT_1 = "//button[contains(text(),'Save & Next')]";
	public static String PATH_AGILE_PRIMARY_BUSINESS_ACTIVITY_DRN = "//select[@id='priBussAct']";
	public static String PATH_AGILE_PRIMARY_BUSINESS_ACTIVITY_OTHERS = "//input[@id='plsSpec']";
	public static String PATH_AGILE_EXACT_NATURE_OF_WORK_DRN = "//select[@id='extNatWorkBuss']";
	public static String PATH_AGILE_WORK_SUBCATEGORY_DRN = "//select[@id='natWorkBussSubCat']";
	public static String PATH_AGILE_NATURE_OF_WORK = "//input[@id='natWorkBuss']";
	public static String PATH_AGILE_SAVEANDNEXT_2 = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[2]/div[5]/button[2]";
	public static String PATH_AGILE_SAVEANDNEXT_OTHERS = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[2]/div[6]/button[2]";

	public static String PATH_AGILE_NO_OF_DIRECTOR_DETAILS_TO_ENTER = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/div[2]/input[1]";
	public static String PATH_AGILE_NO_OF_DIRECTOR_DETAILS_TO_ENTER_ADD_BTN = "//button[contains(text(),'Add')]";
	public static String PATH_AGILE_DIN_RBTN = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[3]/div[4]/div[1]/div[1]/div[1]/input[1]";
	public static String PATH_AGILE_PAN_RBTN = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[3]/div[4]/div[1]/div[1]/div[1]/input[2]";
	public static String PATH_AGILE_DIN_TBX = "//input[@id='dirDIN']";
	public static String PATH_AGILE_PREFILL_BTN = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[3]/div[5]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/button[1]";
	public static String PATH_AGILE_PAN_TBX = "//input[@id='dirPAN']";
	public static String PATH_AGILE_FIRSTNAME_TBX = "//input[@id='dirFirstName']";
	public static String PATH_AGILE_MIDDLENAME_TBX = "//input[@id='dirMiddleName']";
	public static String PATH_AGILE_LASTNAME_TBX = "//input[@id='dirLastName']";
	public static String PATH_AGILE_UPLOAD_PHOTO = "//input[@id='imgCopy']";
	public static String PATH_AGILE_MOBILE_TBX = "//input[@id='dirMobile']";
	public static String PATH_AGILE_SEND_OTP = "//button[contains(text(),'Send OTP')]";
	public static String PATH_AGILE_EMAIL_TBX = "//input[@id='dirEmail']";
	public static String PATH_AGILE_MOBILE_OTP = "//input[@id='dirMobOTP']";
	public static String PATH_AGILE_EMAIL_OTP = "//input[@id='dirEmailOTP']";
	public static String PATH_AGILE_VERIFY_OTP = "//button[@id='verifyOTP']";

	public static String PATH_AGILE_DIRECTOR_ADD_EDIT = "//a[contains(text(),'Add/Edit')]";

	public static String PATH_AGILE_DIRECTOR_1_ADD = "//tbody/tr[1]/td[2]/a[1]";
	public static String PATH_AGILE_DIRECTOR_2_ADD = "//tbody/tr[2]/td[2]/a[1]";
	public static String PATH_AGILE_DIRECTOR_3_ADD = "//tbody/tr[3]/td[2]/a[1]";
	public static String PATH_AGILE_DIRECTOR_4_ADD = "//tbody/tr[4]/td[2]/a[1]";

	public static String PATH_AGILE_B_DIN_RBTN = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/div[1]/div[2]/div[1]/div[3]/div[1]/input[1]";
	public static String PATH_AGILE_B_PAN_RBTN = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/div[1]/div[2]/div[1]/div[3]/div[1]/input[2]";
	public static String PATH_AGILE_B_DIN_TBX = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
	public static String PATH_AGILE_B_PREFILL_BTN = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/button[1]";
	public static String PATH_AGILE_B_PAN_TBX = "//input[@id='modelDirPANPassport']";
	public static String PATH_AGILE_B_FIRSTNAME_TBX = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]";
	public static String PATH_AGILE_B_MIDDLENAME_TBX = "/html/body/app-root/div/div[5]/div[1]/section/app-spiceagile/div/div[2]/div/table/tbody/tr[4]/td[2]/input";
	public static String PATH_AGILE_B_LASTNAME_TBX = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[2]/input[1]";
	public static String PATH_AGILE_B_UPLOAD_PHOTO = "//input[@id='modelImgCopy']";
	public static String PATH_AGILE_B_MOBILE_TBX = "//input[@id='modelDirMobile']";
	public static String PATH_AGILE_B_EMAIL_TBX = "//input[@id='modelDirEmail']";
	public static String PATH_AGILE_B_SAVEANDCONTINUE = "//button[contains(text(),'Save & Continue')]";

	public static String PATH_AGILE_POLICE_STATION = "//input[@id='policeStation']";
	public static String PATH_AGILE_BRANCH_OFFICE_DRN = "//select[@id='appropriateBranchOfc']";
	public static String PATH_AGILE_INSPECTION_OFFICE_DRN = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[3]/div[12]/div[1]/div[2]/select[1]";
	public static String PATH_AGILE_BANK_NAME_DRN = "//select[@id='selectBankName']";
	public static String PATH_AGILE_SAVEANDNEXT_3 = "/html/body/app-root/div/div[5]/div[1]/section/app-spiceagile/form/div/div/div[5]/div[2]/div/form/div[3]/div[15]/button[2]";
	public static String PATH_AGILE_ATTACHMENT_3 = "//input[@id='proofIdentityAuthorizeBank']";
	public static String PATH_AGILE_ATTACHMENT_4 = "//input[@id='proofAdderessAuthorizeBank']";
	public static String PATH_AGILE_ATTACHMENT_5 = "//input[@id='spicemenSignAuthorizeGSTN']";
	public static String PATH_AGILE_SAVEANDNEXT_4 = "//button[@id='attachmentNext']";
	public static String PATH_AGILE_DECLARATION_CHQBX1 = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[5]/div[2]/input[1]";
	public static String PATH_AGILE_DECLARATION_CHQBX2 = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[5]/div[4]/input[1]";
	public static String PATH_AGILE_DECLARATION_CHQBX3 = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[5]/div[6]/input[1]";
	public static String PATH_AGILE_DECLARATION_CHQBX1_PT = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[5]/div[2]/input[1]";
	public static String PATH_AGILE_DECLARATION_CHQBX2_PT = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[5]/div[3]/div[2]/input[1]";
	public static String PATH_AGILE_DECLARATION_CHQBX3_PT = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[5]/div[5]/input[1]";
	public static String PATH_AGILE_DECLARATION_CHQBX4_PT = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceagile[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/form[1]/div[5]/div[7]/input[1]";
	public static String PATH_AGILE_DEC_PLACE = "//input[@id='declPlace']";
	public static String PATH_AGILE_DEC_DATE = "//input[@id='mat-input-2']";
	public static String PATH_AGILE_DEC_DIN = "//input[@id='declDINPAN']";
	public static String PATH_AGILE_PRESCUTINY = "//button[contains(text(),'Prescrutiny')]";
	public static String PATH_AGILE_SUBMIT = "//button[contains(text(),'Submit')]";
	public static String PATH_AGILE_OKAY = "//button[contains(text(),'Okay')]";
	public static String PATH_AGILE_ = "";

//SPICe+ AoA

	public static String PATH_AOA_EDIT = "//tbody/tr[4]/td[4]/a[1]/img[1]";

	public static String PATH_AOA_TABLE_TYPE_DRN = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[1]/div[2]/select[1]";
	public static String PATH_AOA_CHECK_INTERPRETATION = "//tbody/tr[3]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_INTERPRETATION = "//tbody/tr[3]/td[3]/textarea[1]";
	public static String PATH_AOA_CHECK_SHARE_CAPITAL_VARIATION_2 = "//tbody/tr[6]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_SHARE_CAPITAL_VARIATION_2 = "//tbody/tr[6]/td[3]/textarea[1]";
	public static String PATH_AOA_UNCHECK_SHARE_CAPITAL_VARIATION_5 = "//tbody/tr[9]/td[1]/input[1]";
	public static String PATH_AOA_CHECK_SHARE_CAPITAL_VARIATION_6 = "//tbody/tr[10]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_SHARE_CAPITAL_VARIATION_6 = "//tbody/tr[10]/td[3]/textarea[1]";
	public static String PATH_AOA_CHECK_PROCEEDINGS = "//tbody/tr[58]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_PROCEEDINGS = "//tbody/tr[58]/td[3]/textarea[1]";
	public static String PATH_AOA_CHECK_VOTING_RIGHTS = "//tbody/tr[66]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_VOTING_RIGHTS = "//tbody/tr[66]/td[3]/textarea[1]";
	public static String PATH_AOA_CHECK_BOARD_OF_DIRECTORS = "//tbody/tr[78]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_BOARD_OF_DIRECTORS = "//tbody/tr[78]/td[3]/textarea[1]";
	public static String PATH_AOA_CHECK_THE_SEAL = "//tbody/tr[100]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_THE_SEAL = "//tbody/tr[100]/td[3]/textarea[1]";
	public static String PATH_AOA_CHECK_OTHERS = "//tbody/tr[118]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_OTHERS = "//tbody/tr[118]/td[3]/textarea[1]";
	public static String PATH_AOA_NO_OF_SUBSCRIBER = "//input[@id='numOfSubscribers']";
	public static String PATH_AOA_ADD = "//button[contains(text(),'Add')]";
	public static String PATH_AOA_SUB1_NAME = "//tbody/tr[1]/td[1]/input[1]";
	public static String PATH_AOA_SUB1_DIN = "//tbody/tr[1]/td[2]/input[1]";
	public static String PATH_AOA_SUB1_PLACE = "//tbody/tr[1]/td[3]/input[1]";
	public static String PATH_AOA_SUB2_NAME = "//tbody/tr[2]/td[1]/input[1]";
	public static String PATH_AOA_SUB2_DIN = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[5]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/input[1]";
	public static String PATH_AOA_SUB2_PLACE = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[5]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[3]/input[1]";
	public static String PATH_AOA_SUB3_NAME = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[5]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/input[1]";
	public static String PATH_AOA_SUB3_DIN = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[5]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[2]/input[1]";
	public static String PATH_AOA_SUB3_PLACE = "//tbody/tr[3]/td[3]/input[1]";
	public static String PATH_AOA_SUB4_NAME = "//tbody/tr[4]/td[1]/input[1]";
	public static String PATH_AOA_SUB4_DIN = "//tbody/tr[4]/td[2]/input[1]";
	public static String PATH_AOA_SUB4_PLACE = "//tbody/tr[4]/td[3]/input[1]";
	public static String PATH_AOA_SUB5_NAME = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[5]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[1]/input[1]";
	public static String PATH_AOA_SUB5_DIN = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[5]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[2]/input[1]";
	public static String PATH_AOA_SUB5_PLACE = "//tbody/tr[5]/td[3]/input[1]";
	public static String PATH_AOA_SUB6_NAME = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[5]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[6]/td[1]/input[1]";
	public static String PATH_AOA_SUB6_DIN = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[5]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[6]/td[2]/input[1]";
	public static String PATH_AOA_SUB6_PLACE = "//tbody/tr[6]/td[3]/input[1]";
	public static String PATH_AOA_SUB7_NAME = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[5]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[7]/td[1]/input[1]";
	public static String PATH_AOA_SUB7_DIN = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[5]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[7]/td[2]/input[1]";
	public static String PATH_AOA_SUB8_DIN = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[5]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[8]/td[2]/input[1]";
	public static String PATH_AOA_SUB9_DIN = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[5]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[9]/td[2]/input[1]";
	public static String PATH_AOA_SUB10_DIN = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[5]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[10]/td[2]/input[1]";
	public static String PATH_AOA_SUB7_PLACE = "//tbody/tr[7]/td[3]/input[1]";
	public static String PATH_AOA_SUB8_PLACE = "//tbody/tr[8]/td[3]/input[1]";
	public static String PATH_AOA_SUB9_PLACE = "//tbody/tr[9]/td[3]/input[1]";
	public static String PATH_AOA_SUB10_PLACE = "//tbody/tr[10]/td[3]/input[1]";
	public static String PATH_AOA_SUB8_NAME = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[5]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[8]/td[1]/input[1]";
	public static String PATH_AOA_SUB9_NAME = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[5]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[9]/td[1]/input[1]";
	public static String PATH_AOA_SUB10_NAME = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[5]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[10]/td[1]/input[1]";
	public static String PATH_AOA_SUB_CONTINUE = "//button[contains(text(),'Continue')]";
	public static String PATH_AOA_SIGNED_DRN = "//tbody/tr[2]/td[1]/select[1]";
	public static String PATH_AOA_SIGNED_NAME = "/html/body/app-root/div/div[5]/div[1]/section/app-spiceaoa/form/div[4]/div[2]/div[5]/div[3]/table/tbody/tr[2]/td[2]/input";
	public static String PATH_AOA_SIGNED_ADDRESS = "/html/body/app-root/div/div[5]/div[1]/section/app-spiceaoa/form/div[4]/div[2]/div[5]/div[3]/table/tbody/tr[2]/td[3]/input";
	public static String PATH_AOA_SIGNED_DIN = "/html/body/app-root/div/div[5]/div[1]/section/app-spiceaoa/form/div[4]/div[2]/div[5]/div[3]/table/tbody/tr[2]/td[4]/input";
	public static String PATH_AOA_SIGNED_PLACE = "/html/body/app-root/div/div[5]/div[1]/section/app-spiceaoa/form/div[4]/div[2]/div[5]/div[3]/table/tbody/tr[2]/td[5]/input";
	public static String PATH_AOA_CHECK_FORM = "//button[contains(text(),'Check Form')]";
	public static String PATH_AOA_SAVE = "//button[contains(text(),'Save')]";
	public static String PATH_AOA_SUBMIT = "//button[contains(text(),'Submit')]";
	public static String PATH_AOA_SUBMIT_MESSAGE = "/html/body/app-root/div/div[5]/div[1]/section/app-spiceaoa/form/div[4]/div[2]/div[7]/div/div/div[3]/span/b";
	public static String PATH_AOA_OK_POPUP = "/html/body/app-root/div/div[5]/div[1]/section/app-spiceaoa/form/div[4]/div[2]/div[7]/div/div/div[4]/button";

//SPICe+ MoA

	public static String PATH_MOA_EDIT = "//tbody/tr[5]/td[4]/a[1]/img[1]";

	public static String PATH_MOA_TABLE_APPLICABLE = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[2]/div[2]/select[1]";
	public static String PATH_MOA_OBJECTIVE = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[3]/div[1]/textarea[1]";
	public static String PATH_MOA_MATTERS = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[4]/div[1]/textarea[1]";
	public static String PATH_MOA_SHARE_CAPITAL = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[6]/div[1]/input[1]";
	public static String PATH_MOA_NO_OF_SHARES = "//input[@id='noOfShares0']";
	public static String PATH_MOA_AMOUNT_PER_SHARE = "//input[@id='amtOfShare0']";
	public static String PATH_MOA_DECLARATION_CHECKBOX = "//tbody/tr[1]/th[1]/input[1]";
	public static String PATH_MOA_SUB1_NAME = "//tbody/tr[2]/td[2]/textarea[1]";
	public static String PATH_MOA_SUB1_DIN = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[2]/td[3]/input[1]";
	public static String PATH_MOA_SUB1_NO_OF_SHARE = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[2]/td[4]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static String PATH_MOA_SUB1_EQUITY = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[2]/td[4]/table[1]/tbody[1]/tr[1]/td[2]/select[1]";
	public static String PATH_MOA_SUB2_NAME = "//tbody/tr[3]/td[2]/textarea[1]";
	public static String PATH_MOA_SUB2_DIN = "//tbody/tr[3]/td[3]/input[1]";
	public static String PATH_MOA_SUB2_NO_OF_SHARE = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[3]/td[4]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static String PATH_MOA_SUB2_EQUITY = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[3]/td[4]/table[1]/tbody[1]/tr[1]/td[2]/select[1]";
	public static String PATH_MOA_SUB3_NAME = "//tbody/tr[4]/td[2]/textarea[1]";
	public static String PATH_MOA_SUB3_DIN = "//tbody/tr[4]/td[3]/input[1]";
	public static String PATH_MOA_SUB3_NO_OF_SHARE = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[4]/td[4]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static String PATH_MOA_SUB3_EQUITY = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[4]/td[4]/table[1]/tbody[1]/tr[1]/td[2]/select[1]";
	public static String PATH_MOA_SUB4_NAME = "//tbody/tr[5]/td[2]/textarea[1]";
	public static String PATH_MOA_SUB4_DIN = "//tbody/tr[5]/td[3]/input[1]";
	public static String PATH_MOA_SUB4_NO_OF_SHARE = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[5]/td[4]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static String PATH_MOA_SUB4_EQUITY = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[5]/td[4]/table[1]/tbody[1]/tr[1]/td[2]/select[1]";
	public static String PATH_MOA_SUB5_NAME = "//tbody/tr[6]/td[2]/textarea[1]";
	public static String PATH_MOA_SUB6_NAME = "//tbody/tr[7]/td[2]/textarea[1]";
	public static String PATH_MOA_SUB7_NAME = "//tbody/tr[8]/td[2]/textarea[1]";
	public static String PATH_MOA_SUB8_NAME = "//tbody/tr[9]/td[2]/textarea[1]";
	public static String PATH_MOA_SUB9_NAME = "//tbody/tr[10]/td[2]/textarea[1]";
	public static String PATH_MOA_SUB10_NAME = "//tbody/tr[11]/td[2]/textarea[1]";
	public static String PATH_MOA_SUB5_DIN = "//tbody/tr[6]/td[3]/input[1]";
	public static String PATH_MOA_SUB6_DIN = "//tbody/tr[7]/td[3]/input[1]";
	public static String PATH_MOA_SUB7_DIN = "//tbody/tr[8]/td[3]/input[1]";
	public static String PATH_MOA_SUB8_DIN = "//tbody/tr[9]/td[3]/input[1]";
	public static String PATH_MOA_SUB9_DIN = "//tbody/tr[10]/td[3]/input[1]";
	public static String PATH_MOA_SUB10_DIN = "//tbody/tr[11]/td[3]/input[1]";
	public static String PATH_MOA_SUB5_NO_OF_SHARE = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[6]/td[4]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static String PATH_MOA_SUB6_NO_OF_SHARE = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[7]/td[4]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static String PATH_MOA_SUB7_NO_OF_SHARE = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[8]/td[4]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static String PATH_MOA_SUB8_NO_OF_SHARE = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[9]/td[4]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static String PATH_MOA_SUB9_NO_OF_SHARE = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[10]/td[4]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static String PATH_MOA_SUB10_NO_OF_SHARE = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[11]/td[4]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	public static String PATH_MOA_SUB5_EQUITY = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[6]/td[4]/table[1]/tbody[1]/tr[1]/td[2]/select[1]";
	public static String PATH_MOA_SUB6_EQUITY = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[7]/td[4]/table[1]/tbody[1]/tr[1]/td[2]/select[1]";
	public static String PATH_MOA_SUB7_EQUITY = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[8]/td[4]/table[1]/tbody[1]/tr[1]/td[2]/select[1]";
	public static String PATH_MOA_SUB8_EQUITY = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[9]/td[4]/table[1]/tbody[1]/tr[1]/td[2]/select[1]";
	public static String PATH_MOA_SUB9_EQUITY = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[10]/td[4]/table[1]/tbody[1]/tr[1]/td[2]/select[1]";
	public static String PATH_MOA_SUB10_EQUITY = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[10]/table[1]/tbody[1]/tr[11]/td[4]/table[1]/tbody[1]/tr[1]/td[2]/select[1]";
	public static String PATH_MOA_SIGNED_FCA = "//tbody/tr[2]/td[1]/select[1]";
	public static String PATH_MOA_SIGNED_NAME = "//body[1]/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spicemoa[1]/form[1]/div[5]/div[3]/div[11]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]";
	public static String PATH_MOA_SIGNED_ADDRESS = "//tbody/tr[2]/td[3]/textarea[1]";
	public static String PATH_MOA_SIGNED_DIN = "//tbody/tr[2]/td[4]/input[1]";
	public static String PATH_MOA_CHECK_FORM = "//button[contains(text(),'Check Form')]";
	public static String PATH_MOA_SAVE = "//button[contains(text(),'Save')]";
	public static String PATH_MOA_SUBMIT = "//button[contains(text(),'Submit')]";
	public static String PATH_MOA_SUBMIT_MESSAGE = "/html/body/app-root/div/div[5]/div[1]/section/app-spicemoa/div[2]/div/div/div[3]/span/b";
	public static String PATH_MOA_OK_POPUP = "/html/body/app-root/div/div[5]/div[1]/section/app-spicemoa/div[2]/div/div/div[4]/button";

//Spice Download Forms

	public static String PATH_DOWNLOAD_PARTB = "//tbody/tr[2]/td[5]/a[1]/img[1]";
	public static String PATH_DOWNLOAD_AGILE = "//tbody/tr[3]/td[5]/a[1]/img[1]";
	public static String PATH_DOWNLOAD_MOA = "//tbody/tr[5]/td[5]/a[1]/img[1]";
	public static String PATH_DOWNLOAD_AOA = "//tbody/tr[4]/td[5]/a[1]/img[1]";
	public static String PATH_DOWNLOAD_INC = "//tbody/tr[7]/td[5]/a[1]/img[1]";

	// SPICE OPC - NOMINEE

	public static String PATH_NOMINEE_I = "//input[contains(@name, 'nameOfNominee')]";
	public static String PATH_NOMINEE_DO_HEREBY_NOMINATE = "//input[contains(@name, 'nominant')]";
	public static String PATH_NOMINEE_DIN = "//input[contains(@name, 'din')]";
	public static String PATH_NOMINEE_PREFILL = "//button[contains(@name, 'prefillBtn')]";
	public static String PATH_NOMINEE_FNAME = "//input[contains(@name, 'firstName')]";
	public static String PATH_NOMINEE_MNAME = "//input[contains(@name, 'middleName')]";
	public static String PATH_NOMINEE_SNAME = "//input[contains(@name, 'lastName')]";
	public static String PATH_NOMINEE_FATHER_FNAME = "//input[contains(@name, 'fatherFirstName')]";
	public static String PATH_NOMINEE_FATHER_MNAME = "//input[contains(@name, 'fatherMiddleName')]";
	public static String PATH_NOMINEE_FATHER_SNAME = "//input[contains(@name, 'fatherLastName')]";
	public static String PATH_NOMINEE_GENDER = "//select[contains(@name, 'partbDtls.nomination.gender')]";
	public static String PATH_NOMINEE_DOB = "//input[contains(@name, 'partbDtls.nomination.dateOfBirth')]";
	public static String PATH_NOMINEE_NATIONALITY = "//select[contains(@name, 'partbDtls.nomination.nationality')]";
	public static String PATH_NOMINEE_PAN = "//input[contains(@name, 'partbDtls.nomination.panNumber')]";
	public static String PATH_NOMINEE_VERIFY_DETAILS = "//*[@id=\"page5\"]/div[14]/div[3]/button";
	public static String PATH_NOMINEE_PLACE_OF_BIRTH = "//input[contains(@name, 'partbDtls.nomination.placeOfBirth')]";
	public static String PATH_NOMINEE_OCCUPATION = "//select[contains(@name, 'partbDtls.nomination.occupationType')]";
	public static String PATH_NOMINEE_AREA_OF_OCCUPATION = "//input[contains(@name, 'partbDtls.nomination.areaOfOccupation')]";
	public static String PATH_NOMINEE_EDUCATION = "//select[contains(@name, 'partbDtls.nomination.educationQualif')]";
	public static String PATH_NOMINEE_LINE_I = "//input[contains(@name, 'partbDtls.nomination.permanentAddress.line1')]";
	public static String PATH_NOMINEE_LINE_II = "//input[contains(@name, 'partbDtls.nomination.permanentAddress.line2')]";
	public static String PATH_NOMINEE_CITY = "//input[contains(@name, 'partbDtls.nomination.permanentAddress.city')]";
	public static String PATH_NOMINEE_STATE = "//select[contains(@name, 'partbDtls.nomination.permanentAddress.state')]";
	public static String PATH_NOMINEE_PIN = "//input[contains(@name, 'partbDtls.nomination.permanentAddress.pincode')]";
	public static String PATH_NOMINEE_ISO = "//select[contains(@name, 'partbDtls.nomination.permanentAddress.countryCode')]";
	public static String PATH_NOMINEE_COUNTRY = "//input[contains(@name, 'partbDtls.nomination.permanentAddress.country')]";
	public static String PATH_NOMINEE_STD = "//input[contains(@name, 'partbDtls.nomination.permanentAddress.phoneIsd')]";
	public static String PATH_NOMINEE_PHONE = "//input[@name = 'partbDtls.nomination.permanentAddress.phone']";
	public static String PATH_NOMINEE_EMAIL = "//input[contains(@name, 'partbDtls.nomination.permanentAddress.emailId')]";
	public static String PATH_NOMINEE_RESIDENTIAL_YES = "//input[contains(@name, 'partbDtls.nomination.whetherSameAddress')]";
	public static String PATH_NOMINEE_DURATION_YEAR = "//input[contains(@name, 'noOfYears')]";
	public static String PATH_NOMINEE_DURATION_MONTH = "//input[contains(@name, 'noOfMonths')]";
	public static String PATH_NOMINEE_IDENTITY_PROOF = "//select[contains(@name, 'partbDtls.nomination.proofOfIdentity')]";
	public static String PATH_NOMINEE_RESIDENTIAL_PROOF = "//select[contains(@name, 'partbDtls.nomination.residentialProof')]";
	public static String PATH_NOMINEE_SAVE_AND_CONTINUE = "//*[@id=\"page5\"]/div[42]/button[2]";
	public static String PATH_NOMINEE_MESSAGE = "//*[@id=\"companiesact1\"]/section/app-spicepartb/form/div/div/div[3]";

	public static String PATH_NOMINEE_NOC = "//input[@name='partbDtls.copiesOfUtilityBillsCopy']";
	public static String PATH_NOMINEE_INC3 = "//input[@name='partbDtls.consentOfNomineeCopy']";
	public static String PATH_NOMINEE_PROOF_SUBSCRIBER = "//input[@name='partbDtls.poiAndresAddOfSubCopy']";
	public static String PATH_NOMINEE_PROOF_NOMINEE = "//input[@name='partbDtls.poiAndresAddOfNomineeCopy']";
	public static String PATH_NOMINEE_PROOF_APP_1 = "//input[@name='partbDtls.poiAndresAddOfApplicant1Copy']";
	public static String PATH_NOMINEE_PROOF_APP_2 = "//input[@name='partbDtls.poiAndresAddOfApplicant2Copy']";
	public static String PATH_NOMINEE_PROOF_APP_3 = "//input[@name='partbDtls.poiAndresAddOfApplicant3Copy']";

	// SPICE OPC AOA
	public static String PATH_AOA_TABLE_TYPE_DRN_OPC = "//body/app-root[1]/div[1]/div[5]/div[1]/section[1]/app-spiceaoa[1]/form[1]/div[4]/div[2]/div[1]/div[2]/select[1]";
	public static String PATH_AOA_CHECK_INTERPRETATION_OPC = "//tbody/tr[3]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_INTERPRETATION_OPC = "//tbody/tr[3]/td[3]/textarea[1]";
	public static String PATH_AOA_CHECK_SHARECAPITAL_1_OPC = "//tbody/tr[5]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_SHARECAPITAL_1_OPC = "//tbody/tr[5]/td[3]/textarea[1]";
	public static String PATH_AOA_CHECK_SHARECAPITAL_2_OPC = "//tbody/tr[6]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_SHARECAPITAL_2_OPC = "//tbody/tr[6]/td[3]/textarea[1]";
	public static String PATH_AOA_CHECK_SHARECAPITAL_3_OPC = "//tbody/tr[7]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_SHARECAPITAL_3_OPC = "//tbody/tr[7]/td[3]/textarea[1]";
	public static String PATH_AOA_UNCHECK_SHARECAPITAL_5_OPC = "//tbody/tr[9]/td[1]/input[1]";
	public static String PATH_AOA_UNCHECK_SHARECAPITAL_6_OPC = "//tbody/tr[10]/td[1]/input[1]";
	public static String PATH_AOA_UNCHECK_SHARECAPITAL_7_OPC = "//tbody/tr[11]/td[1]/input[1]";
	public static String PATH_AOA_UNCHECK_SHARECAPITAL_8_OPC = "//tbody/tr[12]/td[1]/input[1]";
	public static String PATH_AOA_CHECK_CALLS_ON_SHARES_OPC = "//tbody/tr[19]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_CALLS_ON_SHARES_OPC = "//tbody/tr[19]/td[3]/textarea[1]";
	public static String PATH_AOA_CHECK_TRANSMISSION_OPC = "//tbody/tr[31]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_TRANSMISSION_OPC = "//tbody/tr[31]/td[3]/textarea[1]";
	public static String PATH_AOA_UNCHECK_TRANSMISSION_2_OPC = "//tbody/tr[32]/td[1]/input[1]";
	public static String PATH_AOA_UNCHECK_TRANSMISSION_3_OPC = "//tbody/tr[33]/td[1]/input[1]";
	public static String PATH_AOA_UNCHECK_TRANSMISSION_4_OPC = "//tbody/tr[34]/td[1]/input[1]";
	public static String PATH_AOA_CHECK_ALTERATION_1_OPC = "//tbody/tr[45]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_ALTERATION_1_OPC = "//tbody/tr[45]/td[3]/textarea[1]";
	public static String PATH_AOA_CHECK_ALTERATION_2_OPC = "//tbody/tr[46]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_ALTERATION_2_OPC = "//tbody/tr[46]/td[3]/textarea[1]";
	public static String PATH_AOA_CHECK_ALTERATION_3_OPC = "//tbody/tr[48]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_ALTERATION_3_OPC = "//tbody/tr[48]/td[3]/textarea[1]";
	public static String PATH_AOA_CHECK_GENERAL_MEETING_OPC = "//tbody/tr[56]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_GENERAL_MEETING_OPC = "//tbody/tr[56]/td[3]/textarea[1]";
	public static String PATH_AOA_CHECK_PROCEEDING_OPC = "//tbody/tr[58]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_PROCEEDING_OPC = "//tbody/tr[58]/td[3]/textarea[1]";
	public static String PATH_AOA_UNCHECK_PROCEEDING_OPC = "//tbody/tr[62]/td[1]/input[1]";
	public static String PATH_AOA_CHECK_VOTING_OPC = "//tbody/tr[66]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_VOTING_OPC = "//tbody/tr[66]/td[3]/textarea[1]";
	public static String PATH_AOA_UNCHECK_VOTING_1_OPC = "//tbody/tr[70]/td[1]/input[1]";
	public static String PATH_AOA_UNCHECK_VOTING_2_OPC = "//tbody/tr[72]/td[1]/input[1]";
	public static String PATH_AOA_CHECK_BOARD_OF_DIR_OPC = "//tbody/tr[78]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_BOARD_OF_DIR_OPC = "//tbody/tr[78]/td[3]/textarea[1]";
	public static String PATH_AOA_CHECK_PROCEEDING_OF_BOARD_OPC = "//tbody/tr[86]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_PROCEEDING_OF_BOARD_OPC = "//tbody/tr[86]/td[3]/textarea[1]";
	public static String PATH_AOA_UNCHECK_PROCEEDING_OF_BOARD_1_OPC = "//tbody/tr[94]/td[1]/input[1]";
	public static String PATH_AOA_UNCHECK_PROCEEDING_OF_BOARD_2_OPC = "//tbody/tr[95]/td[1]/input[1]";
	public static String PATH_AOA_CHECK_THE_SEAL_OPC = "//tbody/tr[100]/td[2]/input[1]";
	public static String PATH_AOA_TEXT_THE_SEAL_OPC = "//tbody/tr[100]/td[3]/textarea[1]";
	public static String PATH_AOA_ADD_SUBSCRIBER_BUTTON = "//button[contains(text(),'Add')]";
	public static String PATH_AOA_SUB_NAME = "//input[@id='subscribers.subscriberName']";
	public static String PATH_AOA_SUB_PAN = "//input[@id='subscribers.subscriberId']";
	public static String PATH_AOA_SUB_PLACE = "//input[@id='subscribers.subscriberPlace']";
	public static String PATH_AOA_SUB_CONTINUE_OPC = "//button[contains(text(),'Continue')]";
	public static String PATH_AOA_CHECKFORM = "//button[contains(text(),'Check Form')]";

	// GST Recon
	public static String PATH_RETURN_DASHBOARD = "//span[contains(text(),'Return Dashboard')]";
	public static String PATH_FINANCIAL_YEAR = "//select[@name='fin']";
	public static String PATH_RETURN_FILING_PERIOD = "//select[@name='mon']";
	public static String PATH_SEARCH_BUTTON = "//button[contains(text(),'Search')]";
	public static String PATH_GSTR3B_STATUS = "//div//div//div//div//div[2]//div[1]//div[1]//div[2]//p[1]//span[1]";
	public static String PATH_GSTR1_STATUS = "//body//div//div//div//div[1]//div[1]//div[1]//div[2]//p[1]//span[1]";
	public static String PATH_GSTR3B_DOWNLOAD = "//body//div[@class='mypage']//div//div[2]//div[1]//div[1]//div[2]//div[1]//div[2]//button[1]";
	public static String PATH_GSTR3B_VIEW_SUMMARY_BTN = "//button[@id='ember345']";
	public static String PATH_VIEW_ITC_CLAIMED_BTN = "//button[@class='btn btn-primary offline_btn'][contains(text(),'View')]";
	public static String PATH__ITC_CREDIT_CLAIMED_AND_DUE_BTN = "//button[contains(text(),'ITC credit claimed and due')]";
	public static String PATH_VIEW_GSTR1_BTN = "//button[contains(text(),'VIEW GSTR1')]";
	public static String PATH_GSTR1_PREVIEW_BTN = "//button[contains(text(),'Preview')]";
	public static String PATH_BACK_GSTR1_BTN = "//a[@class='btn btn-default']";

	// Tm Download
	public static String PATH_CAPTHA_IMAGE = "//div[@style='background-color:White;']/img";
	public static String PATH_CAPTCHATEXT_BOX = "//input[@name='txtCaptcha']";
	public static String PATH_CAPTCHATEXT_REFRESH = "//input[@name='ImageButton1']";
	public static String PATH_TRADEMARK_URL = "https://ipindiaonline.gov.in/trademarkefiling/user/frmloginNew.aspx";
	public static String PATH_LOGINBUTTON = "input[type='submit']";
	public static String PATH_USERNAME = "input#TBUserName";
	public static String PATH_CAPTHATEXTBOX = "input#txtCaptcha";
	public static String PATH_PASSWORD = "input#TBPassword";
	public static String PATH_FORMHISTORY = "//a[text()='Form History']";
	public static String PATH_FILLINGHISTORY = "//a[text()='Filing History']";
	public static String PATH_FROMDATE = "//input[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_txtFromDate']";
	public static String PATH_TODATE = "//input[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_txtToDate']";
	public static String PATH_DATECLOSEBUTTON = "(//td[@class='ajax__validatorcallout_close_button_cell']/div/img)[2]";
	public static String PATH_DATESUBMITBUTTON = "//a[text()='Submit']";
	public static String PATH_PAGENATION_SIZE = "(//table[@border='0'])[2]/tbody/tr/td/a";
	public static String PATH_NEWFORMFILING = "//a[text()='New Form Filing']";
	public static String PATH_MISCELLANEOUSREPLY = "//a[text()='Miscellaneous Reply']";
	public static String PATH_PURPOSEOFREQUEST = "//span[text()='PURPOSE OF REQUEST']";
	public static String PATH_REPLYTOEXAMANINATIONRADIOBUTTON = "//label[text()=' REPLY TO EXAMINATION REPORT(MIS-R)']/parent::td/input";
	public static String PATH_PROCEEDBUTTON = "//input[@value='Proceed']";
	public static String PATH_REPLYATTACHEDSEPERATELYCHECKBOX = "//label[text()='Reply attached seperately']/parent::td/input";
	public static String PATH_ATTENDINGHEARINGDROPDOWN = "//select[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_ddlhearingmode']";
	public static String PATH_UPLOADBUTTON = "//a[text()='Uploads']";
	public static String PATH_UPLOADCHOOSEDROPDOWN = "//select[@class='txtBoxStyle']";
	public static String PATH_FILEUPLOADBUTTON = "//input[@type='file']";
	public static String PATH_UPLOADBUTTONSUBMIT = "//td[@style='vertical-align: top']/input[2]";
	public static String PATH_CLOSEBUTTON = "//a[text()='Close']";
	public static String PATH_SUBMITBUTTON = "//a[text()='Submit']";
	public static String PATH_APPLICATIONFORUMS = "//a[text()='Update Application/Forms']";
	public static String PATH_DFRATEDFORMS = "//a[text()='Drafted Forms']";
	public static String PATH_SIGNDOCUMENTBUTTON = "//a[text()='Sign Document']";
	public static String PATH_SIGNFILESBUTTON = "//a[text()='Sign Files']";
	public static String PATH_BACKBUTTON = "//a[text()='Back']";
	public static String PATH_INVALIDAPPLICATIONNUMBERPOPUP = "//span[text()='NOT A VALID  APPLICATION/OPPOSITION/RECTIFICATION NUMBER']";

	// DSC emudhra
	public static String DSC_PATH_URL = "https://partner.e-mudhra.com/portal/Partner/Login.aspx#";
	public static String DSC_PATH_USERNAMETEXTBOX = "//input[@id='HomeContentPlaceHolder_txtLoginID']";
	public static String DSC_PATH_PASSWORDTEXTBOX = "//input[@id='HomeContentPlaceHolder_txtPassword']";
	public static String DSC_PATH_AGREECHECKBOK = "//label[text()='I agree to the T&C of ']/parent::span/input";
	public static String DSC_PATH_SUBMITBUTTON = "//input[@value='Submit']";
	public static String DSC_PATH_SKIPBUTTON = "//input[@id='HomeContentPlaceHolder_btn_Skip']";
	public static String DSC_PATH_IMPORTANTNOTELABEL = "//h4[text()='Important Note']";
	public static String DSC_PATH_CLOSEBUTTON = "//button[@class='close']";
	public static String DSC_PATH_PAPERLESSDSCTAB = "//span[text()='Paperless DSC ']";
	public static String DSC_PATH_PAPERLESSDSCISSUANCELINK = "//span[text()='Paperless DSC Issuance Link']/parent::a";
	public static String DSC_PATH_VISTPAGEBUTTON = "//a[text()='Visit Page']";
	public static String DSC_PATH_ENROLLAPPLYDSCBUTTON = "//input[@value='Enrol & Apply DSC']";
	public static String DSC_PATH_CONTINUEBUTTON = "//input[@id='Body_btnIndividualProceed']";
	public static String DSC_PATH_SIGNATURERADIOBUTTON = "//label[text()='Signature']/parent::span/input";
	public static String DSC_PATH_TWOYEARSRADIOBUTTON = "//label[text()='2 Yrs']/parent::span/input";
	public static String DSC_PATH_CHALLENGEBUTTON = "//input[@id='challange']";
	public static String DSC_PATH_RECHALLENGEBUTTON = "//input[@id='retypechallange']";
	public static String DSC_PATH_NEXTBUTTON = "//input[@value='Next']";
	public static String DSC_PATH_APPLICANTPANTEXTBOX = "//input[@id='txtValidateApplicantPAN']";
	public static String DSC_PATH_PROCEEDBUTTON = "//input[@value='Proceed']";
	public static String DSC_PATH_APPLICATIONNUMBEREXTRACT = "//span[@id='Body_lblApplicationIdSkipeSign']";
	public static String DSC_PATH_CONTINUETOSIGNBUTTON = "//input[@value='Continue to eSign Verification']";

	// DSC Sify
	public static String DSC_SIFY_PATH_URL = "https://dsc.safescrypt.com/vakilsearch/";
	public static String DSC_SIFY_PATH_PROCEEDBUTTON = "(//div[text()='Proceed'])[1]";
	public static String DSC_SIFY_PATH_POLICYNAMELABEL = "//div[text()='Policy Name']";
	public static String DSC_SIFY_PATH_POLICYDROPDOWN = "//select[@id='policyName']";
	public static String DSC_SIFY_PATH_CLASSNAMEDROPDOWN = "//select[@id='className']";
	public static String DSC_SIFY_PATH_SUBMITBUTTON = "//div[text()='Submit']";
	public static String DSC_SIFY_PATH_REGISTRATIONNUMBER = "//div[@id='adminPopText']/b";
	public static String DSC_SIFY_PATH_OKAYBUTTON = "//div[@id='okMsgBtn']";
	public static String DSC_SIFY_PATH_CLICKHERE = "//span[text()='click here']";
	public static String DSC_SIFY_PATH_REGISTERPAN = "//div[text()='Register using PAN']/parent::span/center[2]/div";
	public static String DSC_SIFY_PATH_MOBILETEXTBOX = "//input[@id='registerMobile']";
	public static String DSC_SIFY_PATH_PANTEXTBOX = "//input[@id='registerPanNumber']";
	public static String DSC_SIFY_PATH_PANAPPROVED = "//span[@id='panNoApproved']";
	public static String DSC_SIFY_PATH_NAME = "//span[text()='Name']/parent::div/input";
	public static String DSC_SIFY_PATH_NAMEAPPROVED = "//span[@id='nameApproved']";
	public static String DSC_SIFY_PATH_DOBDATE = "//span[@class='formLabel']/parent::div/input[@placeholder='DD']";
	public static String DSC_SIFY_PATH_DOBMONTH = "//span[@class='formLabel']/parent::div/input[@placeholder='MM']";
	public static String DSC_SIFY_PATH_DOBYEAR = "//span[@class='formLabel']/parent::div/input[@placeholder='YYYY']";
	public static String DSC_SIFY_PATH_MALERADIOBUTTON = "//input[@id='male']";
	public static String DSC_SIFY_PATH_FEMALERADIOBUTTON = "//div[@class='formValue']/div[2]";
	public static String DSC_SIFY_PATH_OTHERSRADIOBUTTON = "//div[@class='formValue']/div[3]";
	public static String DSC_SIFY_PATH_ADDRESSTEXTBOX = "//textarea[@id='address']";
	public static String DSC_SIFY_PATH_STATEDROPDOWN = "//select[@id='state']";
	public static String DSC_SIFY_PATH_PINCODETEXTBOX = "//input[@id='postalCode']";
	public static String DSC_SIFY_PATH_EMAILTEXTBOX = "//input[@id='registerEmail']";
	public static String DSC_SIFY_PATH_PHOTOUPLOAD = "//input[@id='photoFile']";
	public static String DSC_SIFY_PATH_IDENTITYPROOFUPLOAD = "//input[@id='docIdFile']";
	public static String DSC_SIFY_PATH_ADRESSDOCUMENTUPLOAD = "//input[@id='docAddressFile']";
	public static String DSC_SIFY_PATH_USERNAMETEXTBOX = "//input[@id='createSignerId']";
	public static String DSC_SIFY_PATH_PINTEXTBOX = "//input[@id='createPin']";
	public static String DSC_SIFY_PATH_PANALREADYEXISTS = "//div[text()='PAN is already used for another account']";
	public static String DSC_SIFY_PATH_INVALIDPANPOPUP = "//div[text()='Invalid PAN']";
	public static String DSC_SIFY_PATH_INVALIDPANPOPUPCLOSE = "//div[@id='popupMessageArea']/span";
	public static String DSC_SIFY_PATH_INVALIDPANTOOLTIP = "//div[@class='errorText']";
	public static String DSC_SIFY_PATH_INVALIDNAMEPOPUP = "//div[text()='Enter your name as in PAN Card']";
	public static String DSC_SIFY_PATH_INVALIDNAMCROSS = "//span[@id='nameRejected']";
	public static String DSC_SIFY_PATH_PANALREADYUSED = "//div[text()='PAN is already used for another account']";
	public static String DSC_SIFY_PATH_MOBILENUMBERALREADYTHERE = "//div[text()='Mobile Number is already used for another account.']";
	public static String DSC_SIFY_PATH_DULLPOPUP = "//div[@id='popupDullScreen']";

	// Vakilsearch.com
	public static String VS_HOME = "https://vakilsearch.com";
	// Business Setup
	public static String VS_PVT_SUFFIX = "/online-company-registration";
	public static String VS_LLP_SUFFIX = "/llp-registration-india";
	public static String VS_OPC_SUFFIX = "/one-person-company-opc-in-india";
	public static String VS_SOLE_PROP_SUFFIX = "/proprietorship-registration-india-sole-proprietorship";
	public static String VS_NIDHI_SUFFIX = "/nidhi-company";
	public static String VS_PRODUCER_SUFFIX = "/producer-company";
	public static String VS_PARTNERSHIP_SUFFIX = "/partnership-firm";
	public static String VS_STARTUP_SUFFIX = "/startup-india-scheme";
	public static String VS_COMPANY_NAME_SEARCH_SUFFIX = "/company-name-search";
	public static String VS_DSC_SUFFIX = "/digital-signature";
	public static String VS_MSME_SUFFIX = "/online-udyog-aadhaar-registration";
	public static String VS_ISO_SUFFIX = "/iso-certification";
	public static String VS_FSSAI_SUFFIX = "/online-food-license-fssai-registration";
	public static String VS_IEC_SUFFIX = "/import-export-code";
	public static String VS_US_INC_SUFFIX = "/usa-incorporation";
	public static String VS_SINGAPORE_INC_SUFFIX = "/incorporating-a-company-in-singapore";
	public static String VS_UK_INC_SUFFIX = "/incorporating-a-company-in-united-kingdom";
	public static String VS_NETHERLANDS_INC_SUFFIX = "/incorporating-a-company-in-netherlands";
	public static String VS_HONGKONG_INC_SUFFIX = "/incorporating-a-company-in-hong-kong";
	public static String VS_DUBAI_INC_SUFFIX = "/incorporating-a-company-in-dubai";
	// Talk to
	public static String VS_TALK_TO_LAWYER_SUFFIX = "/talk-to-a-lawyer";
	public static String VS_TALK_TO_CA_SUFFIX = "/talk-to-a-chartered-accountant";
	public static String VS_TALK_TO_CS_SUFFIX = "/talk-to-a-company-secretary";
	// Tax and Compliance
	public static String VS_TC_ADD_DIR = "/appointment-of-a-director";
	public static String VS_TC_REM_DIR = "/removal-of-a-director";
	public static String VS_TC_INCREASE_AUTH = "/increase-in-authorized-capital";
	public static String VS_TC_CLOSE_PVT = "/close-your-private-limited-company";
	public static String VS_TC_CHANGE_OBJ = "/change-the-objectives-of-your-business";
	public static String VS_TC_CHANGE_ADDRESS = "/change-the-official-address-of-your-business-within-the-city";
	public static String VS_TC_CHANGE_COMP_NAME = "/change-your-company-name";
	public static String VS_TC_GST_REG = "/online-gst-registration";
	public static String VS_TC_GST_FILINGS = "/gst-return-filing";
	public static String VS_TC_GST_ADVISORY = "/gst-advisory";
	public static String VS_TC_PVT = "/company-maintenance-package";
	public static String VS_TC_LLP = "/llp-annual-filings";
	public static String VS_TC_CFSS = "/fresh-start-for-companies";

	// Trademark
	public static String VS_TM_REG_SUFFIX = "/online-trademark-registration";
	public static String VS_SEARCH_TM_SUFFIX = "/trademark-search";
	public static String VS_RESPOND_TM_SUFFIX = "/trademark-objection";
	public static String VS_LEGAL_METRO_SUFFIX = "/legal-metrology";
	public static String VS_LOGO_DESIGN_SUFFIX = "/logo-design";
	public static String VS_TM_WATCH_SUFFIX = "/trademark-watch";
	public static String VS_TM_RENEWAL_SUFFIX = "/trademark-renewal";
	public static String VS_TM_ASSIGN_SUFFIX = "/trademark-assign";
	public static String VS_USA_TMSUFFIX = "/trademark-registration-in-usa";
	public static String VS_COPYRIGHT_REG_SUFFIX = "/copyright-registration";
	public static String VS_PATENT_SEARCH_SUFFIX = "/patent-search";
	public static String VS_PROVISION_AP_SUFFIX = "/provisional-patent";
	public static String VS_PER_PATENT_SUFFIX = "/permanent-patent";
	// NGO
	public static String VS_NGO_SUFFIX = "/online-ngo-registration";
	public static String VS_SECTION_8_SUFFIX = "/online-section-8-company-registration";
	public static String VS_TRUST_REG_SUFFIX = "/online-trust-registration";
	public static String VS_SOCEITY_REG_SUFFIX = "/online-society-registration";
	public static String VS_NGO_COMP_SUFFIX = "/ngo-compliance-darpan-80g-12a-csr-1";
	public static String VS_SEC8_COMP_SUFFIX = "/annual-compliances-of-section-8-company";
	public static String VS_CSRFILING_SUFFIX = "/form-csr-1-filing";
	public static String VS_SEC80G_SUFFIX = "/registration-under-section-80G-12A";
	public static String VS_DARPAN_SUFFIX = "/ngo-darpan-registration";

	//
	public static String VS_EMAIL_1 = "(//input[@placeholder='Email*'])[1]";
	public static String VS_PHONE_1 = "(//input[@placeholder='Mobile Number*'])[1]";
	public static String VS_STATE_1 = "(//div[text()='Select State*']/parent::div/div[2]/div/input)[1]";
	public static String VS_LANG_1 = "(//div[text()='Select Language*']/parent::div/div[2]/div/input)[1]";
	public static String VS_SERVICE_1 = "(//div[text()='Service Required']/parent::div/div[2]/div/input)[1]";
	public static String VS_SELECT_ORG_1 = "(//div[text()='Select Organization Type']/parent::div/div[2]/div/input)[1]";
	public static String VS_SELECT_BUSINESS_1 = "(//div[text()='Select Business Type']/parent::div/div[2]/div/input)[1]";
	public static String VS_REG_REQUIRED_1 = "(//div[text()='Registration Required']/parent::div/div[2]/div/input)[1]";
	public static String VS_SUBMIT_1 = "(//button[@type='submit'])[1]";
	public static String VS_EMAIL_2 = "(//input[@placeholder='Email*'])[2]";
	public static String VS_PHONE_2 = "(//input[@placeholder='Mobile Number*'])[2]";
	public static String VS_STATE_2 = "(//div[text()='Select State*']/parent::div/div[2]/div/input)[2]";
	public static String VS_LANG_2 = "(//div[text()='Select Language*']/parent::div/div[2]/div/input)[2]";
	public static String VS_SERVICE_2 = "(//div[text()='Service Required']/parent::div/div[2]/div/input)[2]";
	public static String VS_SELECT_ORG_2 = "(//div[text()='Select Organization Type']/parent::div/div[2]/div/input)[2]";
	public static String VS_SELECT_BUSINESS_2 = "(//div[text()='Select Business Type']/parent::div/div[2]/div/input)[2]";
	public static String VS_REG_REQUIRED_2 = "(//div[text()='Registration Required']/parent::div/div[2]/div/input)[2]";
	public static String VS_SUBMIT_2 = "(//button[@type='submit'])[2]";
	public static String VS_EMAIL_3 = "(//input[@placeholder='Email*'])[3]";
	public static String VS_PHONE_3 = "(//input[@placeholder='Mobile Number*'])[3]";
	public static String VS_SUBMIT_3 = "(//button[@type='submit'])[3]";

		
	
	//GST NIL Filing
	
	public static String GST_LOGIN_PAGE = "https://services.gst.gov.in/services/login";
	public static String GST_USERNAME   = "(//input[@id='username'])";
	public static String GST_PASSWORD   = "(//input[@id='user_pass'])";
	public static String GST_CAPTCHA   = "(//input[@id='captcha'])";
	public static String GST_CAPTCHA_REFRESH = "//button[@ng-click='refreshCaptcha()']";
	public static String GST_CAPTCHA_IMAGE   = "//*[@id=\"imgCaptcha\"]";
	public static String GST_SUBMIT   = "(//button[@type='submit'])";
	public static String GST_POPUP_YES   = "(//a[@ng-click='callback()'])";
	public static String GST_POPUP_REMIND_LATER   = "(//a[@ng-click='cancelcallback()'])";
	
	public static String GST_AMENDMENT_POPUP= "//a[text()='FILE AMENDMENT']";
	public static String GST_DASHBOARD_LINK = "//a[text()='Dashboard']";
	public static String GST_FILE_RETURNS  = "//span[text()='File Returns ']";
	public static String GST_RETURN_DASHBOARD_BTN   = "(//span[@title='Return Dashboard'])";
	public static String GST_SELECT_QUARTER = "//select[@name='quarter']";
	public static String GST_SELECT_MONTH = "(//select[@name='mon'])";
	public static String GST_SEARCH = "(//button[@class='btn btn-primary srchbtn'])";
	public static String GST_1B_PREPARE_BTN = "(//button[@data-ng-bind='trans.LBL_ITC01_MSG17'])";
	public static String GST_1B_GENERATE_SUMMARY_BTN ="//button[text()='GENERATE SUMMARY']";
	public static String GST_ERROR_MESSAGE ="//span[@data-ng-bind='message']";
	public static String GST_LOADER ="(//div[@id='dimmer'])";
	public static String GST_REFRESH = "//button[@data-ng-click='refresh()']";
	public static String GST_PROCEED_TO_FILE = "//span[text()='PROCEED TO FILE/SUMMARY']";
	public static String GST_FILING_STATUS = "/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div[2]/div[3]/span[2]";
	
	public static String GST_FILE_STATEMENT  = "//button[text()='File Statement']";
	public static String GST_CHECKBOX = "//input[@id='dscCheckbox']";
	public static String GST_APP_NAME = "//select[@name='pandsc']";
	public static String GST_FILE_WITH_IEC_BTN = "//button[text()='File With EVC']";
	public static String GST_OTP_TBX = "//input[@name='otp']";
	public static String GST_VERIFY_OTP_BTN = "//button[text()='VERIFY']";
	public static String GST_RESEND_OTP_BTN = "//button[text()='RESEND OTP']";
	public static String GST_SUCCESS_MESSAGE = "//div[@data-ng-show='success_msg']";
	public static String GST_FAILURE_MESSAGE = "//div[@data-ng-show='fail_msg']";
	public static String GST_SUCCESS_OK_BTN = "//button[text()='Ok']";
	public static String GST_3B_PREPARE_BTN= "//button[@class='btn btn-primary offline_btn']";
	public static String GST_3B_FILED_ALREADY= "/html/body/div[2]/div[2]/div/div[2]/div[4]/div[3]/div[2]/div[1]/div/div/p/span";
	public static String GST_3B_NIL_YES_RBTN= "//input[@id='nilyes']";
	public static String GST_3B_NEXT_BTN = "//button[@data-ng-click='showGSTR3BTiles()']";
	public static String GST_3B_CLOSE_MESSAGE = "//button[text()='CLOSE']";
	public static String GST_3B_CHECKBOX= "//input[@id='dscCheckbox']";
	public static String GST_3B_AUTH_DIR_DRN= "//select[@id='DscAuth']";
	public static String GST_3B_FILE_WITH_EVC="//button[text()='File GSTR-3B with EVC']";
	public static String GST_RETURN_DASHBOARD_LINK = "//a[text()='Returns' and @href='/returns/auth/dashboard']";
	public static String GST_3B_SUCCESS_MESSAGE = "/html/body/success-dialogue/div/div/div/div[1]/p";
	
	
	//MSME Registration
	public static String MSME_SPINNER= "//div[@id='status']";
	public static String MSME_REG_URL= "https://udyamregistration.gov.in/UdyamRegistration.aspx";
	public static String MSME_DOWNLOAD_URL= "https://udyamregistration.gov.in/Udyam_Verify.aspx";
	public static String MSME_AADHARNUMBER= "//input[@placeholder='Your Aadhaar No']";
	public static String MSME_NAME_OF_ENTERPRENEUR= "//input[@placeholder='Name as per Aadhaar']";
	public static String MSME_VALIDATE_AND_GENERATE_OTP= "//input[@value='Validate & Generate OTP']";
	public static String MSME_AADHAR_ERROR= "//span[@id='ctl00_ContentPlaceHolder1_lblmsg' and @style='color:Red;font-weight:bold;']";
	public static String MSME_OTP_INPUT= "//input[@placeholder='OTP code']";
	public static String MSME_VALIDATE_OTP= "//input[@type='submit']";
	public static String MSME_ERROR_OTP= "//span[@id='ctl00_ContentPlaceHolder1_lblOtp1']";
	public static String MSME_TYPE_OF_ORGANISATION= "//select[@id='ctl00_ContentPlaceHolder1_ddlTypeofOrg']";
	public static String MSME_ENTER_PAN= "//input[@placeholder='Enter Pan Number']";
	public static String MSME_PAN_VALIDATION_SUCCESS= "//span[@id='ctl00_ContentPlaceHolder1_lblPanError']";
	public static String MSME_VALIDATE_PAN= "//input[@id='ctl00_ContentPlaceHolder1_btnValidatePan']";
	public static String MSME_CONTINUE_BTN= "//input[@id='ctl00_ContentPlaceHolder1_btnGetPanData']";
	public static String MSME_PAN_VERIFY_SUCCESS_MESSAGE= "//span[@id='ctl00_ContentPlaceHolder1_lblPanError' and  @style='color:Green;font-weight:bold;']";
	public static String MSME_HAVE_GSTIN_YES= "//input[@id='ctl00_ContentPlaceHolder1_rblWhetherGstn_0']";
	public static String MSME_HAVE_GSTIN_NO= "//input[@id='ctl00_ContentPlaceHolder1_rblWhetherGstn_1']";
	public static String MSME_HAVE_GSTIN_EXEMPTED= "//input[@id='ctl00_ContentPlaceHolder1_rblWhetherGstn_2']";
	public static String MSME_MOBILE_NUMBER= "//input[@id='ctl00_ContentPlaceHolder1_txtmobile']";
	public static String MSME_EMAIL= "//input[@id='ctl00_ContentPlaceHolder1_txtemail']";
	public static String MSME_SOCIAL_CATEGORY_GENERAL= "//input[@id='ctl00_ContentPlaceHolder1_rdbcategory_0']";
	public static String MSME_SOCIAL_CATEGORY_SC= "//input[@id='ctl00_ContentPlaceHolder1_rdbcategory_1']";
	public static String MSME_SOCIAL_CATEGORY_ST= "//input[@id='ctl00_ContentPlaceHolder1_rdbcategory_2']";
	public static String MSME_SOCIAL_CATEGORY_OBC= "//input[@id='ctl00_ContentPlaceHolder1_rdbcategory_3']";
	public static String MSME_GENDER_MALE= "//input[@id='ctl00_ContentPlaceHolder1_rbtGender_0']";
	public static String MSME_GENDER_FEMALE= "//input[@id='ctl00_ContentPlaceHolder1_rbtGender_1']";
	public static String MSME_GENDER_OTHERS= "//input[@id='ctl00_ContentPlaceHolder1_rbtGender_2']";
	public static String MSME_SPECIALLY_ABLED_YES= "//input[@id='ctl00_ContentPlaceHolder1_rbtPh_0']";
	public static String MSME_SPECIALLY_ABLED_NO= "//input[@id='ctl00_ContentPlaceHolder1_rbtPh_1']";
	public static String MSME_NAME_OF_ENTERPRISE= "//input[@id='ctl00_ContentPlaceHolder1_txtenterprisename']";
	public static String MSME_PLANT_UNIT_NAME= "//input[@id='ctl00_ContentPlaceHolder1_txtUnitName']";
	public static String MSME_ADD_UNIT= "//input[@id='ctl00_ContentPlaceHolder1_btnAddUnit']";
	public static String MSME_UNIT_NAME_DRN= "//select[@id='ctl00_ContentPlaceHolder1_ddlUnitName']";
	public static String MSME_PLANT_FLAT_NO= "//input[@id='ctl00_ContentPlaceHolder1_txtPFlat']";
	public static String MSME_PLANT_NAME_OF_PREMISES= "//input[@id='ctl00_ContentPlaceHolder1_txtPBuilding']";
	public static String MSME_PLANT_VILLAGE= "//input[@id='ctl00_ContentPlaceHolder1_txtPVillageTown']";
	public static String MSME_PLANT_BLOCK= "//input[@id='ctl00_ContentPlaceHolder1_txtPBlock']";
	public static String MSME_PLANT_ROAD= "//input[@id='ctl00_ContentPlaceHolder1_txtPRoadStreetLane']";
	public static String MSME_PLANT_CITY= "//input[@id='ctl00_ContentPlaceHolder1_txtPCity']";
	public static String MSME_PLANT_PIN= "//input[@id='ctl00_ContentPlaceHolder1_txtPpin']";
	public static String MSME_PLANT_STATE= "//select[@id='ctl00_ContentPlaceHolder1_ddlPState']";
	public static String MSME_PLANT_DISTRICT= "//select[@id='ctl00_ContentPlaceHolder1_ddlPDistrict']";
	public static String MSME_ADD_PLANT_BTN= "//input[@id='ctl00_ContentPlaceHolder1_BtnPAdd']";
	public static String MSME_ADD_PLANT_SUCCESS= "//table[@id='ctl00_ContentPlaceHolder1_gvPlant']";
	public static String MSME_OFC_FLAT_NO= "//input[@id='ctl00_ContentPlaceHolder1_txtOffFlatNo']";
	public static String MSME_OFC_NAME_OF_PREMISES= "//input[@id='ctl00_ContentPlaceHolder1_txtOffBuilding']";
	public static String MSME_OFC_VILLAGE= "//input[@id='ctl00_ContentPlaceHolder1_txtOffVillageTown']";
	public static String MSME_OFC_BLOCK= "//input[@id='ctl00_ContentPlaceHolder1_txtOffBlock']";
	public static String MSME_OFC_ROAD= "//input[@id='ctl00_ContentPlaceHolder1_txtOffRoadStreetLane']";
	public static String MSME_OFC_CITY= "//input[@id='ctl00_ContentPlaceHolder1_txtOffCity']";
	public static String MSME_OFC_PIN= "//input[@id='ctl00_ContentPlaceHolder1_txtOffPin']";
	public static String MSME_OFC_STATE= "//select[@id='ctl00_ContentPlaceHolder1_ddlstate']";
	public static String MSME_OFC_DISTRICT= "//select[@id='ctl00_ContentPlaceHolder1_ddlDistrict']";
	public static String MSME_PREVIOUS_NA= "//input[@id='ctl00_ContentPlaceHolder1_rdbPreviousEM_0']";
	public static String MSME_PREVIOUS_EM= "//input[@id='ctl00_ContentPlaceHolder1_rdbPreviousEM_1']";
	public static String MSME_PREVIOUS_UAM= "//input[@id='ctl00_ContentPlaceHolder1_rdbPreviousEM_2']";
	public static String MSME_DATE_OF_INCORP= "//input[@id='ctl00_ContentPlaceHolder1_txtdateIncorporation']";
	public static String MSME_WHEATHER_PROD_YES= "//input[@id='ctl00_ContentPlaceHolder1_rblcommenced_0']";
	public static String MSME_WHEATHER_PROD_NO= "//input[@id='ctl00_ContentPlaceHolder1_rblcommenced_1']";
	public static String MSME_DATE_OF_COMMENCEMENT= "//input[@id='ctl00_ContentPlaceHolder1_txtcommencedate']";
	public static String MSME_BANK_NAME= "//input[@id='ctl00_ContentPlaceHolder1_txtBankName']";
	public static String MSME_IFSC_CODE= "//input[@id='ctl00_ContentPlaceHolder1_txtifsccode']";
	public static String MSME_BANK_ACCOUNT_NUMBER= "//input[@id='ctl00_ContentPlaceHolder1_txtaccountno']";
	public static String MSME_MAJOR_ACTIVITY_MANUFACTURING= "//input[@id='ctl00_ContentPlaceHolder1_rdbCatgg_0']";
	public static String MSME_MAJOR_ACTIVITY_SERVICES= "//input[@id='ctl00_ContentPlaceHolder1_rdbCatgg_1']";
	public static String MSME_MAJOR_ACTIVITY_SERVICES_NON_TRADING = "//input[@id='ctl00_ContentPlaceHolder1_rdbSubCategg_0']";
	public static String MSME_MAJOR_ACTIVITY_SERVICES_TRADING = "//input[@id='ctl00_ContentPlaceHolder1_rdbSubCategg_1']";
	public static String MSME_SEARCH_NIC_CODE= "//input[@id='ctl00_ContentPlaceHolder1_txtsearchNic']";
	public static String MSME_NIC_MANUFACTURING= "//input[@id='ctl00_ContentPlaceHolder1_rdbCatggMultiple_0']";
	public static String MSME_NIC_SERVICES= "//input[@id='ctl00_ContentPlaceHolder1_rdbCatggMultiple_1']";
	public static String MSME_NIC_TRADING= "//input[@id='ctl00_ContentPlaceHolder1_rdbCatggMultiple_2']";
	public static String MSME_NIC_2DIGIT= "//select[@id='ctl00_ContentPlaceHolder1_ddl2NicCode']";
	public static String MSME_NIC_4DIGIT= "//select[@id='ctl00_ContentPlaceHolder1_ddl4NicCode']";
	public static String MSME_NIC_5DIGIT= "//select[@id='ctl00_ContentPlaceHolder1_ddl5NicCode']";
	public static String MSME_ADD_MORE_ACTIVITY= "//input[@id='ctl00_ContentPlaceHolder1_btnAddMore']";
	public static String MSME_NO_OF_PERSONS_MALE= "//input[@id='ctl00_ContentPlaceHolder1_txtNoofpersonMale']";
	public static String MSME_NO_OF_PERSONS_FEMALE= "//input[@id='ctl00_ContentPlaceHolder1_txtNoofpersonFemale']";
	public static String MSME_NO_OF_PERSONS_OTHERS= "//input[@id='ctl00_ContentPlaceHolder1_txtNoofpersonOthers']";
	public static String MSME_DECLARATION_CHECKBOX= "//input[@id='ctl00_ContentPlaceHolder1_chkboxEmp']";
	public static String MSME_WRITTEN_DOWN_VALUE= "//input[@id='ctl00_ContentPlaceHolder1_txtDepCost']";
	public static String MSME_EXCLUSION_OF_COST= "//input[@id='ctl00_ContentPlaceHolder1_txtExCost']";
	public static String MSME_TOTAL_TURNOVER= "//input[@id='ctl00_ContentPlaceHolder1_txtTotalTurnoverA']";
	public static String MSME_REGISTER_ON_GOVERNMENT_YES= "//input[@id='ctl00_ContentPlaceHolder1_rblGeM_0']";
	public static String MSME_REGISTER_ON_GOVERNMENT_NO= "//input[@id='ctl00_ContentPlaceHolder1_rblGeM_1']";
	public static String MSME_REGISTER_ON_TREDS_YES= "//input[@id='ctl00_ContentPlaceHolder1_rblTReDS_0']";
	public static String MSME_REGISTER_ON_TREDS_NO= "//input[@id='ctl00_ContentPlaceHolder1_rblTReDS_1']";
	public static String MSME_REGISTER_ON_NCS_YES= "//input[@id='ctl00_ContentPlaceHolder1_rblNCS_0']";
	public static String MSME_REGISTER_ON_NSIC_YES= "//input[@id='ctl00_ContentPlaceHolder1_rblnsic_0']";
	public static String MSME_DISTRICT_INDUSTRIES_CENTRE= "//select[@id='ctl00_ContentPlaceHolder1_ddlDIC']";
	public static String MSME_DISTRICT_INDUSTRIES_CENTRE_DISABLED= "//select[@id='ctl00_ContentPlaceHolder1_ddlDIC' and @disabled='disabled']";
	public static String MSME_SUBMIT_AND_GET_OTP= "//input[@id='ctl00_ContentPlaceHolder1_btnsubmit']";
	public static String MSME_FINAL_OTP_TBX= "//input[@id='ctl00_ContentPlaceHolder1_txtOtp']";
	public static String MSME_CAPTCHA_INPUT="//input[@id='ctl00_ContentPlaceHolder1_txtCaptcha']";
	public static String MSME_CAPTCHA_IMAGE="//img[@id='ctl00_ContentPlaceHolder1_imgCaptcha' and @alt='Verification code']";
	public static String MSME_FINAL_SUBMIT="//input[@id='ctl00_ContentPlaceHolder1_btn_finalsubmit']";
	public static String MSME_RESEND_OTP="//input[@id='ctl00_ContentPlaceHolder1_btnsubmit']";
	public static String MSME_CAPTCHA_REFRESH="//input[@id='ctl00_ContentPlaceHolder1_ImgRefresh']";
	public static String MSME_WRONG_OTP_MESSAGE="//span[text()='Your OTP Number is Wrong.']";
	public static String MSME_WRONG_CAPTCHA="//span[text()='Incorrect verification code. Please try again.']";
	public static String MSME_NUMBER_INPUT_TBX = "//input[@id='ctl00_ContentPlaceHolder1_txtUdyamNo']";
	public static String MSME_NUMBER_CAPTCHA_IMAGE = "//img[@id='ctl00_ContentPlaceHolder1_imgCaptcha']";
	public static String MSME_NUMBER_CAPTCHA_REFRESH = "//input[@id='ctl00_ContentPlaceHolder1_ImgRefresh']";
	public static String MSME_NUMBER_CAPTCHA_VERIFY_BTN = "//input[@id='ctl00_ContentPlaceHolder1_btnVerify']";
	public static String MSME_NUMBER_CAPTCHA_INPUT = "//input[@id='ctl00_ContentPlaceHolder1_txtCaptcha']";
	public static String MSME_NUMBER_CAPTCHA_INVALID_MESSAGE = "//span[@id='ctl00_ContentPlaceHolder1_lblCaptcha']";
	public static String MSME_CERTIFICATE_IMAGE = "//table[@id='ctl00_ContentPlaceHolder1_tblprint']";
	public static String MSME_SUCCESS_MESSAGE= "//span[@id='ctl00_ContentPlaceHolder1_lblmsg']";
	
	//TM OBJECTION
	public static String TMOB_URL = "https://ipindiaonline.gov.in/trademarkefiling/user/frmloginNew.aspx";
	public static String TMOB_NEW_FORM_FILLING = "//a[@id='ctl00_ctl00_ContentPlaceHolder1_AccordionPane5_header_LinkButton78']";
	public static String TMOB_MISCELLANEOUS_REPLY = "//a[@id='ctl00_ctl00_ContentPlaceHolder1_AccordionPane5_content_LinkButton1']";
	public static String TMOB_REPLY_TO_EXAMINATION_REPORT = "//input[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_rbtnForReply_1']";
	public static String TMOB_APPLICATION_NUMBER = "//input[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_TBApplicationnumber']";
	public static String TMOB_PROCEED_BTN = "//input[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_btnProceed']";
	public static String TMOB_PREFFERED_MODE_DRN = "//select[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_ddlhearingmode']";
	public static String TMOB_REPLY_ATTACHED_CBX = "//input[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_chkReply']";
	public static String TMOB_UPLOADS_BTN = "//a[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_LnkUpload']";
	public static String TMOB_DOCUMENT_TYPE_DRN = "//select[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_FormUpload1_DDLDocType']";
	public static String TMOB_SELCT_FILE_UPLOAD = "//input[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_FormUpload1_AFUAttachments']";
	public static String TMOB_UPLOAD_BTN = "//input[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_FormUpload1_lblAddMore']";
	public static String TMOB_CLOSE_BTN = "//a[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_LinkButton5']";
	public static String TMOB_SUBMIT_BTN = "//a[@id='ctl00_ctl00_ContentPlaceHolder1_ContentPlaceHolder2_LnkSubmit']";
	
	//LLP 2 Upload
	public static String LLP_LOADER = "//div[@class='loader d-none d-flex']";
	public static String LLP_LOADER_BLUE = "//div[@id='loadingPage' and @class='guideServiceLoading']";
	public static String LLP_PAGINATION ="//select[@id='pagination-values']";
	public static String LLP_NEXT_BTN = "//*[@id=\"fohomepage-1894668fe8\"]/div[2]/div/div[1]/div/div/div[2]/div/div[11]/div[2]/div[2]/div[1]/div[3]/div/ul/div/span[2]";
	public static String LLP_CHOOSE_FILE_FORM_9 = "//input[@id ='guideContainer-rootPanel-panel_861469557_copy_964570287-panel_459488480_copy-panel-fileuploadwithplaceh___widget']";
	public static String LLP_CHOOSE_FILE_FILLIP = "//input[@id ='guideContainer-rootPanel-panel_861469557_copy_964570287-panel_459488480_copy-panel_copy_copy-fileuploadwithplaceh___widget']";
	public static String LLP_UPLOAD_FORM_9 = "//*[@id=\"guideContainer-rootPanel-panel_861469557_copy_964570287-panel_459488480_copy-panel-mca_button___widget\"]";
	public static String LLP_UPLOAD_FILLIP = "//*[@id=\"guideContainer-rootPanel-panel_861469557_copy_964570287-panel_459488480_copy-panel_copy_copy-mca_button___widget\"]/span[2]";
	public static String LLP_MESSAGE_FORM_9 = "//*[@id=\"guideContainer-rootPanel-panel_861469557_copy_964570287-panel_459488480_copy-panel-guidetextdraw_950116__\"]/p";
	public static String LLP_MESSAGE_FILLIP = "//*[@id=\"guideContainer-rootPanel-panel_861469557_copy_964570287-panel_459488480_copy-panel_copy_copy-guidetextdraw_950116__\"]/p";
	public static String LLP_MAKE_PAYMENT = "//span[text()='Proceed For Payment']";
	public static String LLP_PAYMENT_AMOUNT = "//*[@id=\"remittanceTable\"]/tbody/tr[5]/td[2]";
	public static String LLP_MAKE_PAYMENT_BTN = "//*[@id=\"homepage-e27df2f92e\"]/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/button";
	public static String LLP_SUBMIT_BTN = "//*[@id=\"payment-submit\"]/button[2]";
	public static String LLP_PAYMENT_CONFIRM ="//button[@id='btnConfirm']";
	
	//LLP3 Form Filling
	
	public static String LLP_FORM_3_URL = "https://www.mca.gov.in/content/mca/global/en/mca/llp-e-filling/Form-3.html";
	public static String LLP_FORMFILLED_FOR_FILING_RBTN = "//input[@id='guideContainer-rootPanel-panel-panel-guideradiobutton__-1_widget']";
	public static String LLP_LLPIN = "//input[@id='guideContainer-rootPanel-panel-panel-panel-guidetextbox___widget']";
	public static String LLP_CLICK_OUT  = "//div[@id='guideContainer-rootPanel-panel-panel-panel_635453227-guidetextdraw_1412781107___guide-item']";
	public static String LLP_JURISDICTION_POICE_STATION = "guideContainer-rootPanel-panel-panel-panel-guidetextbox_313524918___widget";
	public static String LLP_STATE = "//select[@id='guideContainer-rootPanel-panel-panel-panel_635453227-panel_1589508658-customdropdown_1211123326___widget']";
	public static String LLP_DISTRICT = "//select[@id='guideContainer-rootPanel-panel-panel-panel_635453227-panel_1589508658-customdropdown_1207336971___widget']";
	public static String LLP_DATE_OF_AGREEMENT = "//input[@id='guideContainer-rootPanel-panel-panel-panel_635453227-panel_1589508658-guidedatepicker___widget']";
	public static String LLP_6_MUTUAL_RIGHTS = "//input[@id='guideContainer-rootPanel-panel-panel-panel_635453227-guidetextbox_432233980___widget']";
	public static String LLP_7_RESTRICTIONS = "//input[@id='guideContainer-rootPanel-panel-panel-panel_635453227-guidetextbox_373536402___widget']";
	public static String LLP_8A_MANAGEMENT = "//textarea[@id='guideContainer-rootPanel-panel-panel-panel_635453227-panel_1653140565-guidetextbox___widget']";
	public static String LLP_8B_PROCEDURE = "//textarea[@id='guideContainer-rootPanel-panel-panel-panel_635453227-panel_1653140565-guidetextbox_1266414053___widget']";
	public static String LLP_9_DETAILS_OF_INDEMNITY = "//textarea[@id='guideContainer-rootPanel-panel-panel-panel_635453227-guidetextbox_2140727676___widget']";
	public static String LLP_10A_ADMISSION = "//textarea[@id='guideContainer-rootPanel-panel-panel-panel_635453227-panel_1372225076-guidetextbox___widget']";
	public static String LLP_10B_RETIREMENT = "//textarea[@id='guideContainer-rootPanel-panel-panel-panel_635453227-panel_1372225076-guidetextbox_1658565629___widget']";
	public static String LLP_10C_CESSATION = "//textarea[@id='guideContainer-rootPanel-panel-panel-panel_635453227-panel_1372225076-guidetextbox_590928173___widget']";
	public static String LLP_10D_EXPULSION = "//textarea[@id='guideContainer-rootPanel-panel-panel-panel_635453227-panel_1372225076-guidetextbox_2029056353___widget']";
	public static String LLP_10E_RESIGNATION = "//textarea[@id='guideContainer-rootPanel-panel-panel-panel_635453227-panel_1372225076-guidetextbox_543154457___widget']";
	public static String LLP_11A_BETWEEN_PARTNERS = "//textarea[@id='guideContainer-rootPanel-panel-panel-panel_635453227-panel_1372225076-guidetextbox_6754368___widget']";
	public static String LLP_11B_BETWEEN_PARTNERS_AND_LLP = "//textarea[@id='guideContainer-rootPanel-panel-panel-panel_635453227-panel_1372225076-guidetextbox_253581154___widget']";
	public static String LLP_13_INFORMATION = "//textarea[@id='guideContainer-rootPanel-panel-panel-panel_635453227-guidetextbox_1193825153___widget']";
	public static String LLP_14A_RULE16 = "//textarea[@id='guideContainer-rootPanel-panel-panel-panel_635453227-panel_1483516405-guidetextbox___widget']";
	public static String LLP_14B_RULE17  = "//textarea[@id='guideContainer-rootPanel-panel-panel-panel_635453227-panel_1483516405-guidetextbox_946291019___widget']";
	public static String LLP_14C_RULE20  = "//textarea[@id='guideContainer-rootPanel-panel-panel-panel_635453227-panel_1483516405-guidetextbox_1423850455___widget']";
	public static String LLP_14D_RULE24  = "//textarea[@id='guideContainer-rootPanel-panel-panel-panel_635453227-panel_1483516405-guidetextbox_1726581682___widget']";
	public static String LLP_NEXT_1  = "//button[@id='guideContainer-rootPanel-panel-panel_134160595-mca_button_1264461113___widget']";
	public static String LLP_NEXT_2 ="//button[@id='guideContainer-rootPanel-panel_998497442-panel_134160595_copy-mca_button_1264461113___widget']";
	public static String LLP_UPLOAD_AGREEMENT = "//input[@id='guideContainer-rootPanel-panel_510302503-panel-panel_696140626-fileuploadwithplaceh___widget']";
	public static String LLP_DIN_OF_DIRECTOR ="//input[@id='guideContainer-rootPanel-panel_510302503-panel-panel_186954481-guidetextbox_1959989___widget']";
	public static String LLP_CHARTERED_ACCOUNTANT = "//input[@id='guideContainer-rootPanel-panel_510302503-panel-panel-panel-guideradiobutton__-1_widget']";
	public static String LLP_CASH_ACCOUNTANT = "//input[@id='guideContainer-rootPanel-panel_510302503-panel-panel-panel-guideradiobutton__-2_widget']";
	public static String LLP_COMPANY_SECRETARY = "//input[@id='guideContainer-rootPanel-panel_510302503-panel-panel-panel-guideradiobutton__-3_widget']";
	public static String LLP_ASSOCIATE = "//input[@id='guideContainer-rootPanel-panel_510302503-panel-panel-panel-guideradiobutton_1135252890__-1_widget']";
	public static String LLP_FELLOW = "//input[@id='guideContainer-rootPanel-panel_510302503-panel-panel-panel-guideradiobutton_1135252890__-2_widget']";
	public static String LLP_MEMBERSHIP_NUMBER = "//input[@id='guideContainer-rootPanel-panel_510302503-panel-panel-panel-guidetextbox_1833669___widget']";
	public static String LLP_MEMBERSHIP_NUMBER_2 = "//input[@id='guideContainer-rootPanel-panel_510302503-panel-panel-panel-guidetextbox___widget']";   									  
	public static String LLP_NEXT_ATTACHMENT = "//button[@id='guideContainer-rootPanel-panel_510302503-panel_1407040237-mca_button_1744779498___widget']";
	public static String LLP_FINAL_SAVE= "//button[@id='guideContainer-rootPanel-panel_441934293-mca_button_1979380144___widget']";
	public static String LLP_FINAL_SUBMIT = "//button[@id='guideContainer-rootPanel-panel_441934293-mca_button_1807530884___widget']";
	public static String LLP_ERROR_MESSAGE = "//div[@class='guideFieldError' and text()='This Field is a required field.']";
	public static String LLP_SAVE_OK_BUTTON = "//button[@id='guideContainer-rootPanel-modal_container_2054-panel_copy-guidebutton_copy___widget']";
	public static String LLP_SRN_NUMBER = "//*[@id=\"guideContainer-rootPanel-modal_container_20763-panel_copy-guidetextdraw_183296_1408328477__\"]/p/b";
	public static String LLP_SUBMIT_OK_BUTTON  = "//button[@id='guideContainer-rootPanel-modal_container_20763-panel_copy-guidebutton_copy___widget']";
	public static String LLP_SRN_TEXT = "//*[@id=\"guideContainer-rootPanel-panel_969571471-panel_4594884808-guidetextdraw__\"]/p/b";
	public static String LLP_SAVE_BLACK_LOADER ="//body[@id='fohomepage-b212e8959a']";
	
	//LLP2 Form Filling
	
	public static String LLP2_URL = "https://www.mca.gov.in/content/mca/global/en/mca/llp-e-filling/Fillip.html";
	public static String LLP2_NAME_APPROVED_YES = "//input[@id='guideContainer-rootPanel-panel-panel-panel-panel_copy_copy-panel1626772568950-guideradiobutton__-1_widget']";
	public static String LLP2_NAME_APPROVED_NO = "//input[@id='guideContainer-rootPanel-panel-panel-panel-panel_copy_copy-panel1626772568950-guideradiobutton__-2_widget']";
	public static String LLP2_SRN = "//input[@id='guideContainer-rootPanel-panel-panel-panel-panel_copy_copy-panel1626772568950-guidetextbox_copy___widget']";
	public static String LLP2_TYPE_NEW = "//input[@id='guideContainer-rootPanel-panel-panel-panel-panel_copy_copy-panel1626772568950-guideradiobutton_1069538009__-1_widget']";
	public static String LLP2_TYPE_FIRM = "//input[@id='guideContainer-rootPanel-panel-panel-panel-panel_copy_copy-panel1626772568950-guideradiobutton_1069538009__-2_widget']";
	public static String LLP2_TYPE_PVT_COMPANY = "//input[@id='guideContainer-rootPanel-panel-panel-panel-panel_copy_copy-panel1626772568950-guideradiobutton_1069538009__-3_widget']";
	public static String LLP2_PROPOSED_APPROVED_NAME = "//input[@id='guideContainer-rootPanel-panel-panel-panel-panel_copy_copy-panel-guidetextbox___widget']";
	public static String LLP2_SIGNIFICANCE_OF_PROPOSED_NAME = "//input[@id='guideContainer-rootPanel-panel-panel-panel-panel_copy_copy-panel-guidetextbox_copy___widget']";
	public static String LLP2_STATE_THE_NAME = "//input[@id='guideContainer-rootPanel-panel-panel-panel-panel_copy_copy-panel-guidetextbox_copy_450892665___widget']";
	public static String LLP2_TM_REG_YES = "//input[@id='guideContainer-rootPanel-panel-panel-panel-panel_copy_copy-panel-guideradiobutton__-1_widget']";
	public static String LLP2_PARTICULAR_OF_TM = "//input[@id='guideContainer-rootPanel-panel-panel-panel-panel_copy_copy-panel-guidetextbox_copy_1001227425___widget']";
	public static String LLP2_TM_REG_NO = "//input[@id='guideContainer-rootPanel-panel-panel-panel-panel_copy_copy-panel-guideradiobutton__-2_widget']";
	public static String LLP2_ATTACHMENT_APPROVAL_OF_OWNER = "//input[@id='guideContainer-rootPanel-panel-panel-panel-panel_copy_copy-panel_1454193331-fileuploadwithplaceh_980627467___widget']";
	public static String LLP2_ATTACHMENT_COPY_OF_BOARD_RES = "//input[@id='guideContainer-rootPanel-panel-panel-panel-panel_copy_copy-panel_1454193331-fileuploadwithplaceh_977437254___widget']";
	public static String LLP2_SAVE_AND_CONTINUE_BTN = "//button[@id='guideContainer-rootPanel-panel-panel-panel-panel_copy_copy_copy-mca_button___widget']";
	public static String LLP2_DATA_SAVE_OK_BUTTON = "//button[@id='guideContainer-rootPanel-modal_container_copy-panel_86338280-panel-mca_button___widget']";
	public static String LLP2_NEXT_1 = "//button[@id='guideContainer-rootPanel-panel-panel-panel_copy_copy_copy_1792429032-mca_button___widget']";
	public static String LLP2_NEXT_2 = "(//button[@aria-label='Next'])[1]";
	public static String LLP2_OFC_ADDRESS_1 = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel-panel_702814714-panel-guidetextbox_copy_11___widget']";
	public static String LLP2_OFC_ADDRESS_2 = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel-panel_702814714-panel-guidetextbox_copy_11_635080626___widget']";
	public static String LLP2_OFC_PINCODE = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel-panel_702814714-panel-guidetextbox_copy_11_1386963699___widget']";
	public static String LLP2_OFC_AREA_LOCALITY_DRN = "//select[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel-panel_702814714-panel-guidetextbox_9527960___widget']";
	public static String LLP2_OFC_LONGITUDE = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel-panel_702814714-panel-guidetextbox_1045433___widget']";
	public static String LLP2_OFC_LATITUDE = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel-panel_702814714-panel-guidetextbox_1045433_1076286455___widget']";
	public static String LLP2_OFC_JURISDICTION_OF_POLICE = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel-panel_702814714-panel-guidetextbox_copy___widget']";
	public static String LLP2_OFC_MOBILE_NUMBER = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel_417418999-panel_2000768201_cop-guidetextbox_copy_11_211671462___widget']";
	public static String LLP2_OFC_EMAIL_ID = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel_417418999-panel_2000768201_cop-guidetextbox_copy_11___widget']";
	public static String LLP2_ATTACHEMENT_PROOF_OF_OFFICE_ADDRESS = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel_copy-fileuploadwithplaceh___widget']";
	public static String LLP2_ATTACHEMENT_UTILITY_BILL = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel_copy-fileuploadwithplaceh_376676005___widget']";
	public static String LLP2_NAME_OF_REGISTRAR_DRN = "//select[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel_2015234307-guidedropdownlist_co___widget']";
	public static String LLP2_NIC_SEARCH = "//button[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel_255787538-panel_1980298345_cop-panel_1663114232_cop-panel_1119548299-panel-mca_button_v2___widget']";
	public static String LLP2_NIC_INPUT = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel_255787538-panel_1980298345_cop-panel_1663114232_cop-modal_container_1602-panel-panel-guidetextbox___widget']";
	public static String LLP2_NIC_ADD_BTN = "//button[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel_255787538-panel_1980298345_cop-panel_1663114232_cop-modal_container_1602-panel-panel-guidebutton___widget']";
	public static String LLP2_DISTRICT = "//*[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel-panel_702814714-panel-guidetextbox_copy_11_755696894___widget']";
	
	public static String LLP2_INDIVIDUALS_HAVING_DIN = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel_1891907560_cop-table_copy-Row1629350115276-tableItem1629350115279___widget']";
	public static String LLP2_INDIVIDUALS_NOT_HAVING_DIN = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel_1891907560_cop-table_copy-Row1629350123645-tableItem1629350123648___widget']";
	public static String LLP2_BODY_CORPORATE_HAVING_DIN = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel_1891907560_cop-table_copy-Row1629350126976-tableItem1629350126979___widget']";
	public static String LLP2_BODY_CORPORATE_NOT_HAVING_DIN = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel_1891907560_cop-table_copy-Row1629350131849-tableItem1629350131852___widget']";
	public static String LLP2_INDIVIDUALS_HAVING_DIN_2 = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel_1891907560_cop-table_copy-Row1629350148437-tableItem1629350148441___widget']";
	public static String LLP2_INDIVIDUALS_NOT_HAVING_DIN_2 = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel_1891907560_cop-table_copy-Row1629356006750-tableItem1629356006753___widget']";
	public static String LLP2_BODY_CORPORATE_HAVING_DIN_2 = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel_1891907560_cop-table_copy-Row1629356019361-tableItem1629356019364___widget']";
	public static String LLP2_BODY_CORPORATE_NOT_HAVING_DIN_2 = "//input[@id='guideContainer-rootPanel-panel-panel_1815470267-panel_1379931518_cop-panel-panel_1891907560_cop-table_copy-Row1629356041275-tableItem1629356041278___widget']";
//	public static String LLP2_ = "";
//	public static String LLP2_ = "";
//	public static String LLP2_ = "";
//	public static String LLP2_ = "";
//	public static String LLP2_ = "";
//	public static String LLP2_ = "";
//	public static String LLP2_ = "";
//	public static String LLP2_ = "";
	
	
	
	
	
}

//	public static String LLP2_ = "";


