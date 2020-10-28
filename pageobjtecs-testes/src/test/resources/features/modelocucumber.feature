#Author josepauloluizjr@gmail.com


#Funcionalidade a ser testada
@regressivos
Feature: Pesquisa no google
  Como usuario quero pesquisar no google para obter informações

  @regressivos
  Scenario: Pesquisar E2E Treinamentos
    Given que eu esteja no site "https://www.google.com.br"
    When pesquisar "E2E treinamentos"
    Then informações da escola são apresentadas

  @regressivos
  Scenario: Pesquisar Bradesco
    Given que eu esteja no site "https://www.google.com.br"
    When pesquisar "Bradesco"
    Then sistema exibe informações do Bradesco

  @release
  Scenario: Pesquisar Itau
    Given que eu esteja no site "https://www.google.com.br"
    When pesquisar "Itau"
    Then sistema exibe informações do Itau
