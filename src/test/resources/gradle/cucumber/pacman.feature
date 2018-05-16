Feature:  Cuando el pacman come

  Scenario: Comiendo un biscuit
    Given Pacman come un biscuit
    When Se vuelve más gordo
    Then Suma puntos 5

  Scenario: Comiendo una fruta
    Given Pacman come una fruta
    When Se vuelve más gordo
    Then Suma puntos 10

  Scenario: Pacman choca fantasma y muere
    Given Pacman avanza
    When Choca con un fantasma
    Then Su vida es 0

  Scenario: Pacman come pellet y debilita a los fantasmas
    Given Un Pacman
    When Pacman come pellet
    Then Fantasmas se debilitan

  Scenario: Pacman choca con un fantasma debilitado y no muere
    Given Un Pacman
    When Choca con un fantasma debilitado
    Then Sigue con vida y el fantasma pierde su cuerpo
