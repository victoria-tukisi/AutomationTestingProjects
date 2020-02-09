import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;



public class base {

	public static AndroidDriver<AndroidElement> Capabilities(String device) throws MalformedURLException
	{
		AndroidDriver<AndroidElement>  driver;
		File f = new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");
		//File fs = new File(f,"android-ump-mobile-debug-67a35ff.apk");		
				
		DesiredCapabilities cap = new DesiredCapabilities();
		if(device.equals("emulator"))
		{
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "DemoEmulator8.1");
		}
		else if(device.equals("real"))
		{
			//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Hisense C30 Lite");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Victoria-Phone");
		}
	     cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}

}
