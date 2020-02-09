import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/*
 * This class will test the drag and drop functionality with parameterization 
 * The test will goto Views
 * Select option Drag and Drop
 * Longpress on a dot and drag and drop over another
 */

public class basicFunctionality extends base{

	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities("real");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		TouchAction t = new TouchAction(driver);
		WebElement source = driver.findElementsByClassName("android.view.View").get(0);
		WebElement destination = driver.findElementsByClassName("android.view.View").get(2);
		
		t.longPress(element(source)).moveTo(element(destination)).release().perform();
	}

}
