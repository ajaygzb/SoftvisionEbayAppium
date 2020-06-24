package base;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumService {
	
	private AppiumDriverLocalService service;
	private AppiumServiceBuilder builder;
	private DesiredCapabilities cap;
	private int port = 4723;
	protected static URL appiumServerURL;
	public static String primary,secondary;
	
	
	@BeforeSuite	
	public void startServer() {

		System.out.println("-----------------------Start Appium Service--------------------------------");
		cap = new DesiredCapabilities();
		cap.setCapability("noReset", false);
		AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		appiumServerURL=service.getUrl();
		
		
		
		 
	}

	
	/* @AfterSuite public void stopServer() { service.stop(); } */
	 


}
