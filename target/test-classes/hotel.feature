Feature: validating hotel application

  Scenario Outline: validating hotel application to generate order id
    Given user is on hotel login page
    When user enters "<username>" and "<password>"
    And click login button
    When user enters "<location>"
    And click search button
    When user select the hotel
    And click continue button
    When user enters "<firstName>", "<lastName>", "<address>", "<cardNo>", "<cardType>", "<cardDate>", "<cardYear>" and "<ccvNumber>"
    And click book now button
    Then user is getting the order no

    Examples: 
      | username        | password  | location | firstName | lastName | address | cardNo           | cardType | cardDate | cardYear | ccvNumber |
      | nejusathiyadas1 | 987654321 | Sydney   | xxxx      | yyyy     | zzzz    | 9875642013698521 | VISA     | February |     2022 |       564 |
      | nejusathiyadas1 | 987654321 | Sydney   | xxxx      | yyyy     | zzzz    | 9875642013698521 | VISA     | February |     2022 |       564 |
      | nejusathiyadas1 | 987654321 | Sydney   | xxxx      | yyyy     | zzzz    | 9875642013698521 | VISA     | February |     2022 |       564 |
      | nejusathiyadas1 | 987654321 | Sydney   | xxxx      | yyyy     | zzzz    | 9875642013698521 | VISA     | February |     2022 |       564 |
      | nejusathiyadas1 | 987654321 | Sydney   | xxxx      | yyyy     | zzzz    | 9875642013698521 | VISA     | February |     2022 |       564 |
      | nejusathiyadas1 | 987654321 | Sydney   | xxxx      | yyyy     | zzzz    | 9875642013698521 | VISA     | February |     2022 |       564 |
      | nejusathiyadas1 | 987654321 | Sydney   | xxxx      | yyyy     | zzzz    | 9875642013698521 | VISA     | February |     2022 |       564 |
      | nejusathiyadas1 | 987654321 | Sydney   | xxxx      | yyyy     | zzzz    | 9875642013698521 | VISA     | February |     2022 |       564 |
      | nejusathiyadas1 | 987654321 | Sydney   | xxxx      | yyyy     | zzzz    | 9875642013698521 | VISA     | February |     2022 |       564 |
      | nejusathiyadas1 | 987654321 | Sydney   | xxxx      | yyyy     | zzzz    | 9875642013698521 | VISA     | February |     2022 |       564 |
