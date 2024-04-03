package SpicePart_A;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.bson.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.JsonObject;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import Wrappers.CommonFunctions;
import Wrappers.Utilities;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class spicePartB_PaymentDetails {
	static String project_path = System.getProperty("user. dir");
	static CommonFunctions commonFunctions = new CommonFunctions();
//	public static Logger logger = Logger.getLogger(SpicePart_A.class);
	static String sharedFolderName = "Spice_Part_B_Upload";
	static String NetworkPath = "/network_folder/" + sharedFolderName + "/";
	public static List<String> windowStrings;

	public static void loginForOtherServices(WebDriver driver, String ticketId,
			WebDriverWait wait, String username, String password) throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Sign In/Sign Up')]")))
				.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@type='text']"))));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		System.out.println("login");
		// Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Login for V3 Filing')]")))
				.click();

	}

//		public static void loginForOtherServices(WebDriver driver, String ticketId, Map<String, String> dataMap,
//				WebDriverWait wait, String username, String password) throws Exception {
//			for (int i = 0; i < 10; i++) {
//				
//				wait.until(
//						ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='userName']"))));
//				driver.findElement(By.xpath("//input[@id='guideContainer-rootPanel-panel_1846244155-guidetextbox___widget']")).sendKeys(username);
//				wait.until(
//						ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='userName']"))));
//				driver.findElement(By.xpath("//input[@id='guideContainer-rootPanel-panel_1846244155-guidetextbox___widget']")).sendKeys(username);
//				driver.findElement(By.xpath("//input[@id='guideContainer-rootPanel-panel_1846244155-guidepasswordbox___widget']")).sendKeys(password);
//				WebElement captcha = driver.findElement(By.xpath("//img[@id='captcha']"));
//				commonFunctions.clickElementByJS(driver, "//a[@id='captchaRefresh']");
//				Thread.sleep(2000);
//				String filepath = Utilities.webElementScreenshotnew(driver, captcha);
//				String base64 = Utilities.convertImageToBase64String(filepath);
//				System.out.println(base64);
//				String vsCapctha[] = Utilities.getCaptchaUsingVSCaptcha(base64,
//						"https://helpdesk.vakilsearch.com/ml-ad/captcha/mca", "s7wb28pAoEuTk9DfIcSnZr3G65HjRiFq");
//				
//				driver.findElement(By.xpath("//input[@name='userEnteredCaptcha']")).sendKeys(vsCapctha[0].toString());
//				driver.findElement(By.xpath("//input[@id='login_0']")).click();
//				Thread.sleep(2000);
//				boolean INVALID_CAPTCHA_ALERT = commonFunctions.isElementPresent(driver,
//						By.xpath(CommonVariables.PATH_MCA_HOME_INVALID_CAPTCHA_ALERT));
//				boolean ALREADY_LOGIN_ALERT = commonFunctions.isElementPresent(driver,
//						By.xpath(CommonVariables.PATH_MCA_HOME_ALREADY_LOGIN_ALERT));
//				boolean INVALID_CREDENTIALS_ALERT = commonFunctions.isElementPresent(driver,
//						By.xpath(CommonVariables.PATH_MCA_HOME_INVALID_CREDENTIALS_ALERT));
//				boolean myWorkspace = commonFunctions.isElementPresent(driver, By.xpath("//h1[text()='My WorkSpace']"));
//				if (ALREADY_LOGIN_ALERT == true) {
//					sendStatusToGroup(ticketId + "_The user is already signed in another browser");
//					break;
//				} else {
//					System.out.println("Already Signed in alert is not thrown");
//				}
//				if (INVALID_CREDENTIALS_ALERT == true) {
//					sendStatusToGroup(ticketId + "_username and password is incorrect");
//					break;
//				} else {
//					System.out.println("invalid credentials alert is not thrown");
//				}
//				if (INVALID_CAPTCHA_ALERT == true) {
//					System.out.println("Captcha is wrong, Trying again");
//					Thread.sleep(2000);
//					driver.findElement(By.xpath("(//p[@class='error']/parent::div/a)[1]")).click();
////					Utilities.sendFailedCaptchaToMlTeam(base64, "https://www.mca.gov.in/MinistryV2/spicefaq.html",
////							vsCapctha[0].toString(), "SPICE");
//				} else {
//					if (myWorkspace == true) {
//						System.out.println("User has been sucessfully logged in ");
//						break;
//					}
//				}
//			}
	//
//		}
	public static void sendSucessResponseToCRM1(String ticketId, String username, String moaExpense,
			String stampDutyExpense, String Spice_Moa_DocumentSubmitted_Receipt_base64,
			String Spice_Moa_Payment_Receipt_base64, String Spice_Stamp_Duty_Payment_Receipt_base64, String password) {
		Utilities.insertAutomationStatusToMongoDB("HA", "STOP", ticketId, "PART B UPLOAD Fresh",
				"https://helpdesk.vakilsearch.com", "automation@vakilsearch.com");
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("ticketId", ticketId);
		requestParams.addProperty("automationStatus", "pass");
		requestParams.addProperty("userName", username);
		requestParams.addProperty("password", password);

		requestParams.addProperty("MoaExpense", moaExpense);
		requestParams.addProperty("stampDutyExpense", stampDutyExpense);
		requestParams.addProperty("Spice_Moa_DocumentSubmitted_Receipt_base64",
				Spice_Moa_DocumentSubmitted_Receipt_base64);
		requestParams.addProperty("Spice_Moa_Payment_Receipt_base64", Spice_Moa_Payment_Receipt_base64);
		requestParams.addProperty("Spice_Stamp_Duty_Payment_Receipt_base64", Spice_Stamp_Duty_Payment_Receipt_base64);
		String environment = "https://helpdesk.vakilsearch.com";
		RestAssured.baseURI = environment + "/Spice_PartB_Plus_Results";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.request(Method.POST);

	}

	public static void sendSucessResponseToCRMPayment(String ticketId, String username, String moaExpense,
			String stampDutyExpense, String Spice_Moa_Payment_Receipt_base64,
			String Spice_Stamp_Duty_Payment_Receipt_base64, String password) {
		Utilities.insertAutomationStatusToMongoDB("HA", "STOP", ticketId, "PART B UPLOAD Fresh",
				"https://helpdesk.vakilsearch.com", "automation@vakilsearch.com");
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("ticketId", ticketId);
		requestParams.addProperty("automationStatus", "pass");
		requestParams.addProperty("userName", username);
		requestParams.addProperty("password", password);

		requestParams.addProperty("MoaExpense", moaExpense);
		requestParams.addProperty("stampDutyExpense", stampDutyExpense);
		requestParams.addProperty("Spice_Moa_Payment_Receipt_base64", Spice_Moa_Payment_Receipt_base64);
		requestParams.addProperty("Spice_Stamp_Duty_Payment_Receipt_base64", Spice_Stamp_Duty_Payment_Receipt_base64);
		String environment = "https://helpdesk.vakilsearch.com";
		RestAssured.baseURI = environment + "/Spice_PartB_Plus_Results";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.request(Method.POST);

	}

	public static void waitUntilManualActions(final WebDriver driver, String message) {
		int tabSize;
		try {
			((JavascriptExecutor) driver).executeScript("window.open('about:blank','_blank');");
			driver.switchTo().defaultContent();
			JavascriptExecutor javascript = (JavascriptExecutor) driver;
			javascript.executeScript("alert('" + message + "');");

			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(0));
			tabSize = tabs.size();
			while (tabSize >= 2) {
				Thread.sleep(1000);
				tabs = new ArrayList<String>(driver.getWindowHandles());
				tabSize = tabs.size();
			}
			;
		} catch (Exception e) {
		}
	}

	public static void sendSucessResponseToCRM(String ticketId, String username, String moaSrnNumber,
			String stampSrnNumber, String moaExpense, String stampDutyExpense, String Spice_Moa_Payment_Receipt_base64,
			String Spice_Stamp_Duty_Payment_Receipt_base64, String password) {
		Utilities.insertAutomationStatusToMongoDB("HA", "STOP", ticketId, "PART B UPLOAD Fresh",
				"https://helpdesk.vakilsearch.com", "automation@vakilsearch.com");
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("ticketId", ticketId);
		requestParams.addProperty("automationStatus", "pass");
		requestParams.addProperty("userName", username);
		requestParams.addProperty("password", password);
		requestParams.addProperty("Moa_SRN_Number", moaSrnNumber);
		requestParams.addProperty("Stamp_SRN_Number", stampSrnNumber);
		requestParams.addProperty("MoaExpense", moaExpense);
		requestParams.addProperty("stampDutyExpense", stampDutyExpense);
		requestParams.addProperty("Spice_Moa_Payment_Receipt_base64", Spice_Moa_Payment_Receipt_base64);
		requestParams.addProperty("Spice_Stamp_Duty_Payment_Receipt_base64", Spice_Stamp_Duty_Payment_Receipt_base64);
		String environment = "https://helpdesk.vakilsearch.com";
		RestAssured.baseURI = environment + "/Spice_PartB_Plus_Results";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.request(Method.POST);

	}

	public static void selectByValue(String xpath, String value, WebDriver driver) throws InterruptedException {
		WebElement Dropdown = driver.findElement(By.xpath(xpath));
		final Select selectSort = new Select(Dropdown);
		Thread.sleep(200);
		selectSort.selectByValue(value);

	}

	public static String internetBanking(WebDriver driver, WebDriverWait wait) throws Exception {
		driver.findElement(By.xpath("//input[@value='Online Internet Banking']")).click();
		selectByVisibleText("//select[@name='internetBankingData']", "HDFC Bank", driver);
		commonFunctions.clickByxpath(driver, "//*[@id=\"submitBtn\"]");
		Thread.sleep(3000);
		commonFunctions.clickByxpath(driver, "//*[@id=\"acceptBtn\"]");
		Thread.sleep(2000);
		String HomeWindow = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			System.out.println("The first time" + driver.getWindowHandles().toString());
			driver.switchTo().window(winHandle);
		}
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//frame[@name='bottom_frame']"))));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='bottom_frame']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("69648759");
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='bottom_frame']")));
		driver.findElement(By.xpath("//input[@name='fldPassword']")).sendKeys("Uber9@2022");
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		selectByValue("//select[@name='selAcct']", "50200019461490  ", driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Continue']")).click();
		String isOtpAutoFetch = Utilities.checkWetherAutoOtpFetch();
		if (isOtpAutoFetch.equals("true")) {
			Thread.sleep(35000);
			String otp = fetchOtp();
			driver.findElement(By.xpath("//input[@name='fldOtpToken']")).sendKeys(otp);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@alt='Submit']")).click();
		} else {
			Thread.sleep(20000);
			driver.findElement(By.xpath("//img[@alt='Submit']")).click();
		}
		try {
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("No Popup displayed");
		}
		return HomeWindow;

	}

	public static Set<String> internetBanking2(WebDriver driver, WebDriverWait wait) throws Exception {
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("The secound time" + windowHandles.toString());
		windowStrings = new ArrayList<>(windowHandles);
		String reqWindow = windowStrings.get(2);
		driver.switchTo().window(reqWindow);
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//frame[@name='bottom_frame']"))));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='bottom_frame']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("69648759");
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='bottom_frame']")));
		driver.findElement(By.xpath("//input[@name='fldPassword']")).sendKeys("Uber9@2022");
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		selectByValue("//select[@name='selAcct']", "50200019461490  ", driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Continue']")).click();
		String isOtpAutoFetch = Utilities.checkWetherAutoOtpFetch();
		if (isOtpAutoFetch.equals("true")) {
			Thread.sleep(35000);
			String otp = fetchOtp();
			driver.findElement(By.xpath("//input[@name='fldOtpToken']")).sendKeys(otp);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@alt='Submit']")).click();
		} else {
			Thread.sleep(20000);
			driver.findElement(By.xpath("//img[@alt='Submit']")).click();
		}
		try {
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("No Popup displayed");
		}
		return windowHandles;

	}

	public static void selectByVisibleText(String XPATH, String text, WebDriver driver) throws InterruptedException {
		WebElement Dropdown = driver.findElement(By.xpath(XPATH));
		final String Value = text;
		final Select selectSort = new Select(Dropdown);
		Dropdown.click();
		Thread.sleep(200);
		selectSort.selectByVisibleText(Value);

	}

	public static String fetchOtp() {
		RestAssured.baseURI = "http://192.168.5.167:8855/VSProcessAutomation/fetchOtp";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "text/plain");
		Response response = httpRequest.request(Method.GET);
		String otp = response.asPrettyString();
		return otp;
	}

	public static void sendNegativeResponseToCRM(String ticketId, String username, String base64, String password) {
		Utilities.insertAutomationStatusToMongoDB("HA", "STOP", ticketId, "PART B UPLOAD Fresh",
				"https://helpdesk.vakilsearch.com", "automation@vakilsearch.com");
		System.out.println("failed sent to crm started");
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("ticketId", ticketId);
		requestParams.addProperty("automationStatus", "fail");
		requestParams.addProperty("userName", username);
		requestParams.addProperty("password", password);
		requestParams.addProperty("Form_Upload_Failed_base64", base64);
		String environment = "https://helpdesk.vakilsearch.com";
		RestAssured.baseURI = environment + "/Spice_PartB_Plus_Results";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.request(Method.POST);

	}

	public static void searchApplication(WebDriver driver, WebDriverWait wait, String srnNumber, String companyName,
			String ticketId, String username, String password) throws Exception {

		Robot robot = new Robot();
		// Thread.sleep(5000);
		System.out.println("searchapp started");
		spinner(driver, wait);
		boolean empty = srnNumber.isEmpty();
		if (empty == false) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='searchSRNOfEForm']")));
			commonFunctions.FindAndAddElementByJS(driver, "//input[@id='searchSRNOfEForm']", srnNumber);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Approved')]")));
			commonFunctions.clickElementByJS(driver, "//button[contains(text(),'Approved')]");
			spinner(driver, wait);

			wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Mini dashboard']/parent::button")));
			System.out.println("Waited");
			driver.findElement(By.xpath("//a[text()='Mini dashboard']/parent::button")).click();
			System.out.println("Clicked");
		} else {
			try {
				commonFunctions.clickElementByJS(driver, "((//td[contains(text(),'" + companyName.toUpperCase()
						+ "')])[2]/parent::tr/child::td)[12]/child::div/child::button/child::a[contains(text(),'Mini dashboard')]");
				
				System.out.println("Clicked");
			} catch (Exception e) {
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Pending for Action')]")));
				commonFunctions.clickElementByJS(driver, "//button[contains(text(),'Pending for Action')]");
				spinner(driver, wait);
				
				commonFunctions.clickElementByJS(driver, "((//td[contains(text(),'" + companyName.toUpperCase()
						+ "')])[2]/parent::tr/child::td)[12]/child::div/child::button/child::a[contains(text(),'Mini dashboard')]");

			}
		}
	}

	private static void spicePartBUpload(WebDriver driver, WebDriverWait wait, String srnNumber, String companyName,
			String ticketId, String username, String password, Map<String, String> dataMap) throws Exception {

		Robot robot = new Robot();
		Thread.sleep(4500);

		try {

			createtab(driver);
			spinner(driver, wait);

			commonFunctions.isElementPresent(driver, By.xpath(
					"//span[contains(text(),'SPICE + Part B')]/parent::td/following-sibling::td/button[contains(text(),'Upload PDF')]"));

			commonFunctions.clickElementByJS(driver,
					"//span[contains(text(),'SPICE + Part B')]/parent::td/following-sibling::td/button[contains(text(),'Upload PDF')]");

			documentUpload(driver, wait, dataMap);

			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
					"(//label[contains(text(),'Upload the DSC affixed pdf document')]/parent::div/parent::div/parent::div/parent::div/following-sibling::div)[2]/child::div/child::div/child::p/child::b")));
			System.out.println("document uploaded");
			WebElement currentUploadStatus = driver.findElement(By.xpath(
					"(//label[contains(text(),'Upload the DSC affixed pdf document')]/parent::div/parent::div/parent::div/parent::div/following-sibling::div)[2]/child::div/child::div/child::p/child::b"));
			String currentUploadStatus1 = currentUploadStatus.getText();
			boolean elementPresent = commonFunctions.isElementPresent(driver,
					By.xpath("//span(contains(text(),'Ok')]"));
			if (elementPresent == true) {
				commonFunctions.clickElementByJS(driver, "//span(contains(text(),'Ok')]");
			}
			String uploadstatus = "The document has been successfully uploaded";
			System.out.println(currentUploadStatus1);
			System.out.println(uploadstatus);
			Thread.sleep(3000);
			boolean contains = currentUploadStatus1.contains(uploadstatus);
			System.out.println(contains);
			if (currentUploadStatus1.contains(uploadstatus) == true) {
				System.out.println("Success if");
				driver.close();

			} else {

				System.out.println("Success else");
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				documentUpload(driver, wait, dataMap);

				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
						"(//label[contains(text(),'Upload the DSC affixed pdf document')]/parent::div/parent::div/parent::div/parent::div/following-sibling::div)[2]/child::div/child::div/child::p/child::b")));
				boolean elementPresent1 = commonFunctions.isElementPresent(driver,
						By.xpath("//span(contains(text(),'Ok')]"));
				if (elementPresent1 == true) {
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.keyRelease(KeyEvent.VK_ENTER);
				}
				System.out.println("document uploaded");

				if (currentUploadStatus.getText().contains(uploadstatus) == true) {
					driver.close();
				} else {

					throw new RuntimeException("Error occurred in the fail method");
				}

			}
		} catch (Exception e) {

			throw new RuntimeException("Error occurred in the fail method");
		}

	}

	private static void documentUpload(WebDriver driver, WebDriverWait wait, Map<String, String> dataMap)
			throws InterruptedException, AWTException {

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-label='OK'])[3]")));
		driver.findElement(By.xpath("(//button[@aria-label='OK'])[3]")).click();
		driver.findElement(By.xpath("//button[@aria-label='Upload the DSC affixed pdf document']")).click();
		Thread.sleep(3000);
		String sendkeyLocation1 = dataMap.get("SPICE_Part_B_Upload_File");
		uploadFileWithRobot1(sendkeyLocation1);
		Thread.sleep(3000);

		spinner(driver, wait);

		commonFunctions.clickElementByJS(driver, "//span[contains(text(),'Upload')]");
		spinner(driver, wait);

	}

	private static void AGILE_PRO_Upload(WebDriver driver, WebDriverWait wait, String srnNumber, String companyName,
			String ticketId, String username, String password, Map<String, String> dataMap) throws Exception {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(4500);
			Robot robot = new Robot();
			createtab(driver);
			spinner(driver, wait);
			commonFunctions.clickElementByJS(driver,
					"//span[contains(text(),'AGILE PRO')]/parent::td/following-sibling::td/button[contains(text(),'Upload PDF')]");
			spinner(driver, wait);

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"//div[@class='guideFieldWidget afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]")))
					.click();
//			driver.findElement(By.xpath("//div[@class='guideFieldWidget afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]")).click();
			Actions action = new Actions(driver);
			WebElement findElement = driver.findElement(By.xpath(
					"//div[@class='guideFieldWidget afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]"));
			action.moveToElement(findElement).click().perform();
			// commonFunctions.clickElementByJS(driver, "//div[@class='guideFieldWidget
			// afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]");
			Thread.sleep(3000);
			String sendkeyLocation = dataMap.get("AGILE_PRO_Upload_File");
			uploadFileWithRobot1(sendkeyLocation);
			spinner(driver, wait);
			Thread.sleep(3000);

			commonFunctions.clickElementByJS(driver, "//span[contains(text(),'Upload')]");
			spinner(driver, wait);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
					"(//label[contains(text(),'Upload the DSC affixed pdf document')]/parent::div/parent::div/parent::div/parent::div/following-sibling::div)[2]/child::div/child::div/child::p/child::b")));
			System.out.println("document uploaded");
			WebElement currentUploadStatus = driver.findElement(By.xpath(
					"(//label[contains(text(),'Upload the DSC affixed pdf document')]/parent::div/parent::div/parent::div/parent::div/following-sibling::div)[2]/child::div/child::div/child::p/child::b"));
			String currentUploadStatus1 = currentUploadStatus.getText();
			String uploadstatus = "The document has been successfully uploaded";
			boolean contains = currentUploadStatus1.contains(uploadstatus);
			System.out.println(contains);
			if (currentUploadStatus1.contains(uploadstatus) == true) {
				System.out.println("Success if");
				Thread.sleep(3000);
				driver.close();
			} else {
				System.out.println("Success else");
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
						"//div[@class='guideFieldWidget afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]")))
						.click();
//				driver.findElement(By.xpath("//div[@class='guideFieldWidget afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]")).click();

				WebElement findElement1 = driver.findElement(By.xpath(
						"//div[@class='guideFieldWidget afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]"));
				action.moveToElement(findElement1).click().perform();
				// commonFunctions.clickElementByJS(driver, "//div[@class='guideFieldWidget
				// afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]");
				Thread.sleep(3000);
				String sendkeyLocation1 = dataMap.get("AGILE_PRO_Upload_File");
				uploadFileWithRobot1(sendkeyLocation1);
				Thread.sleep(3000);

				spinner(driver, wait);

				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Upload')]")));
				commonFunctions.clickElementByJS(driver, "//span[contains(text(),'Upload')]");
				spinner(driver, wait);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
						"(//label[contains(text(),'Upload the DSC affixed pdf document')]/parent::div/parent::div/parent::div/parent::div/following-sibling::div)[2]/child::div/child::div/child::p/child::b")));
				System.out.println("document uploaded");

				String uploadstatus1 = "The document has been successfully uploaded";
				boolean contains1 = currentUploadStatus.getText().contains(uploadstatus1);
				if (contains1 == true) {
					driver.close();
				} else {

					throw new RuntimeException("Error occurred in the fail method");
				}

			}
		} catch (Exception e) {

			throw new RuntimeException("Error occurred in the fail method");
		}
	}

	private static void INC_34_Upload(WebDriver driver, WebDriverWait wait, String srnNumber, String companyName,
			String ticketId, String username, String password, Map<String, String> dataMap) throws Exception {
		try {// TODO Auto-generated method stub
			Thread.sleep(4500);

			Robot robot = new Robot();
			createtab(driver);

			System.out.println(driver.getCurrentUrl());
			spinner(driver, wait);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"//span[contains(text(),'INC-34')]/parent::td/following-sibling::td/button[contains(text(),'Upload PDF')]")));
			commonFunctions.clickElementByJS(driver,
					"//span[contains(text(),'INC-34')]/parent::td/following-sibling::td/button[contains(text(),'Upload PDF')]");
			Thread.sleep(4000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@accept='pdf']/parent::div/button")));
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@accept='pdf']/parent::div/button")).click();

//			     Actions action = new Actions(driver);
//			     WebElement findElement = driver.findElement(By.xpath("//div[@class='guideFieldWidget afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]"));
//			     action.moveToElement(findElement).click().perform();		
			String sendkeyLocation = dataMap.get("INC_34_Upload_File");
			uploadFileWithRobot1(sendkeyLocation);
			spinner(driver, wait);
			Thread.sleep(3000);

			commonFunctions.clickElementByJS(driver, "//span[contains(text(),'Upload')]");
			spinner(driver, wait);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
					"(//div[@class='guideFieldNode guideTextDraw afterUploadDocumentMsg submittedTextIcon submittedTextFilledIcon mb-3 guideStaticText af-field-filled']/child::p/child::b)[7]")));
			System.out.println("document uploaded");
			WebElement currentUploadStatus = driver.findElement(By.xpath(
					"(//div[@class='guideFieldNode guideTextDraw afterUploadDocumentMsg submittedTextIcon submittedTextFilledIcon mb-3 guideStaticText af-field-filled']/child::p/child::b)[7]"));

			String uploadstatus = "The document has been successfully uploaded";
			boolean contains = currentUploadStatus.getText().contains(uploadstatus);
			System.out.println(contains);
			if (currentUploadStatus.getText().contains(uploadstatus) == true) {
				System.out.println("Success");
				Thread.sleep(3000);
				driver.close();
			} else {
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				wait.until(
						ExpectedConditions.elementToBeClickable(By.xpath("//input[@accept='pdf']/parent::div/button")));
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@accept='pdf']/parent::div/button")).click();

//				     Actions action = new Actions(driver);
//				     WebElement findElement = driver.findElement(By.xpath("//div[@class='guideFieldWidget afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]"));
//				     action.moveToElement(findElement).click().perform();		
				String sendkeyLocation2 = dataMap.get("INC_34_Upload_File");
				uploadFileWithRobot1(sendkeyLocation2);
				Thread.sleep(3000);

				spinner(driver, wait);
				Thread.sleep(3000);

				commonFunctions.clickElementByJS(driver, "//span[contains(text(),'Upload')]");
				spinner(driver, wait);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
						"(//div[@class='guideFieldNode guideTextDraw afterUploadDocumentMsg submittedTextIcon submittedTextFilledIcon mb-3 guideStaticText af-field-filled']/child::p/child::b)[7]")));
				System.out.println("document uploaded");
				if (currentUploadStatus.getText().contains(uploadstatus) == true) {
					Thread.sleep(1500);
					driver.close();
					Thread.sleep(1500);
				} else {

					throw new RuntimeException("Error occurred in the fail method");
				}

			}
		} catch (Exception e) {

			throw new RuntimeException("Error occurred in the fail method");
		}

	}

	private static void INC_33_Upload(WebDriver driver, WebDriverWait wait, String srnNumber, String companyName,
			String ticketId, String username, String password, Map<String, String> dataMap) throws Exception {
		try {// TODO Auto-generated method stub
			Thread.sleep(4500);
			Thread.sleep(4500);
			Robot robot = new Robot();
			createtab2(driver);
			Thread.sleep(3000);
			spinner(driver, wait);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"//span[contains(text(),'INC-33')]/parent::td/following-sibling::td/button[contains(text(),'Upload PDF')]")));
			commonFunctions.clickElementByJS(driver,
					"//span[contains(text(),'INC-33')]/parent::td/following-sibling::td/button[contains(text(),'Upload PDF')]");
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
//					"//span[contains(text(),'INC-33')]/parent::td/following-sibling::td/button[contains(text(),'Upload PDF')]")));
//			
//			driver.findElement(By.xpath(
//					"//span[contains(text(),'INC-33')]/parent::td/following-sibling::td/button[contains(text(),'Upload PDF')]"))
//					.click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"//div[@class='guideFieldWidget afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]")));
			Actions action = new Actions(driver);
			WebElement findElement = driver.findElement(By.xpath(
					"//div[@class='guideFieldWidget afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]"));
			action.moveToElement(findElement).click().perform();
			String sendkeyLocation = dataMap.get("INC_33_Upload_File");
			uploadFileWithRobot1(sendkeyLocation);
			spinner(driver, wait);
			Thread.sleep(3000);

			commonFunctions.clickElementByJS(driver, "//span[contains(text(),'Upload')]");
			spinner(driver, wait);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
					"(//div[@class='guideFieldNode guideTextDraw afterUploadDocumentMsg submittedTextIcon submittedTextFilledIcon mb-3 guideStaticText af-field-filled']/child::p/child::b)")));
			System.out.println("document uploaded");
			WebElement currentUploadStatus = driver.findElement(By.xpath(
					"(//div[@class='guideFieldNode guideTextDraw afterUploadDocumentMsg submittedTextIcon submittedTextFilledIcon mb-3 guideStaticText af-field-filled']/child::p/child::b)"));
			String uploadstatus = "The document has been successfully uploaded";

			boolean contains = currentUploadStatus.getText().contains(uploadstatus);
			System.out.println(contains);
			// if (currentUploadStatus.getText().contains(uploadstatus) == true) {
			if (uploadstatus.contains(currentUploadStatus.getText()) == true) {
				System.out.println("Success");
				Thread.sleep(3000);
				driver.close();
			} else {
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
						"//div[@class='guideFieldWidget afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]")));

				WebElement findElement1 = driver.findElement(By.xpath(
						"//div[@class='guideFieldWidget afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]"));
				action.moveToElement(findElement1).click().perform();
				String sendkeyLocation1 = dataMap.get("INC_33_Upload_File");
				uploadFileWithRobot1(sendkeyLocation1);
				Thread.sleep(3000);

				spinner(driver, wait);
				Thread.sleep(3000);

				commonFunctions.clickElementByJS(driver, "//span[contains(text(),'Upload')]");
				spinner(driver, wait);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
						"(//div[@class='guideFieldNode guideTextDraw afterUploadDocumentMsg submittedTextIcon submittedTextFilledIcon mb-3 guideStaticText af-field-filled']/child::p/child::b)")));
				System.out.println("document uploaded");
				if (uploadstatus.contains(currentUploadStatus.getText()) == true) {
					// if (currentUploadStatus.getText().contains(uploadstatus) == true) {
					Thread.sleep(1500);
					driver.close();
				} else {

					throw new RuntimeException("Error occurred in the fail method");
				}
			}
		} catch (Exception e) {

			throw new RuntimeException("Error occurred in the fail method");
		}
	}

	private static void INC_9_Upload(WebDriver driver, WebDriverWait wait, String srnNumber, String companyName,
			String ticketId, String username, String password, Map<String, String> dataMap) throws Exception {
		try { // TODO Auto-generated method stub
			Thread.sleep(4500);
			Robot robot = new Robot();
			createtab2(driver);
			Thread.sleep(3000);
			spinner(driver, wait);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"//span[contains(text(),'INC-9')]/parent::td/following-sibling::td/button[contains(text(),'Upload PDF')]")));
			commonFunctions.clickElementByJS(driver,
					"//span[contains(text(),'INC-9')]/parent::td/following-sibling::td/button[contains(text(),'Upload PDF')]");
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"//div[@class='guideFieldWidget afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]")));
			Actions action = new Actions(driver);
			WebElement findElement = driver.findElement(By.xpath(
					"//div[@class='guideFieldWidget afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]"));
			action.moveToElement(findElement).click().perform();
			String sendkeyLocation = dataMap.get("INC_9_Upload_File");
			uploadFileWithRobot1(sendkeyLocation);
			spinner(driver, wait);
			Thread.sleep(3000);

			commonFunctions.clickElementByJS(driver, "//span[contains(text(),'Upload')]");
			spinner(driver, wait);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
					"(//div[@class='guideFieldNode guideTextDraw afterUploadDocumentMsg submittedTextIcon submittedTextFilledIcon mb-3 guideStaticText af-field-filled']/child::p/child::b)")));
			System.out.println("document uploaded");
			WebElement currentUploadStatus = driver.findElement(By.xpath(
					"(//div[@class='guideFieldNode guideTextDraw afterUploadDocumentMsg submittedTextIcon submittedTextFilledIcon mb-3 guideStaticText af-field-filled']/child::p/child::b)"));

			String uploadstatus = "The document has been successfully uploaded";
			boolean contains = currentUploadStatus.getText().contains(uploadstatus);
			System.out.println(contains);
			if (uploadstatus.contains(currentUploadStatus.getText()) == true) {
				// if (currentUploadStatus.getText().contains(uploadstatus) == true) {
				System.out.println("Success if");
				Thread.sleep(3000);
				driver.close();
			} else {
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				System.out.println("Success else");
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
						"//div[@class='guideFieldWidget afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]")));

				WebElement findElement1 = driver.findElement(By.xpath(
						"//div[@class='guideFieldWidget afFileUpload fileUpload']/child::button[contains(text(),'Choose file')]"));
				action.moveToElement(findElement1).click().perform();
				String sendkeyLocation1 = dataMap.get("INC_9_Upload_File");
				uploadFileWithRobot1(sendkeyLocation1);
				Thread.sleep(3000);

				spinner(driver, wait);
				Thread.sleep(3000);

				commonFunctions.clickElementByJS(driver, "//span[contains(text(),'Upload')]");
				spinner(driver, wait);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
						"(//div[@class='guideFieldNode guideTextDraw afterUploadDocumentMsg submittedTextIcon submittedTextFilledIcon mb-3 guideStaticText af-field-filled']/child::p/child::b)")));
				System.out.println("document uploaded");
				if (uploadstatus.contains(currentUploadStatus.getText()) == true) {
					Thread.sleep(1500);
				} else {

					throw new RuntimeException("Error occurred in the fail method");
				}

			}
		} catch (Exception e) {
			driver.close();
			throw new RuntimeException("Error occurred in the fail method");
		}
	}

	private static void createtab(WebDriver driver) throws InterruptedException, AWTException {

		Robot robot = new Robot();
		Thread.sleep(2500);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_K);
		robot.keyRelease(KeyEvent.VK_K);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(4000);
		// driver.get(currentUrl);
		// Thread.sleep(4000);
	}

	private static void createtab2(WebDriver driver) throws InterruptedException, AWTException {

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_K);
		robot.keyRelease(KeyEvent.VK_K);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(1));
		Thread.sleep(4000);
		// driver.get(currentUrl);
		// Thread.sleep(4000);
	}

	private static void logoutandlogin(WebDriver driver, String ticketId,
			WebDriverWait wait, String username, String password) throws Exception {
		commonFunctions.clickElementByJS(driver, "//span[@id='sign-in-firstname']");
		commonFunctions.clickElementByJS(driver, "//a[@class='logoutIcon removeCookies']");
		Thread.sleep(5000);
		loginForOtherServices(driver, ticketId,  wait, username, password);
	}

	public static void uploadFileWithRobot1(String sendkeyLocation) throws InterruptedException, AWTException {

		try {
			// Provide the file path to the file upload dialog using the Robot class
			StringSelection stringSelection = new StringSelection(sendkeyLocation);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

			Robot robot = new Robot();
			robot.delay(5000); // Delay to wait for the file dialog to fully open
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.delay(3000); // Adjust the delay as needed
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			// You may need to wait for the file to be uploaded or handle further actions

		} catch (AWTException e) {
			e.printStackTrace();
		}

	}

	public static void CheckFile_UploadDoc_Network(String PDF_Name, String Upload_Xpath, final WebDriver driver,
			Map<String, String> dataMap, String ticketId) throws Exception {
		final CommonFunctions commonFunctions = new CommonFunctions();
		try {
			String sharedFolderName = "Spice_Part_B_Upload";
			String networkPath = "/network_folder/" + sharedFolderName + "/" + ticketId + "/";

			String Upload_filePath = networkPath + PDF_Name;
			System.out.println(Upload_filePath);
			File Doc = new File(Upload_filePath);
			System.out.println(Doc.getPath());
			System.out.println(Doc.getName());
			if (Doc.getName().equals(PDF_Name)) {
				System.out.println("me came here ");
				WebElement Upload = driver.findElement(By.xpath(Upload_Xpath));
				Upload.sendKeys(Doc.getPath() + "");
				Thread.sleep(1000);
				System.out.println("File Uploaded SucessFully!!!");
			} else {
				System.out.println(Upload_filePath + "is missing!!!!");
				sendStatusToGroup("Significane Objective Document is not present");
			}

		} catch (Exception e) {
			Utilities.errorParsingLogger(e.toString(), "Spice");
		}
	}

	public static void chooseLinkedForms(WebDriver driver, WebDriverWait wait) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='otherEfiling']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='linkedFilingChkBox']")).click();
	}

	public static ArrayList<String> signTheAgreement(WebDriver driver, WebDriverWait wait, String srnNumber)
			throws InterruptedException, IOException, AWTException {
		try {
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'File')]")));

			commonFunctions.clickElementByJS(driver, "//button[contains(text(),'File')]");

			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
					"//center[contains(text(),'Your request for Spice + Form has been submitted against SRN ')]")));
			String MOA_SrnNumber = driver.findElement(By.xpath(
					"//center[contains(text(),'Your request for Spice + Form has been submitted against SRN ')]"))
					.getText();
//			String MOA_Reciept = fullScreenShot(driver, "MOA_Reciept");
//			String Spice_Moa_DocumentSubmitted_Receipt_base64 = Utilities.convertImageToBase64String(MOA_Reciept);
			// ************************need to send to crm
			System.out.println(MOA_SrnNumber);
			Robot robot = new Robot();
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//td[@class='totalFees'])[1]")));
			// commonFunctions.clickElementByJS(driver,
			// "(//button[contains(text(),'Ok')])[1]");
			// driver.findElement(By.xpath("(//button[contains(text(),'Ok')])[1]")).click();
			String SPICEPartBTotalAmount = driver.findElement(By.xpath("(//td[@class='totalFees'])[1]")).getText();
			String StampDutyFeeForMOAandAOA = driver.findElement(By.xpath("(//td[@class='totalFees'])[2]")).getText();
			try {

				Utilities.scrollToElement(driver, driver.findElement(By.xpath("//button[text()='Make Payment']")));
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[text()='Make Payment']")).click();
				Thread.sleep(2000);
				navigateToBharatKosh(driver, wait);
			} catch (Exception e) {
				waitUntilManualActions(driver, "Please enter the captcha text");
			}

			hdfcNetBanking(driver);
			String Spice_Moa_Payment_Receipt = getPrintReceipt(driver, srnNumber);
			stampduty_payment(driver, wait);
			String Spice_Stamp_Duty_Payment_Receipt_base64 = getPrintReceipt(driver, srnNumber);

			ArrayList<String> values = new ArrayList<String>();
			values.add(MOA_SrnNumber);
			values.add("");
			values.add(SPICEPartBTotalAmount);
			values.add(StampDutyFeeForMOAandAOA);
			values.add(Spice_Moa_Payment_Receipt);
			values.add(Spice_Stamp_Duty_Payment_Receipt_base64);
			return values;
		} catch (Exception e) {

			throw new RuntimeException("Error occurred in the fail method");
		}
	}

	public static ArrayList<String> directPaymentFlow(WebDriver driver, WebDriverWait wait, String srnNumber)
			throws InterruptedException, IOException, AWTException {
		try {
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Pay Fees')]")));

			commonFunctions.clickElementByJS(driver, "//button[contains(text(),'Pay Fees')]");

			Thread.sleep(1000);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By
//					.xpath("//center[contains(text(),'Your request for Spice + Form has been submitted against SRN ')]")));
//			String UploadedSRNNumber = driver
//					.findElement(By.xpath(
//							"//center[contains(text(),'Your request for Spice + Form has been submitted against SRN ')]"))
//					.getText();
//			String MOA_Reciept = fullScreenShot(driver, "MOA_Reciept");
//			String Spice_Moa_DocumentSubmitted_Receipt_base64 = Utilities.convertImageToBase64String(MOA_Reciept);
//			// ************************need to send to crm
//			System.out.println(UploadedSRNNumber);
//			Robot robot = new Robot();
//			Thread.sleep(2000);
//			robot.keyPress(KeyEvent.VK_TAB);
//			robot.keyRelease(KeyEvent.VK_TAB);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
//			
//			
//		//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Ok')])[1]")));
//		//	commonFunctions.clickElementByJS(driver, "(//button[contains(text(),'Ok')])[1]");
//			//driver.findElement(By.xpath("(//button[contains(text(),'Ok')])[1]")).click();
			String SPICEPartBTotalAmount = driver.findElement(By.xpath("(//td[@class='totalFees'])[1]")).getText();
			String StampDutyFeeForMOAandAOA = driver.findElement(By.xpath("(//td[@class='totalFees'])[1]")).getText();
			Utilities.scrollToElement(driver, driver.findElement(By.xpath("//button[text()='Make Payment']")));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Make Payment']")).click();
			Thread.sleep(2000);
			navigateToBharatKosh(driver, wait);
			hdfcNetBanking(driver);
			String Spice_Moa_Payment_Receipt_base64 = getPrintReceipt(driver, srnNumber);
			String moaSrn = driver.findElement(By.xpath(
					"(//div[@class='transactionSuccess']/following-sibling::div[@class='transactionCompleteAlert']/child::span/following-sibling::span[@id='srnNumber'])[1]"))
					.getText();
			String moaSrnamount = driver
					.findElement(By.xpath("(//div[@class='transactionCompleteAlert']//span[@id='charges'])[1]"))
					.getText();

			stampduty_payment(driver, wait);
			String Spice_Stamp_Duty_Payment_Receipt_base64 = getPrintReceipt(driver, srnNumber);
			String stampSrn = driver.findElement(By.xpath(
					"(//div[@class='transactionSuccess']/following-sibling::div[@class='transactionCompleteAlert']/child::span/following-sibling::span[@id='srnNumber'])[1]"))
					.getText();
			String stampSrnamount = driver
					.findElement(By.xpath("(//div[@class='transactionCompleteAlert']//span[@id='charges'])[1]"))
					.getText();
			ArrayList<String> values = new ArrayList<String>();

			System.out.println(SPICEPartBTotalAmount);
			System.out.println(StampDutyFeeForMOAandAOA);
			System.out.println(Spice_Moa_Payment_Receipt_base64);
			System.out.println(Spice_Stamp_Duty_Payment_Receipt_base64);

			values.add(moaSrn);// moaSrnnumber
			values.add(stampSrn);// stampSrnnumber
			values.add(moaSrnamount);
			values.add(Spice_Moa_Payment_Receipt_base64);
			values.add(stampSrnamount);
			values.add(Spice_Stamp_Duty_Payment_Receipt_base64);
			return values;
		} catch (Exception e) {

			throw new RuntimeException("Error occurred in the fail method");
		}
	}

	public static void chooseNoOfBoxShouldBeOpenToUpload(int nos, WebDriver driver) throws InterruptedException {
		for (int i = 1; i < nos; i++) {
			driver.findElement(By.xpath("//input[@id='addMoreFileUpldDlgs']")).click();
			Thread.sleep(1000);
		}
	}

	public static void stampduty_payment(WebDriver driver, WebDriverWait wait)
			throws InterruptedException, AWTException {

		WebElement Proceed_To_Pay_stampDuty = driver
				.findElement(By.xpath("//div[@id='inline_content']/child::form/child::a/following-sibling::a"));
		Proceed_To_Pay_stampDuty.click();
		navigateToBharatKoshpayStampDuty(driver, wait);
		hdfcNetBanking(driver);

	}

	public static void uploadDocuments(Map<String, String> dataMap, WebDriver driver, WebDriverWait wait,
			String ticketId, String serviceId) throws Exception {

		if (serviceId.equals("3") || serviceId.equals("8") || serviceId.equals("233") || serviceId.equals("1")
				|| serviceId.equals("12")) {
			ArrayList<String> five = new ArrayList<String>();
			five.add("SPICePartB.pdf");
			five.add("SPICeMoA.pdf");
			five.add("SPICeAoA.pdf");
			five.add("AGILEPRO.pdf");
			five.add("SPICeINC9.pdf");
			chooseNoOfBoxShouldBeOpenToUpload(5, driver);
			for (int i = 0; i < five.size(); i++) {
				System.out.println(five.get(i));
				int a = i + 1;
				CheckFile_UploadDoc_Network(five.get(i), "//input[@id='uploadFileDialog" + a + "']", driver, dataMap,
						ticketId);
			}
		} else if (serviceId.equals("7")) {
			ArrayList<String> two = new ArrayList<String>();
			two.add("SPICePartB.pdf");
			two.add("AGILEPRO.pdf");
			chooseNoOfBoxShouldBeOpenToUpload(2, driver);
			for (int i = 0; i < two.size(); i++) {
				int a = i + 1;
				CheckFile_UploadDoc_Network(two.get(i), "//input[@id='uploadFileDialog" + a + "']", driver, dataMap,
						ticketId);
			}
		} else if (serviceId.equals("238") || serviceId.equals("22")) {
			ArrayList<String> three = new ArrayList<String>();
			three.add("SPICePartB.pdf");
			three.add("AGILEPRO.pdf");
			three.add("SPICeINC9.pdf");
			chooseNoOfBoxShouldBeOpenToUpload(3, driver);
			for (int i = 0; i < three.size(); i++) {
				System.out.println(three.get(i));
				int a = i + 1;
				CheckFile_UploadDoc_Network(three.get(i), "//input[@id='uploadFileDialog" + a + "']", driver, dataMap,
						ticketId);
			}
		}

		driver.findElement(By.xpath("//input[@id='upload']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='boxclose']")));
	}

	public static boolean checkErrorMessage(WebDriver driver) {
		boolean isError = commonFunctions.isElementPresent(driver, By.xpath("(//h2[text()='Error'])[1]"));
		if (isError == true) {
			return true;
		} else {
			return false;
		}

	}

	public static String[] fetchSrnNumber1(WebDriver driver, WebDriverWait wait) throws InterruptedException {
		String a[] = new String[5];
		String srnNumber = driver.findElement(By.xpath("//ul[@class='alertMessage']/li")).getText().split("is")[1]
				.trim();
		driver.findElement(By.xpath("//a[@id='alertboxclose']")).click();
		Utilities.scrollToElement(driver, driver.findElement(By.xpath("//input[@id='payNowBtn']")));
		String amount1 = driver.findElement(By.xpath("(//b[text()='Total'])[1]/parent::td/parent::tr/td[2]")).getText();
		System.out.println(amount1);
		a[0] = amount1;
		String amount2 = driver.findElement(By.xpath("(//b[text()='Total'])[2]/parent::td/parent::tr/td[2]")).getText();
		a[1] = amount2;
		System.out.println(amount2);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='payNowBtn']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='payNowBtn']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Online Internet Banking']")));
		a[2] = srnNumber;
		return a;
	}

	public static String getPaymentReceipt(String ticketId, String srnNumber) throws IOException {
		String path = "\\192.168.1.9\\VakilSearch\\Balaji\\" + ticketId + ".pdf";
		Utilities.gettingPDFFromAPI(
				"https://www.mca.gov.in/mcafoportal/displayChallanReceipt.do?srn=" + srnNumber + "&pltrReceipt=false",
				path);
		String Spice_Payment_Receipt_base64 = Utilities.convertImageToBase64String(path);
		return Spice_Payment_Receipt_base64;
	}

	public static String fetchSrnNumber2(WebDriver driver, WebDriverWait wait) throws Exception {
		driver.findElement(By.xpath("//input[@value='Online Internet Banking']")).click();
		selectByVisibleText("//select[@name='internetBankingData']", "HDFC Bank", driver);
		commonFunctions.clickByxpath(driver, "//*[@id=\"submitBtn\"]");
		Thread.sleep(3000);
		String srnNumber = driver.findElement(By.xpath("(//td[@align='left']/b)[1]")).getText().trim();
		commonFunctions.clickByxpath(driver, "//*[@id=\"acceptBtn\"]");
		Thread.sleep(2000);
		return srnNumber;
	}

	public static void sendStatusToGroup(String message) {
		String k = "https://chat.googleapis.com/v1/spaces/AAAAbe-6ixM/messages";
		RestAssured.baseURI = k;
		RequestSpecification httpRequest = RestAssured.given();
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("text", message);
		httpRequest.queryParam("key", "AIzaSyDdI0hCZtE6vySjMm-WEfRq3CPzqKqqsHI");
		httpRequest.queryParam("token", "CbTrzfOEMXMlPZYOq6-woNLE6p9k7yT7-t38SVtQZGo=");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.request(Method.POST);

	}

	

	public static void checkStatusAndSendNegativeResponse(WebDriver driver, WebDriverWait wait, String ticketId,
			String username, String password) throws IOException, InterruptedException {
//			String currentUploadStatus1 = driver.findElement(By.xpath(
//					"//div[@id='guideContainer-rootPanel-panel_447355163_copy-panel_1375136083_cop-panel_1918291137-panel-guidetextdraw_copy_c__']/child::p/child::b"))
//					.getText();
//			String uploadstatus1 = "The document has been successfully uploaded. ";
//			if (currentUploadStatus1.contains(uploadstatus1)) {
//				driver.close();
//			} else {
		System.out.println("failed sent");
		String PriliminaryFailure_Screenshot_Path = fullScreenShot(driver, "PriliminaryFailure_Screenshot");
		String base64String = Utilities.convertImageToBase64String(PriliminaryFailure_Screenshot_Path);
		sendNegativeResponseToCRM(ticketId, username, base64String, password);
		System.out.println("failed sent to crm");
		try {
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(1));
			driver.close();
		} catch (Exception e) {

			System.out.println("only one window found");
		}

		Logout(driver);

		// }

	}

	public static void enterDetailsInDB(String ticketId, String moaSrnNumber, String moaAmount,
			String stampDutySrnNumber, String stampDutyAmount, String mcaLogin, String agentEmail,
			String automationStatus, String reason) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-uuuu");
		LocalDate localDate = LocalDate.now();
		MongoClient mongoClient = MongoClients
				.create("mongodb://local_automation_user:DenTErimpOre@192.168.9.68:7750/VS_ProcessAutomation");
		MongoDatabase vsDB = mongoClient.getDatabase("VS_ProcessAutomation");
		MongoCollection<Document> reports = vsDB.getCollection("spicePartB_Upload_Status");
		Document report = new Document();
		report.append("date", localDate.toString());
		report.append("ticketId", ticketId);
		report.append("moaSrnNumber", moaSrnNumber);
		report.append("moaSrnAmount", moaAmount);
		report.append("stampDutySrnNumber", stampDutySrnNumber);
		report.append("stampDutySrnAmount", stampDutyAmount);
		report.append("mcaLogin", mcaLogin);
		report.append("agentEmail", agentEmail);
		report.append("automationStatus", automationStatus);
		report.append("reason", reason);
		reports.insertOne(report);
	}

	public static void sendReportToGoogleSheet() {
		RestAssured.baseURI = "https://vs-automation.vakilsearch.com/automation/gst/spicePartBUploadReport";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "text/plain");
		Response response = httpRequest.request(Method.GET);
	}

	private static void spinner(WebDriver driver, WebDriverWait wait) throws InterruptedException {
		try {

			wait.until(ExpectedConditions
					.invisibilityOfElementLocated(By.xpath("(//div[@class='loader d-none d-flex'])[1]")));
		} catch (Exception e) {
			System.out.println("No spinner");
		}

	}

	public static void navigateToBharatKosh(WebDriver driver, WebDriverWait wait)
			throws InterruptedException, AWTException {
		try {
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("(//div[@class='instruction-text stampDutyWarnText']/child::p)[1]")));
			Thread.sleep(5000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnConfirm']")));
			Utilities.scrollToElement(driver, driver.findElement(By.xpath("//button[@id='btnConfirm']")));
			driver.findElement(By.xpath("//button[@id='btnConfirm']")).click();
			Thread.sleep(5000);
			Utilities.scrollToElement(driver, driver.findElement(
					By.xpath("//img[@src='../App_Themes/Receipt/images/HDFClogo.jpg']/parent::label/input")));
			driver.findElement(By.xpath("//img[@src='../App_Themes/Receipt/images/HDFClogo.jpg']/parent::label/input"))
					.click();
			Thread.sleep(2000);
			selectByValue("//select[@id='lstggregatorBankForInternetBanking']", "31", driver);
			waitUntilManualActions(driver, "Please enter the captcha text");
//			driver.findElement(By.xpath("//input[@id='BtnPay']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Confirm']")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			waitUntilManualActions(driver, "Please enter the OTP and navigate to HDFC Page");
		}

	}

	public static void navigateToBharatKoshpayStampDuty(WebDriver driver, WebDriverWait wait)
			throws InterruptedException, AWTException {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnConfirm']")));

			Utilities.scrollToElement(driver, driver.findElement(By.xpath("//button[@id='btnConfirm']")));
			driver.findElement(By.xpath("//button[@id='btnConfirm']")).click();
			Thread.sleep(5000);
			Utilities.scrollToElement(driver, driver.findElement(
					By.xpath("//img[@src='../App_Themes/Receipt/images/HDFClogo.jpg']/parent::label/input")));
			driver.findElement(By.xpath("//img[@src='../App_Themes/Receipt/images/HDFClogo.jpg']/parent::label/input"))
					.click();
			Thread.sleep(2000);
			selectByValue("//select[@id='lstggregatorBankForInternetBanking']", "31", driver);
			waitUntilManualActions(driver, "Please enter the captcha text");
//			driver.findElement(By.xpath("//input[@id='BtnPay']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Confirm']")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			waitUntilManualActions(driver, "Please enter the OTP and navigate to HDFC Page");
		}

	}

	public static void hdfcNetBanking(WebDriver driver) throws InterruptedException {

		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='bottom_frame']")));
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("69648759");
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='bottom_frame']")));
		driver.findElement(By.xpath("//input[@name='fldPassword']")).sendKeys("Uber9@2023");
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		selectByValue("//select[@name='selAcct']", "50200019461490  ", driver);
		driver.findElement(By.xpath("//img[@alt='Continue']")).click();
		waitUntilManualActions(driver, "Please enter the OTP");

	}

	public static String getPrintReceipt(WebDriver driver, String srnNumber) throws IOException, InterruptedException {
		driver.findElement(By.xpath("//button[@id='popupOK']")).click();
		Thread.sleep(5000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		String Application_ScreenShot_Path = fullScreenShot(driver, srnNumber + "Screenshot");
		String Application_ScreenShot_Path_BASE64String = convertImageToBase64String(Application_ScreenShot_Path);
		System.out.println(Application_ScreenShot_Path_BASE64String);
		driver.close();
		driver.switchTo().window(tabs2.get(0));

		return Application_ScreenShot_Path_BASE64String;

	}

	public static String fullScreenShot(WebDriver driver, String arnNumber) throws IOException {
		String path = "C:\\Users\\Vuser\\Documents\\Screenshot" + arnNumber + ".png";
		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		ImageIO.write(fpScreenshot.getImage(), "PNG", new File(path));
		System.out.println(path);
		return path;
	}

	public static String convertImageToBase64String(String imagePath) throws IOException {
		byte[] fileContent = FileUtils.readFileToByteArray(new File(imagePath));
		String encodedString = Base64.getEncoder().encodeToString(fileContent);
		return encodedString;
	}

	public static void Logout(WebDriver driver) throws IOException, InterruptedException {
		try {
			ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs2.get(0));

			commonFunctions.clickElementByJS(driver, "//a[@class='nav-link dropdown-toggle signInopt']/child::span");
			Thread.sleep(3000);
			commonFunctions.clickElementByJS(driver, "//a[@class='logoutIcon removeCookies']");
		} catch (Exception e) {
			System.out.println("Unable to logout");
		}
	}
	public static void insertAutomationStatusToMongoDB(String userName,String password,String type, String ticketId, String Service,
            String automationType, String agentEmail,String companyName) {
        try {
     
            MongoClient mongoClient = MongoClients
                    .create("mongodb://local_automation_user:DenTErimpOre@14.143.222.116:7750/VS_ProcessAutomation");
            MongoDatabase vsDB = mongoClient.getDatabase("VS_ProcessAutomation");
            MongoCollection<Document> reports = vsDB.getCollection("Spice_Part_B_Payment");
            Document report = new Document();
            report.append("mcaUserName", userName);
            report.append("mcaPassword", password);
            report.append("type", type);
            report.append("ticketId", ticketId);
            report.append("serviceId", Service);
            report.append("companyName", companyName);
            report.append("agentEmail", agentEmail);
            reports.insertOne(report);
      
        }catch (Exception e) {
            
            
        }
    }
	public static void main(WebDriver driver, WebDriverWait wait)
			throws Exception {
		MongoClient mongoClient = MongoClients
                .create("mongodb://local_automation_user:DenTErimpOre@192.168.9.68:7750/VS_ProcessAutomation");
        MongoDatabase vsDB = mongoClient.getDatabase("VS_ProcessAutomation");
        MongoCollection<Document> collection = vsDB.getCollection("Spice_Part_B_Upload");
        Document query = new Document();
        List results = new ArrayList<>();
        collection.find(query).into(results);
		for (int i = 0; i < results.size(); i++) {
			Document ticketDetails = (Document) results.get(i);

		
			String username = ticketDetails.getString("mcaUserName");
			String password = ticketDetails.getString("mcaPassword");
			String ticketId = ticketDetails.getString("ticketId");
			String srnNumber = ticketDetails.getString("srnNumber");
			String serviceId =ticketDetails.getString("serviceId");
			String agentEmail = ticketDetails.getString("agentEmail");
			String companyName = ticketDetails.getString("companyName");
		
			try {
				driver.get("https://www.mca.gov.in");
				loginForOtherServices(driver, ticketId, wait, username, password);
				searchApplication(driver, wait, srnNumber, companyName, ticketId, username, password);
				Thread.sleep(4000);

					ArrayList<String> values = directPaymentFlow(driver, wait, srnNumber);
					String moaSrnNumber = values.get(0);
					String stampSrnNumber = values.get(1);
					String moaExpense = values.get(2);
					String Spice_Moa_Payment_Receipt_base64 = values.get(3);
					String stampDutyExpense = values.get(4);
					String Spice_Stamp_Duty_Payment_Receipt_base64 = values.get(5);

					sendSucessResponseToCRM(ticketId, username, moaSrnNumber, stampSrnNumber, moaExpense,
					stampDutyExpense, Spice_Moa_Payment_Receipt_base64, Spice_Stamp_Duty_Payment_Receipt_base64,
				    password);
					sendStatusToGroup(ticketId + "_" + agentEmail + "_" + "Payment Successfull!!!");
					//insertAutomationStatusToMongoDB(username,password,srnNumber, ticketId, serviceId, companyName, agentEmail,companyName);
					 collection.deleteOne(Filters.eq("ticketId", ticketId));
			            System.out.println("Document deleted successfully...");
					Logout(driver);
				
			} catch (Exception e) {

				System.out.println(e);
				//checkStatusAndSendNegativeResponse(driver, wait, ticketId, username, password);
				//continue;
			}}
	}

}
