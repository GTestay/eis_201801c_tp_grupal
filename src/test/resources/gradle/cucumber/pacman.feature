Feature:  Pacman

  Scenario: Pacman come un biscuit se vuelve más gordo (suma puntos)
    Given Pacman
    When Come un biscuit
    Then Suma puntos 5

  Scenario: Pacman come una fruta se vuelve más gordo (suma puntos)
    Given Pacman
    When Come una fruta
    Then Suma puntos 10

  Scenario: Pacman choca contra un fantasma y muere
    Given Pacman
    When Choca con un fantasma
    Then Muere

  Scenario: Pacman come un pellet y los fantasmas se debilitan
    Given Pacman
    When Come un pellet
    Then Fantasmas se debilitan

  Scenario: Pacman choca con un fantasma debilitado y no muere
    Given Pacman
    When Choca con un fantasma debilitado
    Then Sigue con vida
    Then Fantasma pierde su cuerpo

  Scenario: Pacman choca contra un fantasma sin cuerpo y no muere
    Given Pacman
    When Choca con un fantasma sin cuerpo
    Then Sigue con vida