package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GooglePage extends BasePage{
    public GooglePage(){
        super(driver);
    }


    public void navigateToGoogle(){
        navigateTo("https://heggerty.org/my-account/");
    }

    public void EnterCredentials(String idInput, String valueInput){
        WebElement inputEnter = driver.findElement(By.id(idInput));
        slowType(inputEnter, valueInput);
    }
    public void login() {
        WebElement botonLogin = driver.findElement(By.name("login"));
        botonLogin.click();
    }


    public void irCompras() {
        WebElement enlaceShop = driver.findElement(By.linkText("Shop"));

        // Hacer clic en el enlace
        enlaceShop.click();
    }


    public void comprasDos() {

        WebElement shopDLink = driver.findElement(By.linkText("SHOP ALL PRODUCTS"));
        shopDLink.click();
    }

    public void seleccionar() {
        // Encontrar el enlace del producto por su atributo "href"
        WebElement enlaceProducto = driver.findElement(By.cssSelector("a[href='?add-to-cart=1289672']"));

        // Hacer clic en el enlace del producto
        enlaceProducto.click();
    }

    public void Car(){
        WebElement botonCart = driver.findElement(By.id("cart"));
        botonCart.click();
    }

    public void Check(){
        // Encontrar la etiqueta por el texto "Proceed to checkout"
        WebElement etiquetaCheckout = driver.findElement(By.linkText("Proceed to checkout"));
        etiquetaCheckout.click();
    }

    public void RegisterInfo(String Company, String AdressOne, String City, String Code, String Phone){

        // Captura el elemento label del radio button "Commercial"
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

        // Crea un objeto Select para estados//
        Select select = new Select(selectElement);//
        // Selecciona una opción por valor (por ejemplo, "Alabama")//
        select.selectByValue("AL");     sleep(3000);//

        slowType(inCode, Code);     sleep(3000);//para el codigo de pais

        // Crea un objeto Select para paises//
        Select selectCountry = new Select(selectElementCountry);//
        // Selecciona una opción por valor (por ejemplo, "Alabama")//
        selectCountry.selectByValue("GT");    sleep(3000);//

        slowType(inPhone, Phone);    sleep(3000);//el telefono
    }

    public void RegisterCard(String number){

        WebElement inNumber = driver.findElement(By.cssSelector("div.p-Input input#Field-numberInput"));

        //WebElement inNumber = driver.findElement((By.id("Field-numberInput")));
        //WebElement inExpiration = driver.findElement((By.id("Field-expiryInput")));
        //WebElement inCvc = driver.findElement((By.id("Field-cvcInput")));

        slowType(inNumber, number);     sleep(3000);//para el codigo de pais
        //slowType(inExpiration, expiration);     sleep(3000);//para el codigo de pais
        //slowType(inCvc, Cvc);     sleep(3000);//para el codigo de pais

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
