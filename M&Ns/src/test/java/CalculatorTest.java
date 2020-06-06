import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {

    //WebDriver driver;
    static AppiumDriver<MobileElement> driver;
    //AndroidDriver driver2;

    public static void main(String[]args) {
        try {
            openCalculator();

        }catch(Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }

    }

    public static void openCalculator() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "DigitalPixel");
//        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");
        cap.setCapability("appPackage", "com.google.android.calculator");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);

        MobileElement eight = driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
        eight.click();

        MobileElement blankSpace = driver.findElement(By.id("com.google.android.calculator:id/formula"));


        System.out.println(blankSpace.getAttribute("text"));




    }
}
