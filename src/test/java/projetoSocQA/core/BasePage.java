package projetoSocQA.core;

import static projetoSocQA.core.DriverFactory.initChromeDriver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.Scenario;

public class BasePage {

	protected DSL dsl;

	public void inicializar(String url) {
		initChromeDriver().navigate().to(url);
		dsl = new DSL();
	}

	/*
	 * public static void tearDown(Scenario scenario) { try { String screenshotName
	 * = scenario.getName(); if (scenario.isFailed()) {
	 * scenario.log("mensagem de erro"); TakesScreenshot ts = (TakesScreenshot)
	 * initChromeDriver(); byte[] byteScreenshot =
	 * ts.getScreenshotAs(OutputType.BYTES); scenario.attach(byteScreenshot,
	 * "image/png", screenshotName); } DriverFactory.killDriver();
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } }
	 */

	public static void tearDown(Scenario scenario) {

		String screenshotName = scenario.getName();
		scenario.log("mensagem de erro");
		TakesScreenshot ts = (TakesScreenshot) initChromeDriver();
		byte[] byteScreenshot = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(byteScreenshot, "image/png", screenshotName);

		DriverFactory.killDriver();

	}
}
