Feature: google

  @ingresarAGoogle
  Scenario: ingresar a google
    Given se abre el navegador
    When Se ingresen las credenciales
    Then iniciar sesion
    And cerrar sesion
    And Cerrar el navegador