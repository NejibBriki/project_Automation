@contactUs
Feature: Contact
  ETQ utilisateur je souhaite envoyer un message

  @contactUsForm
  Scenario Outline: je souhaite envoyer un message
    Given Je visite l'application automationexercise
    Then page home est bien affiche
    When Je clique sur bouton  contact
    Then verifier GET IN TOUCH est visible
    When je saisis le nom "<nom>"
    And je saisi le mail "<email>"
    And je saisi le sujet "<subject>"
    And je saisi le message "<message>"
    And je telecharge un fichier "<path>"
    And je clique sur le bouton submit
    And je clique sur le bouton OK
    Then je verifie Success! Your details have been submitted successfully. est visible
    When je clique sur Home
    Then page home est bien affiche

    Examples: 
      | nom  | email                   | subject | message | path                                                                                                                                       |
      | test | nejib.briki88@gmail.com | test    | test    |C:\\Users\\BRIKINejib\\OneDrive - novencia group\\Bureau\\Formation Procervices\\Formation zied hannachi\\Selenium level 1\\testUpload.txt |
