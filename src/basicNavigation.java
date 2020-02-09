import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/*
 * The test will goto Preferences
 * Select option 3. Preference dependencies
 * Select the WiFi checkbox
 * Then select WiFi settings
 * Insert "Hello" text and click OK
 */

public class basicNavigation extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		
		driver.findElementById("android:id/checkbox").click();
		
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
	}	

}
