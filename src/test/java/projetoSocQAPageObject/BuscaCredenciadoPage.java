package projetoSocQAPageObject;

import static projetoSocQA.core.DriverFactory.initChromeDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import projetoSocQA.core.BasePage;


public class BuscaCredenciadoPage extends BasePage {
	
	public void acessarCredenciados(String pesquisa) {
		initChromeDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dsl.executaScriptEClica("/html/body/div[2]/div/div/section[2]/div/div/div/div/div/section/div/div/div/div/div/div/div/section/div/div[2]/div/div/div[3]/div/div/a");
		
		dsl.clicaElemento("/html/body/div[2]/div/div/section[1]/div/div/div/div/div/section/div/div/div/div/div/div[4]/div/div/a");
		
		//selecionando filtros
		dsl.clicaElemento("/html/body/div/div/section[1]/div[3]/section/div[1]/label/span[1]");
		dsl.clicaElemento("/html/body/div/div/section[1]/div[3]/section/div[2]/label/span[1]");
		dsl.escrevePesquisa("/html/body/div/div/section[2]/div[1]/div[1]/form/div/div[1]/input", pesquisa);
	}
	
	public void sugestaoPesquisa() {
		initChromeDriver().findElement(By.id("PlacesAutocomplete__suggestion-ChIJOxw7PEIDzpQRT2Rj_O3OTVg")).click();
	}
	
	public void enviarPesquisa() {
		dsl.clicaBotao("/html/body/div/div/section[2]/div[1]/div[1]/form/div/div[1]/input");
	}
	
	public void acessarPerfil() {
		dsl.executaScriptEClica("/html/body/div/div/section[2]/div[3]/div[1]/div/div[1]/div/section/div[2]/a/button");
	}

}
