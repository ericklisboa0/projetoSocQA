package projetoSocQA.acceptance.steps;

import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projetoSocQAPageObject.BuscaPage;

public class BuscaSteps {
	BuscaPage driver = new BuscaPage();

	@After("@busca")
	public void tearDown(Scenario scenario) {
		BuscaPage.tearDown(scenario);
	}
	
	//primeiro cenario de busca
	
	@Given("abre o navegador e acessa o portal da soc {string}")
	public void abre_e_acessa(String url){
		driver.inicializar(url);
	}

	@When("faz uma busca sem resultado de {string}")
	public void faz_uma_busca_sem_resultado_de(String pesquisa) { 
		driver.pesquisar(pesquisa);
	}

	@Then("verifica se a busca foi sem resultados {string}")
	public void verifica_se_a_busca_foi_sem_resultados(String mensagem) {
		Assert.assertEquals(mensagem + "a", driver.verificarTexto());
	}
	
	//segundo cenario de busca

	@When("faz uma busca bem sucedida de {string}")
	public void faz_uma_busca_bem_sucedida_de(String pesquisa) {
		driver.pesquisar(pesquisa);
	}
	
	@Then("verifica se a busca foi concluida")
	public void verifica_se_a_busca_foi_concluida() {
		Assert.assertEquals("a" , driver.verificarTexto());
	}
}
