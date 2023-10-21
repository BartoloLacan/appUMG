package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import pages.GooglePage;
import org.openqa.selenium.WebDriver;

public class GoogleStepDefinition {
    GooglePage googlePage = new GooglePage();


    @Given("^se abre el navegador$")
    public void navigateToGoogle(){
        googlePage.navigateToGoogle();

    }

    @When("^Registrar$")
    public void registrarse(){
        googlePage.Register("input_11_1_3", "casodePrb3");
        googlePage.Register("input_11_1_6", "casodePrb4");
        googlePage.Register("input_11_2", "pruebadafs1@gmail.com");
        googlePage.Register("input_11_3", "Prueba2323nu");
        googlePage.Register("input_11_3_2", "Prueba2323nu");
    }

    @And("^Seleccionar profesion$")
    public void profesion(){
        googlePage.SelectProffession();
    }

    @And("^Radio Button$")
    public void Btnradio(){
        googlePage.RadioButton();
    }

    @And("^Radio Two$")
    public void BtnRadio(){
        googlePage.RadiobtTwo();
    }

    @And("^Iniciar Registro$")
    public void btnRegistro(){
        googlePage.RegitroButon();
    }

    @When("^Ir a Account$")
    public void account(){
        googlePage.IrIniciarSesion();
    }

    @And("^Se ingresen las credenciales$")
    public void enterCredentials() {
        googlePage.EnterCredentials("username", "pruebadafs1@gmail.com");
        googlePage.EnterCredentials("password", "Prueba2323nu");
    }

    @Then("^iniciar sesion$")
    public void iniciarSesion(){
        googlePage.login();
    }

    @When("^dirigir compras$")
    public void dirigir(){
        googlePage.irCompras();
    }


    @And ("^compra dos$")
    public void selected(){
        googlePage.comprasDos();
    }

    @And("^seleccionar$")
    public void listened(){
        googlePage.seleccionar();
    }

    @And("^carrito$")
    public void car(){
        googlePage.Car();
    }

    @And("^Checks$")
    public void checks(){
        googlePage.Check();
    }

    @And("^Calle$")
    public void calles(){
        googlePage.SelecCalle();
    }

    @And("^Registrar Informacion$")
    public void RegisterInformation(){
        googlePage.RegisterInfo(
                "CompanySa",
                "2780 Tapo Canyon Rd Unit ADDRESS",
                "Guatemala",
                "1902",
                "23435467"
        );
    }

    @And ("^Registrar tarjeta$")
    public void RegisterC(){
        googlePage.RegisterCard("5100010000000114");
    }

    @And("^Cerrar el navegador$")
    public void closeChrome() {
        googlePage.cerrarNavegadorclose();
    }
}
