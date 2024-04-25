@createUserWithMailInvalid
Feature: Creation d'un nouveau utilisateur avec un mail existant
  ETQ utilisateur je souhaite creer un nouveau utilisateur avec un mail existant

  @remplirFormulaireWithMailInvalid
  Scenario Outline: je souhaite creer un nouveau utilisateur avec un mail existant
    Given Je visite l'application automationexercise
    Then page home est bien affiche
    When Je clique sur bouton  Login
    Then page de creation est bien affiche
    When Je saisis le nom "<nom>"
    And Je saisis le mail "<email>"
    And je clique su Signup
    Then je verifie Email Address already exist! est visible

    Examples: 
      | nom   | email               |
      | nejib | nejib.briki88@gmail.com |
