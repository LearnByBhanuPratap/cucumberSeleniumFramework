
package com.cucumber.framework.configuration.browser;

import java.io.File;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.cucumber.framework.utility.DateTimeHelper;
import com.cucumber.framework.utility.ResourceHelper;

public class PhantomJsBrowser {
	public PhantomJSDriverService getPhantomJsService() {
		return new PhantomJSDriverService.Builder().usingAnyFreePort()
				.usingPhantomJSExecutable(new File(ResourceHelper.getResourcePath("driver/phantomjs.exe")))
				.withLogFile(new File(ResourceHelper.getResourcePath("logs/phantomjslogs/") + "phantomjslogs"
						+ DateTimeHelper.getCurrentDateTime() + ".log"))
				.build();

	}

	public Capabilities getPhantomJsCapability() {
		DesiredCapabilities cap = DesiredCapabilities.phantomjs();
		cap.setJavascriptEnabled(true);
		return cap;
	}

	public WebDriver getPhantomJsDriver(PhantomJSDriverService sev, Capabilities cap) {

		return new PhantomJSDriver(sev, cap);
	}

}
