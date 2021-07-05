package projetoSocQAPageObject;

import static projetoSocQA.core.DriverFactory.initChromeDriver;

import org.openqa.selenium.By;
import projetoSocQA.core.BasePage;

public class BuscaPage extends BasePage{
	
	public void pesquisar(String pesquisa) {
		dsl.escrevePesquisa("/html/body/div[2]/div/div/section[1]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/form/div/input", pesquisa);
		dsl.clicaBotao("/html/body/div[2]/div/div/section[1]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/form/div/input");
	}
	
	public String verificarTexto() {
		if(initChromeDriver().findElements(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div/div/div/div/div")).size() <= 0) {
			return null;
		}
		return initChromeDriver().findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div/div/div/div/div/div/div/div")).getText();
	}

}
