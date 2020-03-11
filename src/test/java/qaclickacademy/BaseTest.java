package qaclickacademy;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {

    public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
        File f = new File("src/test/java");
        File fs = new File (f,"ApiDemos-debug.apk");

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Devices");

        //cap.setCapability(MobileCapabilityType.UDID, "ZX1G22L9TK");
        //cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        //cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
        cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.quit();
        return driver;

    }


}
