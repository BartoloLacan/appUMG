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
    public void enterUsername() {
        googlePage.enterField("username", "cikopij466@estudys.com");
        googlePage.enterField("password", "solola2023");
    }

    @Then("^iniciar sesion$")
    public void iniciarSesion(){
        googlePage.login();
    }

    @And("^cerrar sesion$")
    public void cerrarSesion(){ googlePage.logout();  }

    @And("^Cerrar el navegador$")
    public void closeChrome() {
        googlePage.cerrarNavegadorclose();
    }
}
