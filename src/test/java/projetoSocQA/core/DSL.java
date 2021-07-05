package projetoSocQA.core;

import static projetoSocQA.core.DriverFactory.initChromeDriver;

import org.openqa.selenium.By;


public class DSL {

	public void clicaElemento(String caminho) {
		initChromeDriver().findElement(By.xpath(caminho)).click();
	}

	public void encontraElemento(String caminho) {
		initChromeDriver().findElement(By.xpath(caminho));
	}

	public void escrevePesquisa(String campo, String pesquisa) {
		initChromeDriver().findElement(By.xpath(campo)).sendKeys(pesquisa);
	}

	public void clicaBotao(String caminho) {
		initChromeDriver().findElement(By.xpath(caminho)).submit();
	}

}
