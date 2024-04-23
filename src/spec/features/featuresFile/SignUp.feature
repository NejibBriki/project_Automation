@createUser
Feature: Creation d'un nouveau utilisateur
  ETQ utilisateur je souhaite creer un nouveau utilisateur

  @remplirFormulaireSignUp
  Scenario Outline: je souhaite creer un nouveau utilisateur
    Given Je visite l'application automationexercise
    Then page home est bien affiche
    When Je clique sur bouton  Login
    Then page de creation est bien affiche
    When Je saisis le nom "<nom>"
    And Je saisis le mail "<email>"
    And je clique su Signup
    Then je verifie si ENTER ACCOUNT INFORMATION est visible
    When je clique sur Mr
    And Je saisis le password "<password>"
    And je saisis uen date d'anniversaire
    And je clique sur Sign up for our newsletter!
    And je clique sur Receive special offers from our partners
    And Je saisis le first name  "<firstName>"
    And Je saisis le last name "<lastName>"
    And Je saisis company "<company>"
    And Je saisis Adresse  "<adresse>"
    And Je saisis Adresse 2  "<adresse2>"
    And Je saisis State "<state>"
    And Je saisis City   "<city>"
    And Je saisis ZipCode "<zipCode>"
    And Je saisis Number Mobile "<tel>"
    And je clique sur Create Account button
    Then je verifie le message ACCOUNT CREATED! si il est visible
    When je clique sur Continue
    Then je verifie si Logged in as username est visible
    When je clique sur Delete Account
    Then je verifie le message ACCOUNT DELETED!
    And je clique continue

    Examples: 
      | nom   | email                  | password  | firstName | lastName | company | adresse                         | adresse2                        | state  | city   | zipCode | tel      |
      | nejib | nejib.bri@gmail.com | Azerty123 | Nejib     | Briki    | Ariana  | 02 , rue ali bouchoucha, Ariana | 02 , rue ali bouchoucha, Ariana | Ariana | Ariana |    2080 | 22967516 |
