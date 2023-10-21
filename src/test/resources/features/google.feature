Feature: google

  @ingresar
  Scenario: ingresar a google
    Given se abre el navegador
    When Registrar
    And Seleccionar profesion
    And Radio Button
    And Radio Two
    Then Iniciar Registro

 @sesion
   Scenario: credenciales
     When Ir a Account
     And Se ingresen las credenciales
     Then iniciar sesion

  @Comprar
  Scenario: realizar compras
    When dirigir compras
    And compra dos
    And seleccionar
    And carrito
    And Checks
    And Registrar Informacion



  @Salir
  Scenario: Cerar Sesion
    And Myacount
    And LogOut
    And Cerrar el navegador



