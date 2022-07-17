Feature: The program will calculate the love match score between two first names

  Scenario Outline:
    Given Two names <firstName> and <secondName>
    When Calculate love match score
    Then The score is <score>

    Examples:
      | firstName | secondName | score |
      | "Luna"    | "Evan"     | 51    |
      | "Alice"   | "Nolan"    | 27    |
      | "Maya"    | "Leo"      | 22    |
      | "Nora"    | "Lillian"  | 17    |
      | "Ivy"     | "Eli"      | 61    |
      | "Sofia"   | "Logan"    | 37    |
