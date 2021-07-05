Feature:: Projeto QA

Background:
Given abre o navegador e acessa o portal da soc "https://www.soc.com.br/blog/"

@busca
Scenario: busca sem resultado
When faz uma busca sem resultado de "projeto QA Analyst"
Then verifica se a busca foi sem resultados "Nenhum resultado encontrado"

@busca
Scenario: busca sem resultado
When faz uma busca bem sucedida de "Farmacia"
Then verifica se a busca foi concluida