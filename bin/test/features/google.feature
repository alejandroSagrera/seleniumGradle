Feature: Probar la búsqueda en Google

  Scenario: Busco algo en Google
    Given navego a Google
    When busco algo
    When hago click en el boton buscar
    Then obtengo resultado
