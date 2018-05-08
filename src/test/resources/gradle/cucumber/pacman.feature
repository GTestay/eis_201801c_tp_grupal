Feature:  Cuando el pacman come

  Scenario: Comiendo alimento
    Given Pacman come un biscuit
    When Se vuelve más gordo
    Then Suma puntos 5

    Given Pacman come una fruta
    When Se vuelve más gordo
    Then Suma puntos 5
