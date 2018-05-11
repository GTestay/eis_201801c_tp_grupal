Feature:  Cuando el pacman come

  Scenario: Comiendo un biscuit
    Given Pacman come un biscuit
    When Se vuelve más gordo
    Then Suma puntos 5

  Scenario: Comiendo una fruta
    Given Pacman come una fruta
    When Se vuelve más gordo
    Then Suma puntos 10
