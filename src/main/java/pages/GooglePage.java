package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

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
        WebElement botonCart = driver.findElement(By.id("cart"));
        botonCart.click();
    }

    public void avancomp(){
        WebElement botonCheckout = driver.findElement(By.linkText("Proceed to checkout"));
        botonCheckout.click();
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
