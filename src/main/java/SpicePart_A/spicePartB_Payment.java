package SpicePart_A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.json.JSONObject;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import io.restassured.path.json.JsonPath;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;



import java.io.InputStream;
import java.io.InputStreamReader;
import Wrappers.CommonFunctions;
import Wrappers.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.path.json.JsonPath;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

//@Path("/spicePartBUpload")
public class spicePartB_Payment {
	

	public static WebDriverWait wait;

	CommonFunctions commonFunctions = new CommonFunctions();
		
		
	 

@Test
	public void run() throws InterruptedException, FindFailed {


//	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get(
			"https://chromewebstore.google.com/detail/requestly-intercept-modif/mdnleldcmiljblolnjhpnblkcekpdkpa");
	WebDriverWait wait = new WebDriverWait(driver, 100);
	driver.manage().window().maximize();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add to Chrome']"))).click();
	Screen screen = new Screen();
	Pattern addExtension = new Pattern("\\\\14.140.167.188\\Vakilsearch\\Automation_Documents\\Add_extension.png");
	Pattern QAEngineer = new Pattern("\\\\14.140.167.188\\Vakilsearch\\Automation_Documents\\QAEngineer.png");
	Pattern CancelRequest = new Pattern("\\\\14.140.167.188\\Vakilsearch\\Automation_Documents\\Cancel_request.png");

	Thread.sleep(2000);
	screen.wait(addExtension, 20);
	screen.click(addExtension);

	Thread.sleep(6000);

	Set<String> windowHandles = driver.getWindowHandles();

	String[] handles = windowHandles.toArray(new String[0]);
	driver.switchTo().window(handles[1]);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Skip for now ']"))).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-autocomplete='list']"))).click();
	Thread.sleep(2000);
	screen.wait(QAEngineer, 20);
	screen.click(QAEngineer);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Proceed']"))).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Skip for now ']"))).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create new Rule']"))).click();

	Thread.sleep(2000);
	screen.wait(CancelRequest, 20);
	screen.click(CancelRequest);

	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create Rule']"))).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@aria-label='Skip']"))).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='example']")));

	driver.findElement(By.xpath("//input[@placeholder='example']"))
			.sendKeys("https://cdn.jsdelivr.net/npm/disable-devtool");
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Add a new condition']"))).click();

	Thread.sleep(2000);

	driver.findElement(By.xpath("(//input[@placeholder='example'])[2]"))
			.sendKeys("https://www.mca.gov.in/etc.clientlibs/mca/clientlibs/clientlib-devtool.js");
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Add a new condition']"))).click();

	Thread.sleep(2000);

	driver.findElement(By.xpath("(//input[@placeholder='example'])[3]"))
			.sendKeys("https://www.mca.gov.in/content/dam/csr/icons/captcha.jpg");
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='*Save rule']"))).click();
	
	driver.close();
	driver.switchTo().window(handles[0]);

	driver.get("https://www.mca.gov.in/content/mca/global/en/foportal/fologin.html");
        	
        
        
		try {

			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			// Create a new instance of WebDriverWait
			wait = new WebDriverWait(driver, 100);

			// Set up dataMap
//	            Map<String, String> dataMap = new HashMap<>(); 
//	            dataMap.put("totalCount", "5");
//	            dataMap.put("uploadTickets" + "i" + "agentEmail", "kaviyapriya.aravindhan@vakilsearch.com");
//	            dataMap.put("uploadTickets" + "i" + "mcaUserName", "hamiltonvs");
//	            dataMap.put("uploadTickets" + "i" + "mcaPassword", "Vakil@123");
//	            dataMap.put("uploadTickets" + "i" + "srnNumber", "");
//	            dataMap.put("uploadTickets" + "i" + "serviceId", "32");
//	            dataMap.put("uploadTickets" + "i" + "ticketId", "3746960");
//	            dataMap.put("uploadTickets" + "i" + "companyName", "DRAGONFASHION COLLECTION PRIVATE LIMITED");

//			Map<String, String> dataMap = new HashMap<>();
//			String[][] value = { { "gayathri.n@vakilsearch.com", "gayathri.n@vakilsearch.com", "Vakil@321", "AA6740783",
//					"32", "3893069", "" },
					// {"khaleelahamed.r@vakilsearch.com",
					// "bhavanivs","Vakil@321","AA6681510","32","2265796",""},
//	        		{"khaleelahamed.r@vakilsearch.com", "chitravs20","Vakil@123","AA6671827","32","3905993",""},
//	        		{"khaleelahamed.r@vakilsearch.com", "sathya@vakilsearch.com","Sathya_!23","AA6755326","32","3922725",""},

		//	};
			
//				dataMap.put("SPICE_Part_B_Upload_File", "\\\\14.140.167.188\\Vakilsearch\\Spice_Plus\\"
//						+ dataMap.get("uploadTickets" + "i" + "ticketId") + "\\SPICE_Part_B");
//				dataMap.put("AGILE_PRO_Upload_File", "\\\\14.140.167.188\\Vakilsearch\\Spice_Plus\\"
//						+ dataMap.get("uploadTickets" + "i" + "ticketId") + "\\AGILE_PRO.pdf");
//				dataMap.put("INC_34_Upload_File", "\\\\14.140.167.188\\Vakilsearch\\Spice_Plus\\"
//						+ dataMap.get("uploadTickets" + "i" + "ticketId") + "\\AOA.pdf");
//				dataMap.put("INC_33_Upload_File", "\\\\14.140.167.188\\Vakilsearch\\Spice_Plus\\"
//						+ dataMap.get("uploadTickets" + "i" + "ticketId") + "\\MOA.pdf");
//				dataMap.put("INC_9_Upload_File", "\\\\14.140.167.188\\Vakilsearch\\Spice_Plus\\"
//						+ dataMap.get("uploadTickets" + "i" + "ticketId") + "\\INC-9.pdf");
			
//	            for (int i = 0; i < value.length && i < 2; i++) {
//	                // Set the values in the dataMap with appropriate keys
//	                dataMap.put("uploadTickets" + "i" + "agentEmail", value[i][0]);
//	                dataMap.put("uploadTickets" + "i" + "mcaUserName", value[i][1]);
//	                dataMap.put("uploadTickets" + "i" + "mcaPassword", value[i][2]);
//	                dataMap.put("uploadTickets" + "i" + "srnNumber", value[i][3]);
//	                dataMap.put("uploadTickets" + "i" + "serviceId", value[i][4]);
//	                dataMap.put("uploadTickets" + "i" + "ticketId", value[i][5]);
//	                dataMap.put("uploadTickets" + "i" + "companyName", value[i][6]);
//	                dataMap.put("uploadTickets" + "i" + "SPICE_Part_B_Upload_File", value[i][7]);
//	                dataMap.put("uploadTickets" + "i" + "AGILE_PRO_Upload_File", value[i][8]);
//	                dataMap.put("uploadTickets" + "i" + "INC_34_Upload_File", value[i][9]);
//	                dataMap.put("uploadTickets" + "i" + "INC_33_Upload_File", value[i][10]);
//	                dataMap.put("uploadTickets" + "i" + "INC_9_Upload_File", value[i][10]);
//	                

//	    		dataMap.put("SPICE_Part_B_Upload_File", "\\\\14.140.167.188\\Vakilsearch\\Spice_Plus\\"+ dataMap.get("uploadTickets" + "i" + "ticketId")+"\\SPICE_Part_B");
//	    		dataMap.put("AGILE_PRO_Upload_File", "\\\\14.140.167.188\\Vakilsearch\\Spice_Plus\\"+ dataMap.get("uploadTickets" + "i" + "ticketId")+"\\AGILE_PRO.pdf");
//	    		dataMap.put("INC_34_Upload_File","\\\\14.140.167.188\\Vakilsearch\\Spice_Plus\\"+ dataMap.get("uploadTickets" + "i" + "ticketId")+"\\AOA.pdf");
//	    		dataMap.put("INC_33_Upload_File", "\\\\14.140.167.188\\Vakilsearch\\Spice_Plus\\"+ dataMap.get("uploadTickets" + "i" + "ticketId")+"\\MOA.pdf");
//	    		dataMap.put("INC_9_Upload_File", "\\\\14.140.167.188\\Vakilsearch\\Spice_Plus\\"+ dataMap.get("uploadTickets" + "i" + "ticketId")+"\\INC-9.pdf");

			spicePartB_PaymentDetails spice = new spicePartB_PaymentDetails();
			spice.main(driver, wait);
			// }
		} catch (Exception ex) {
			Utilities.errorParsingLogger(ex.toString(), "Spice_Part_A");
			ex.printStackTrace();
		}
//		}
		//
		// });
		// } catch (Exception e) {
		// Utilities.errorParsingLogger("Error Parsing: - " + e + "", serviceName);
		// e.printStackTrace();
		// }
		//
		// return Response.status(Response.Status.OK).entity("Successfully started
		// automation process!!!!").build();
		// }

	}

}
