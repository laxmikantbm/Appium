package com.brillio.phone;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class RunCamera {
	
	AppiumDriver<MobileElement> driver;
	
	
	@BeforeClass
	public void setup() throws MalformedURLException {
		DesiredCapabilities  cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "One Plus 6");
		cap.setCapability("udid", "711ef9c1");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", " com.oneplus.camera");
		cap.setCapability("appActivity", "com.oneplus.camera.OPCameraActivity");
		cap.setCapability("noReset", "true");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
	}
	@Test
	public void testCalculator() {
		System.out.println("open the Camera Application");
		driver.findElement(By.id("com.oneplus.camera:id/switch_camera_button")).click();
		driver.findElement(By.id("com.oneplus.camera:id/primary_capture_button")).click();
		
	}
	
	
	
	

}
