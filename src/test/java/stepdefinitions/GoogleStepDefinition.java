package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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

    @When("^Se ingresen las credenciales$")
    public void enterCredentials() {
        googlePage.EnterCredentials("username", "cikopij466@estudys.com");
        googlePage.EnterCredentials("password", "solola2023");
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

    @And("^Registrar Informacion$")
    public void RegisterInformation(){
        googlePage.RegisterInfo(
                "CompanySa",
                "Callables",
                "Guatemala",
                "1902",
                "23435467"
        );
    }

    @And ("^Registrar tarjeta$")
    public void RegisterC(){
        googlePage.RegisterCard("4970110000000062");
    }

    @And("^Cerrar el navegador$")
    public void closeChrome() {
        googlePage.cerrarNavegadorclose();
    }
}
