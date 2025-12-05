# language: en
Feature: Gerenciamento de Favoritos

  Scenario: Adicionar produto aos favoritos
    Given que estou visualizando o produto "Cachaça Premium"
    When eu clicar em "Adicionar aos favoritos"
    Then o produto deve aparecer na lista de meus favoritos
