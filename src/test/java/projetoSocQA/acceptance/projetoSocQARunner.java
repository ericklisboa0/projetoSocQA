package projetoSocQA.acceptance;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", 
	//tags = "@BuscaCred",
	glue = {"projetoSocQA.acceptance.steps"},
	plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"},
	dryRun = false, monochrome = false)

public class projetoSocQARunner {

}
