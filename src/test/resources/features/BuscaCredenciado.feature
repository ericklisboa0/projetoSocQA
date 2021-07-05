Feature:: Projeto QA

Background:
Given Acessa pagina inicial da soc "https://www.soc.com.br/"

@BuscaCred
Scenario: busca sem sucesso a um credenciado
When faz uma busca de credenciado sem resultado de "jx15sdaz"
Then verifica se a busca de credenciado foi sem resultados "Nenhum resultado encontrado"

@BuscaCred
Scenario: busca de sucesso a um credenciado
When faz uma busca bem sucedida de credenciado "Santos"
When acessa o primeiro perfil
Then verifica se a busca de credenciado foi concluida