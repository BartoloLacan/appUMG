package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

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


    public void logout() {
        WebElement logoutLink = driver.findElement(By.linkText("logout"));
        logoutLink.click();
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

    public void shop(){
        WebElement shopLink = driver.findElement(By.linkText("Shop"));
        shopLink.click();

    }

    public void shopd(){
        WebElement shopDLink = driver.findElement(By.linkText("SHOP ALL PRODUCTS"));
        shopDLink.click();

    }

    public void compraun(){
        WebElement productoLink = driver.findElement(By.cssSelector("a[data-product_sku='1412323']"));
        productoLink.click();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement prodLink = driver.findElement(By.cssSelector("a[data-product_sku='1410323']"));
        prodLink.click();


    }

    public void comprarp(){
>>>>>>> de24234a15bdd5d5f2cdcc0f08702b6215fbe58d
        WebElement botonCart = driver.findElement(By.id("cart"));
        botonCart.click();
    }

<<<<<<< HEAD
    public void Check(){
        // Encontrar la etiqueta por el texto "Proceed to checkout"
        WebElement etiquetaCheckout = driver.findElement(By.linkText("Proceed to checkout"));
        etiquetaCheckout.click();
=======
    public void avancomp(){
        WebElement botonCheckout = driver.findElement(By.linkText("Proceed to checkout"));
        botonCheckout.click();
>>>>>>> de24234a15bdd5d5f2cdcc0f08702b6215fbe58d
    }



<<<<<<< HEAD


=======
>>>>>>> de24234a15bdd5d5f2cdcc0f08702b6215fbe58d
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
