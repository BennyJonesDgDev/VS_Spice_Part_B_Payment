package Wrappers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.bson.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.JsonObject;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Utilities {
	public static WebDriverWait wait;
	final static Logger logger = Logger.getLogger(Utilities.class.getName());
	static CommonFunctions commonFunctions = new CommonFunctions();

	public static String convertImageToBase64String(String imagePath) throws IOException {
		byte[] fileContent = FileUtils.readFileToByteArray(new File(imagePath));
		String encodedString = Base64.getEncoder().encodeToString(fileContent);
		return encodedString;
	}

	public static String convertPdfToBase64(String path) throws IOException {
		System.out.println(path);
		byte[] input_file = Files.readAllBytes(Paths.get(path.replaceAll("//", "////")));
		byte[] encodedBytes = Base64.getEncoder().encode(input_file);
		String encodedString = new String(encodedBytes);
		return encodedString;
	}

	public static String webElementScreenShot(WebDriver driver, WebElement element) {
		String fileStorage = "\\192.168.1.9\\VakilSearch\\Balaji\\captchaScreenshots\\check" + ".PNG";
		Screenshot screenshot = new AShot().takeScreenshot(driver, element);
		try {
			ImageIO.write(screenshot.getImage(), "PNG", new File(fileStorage));
		} catch (IOException e) {

			e.printStackTrace();
		}
		return fileStorage;

	}

	public void waitUntilElementPresence(final WebDriver driver, By by) {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
		} catch (Exception e) {
			// Ignore the timeout exception
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void crmMilestoneChangeInCRM(String ticketId, String milestone, String subMilestone) {
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("ticketId", ticketId);
		requestParams.addProperty("milestone", milestone);
		requestParams.addProperty("subMilestone", subMilestone);
		String environment = "https://helpdesk.vakilsearch.com";
		RestAssured.baseURI = environment + "/crm_update/milestone_submilestone_change";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.request(Method.POST);
		System.out.println(response.time());
	}

	public static void crmTicketAssignment(String ticketId, String agentEmail) {
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("ticketId", ticketId);
		requestParams.addProperty("agentEmail", agentEmail);
		String environment = "https://helpdesk.vakilsearch.com";
		RestAssured.baseURI = environment + "/crm_update/ticket_assignment";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.request(Method.POST);
		System.out.println(response.time());
	}

	public static void addNoteInCRM(String ticketId, String content, String subject, String agentEmail) {
		System.out.println(content);
		System.out.println(agentEmail);
		System.out.println(ticketId);
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("ticketId", ticketId);
		requestParams.addProperty("content", content);
		requestParams.addProperty("subject", subject);
		requestParams.addProperty("agentEmail", agentEmail);
		String environment = "https://helpdesk.vakilsearch.com";
		RestAssured.baseURI = environment + "/crm_update/add_note";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.request(Method.POST);
		System.out.println(response.statusCode());
	}

	public static String checkWetherFileIsPresent(String folderPath, String fileName) {
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("folderPath", folderPath);
		requestParams.addProperty("fileName", fileName);
		RestAssured.baseURI = "http://14.140.167.189:8080/VSProcessAutomation/checkFileExist";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.request(Method.POST);
		String status = response.prettyPrint();
		return status;
	}

	public static String webElementScreenShot2(WebDriver driver, WebElement element) throws IOException {
		String fileStorage = "\\192.168.1.9\\VakilSearch\\Balaji\\captchaScreenshots\\checkmsme" + ".PNG";
		File f = element.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f, new File(fileStorage));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileStorage;

	}

	public static String captchaScreenshot(WebDriver driver, WebElement element) throws IOException {
		String filePath = Utilities.webElementScreenShot2(driver, element);
		String base64 = Utilities.convertImageToBase64String(filePath);
		String fileStorage = "";
		System.out.println(base64);
		String captchaText = antiCaptcha(base64);
		if (captchaText == null) {
			System.out.println("Null captcha");
		} else {
			String text = captchaText.toUpperCase();
			System.out.println(text);
			fileStorage = "c:\\msmeCaptcha\\" + text + ".PNG";
			File f = element.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(f, new File(fileStorage));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return fileStorage;

	}

	public static String antiCaptcha(String base64) {
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("image64", base64);
		requestParams.addProperty("apiKey", "55b2708ee5d59a06bc429f75a8dc2314");
		RestAssured.baseURI = "https://6dvmoxagqk.execute-api.ap-south-1.amazonaws.com/dev/captchabreaker";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.request(Method.POST);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String captchaText = jsonPathEvaluator.get("captchaText.captchaText");
		return captchaText;

	}

	public static String webElementScreenShotAsBase64(WebDriver driver, WebElement element) throws IOException {
		String fileStorage = "\\192.168.1.9\\VakilSearch\\Balaji\\captchaScreenshots\\checkmsme" + ".PNG";
		String base64 = null;
		File f = element.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f, new File(fileStorage));
			base64 = Utilities.convertImageToBase64String(fileStorage);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return base64;

	}

	public static String fullPageScreenshotAsBase64_2(WebDriver driver) {
		String fileStorage = "\\192.168.1.9\\VakilSearch\\Balaji\\captchaScreenshots\\check" + ".PNG";
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		String base64 = null;
		try {
			FileUtils.copyFile(SrcFile, new File(fileStorage));
			base64 = Utilities.convertImageToBase64String(fileStorage);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return base64;

	}

	public static String fullPageScreenshotAsBase64(WebDriver driver) throws IOException {
		String fileStorage = "\\192.168.1.9\\VakilSearch\\Balaji\\captchaScreenshots\\msmeerror" + ".PNG";
		String base64 = null;
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		try {
			ImageIO.write(screenshot.getImage(), "PNG", new File(fileStorage));
			base64 = Utilities.convertImageToBase64String(fileStorage);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return base64;
	}

	public static String[] getCaptchaUsingVSCaptcha(String base64String, String URL, String token) {
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("image", base64String);
		RestAssured.baseURI = URL;
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.header("Authorization", "Bearer " + token + "");
		System.out.println(requestParams.toString());
		httpRequest.body(requestParams.toString());
		System.out.println("hii");
		Response response = httpRequest.request(Method.POST);
		System.out.println("hiiiiiiiiiiiii");
		JsonPath jsonPathEvaluator = response.jsonPath();
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiii");
		String captchaText = jsonPathEvaluator.get("ansCaptcha");
		System.out.println(captchaText);
		String responseCode = Integer.toString(response.getStatusCode());
		System.out.println(response.toString());
		String vsCaptcha[] = { captchaText, responseCode };
		return vsCaptcha;
	}

	public static String[] getCaptchaUsingAntiCaptcha(String base64String) {
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("apiKey", "55b2708ee5d59a06bc429f75a8dc2314");
		requestParams.addProperty("image64", base64String);
		RestAssured.baseURI = "https://6dvmoxagqk.execute-api.ap-south-1.amazonaws.com/dev/captchabreaker";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.request(Method.POST);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String captchaText = jsonPathEvaluator.get("captchaText.captchaText");
		String responseCode = Integer.toString(response.getStatusCode());
		String antiCaptcha[] = { captchaText, responseCode };
		return antiCaptcha;
	}

	public static void scrollToElement(WebDriver driver, WebElement element) {
		try {
			int x = element.getLocation().getX();
			int y = element.getLocation().getY();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(" + (x - 200) + "," + (y - 200) + ")");
		} catch (Exception e) {
			System.err.println("Scrolling to element is not working ");
		}
	}

	public static void spiceLogin(WebDriver driver, String userName, String password, String ticketId,
			Map<String, String> dataMap) throws Exception {
		for (int i = 0; i < 3; i++) {
			commonFunctions.findAndAddElementById(driver, CommonVariables.PATH_MCA_HOME_USERNAME, userName);
			commonFunctions.findAndAddElementById(driver, CommonVariables.PATH_MCA_HOME_PWD, password);
			WebElement captcha = driver.findElement(By.xpath("//img[@id='captcha']"));
			// scrollToElement(driver, captcha);
			// driver.findElement(By.xpath("//a[@id='captchaRefresh']")).click();
			commonFunctions.clickElementByJS(driver, "//a[@id='captchaRefresh']");
			Thread.sleep(2000);
			String filepath = webElementScreenshotnew(driver, captcha);
			String base64 = convertImageToBase64String(filepath);
			String vsCapctha[] = getCaptchaUsingVSCaptcha(base64, "https://helpdesk.vakilsearch.com/ml-ad/captcha/mca",
					"s7wb28pAoEuTk9DfIcSnZr3G65HjRiFq");
			driver.findElement(By.xpath("//input[@name='userEnteredCaptcha']")).sendKeys(vsCapctha[0].toString());
			driver.findElement(By.xpath("//input[@id='login_0']")).click();
			Thread.sleep(2000);
			boolean INVALID_CAPTCHA_ALERT = CommonFunctions.isElementPresent(driver,
					By.xpath(CommonVariables.PATH_MCA_HOME_INVALID_CAPTCHA_ALERT));
			boolean ALREADY_LOGIN_ALERT = CommonFunctions.isElementPresent(driver,
					By.xpath(CommonVariables.PATH_MCA_HOME_ALREADY_LOGIN_ALERT));
			boolean INVALID_CREDENTIALS_ALERT = CommonFunctions.isElementPresent(driver,
					By.xpath(CommonVariables.PATH_MCA_HOME_INVALID_CREDENTIALS_ALERT));
			boolean myWorkspace = CommonFunctions.isElementPresent(driver, By.xpath("//h1[text()='My WorkSpace']"));
			if (ALREADY_LOGIN_ALERT == true) {
				commonFunctions.waitUntilManualActions(driver,
						"The user is already signed in another browser,Kindly try again with another user name . Enter the username and password along with captcha and click signin.After reaching the home page close the empty tab",
						dataMap);
				break;
			} else {
				System.out.println("Already Signed in alert is not thrown");
			}
			if (INVALID_CREDENTIALS_ALERT == true) {
				commonFunctions.waitUntilManualActions(driver,
						"Enter proper username and password along with captcha and click signin and close the empty tab",
						dataMap);
				break;
			} else {
				System.out.println("invalid credentials alert is not thrown");
			}
			if (INVALID_CAPTCHA_ALERT == true) {
				System.out.println("Captcha is wrong, Trying again");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//p[@class='error']/parent::div/a)[1]")).click();
//				Utilities.sendFailedCaptchaToMlTeam(base64, "https://www.mca.gov.in/MinistryV2/spicefaq.html",
//						vsCapctha[0].toString(), "SPICE");
			} else {
				if (myWorkspace == true) {
					System.out.println("User has been sucessfully logged in ");
					break;
				} else {
					commonFunctions.waitUntilManualActions(driver,
							"Kinldy handle the erros and close the empty tab once the manual work is done", dataMap);
				}
			}
		}
// if above captcha is not working manual actions will be open
		boolean myWorkspace = CommonFunctions.isElementPresent(driver, By.xpath("//h1[text()='My WorkSpace']"));
		if (myWorkspace == true) {
			logger.info("user has been sucessfully logged in using VS Captcha");
		} else {
			commonFunctions.findAndAddElementById(driver, CommonVariables.PATH_MCA_HOME_USERNAME, userName);
			commonFunctions.findAndAddElementById(driver, CommonVariables.PATH_MCA_HOME_PWD, password);
			logger.info("Enter captcha manually , manual tab is opened");
			commonFunctions.waitUntilManualActions(driver,
					"Enter Captcha Manually, then Click Signin and Close the empty tab", dataMap);

		}

	}

// Scroll to top of the page
	public static void scrollTop(WebDriver driver) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, 0)");
		} catch (Exception e) {
			System.err.println("Scrolling top is not working ");
		}
	}

	public static void scrollBottom(WebDriver driver) {
		try {
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		} catch (Exception e) {
			System.err.println("Scrolling bottom is not working ");
		}
	}

	public static void gstTemporaryCaptchaBreaker(WebDriver driver, Map<String, String> dataMap)
			throws IOException, InterruptedException {

		for (int i = 0; i < 3; i++) {
			WebElement captcha = driver.findElement(By.xpath("//img[@class='captcha']"));
			Thread.sleep(2000);
			String filepath = webElementScreenShot(driver, captcha);
			String base64 = convertImageToBase64String(filepath);
			String vakilCapctha[] = getCaptchaUsingVSCaptcha(base64,
					"https://helpdesk.vakilsearch.com/ml-ad/captcha/gst", "s7wb28pAoEuTk9DfIcSnZr3G65HjRiFq");
			if (vakilCapctha[1].toString().trim().contentEquals("200")) {
				driver.findElement(By.xpath("//input[@id='captchatrn']")).sendKeys(vakilCapctha[0].toString());
				scrollToElement(driver, driver.findElement(By.xpath("//button[text()='Proceed']")));
				driver.findElement(By.xpath("//button[text()='Proceed']")).click();
				scrollToElement(driver, driver.findElement(By.xpath("//button[text()='Proceed']")));
				Thread.sleep(2000);
				boolean elementCheck = CommonFunctions.isElementPresent(driver,
						By.xpath("//span[text()='Enter characters as displayed in the CAPTCHA image']"));
				if (elementCheck == true) {
//					Utilities.sendFailedCaptchaToMlTeam(base64, "https://reg.gst.gov.in/registration/",
//							vakilCapctha[0].toString(), "GST");
				} else {
					Utilities.gstInfoLog(dataMap.get("ticketId"), "User Sucessfully logged in");
					break;
				}
			} else {
				Utilities.gstInfoLog(dataMap.get("ticketId"), "Vakilsearch Captcha server is not responding");
			}

		}
// Enabling Manual Actions as Vakilsearch Captcha is not working
		Thread.sleep(2000);
		boolean mobileotpElementCheck = CommonFunctions.isElementPresent(driver, By.xpath("//input[@id='mobile_otp']"));
		if (mobileotpElementCheck == true) {
			System.out.println("USer has been sucessfully logged in");
			commonFunctions.waitUntilManualActions(driver,
					"GST TRN LOGIN - Please close the empty tab once your manual work is done", dataMap);
		} else {
			commonFunctions.waitUntilManualActions(driver,
					"GST TRN LOGIN - Please enter the captcha and click proceed button.please close the empty tab once your manual work is done",
					dataMap);
		}

	}

	public static String webElementScreenshotnew(WebDriver driver, WebElement element) {
		String fileStorage = "C:\\Users\\Vakilsearch\\eclipse-workspace\\API_Automation\\images\\hey" + ".PNG";
		try {
			Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
					.takeScreenshot(driver, element);
			ImageIO.write(screenshot.getImage(), "png", new File(fileStorage));
		} catch (Exception e) {
			System.out.println("some error");
		}
		return fileStorage;
	}

	public static void trademarkSignin(final WebDriver driver, Map<String, String> dataMap, String userName,
			String password, WebDriverWait wait) throws IOException, InterruptedException {
		Thread.sleep(2000);
		boolean ispopUp = CommonFunctions.isElementPresent(driver, By.xpath("//a[@title='Close']"));
		if (ispopUp == true) {
			driver.findElement(By.xpath("//a[@title='Close']")).click();
		} else {
			logger.info("No Pop Up");
		}
		System.out.println(userName);
		driver.findElement(By.cssSelector(CommonVariables.PATH_USERNAME)).sendKeys(userName);
		driver.findElement(By.cssSelector(CommonVariables.PATH_PASSWORD)).sendKeys(password);
		enterCaptcha_Trademark(driver, "https://helpdesk.vakilsearch.com/ml-ad/captcha/trademark",
				"s7wb28pAoEuTk9DfIcSnZr3G65HjRiFq", dataMap);

	}

	public static void enterCaptcha_Trademark(WebDriver driver, String CapcthaURL, String token,
			Map<String, String> dataMap) throws IOException, InterruptedException {
		for (int i = 0; i < 5; i++) {
			WebElement captchaImage = driver.findElement(By.xpath("//div[@style='background-color:White;']/img"));
			WebElement loginButton = driver.findElement(By.xpath("//input[@name='LnkSubmitLogin']"));
			WebElement captchaTextbox = driver.findElement(By.xpath("//input[@name='txtCaptcha']"));
			String filePath = webElementScreenShot(driver, captchaImage);
			String base64 = convertImageToBase64String(filePath);
			String vsCapctha[] = Utilities.getCaptchaUsingVSCaptcha(base64, CapcthaURL, token);
			captchaTextbox.sendKeys(vsCapctha[0].toString());
			Thread.sleep(2000);
			loginButton.click();
			Thread.sleep(2000);
			boolean formHistory = CommonFunctions.isElementPresent(driver, By.xpath("//a[text()='Form History']"));
			if (formHistory == true) {
				logger.info("User is sucessfully logged in using VS Captcha Breaker");
				break;
			} else {
				try {
					driver.switchTo().alert().accept();
				} catch (Exception a) {
					System.out.println("No such alert");
				}
				Thread.sleep(2000);
				boolean ispopUp = CommonFunctions.isElementPresent(driver, By.xpath("//a[@title='Close']"));
				if (ispopUp == true) {
					driver.findElement(By.xpath("//a[@title='Close']")).click();
				} else {
					logger.info("No Pop Up");
				}
				driver.findElement(By.xpath("//input[@id='ImageButton1']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@name='TBPassword']")).sendKeys("Ls123vs32!");
				System.out.println("Captcha failed trying again");
//				Utilities.sendFailedCaptchaToMlTeam(base64,
//						"https://ipindiaonline.gov.in/trademarkefiling/user/frmloginNew.aspx", vsCapctha[0].toString(),
//						"Trademark");

			}

		}
// Opening Manual Actions if VS captcha failed
		boolean formHistory = CommonFunctions.isElementPresent(driver, By.xpath("//a[text()='Form History']"));
		if (formHistory == true) {
			System.out.println("USer has been sucessfully logged in");
		} else {
			commonFunctions.waitUntilManualActions(driver, "Please enter the captcha and proceed", dataMap);
		}
	}

	public static void sendFailedCaptchaToMlTeam(String base64, String URL, String textFromML, String domain) {
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("url", URL);
		requestParams.addProperty("domain", domain);
		requestParams.addProperty("actualTextReceived", textFromML);
		requestParams.addProperty("captchaImageBase64", base64);
		requestParams.addProperty("type", "captcha");
		RestAssured.baseURI = "https://helpdesk.vakilsearch.com/capture_failed_captcha";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.request(Method.POST);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String messageSent = jsonPathEvaluator.getString("status");
		if (messageSent.contentEquals("Success")) {
			System.out.println("Failed captcha sent Successfully");
		} else {
			System.out.println("Failed captcha not sent");
		}

	}

	public static boolean checkFileIsPresentInAPath(String path, String fileName) {
		File f = new File(path + "\\" + fileName);
		boolean present = f.exists();
		if (present == true) {
			System.out.println("File is present in the folder");
			return true;
		} else {
			System.out.println("File is not present in the folder");
			return false;
		}
	}

	public void waitUntilManualActions_old_Firefox(final WebDriver driver, String message,
			Map<String, String> dataMap) {
		int tabSize;
		String ticketId = dataMap.get("ticketId");
		try {
			String Msg = ("For ticket #  " + ticketId + " - MANUAL_ACTIONS - " + message);
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

		} catch (Exception e) {
		}
	}

	public static String getTodayDate() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = formatter.format(date);
		return strDate;
	}

	public static int checkProxy() {
		ArrayList<String> proxyPorts = new ArrayList<String>();
		proxyPorts.add("37708");
		proxyPorts.add("57708");
		int validPort = 0;
		for (int i = 0; i < proxyPorts.size(); i++) {
			try {
				int port = Integer.parseInt(proxyPorts.get(i).toString());
				RestAssured.baseURI = "https://www.google.co.in/";
				RequestSpecification httpRequest = RestAssured.given();
				httpRequest.proxy("office9-libra.vakilsearch.com", port);
				Response response = httpRequest.request(Method.GET);
				validPort = port;
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("proxy not working ");
			}
		}

		return validPort;
	}

	public static void sendMessageToSpiceGroup(String message) {
		String k = "https://chat.googleapis.com/v1/spaces/AAAAORmsACg/messages";
		RestAssured.baseURI = k;
		RequestSpecification httpRequest = RestAssured.given();
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("text", message);
		httpRequest.queryParam("key", "AIzaSyDdI0hCZtE6vySjMm-WEfRq3CPzqKqqsHI");
		httpRequest.queryParam("token", "qpxjqjWtLCkjFtId4Cs3KIBcwwvco4DYrFP-SHyuYd0=");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.request(Method.POST);
		System.out.println(response.asPrettyString());
	}

	public static String fullScreenShot(WebDriver driver, String tradeMark) throws IOException {
		Date date = new Date();
		String dateTime = date.toString().replaceAll(":", "_");
		String path = "\\192.168.1.9\\VakilSearch\\Balaji\\" + tradeMark + ".png";
		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		ImageIO.write(fpScreenshot.getImage(), "PNG", new File(path));
		System.out.println(path);
		return path;
	}

	public static String fullScreenShot_Spice(WebDriver driver, Map<String, String> dataMap, String fileName)
			throws IOException {
		Date date = new Date();
		String dateTime = date.toString().replaceAll(":", "_");
		String path = dataMap.get("NetworkPath") + "Screenshot/" + fileName + ".png";
		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		ImageIO.write(fpScreenshot.getImage(), "PNG", new File(path));
		System.out.println(path);
		return path;
	}

	public static void SpiceManualActions(WebDriver driver, String userName, String password,
			Map<String, String> dataMap) throws Exception {
		commonFunctions.findAndAddElementById(driver, CommonVariables.PATH_MCA_HOME_USERNAME, userName);
		commonFunctions.findAndAddElementById(driver, CommonVariables.PATH_MCA_HOME_PWD, password);
		commonFunctions.waitUntilManualActions(driver, "Enter captcha and click signin and close the empty tab",
				dataMap);
	}

	public static void insertAutomationStatusToMongoDB(String automationType, String type, String ticketID,
			String serviceName, String environment, String agentEmail) {
		try {
		if (environment.equals("https://helpdesk.vakilsearch.com") || environment.equals("https://crm.vakilsearch.com")
				|| environment.equals("https://newopscrm.vakilsearch.com")) {
			MongoClient mongoClient = MongoClients
					.create("mongodb://local_automation_user:DenTErimpOre@14.143.222.116:7750/VS_ProcessAutomation");
			MongoDatabase vsDB = mongoClient.getDatabase("VS_ProcessAutomation");
			MongoCollection<Document> reports = vsDB.getCollection("AutomationStatus");
			Document report = new Document();
			report.append("type", type);
			report.append("ticketId", ticketID);
			report.append("Service", serviceName);
			report.append("automationType", automationType);
			report.append("agentEmail", agentEmail);
			reports.insertOne(report);
			logger.info(serviceName + "- For Ticket ID :-" + ticketID + " - " + type + "Value inserted in MongoDB!!!");
		} else {
			logger.info(serviceName + "- For Ticket ID :-" + ticketID + " - Running in QE Environment!!!");
		}
		}catch (Exception e) {
			e.printStackTrace();
			logger.info(e);
		}

	}

	public static void waitUntilManualActionsAndInsertInDb(String messageType, String message,
			Map<String, String> dataMap, final WebDriver driver) {
		int tabSize;
		String ticketId = dataMap.get("ticketId");
		try {
			insertManualActionsToMongoDB(messageType, message, dataMap);
			logger.info("For ticket #  " + ticketId + " - " + message);
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

	public static void insertManualActionsToMongoDB(String messageType, String message, Map<String, String> dataMap) {
		String environment = dataMap.get("environment");
		String ticketId = dataMap.get("ticketId");
		String serviceName = dataMap.get("serviceName");
		String userEmail = dataMap.get("userEmail");

		if (environment.equals("https://helpdesk.vakilsearch.com") || environment.equals("https://crm.vakilsearch.com")
				|| environment.equals("https://newopscrm.vakilsearch.com")) {
			MongoClient mongoClient = MongoClients
					.create("mongodb://local_automation_user:DenTErimpOre@192.168.9.68:7750/VS_ProcessAutomation");
			MongoDatabase vsDB = mongoClient.getDatabase("VS_ProcessAutomation");
			MongoCollection<Document> reports = vsDB.getCollection("Manual_Actions");
			Document report = new Document();
			report.append("ticketId", ticketId);
			report.append("service", serviceName);
			report.append("userEmail", userEmail);
			report.append("message", message);
			report.append("messageType", messageType);
			reports.insertOne(report);
			logger.info(serviceName + "- For Ticket ID :-" + ticketId + " - Value inserted in MongoDB!!!");
		} else {
			logger.info(serviceName + "- For Ticket ID :-" + ticketId + " - Running in QE Environment!!!");
		}

	}

	public static void insertHA_AutomationStatusToMongoDB(String type, String ticketID, String module) {
		MongoClient mongoClient = MongoClients
				.create("mongodb://local_automation_user:DenTErimpOre@192.168.9.68:7750/VS_ProcessAutomation");
		MongoDatabase vsDB = mongoClient.getDatabase("VS_ProcessAutomation");
		MongoCollection<Document> reports = vsDB.getCollection("HA_Automation_Report");
		Document report = new Document();
		report.append("Type", type);
		report.append("ticketId", ticketID);
		report.append("ticketId", module);
		reports.insertOne(report);

	}

	public static void insertLogIntoMongoDB(String ticketId, String type, String page, String message,
			Map<String, String> dataMap) {
		String environment = "";
		if (dataMap.get("environment").equals("https://helpdesk.vakilsearch.com")
				|| dataMap.get("environment").equals("https://crm.vakilsearch.com")
				|| dataMap.get("environment").equals("https://newopscrm.vakilsearch.com")) {
			environment = "Live";
		} else {
			environment = "QE";
		}
		String modifiedMessage = dataMap.get("serviceName") + "-" + dataMap.get("ticketId") + "-" + message;
		Date date = new Date();
		MongoClient mongoClient = MongoClients
				.create("mongodb://local_automation_user:DenTErimpOre@192.168.9.68:7750/VS_ProcessAutomation");
		MongoDatabase vsDB = mongoClient.getDatabase("VS_ProcessAutomation");
		MongoCollection<Document> reports = vsDB.getCollection("VS_Automation_Logs");
		Document report = new Document();
		report.append("type", type);
		report.append("ticketId", ticketId);
		report.append("Service", dataMap.get("serviceName"));
		report.append("message", modifiedMessage);
		report.append("page", page);
		report.append("agentName", dataMap.get("agentName"));
		report.append("environment", environment);
		report.append("date", date.toLocaleString());
		reports.insertOne(report);
	}

	public static void insertErrorParsingLogsIntoMongoDB(String message, String serviceName) {
		Date date = new Date();
		MongoClient mongoClient = MongoClients
				.create("mongodb://local_automation_user:DenTErimpOre@192.168.9.68:7750/VS_ProcessAutomation");
		MongoDatabase vsDB = mongoClient.getDatabase("VS_ProcessAutomation");
		MongoCollection<Document> reports = vsDB.getCollection("VS_Automation_Logs");
		Document report = new Document();
		report.append("date", date.toLocaleString());
		report.append("Service", serviceName);
		report.append("message", message);
		reports.insertOne(report);
	}

	public static String randomNumber() {
		String generatednumber = RandomStringUtils.randomNumeric(4);// 10 is length
		return generatednumber;
	}

// Saving Randomly generated username for DSC_SIFY In Automation Mongo DB
	public static void insertUserNameDetails_DSCSIFY(String pancardNumber, String name, String randomUsername,
			String password, String ticketId) {
		MongoClient mongoClient = MongoClients
				.create("mongodb://local_automation_user:DenTErimpOre@192.168.9.68:7750/VS_ProcessAutomation");
		MongoDatabase vsDB = mongoClient.getDatabase("VS_ProcessAutomation");
		MongoCollection<Document> reports = vsDB.getCollection("DSC_Sify_UsernameDatabase");
		Document report = new Document();
		report.append("pancardNumber", pancardNumber);
		report.append("name", name);
		report.append("Username", randomUsername);
		report.append("password", password);
		report.append("ticketId", ticketId);
		reports.insertOne(report);

	}

	public static Map<String, String> fetchCardDetails(String userName) {
		Map<String, String> dataMap = new HashMap<String, String>();
		MongoClient mongoClient = MongoClients
				.create("mongodb://local_automation_user:DenTErimpOre@192.168.9.68:7750/VS_ProcessAutomation");
		MongoDatabase vsDB = mongoClient.getDatabase("VS_ProcessAutomation");
		MongoCollection<Document> collection = vsDB.getCollection("cardDetails");
		Document query = new Document("users", userName);
		List results = new ArrayList<>();
		collection.find(query).into(results);
		Document document = (Document) results.get(0);
		dataMap.put("cardNumber", document.get("cardNumber").toString());
		dataMap.put("validity", document.get("validity").toString());
		dataMap.put("cvv", document.get("cvv").toString());
		dataMap.put("name", document.get("name").toString());
		dataMap.put("cardName", document.get("cardName").toString());
		return dataMap;
	}

	public static void clickElement(String name, WebDriver driver, By by) {
		driver.findElement(by).click();

	}

	public static void sendKeys(String name, String content, WebDriver driver, By by) {
		if (content.equals("empty")) {
			content = "";
		}
		driver.findElement(by).sendKeys(content);

	}

	public static void gettingPDFFromAPI(String URL, String PathToSave) throws IOException {
		URL url = new URL(URL);
		System.out.println(url);
		InputStream in = url.openStream();
		FileOutputStream fos = new FileOutputStream(new File(PathToSave));
		int length = -1;
		byte[] buffer = new byte[1024];
		while ((length = in.read(buffer)) > -1) {
			fos.write(buffer, 0, length);
		}
		fos.close();
		in.close();
	}

	public static void logger(Map<String, String> dataMap, String ticketId, String type, String page, String message) {
		String environment = dataMap.get("environment").toString();
		String serviceName = dataMap.get("serviceName");
		// insertLogIntoMongoDB(ticketId, type, page, message, dataMap);
		if (environment.equals("https://helpdesk.vakilsearch.com") || environment.equals("https://crm.vakilsearch.com")
				|| environment.equals("https://newopscrm.vakilsearch.com") || environment.equals("")) {
			environment = "Live";
		} else {
			environment = "QE";
		}
		logger.info(environment + "-" + serviceName + "-" + type + "-" + ticketId + "-" + message);
	}

	public static void errorParsingLogger(String message, String serviceName) {
		// insertErrorParsingLogsIntoMongoDB(message, serviceName);
		logger.info(serviceName + "-" + message);
	}

	public static void gstInfoLog(String ticketId, String message) {
		logger.info(ticketId + "-" + message);
	}

	public static void sendStatusToGroup(String message) {
		String k = "https://chat.googleapis.com/v1/spaces/AAAAYzXiwz0/messages";
		RestAssured.baseURI = k;
		RequestSpecification httpRequest = RestAssured.given();
		JsonObject requestParams = new JsonObject();
		requestParams.addProperty("text", message);
		httpRequest.queryParam("key", "AIzaSyDdI0hCZtE6vySjMm-WEfRq3CPzqKqqsHI");
		httpRequest.queryParam("token", "FluA5pFoNjSsrmsqW703N9MKfXtYYfjNIvEwMgoO69w=");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParams.toString());
		Response response = httpRequest.request(Method.POST);
	}

	public static void enterText(WebDriver driver, String xpath, String value, WebDriverWait wait) {
		System.out.println(xpath);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).sendKeys(value);

	}

	public static String chooseBankAccountForPayment(String serviceName) {
		MongoClient mongoClient = MongoClients
				.create("mongodb://local_automation_user:DenTErimpOre@192.168.9.68:7750/VS_ProcessAutomation");
		MongoDatabase vsDB = mongoClient.getDatabase("VS_ProcessAutomation");
		MongoCollection<Document> collection = vsDB.getCollection("BankPaymentMapping");
		Document query = new Document("serviceName", serviceName);
		List results = new ArrayList<>();
		collection.find(query).into(results);
		Document document = (Document) results.get(0);
		return document.getString("bankAccount");

	}
	
	public static void selectByVisibleText (WebDriver driver ,String xpath,String option) {
		Select sel = new Select(driver.findElement(By.xpath(xpath)));
		sel.selectByVisibleText(option);
	}

	public static String checkWetherAutoOtpFetch() {
		MongoClient mongoClient = MongoClients
				.create("mongodb://local_automation_user:DenTErimpOre@192.168.9.68:7750/VS_ProcessAutomation");
		MongoDatabase vsDB = mongoClient.getDatabase("VS_ProcessAutomation");
		MongoCollection<Document> collection = vsDB.getCollection("AutoFetchOtp");
		List results = new ArrayList<>();
		collection.find().into(results);
		Document document = (Document) results.get(0);
		return document.get("isOtpAutoFetch").toString();
	}

}