Feature:: Projeto QA

Background:
Given Acessa pagina inicial da soc "https://www.soc.com.br/"

@BuscaCred
Scenario Outline: busca sem sucesso a um credenciado
When faz uma busca de letras, numero, caracteres e em branco em credenciado e sem resultado de '<pesquisa>'
Then verifica se a busca de credenciado foi sem resultados "Nenhum resultado encontrado"

Examples:
|  pesquisa  |
|  jhijbds   |
|  215165    |
|  !!&@%)    |
|            |

@BuscaCred
Scenario: busca de sucesso a um credenciado
When faz uma busca bem sucedida de credenciado "Santos"
When acessa o primeiro perfil
Then verifica se a busca de credenciado foi concluida