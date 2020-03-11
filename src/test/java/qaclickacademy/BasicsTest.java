package qaclickacademy;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjet.HomePage;
import pageObjet.Preferences;


public class BasicsTest extends BaseTest {
    public static void main(String args []) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver =  Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        HomePage h=new HomePage(driver);
        h.Preferences.click();
        
        Preferences p=new Preferences(driver);
        
       //driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        p.dependencies.click();
        //driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
       
        
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
      driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
       // driver.findElementsByClassName("android.widget.Button").get(1).click();
      p.ds.get(1).click();
    }
}

