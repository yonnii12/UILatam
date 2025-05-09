Feature: Busqueda de vuelos en LATAM

  Scenario: Busqueda de vuelo ida
    Given Que nos encontramos en la pagina principal de LATAM
    When Cuando seleccionamos un vuelo de ida
    And Ingresamos los campos requeridos para vuelo de ida
    And Damos click en buscar vuelos
    Then El sistema nos debera mostrar los vuelos disponibles

  Scenario: Busqueda de vuelo ida y vuelta
    Given Que nos encontramos en la pagina principal de LATAM
    When Cuando seleccionamos un vuelo de ida y vuelta
    And Ingresamos los campos requeridos para vuelo de ida y vuelta
    And Damos click en buscar vuelos
    Then El sistema nos debera mostrar los vuelos disponibles

  Scenario: Busqueda de vuelos al dejar campos vacios
    Given Que nos encontramos en la pagina principal de LATAM
    When Cuando seleccionamos un vuelo de ida y vuelta
    And No ingresamos los campos requeridos
    And Damos click en buscar vuelos
    Then El sistema nos debera alertar que faltan campos por diligenciar