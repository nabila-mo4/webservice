@tag
Feature: tester mon webservice
  

  @tag1
  Scenario: Title of your scenario
    Given ton service est démarré
    When ton envoies la chaine « YES_I_CAN »
    Then tu reçois la chaîne « YES_I_CAN_AND_DID_IT »
    When tu envoies une chaine nulle
    Then tu reçois « NOTHING_TO_SAY »
  