package projetoSocQA.acceptance.steps;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projetoSocQA.core.DriverFactory;
import projetoSocQAPageObject.BuscaCredenciadoPage;

public class BuscaCredenciadoSteps {
	BuscaCredenciadoPage driver = new BuscaCredenciadoPage();

	@After("@BuscaCred")
	public void tearDown(Scenario scenario) {
		BuscaCredenciadoPage.tearDown(scenario);
	}

	// Primeiro teste de busca a credenciados
	
	@Given("Acessa pagina inicial da soc {string}")
	public void acessa_pagina_inicial_da_soc(String url) {
		driver.inicializar(url);
	}

	@When("faz uma busca de credenciado sem resultado de {string}")
	public void faz_uma_busca_de_credenciado_sem_resultado_de(String pesquisa) {
		driver.acessarCredenciados(pesquisa);
		driver.enviarPesquisa();
	}
	
	@Then("verifica se a busca de credenciado foi sem resultados {string}")
	public void verifica_se_a_busca_de_credenciado_foi_sem_resultados(String string) {
		Assert.assertEquals(string, DriverFactory.initChromeDriver().findElement(By.xpath("/html/body/div/div/section[2]/div[2]/div/p")).getText());
	}

	// Segundo teste de busca a credenciados

	@When("faz uma busca bem sucedida de credenciado {string}")
	public void faz_uma_busca_bem_sucedida_de_credenciado(String pesquisa) {
		driver.acessarCredenciados(pesquisa);
	}
	
	@When("acessa o primeiro perfil")
	public void acessa_o_primeiro_perfil() {
		driver.sugestaoPesquisa();
		driver.acessarPerfil();
	}

	@Then("verifica se a busca de credenciado foi concluida")
	public void verifica_se_a_busca_de_credenciado_foi_concluida() throws IOException {
		Assert.assertEquals("https://socnet.soc.com.br/perfil", DriverFactory.initChromeDriver().getCurrentUrl());
	}
}
