package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GooglePage extends BasePage{
    public GooglePage(){
        super(driver);
    }


    public void navigateToGoogle(){
        navigateTo("https://heggerty.org/user-registration/");
        //https://heggerty.org/my-account/
    }


    public void Register(String idInput, String valueInput){
        WebElement inputEnter = driver.findElement(By.id(idInput));
        slowType(inputEnter, valueInput);
    }

    public void SelectProffession(){
        // seleccionar el elemento por su id
        WebElement selectElement = driver.findElement(By.id("input_11_4"));

        Select select = new Select(selectElement);

        select.selectByValue("specialist_teacher_coach");
    }

    public void RadioButton(){
        WebElement labelElement = driver.findElement(By.cssSelector("label[for='choice_11_22_4']"));

        labelElement.click();
    }

    public void RadiobtTwo(){
        WebElement labelElement = driver.findElement(By.cssSelector("label[for='choice_11_21_0']"));

        labelElement.click();
    }

    public void RegitroButon(){
        WebElement submitButton = driver.findElement(By.id("gform_submit_button_11"));

        submitButton.click();
        try {
            Thread.sleep(10000); // Pausa de 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void IrIniciarSesion(){
        WebElement divElement = driver.findElement(By.className("fl-module-button"));
        WebElement anchorElement = divElement.findElement(By.tagName("a"));

        anchorElement.click();

        try {
            Thread.sleep(10000); // Pausa de 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void EnterCredentials(String idInput, String valueInput){
        WebElement inputEnter = driver.findElement(By.id(idInput));
        slowType(inputEnter, valueInput);

        // Agrega una espera de 3 segundos después de ingresar los datos
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void login() {
        WebElement botonLogin = driver.findElement(By.name("login"));
        botonLogin.click();

        try {
            Thread.sleep(10000); // Pausa de 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public void irCompras() {
        WebElement enlaceShop = driver.findElement(By.linkText("Shop"));

        // Hacer clic en el enlace
        enlaceShop.click();
        // Agrega una espera de 3 segundos después de ingresar los datos
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public void comprasDos() {

        WebElement shopDLink = driver.findElement(By.linkText("SHOP ALL PRODUCTS"));
        shopDLink.click();
        // Agrega una espera de 3 segundos después de ingresar los datos
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void seleccionar() {
        WebElement enlaceProducto = driver.findElement(By.cssSelector("a[href='?add-to-cart=1289672']"));

        enlaceProducto.click();
        // Agrega una espera de 3 segundos después de ingresar los datos
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Car(){
        WebElement botonCart = driver.findElement(By.id("cart"));
        botonCart.click();
        // Agrega una espera de 3 segundos después de ingresar los datos
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //WebElement link = driver.findElement(By.linkText("View cart"));
        //link.click();

    }

    public void Check(){
        // Encontrar la etiqueta por el texto Proceed to checkout
        WebElement etiquetaCheckout = driver.findElement(By.linkText("Proceed to checkout"));
        etiquetaCheckout.click();
        try {
            Thread.sleep(10000); // Pausa de 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void SelecCalle(){
        List<WebElement> divElements = driver.findElements(By.cssSelector("div.pcaitem"));

        // Valor por defecto del seleccionador
        String valorPorDefecto = "2780 Tapo Canyon Rd Unit ADDRESS";

        for (WebElement divElement : divElements) {
            String texto = divElement.getText();
            //System.out.println("Valor del div: " + texto);

            // Si el texto coincide con el valor por defecto, selecciona el elemento
            if (texto.equals(valorPorDefecto)) {
                divElement.click();
                break;
            }
        }
        try {
            Thread.sleep(10000); // Pausa de 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void RegisterInfo(String Company, String AdressOne, String City, String Code, String Phone){


        // Captura el elemento label del radio button Commercial
        WebElement commercialLabel = driver.findElement(By.xpath("//label[@for='ak_addr_type_2']"));
        WebElement inCompany = driver.findElement((By.id("billing_company")));
        WebElement inaddressOne = driver.findElement((By.id("billing_address_1")));
        WebElement inCity = driver.findElement((By.id("billing_city")));
        WebElement selectElement = driver.findElement(By.id("billing_state"));
        WebElement inCode = driver.findElement(By.id("billing_postcode"));
        WebElement selectElementCountry = driver.findElement(By.id("billing_country"));
        WebElement inPhone = driver.findElement(By.id("billing_phone"));


        //public void RadioButton(String Company, String Adress1, String City, String State, String Code, String Contry, String Phone){


        // selecciona "Commercial"
        commercialLabel.click();     sleep(3000);//para input radio
        slowType(inCompany, Company);    sleep(3000);//compañias
        slowType(inaddressOne, AdressOne);     sleep(3000);//direccion 1
        slowType(inCity, City);     sleep(3000);//para ciudad


        // objeto Select para paises//
        Select selectCountry = new Select(selectElementCountry);//
        // Selecciona una opción por valor ("Guatemala")//
        selectCountry.selectByValue("GT");    sleep(3000);//


        // objeto Select para estados//
        Select select = new Select(selectElement);//
        // Selecciona una opción por valor ("Solola")//
        select.selectByValue("SO");     sleep(3000);//

        slowType(inCode, Code);     sleep(3000);//para el codigo de pais


        slowType(inPhone, Phone);    sleep(3000);//el telefono
    }

    public void RegisterCard(){//esto no funciona
        WebElement iframe = driver.findElement(By.id("__privateStripeFrame2887"));


        driver.switchTo().frame(iframe);

        WebElement inputElement = driver.findElement(By.id("Field-numberInput"));

        inputElement.clear();

        inputElement.sendKeys("5100010000000114");

    }


    private void slowType(WebElement element, String text) {
        for (char c : text.toCharArray()) {
            element.sendKeys(String.valueOf(c));
            sleep(90);
        }
    }

    private void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    @Override
    public void cerrarNavegadorclose() {
        super.cerrarNavegadorclose();
    }
}
