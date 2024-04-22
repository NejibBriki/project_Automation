@signIn
Feature: Connexion
  ETQ utilisateur je souhaite se connecter avec un compte valide et avec un compte non valide

  Background: 
    Given Je visite l'application automationexercise
    Then page home est bien affiche
    When Je clique sur bouton  Login
    Then page de connexion est bien affiche

  @compteValide
  Scenario Outline: je souhaite me connecter avec un compte valide
    When je saisis une adresse mail valide "<email>"
    And je saisi un password valide "<password>"
    And je clique sur le bouton login
    Then je verifie si je suis bien connecté

    Examples: 
      | email                   | password  |
      | nejib.briki88@gmail.com | Azerty123 |

  @compteNonValide
  Scenario Outline: je souhaite me connecter avec un compte non valide
    When je saisis une adresse mail non valide "<email>"
    And je saisi un password non valide "<password>"
    And je clique sur le bouton login
    Then je verifie si Your email or password is incorrect!' est visible

    Examples: 
      | email                 | password |
      | nejib.briki@gmail.com | Azerty1  |
