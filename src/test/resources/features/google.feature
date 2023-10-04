Feature: google

  @ingresar
  Scenario: ingresar a google
    Given se abre el navegador
    When Se ingresen las credenciales
    Then iniciar sesion

  @Comprar
  Scenario: realizar compras
    When dirigir compras
    And compra dos
    And seleccionar
    And carrito
    And Checks
    And Cerrar el navegador