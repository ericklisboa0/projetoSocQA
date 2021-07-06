Feature:: Projeto QA

Background:
Given abre o navegador e acessa o portal da soc "https://www.soc.com.br/blog/"

@busca
Scenario Outline: busca sem resultado
When faz uma busca sem resultado de '<pesquisa>'
Then verifica se a busca foi sem resultados "Nenhum resultado encontrado"

Examples:
|  pesquisa  |
|  jhijbds   |
|  215165    |
|  !!&@%)    |

@busca
Scenario: busca com resultado
When faz uma busca bem sucedida de "Farmacia"
Then verifica se a busca foi concluida