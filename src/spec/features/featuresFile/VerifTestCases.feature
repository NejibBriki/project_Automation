@verifTestCases
Feature: Test cases
  ETQ utilisateur je souhaite verifier la page test cases

  @verifTestCases
  Scenario Outline: je souhaite verifier la page test cases
    Given Je visite l'application automationexercise
    Then page home est bien affiche
    When je clique sur le bouton test cases
    Then je verifie si je navigue sur la page de test cases