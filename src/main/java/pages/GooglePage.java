package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class GooglePage extends BasePage{
    public GooglePage(){
        super(driver);
    }


    public void navigateToGoogle(){
        navigateTo("https://heggerty.org/my-account/");
    }

    public void enterField(String idField, String valueField){
        WebElement inputField = driver.findElement(By.id(idField));
        slowType(inputField, valueField);
        //inputField.sendKeys(valueField);
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




    private void slowType(WebElement element, String text) {
        for (char c : text.toCharArray()) {
            element.sendKeys(String.valueOf(c));
            sleep(90); // Espera 300 milisegundos entre cada carácter (ajusta el tiempo según tu preferencia)
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
