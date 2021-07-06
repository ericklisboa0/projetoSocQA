package projetoSocQA.core;

import static projetoSocQA.core.DriverFactory.initChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class DSL {

	public void encontraElemento(String caminho) {
		initChromeDriver().findElement(By.xpath(caminho));
	}
	
	public void clicaElemento(String caminho) {
		initChromeDriver().findElement(By.xpath(caminho)).click();
	}

	public void escrevePesquisa(String campo, String pesquisa) {
		initChromeDriver().findElement(By.xpath(campo)).sendKeys(pesquisa);
	}

	public void clicaBotao(String caminho) {
		initChromeDriver().findElement(By.xpath(caminho)).submit();
	}
	
	public void executaScriptEClica(String caminho) {
		WebElement element = initChromeDriver().findElement(By.xpath(caminho));
		JavascriptExecutor js = (JavascriptExecutor)initChromeDriver();
		js.executeScript("arguments[0].click()", element);
	}

}
