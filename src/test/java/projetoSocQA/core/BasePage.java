package projetoSocQA.core;

import static projetoSocQA.core.DriverFactory.initChromeDriver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class BasePage {

	protected DSL dsl;

	public void inicializar(String url) {
		initChromeDriver().navigate().to(url);
		dsl = new DSL();
	}

	@After
	public static void tearDown(Scenario scenario) {
		try {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			if (scenario.isFailed()) {
				Thread.sleep(1000);
				scenario.log("mensagem de erro");
				TakesScreenshot ts = (TakesScreenshot) initChromeDriver();
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", screenshotName);
			}
			DriverFactory.killDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
