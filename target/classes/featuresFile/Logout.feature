@logout
Feature: Deconnexion
  ETQ utilisateur je souhaite me deconnecter

  @logout
  Scenario Outline: je souhaite me deconnecter
    Given Je visite l'application automationexercise
    Then page home est bien affiche
    When Je clique sur bouton  Login
    Then page de connexion est bien affiche
     When je saisis une adresse mail valide "<email>"
    And je saisi un password valide "<password>"
    And je clique sur le bouton login
    Then je verifie si je suis bien connecté
    When je clique sur logout
     Then page de connexion est bien affiche
    
     Examples: 
      | email                   | password  |
      | nejib.briki88@gmail.com | Azerty123 |