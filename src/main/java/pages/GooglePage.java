package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GooglePage extends BasePage{
    public GooglePage(){
        super(driver);
    }


    public void navigateToGoogle(){
        navigateTo("https://fifthavenue.fuelthemes.net/my-account/");
    }

    public void enterField(String idField, String valueField){
        WebElement inputField = driver.findElement(By.id(idField));
        slowType(inputField, valueField);
        //inputField.sendKeys(valueField);
    }
    public void login() {
        WebElement loginButton = driver.findElement(By.cssSelector("button[name='login'][value='Login']"));
        loginButton.click();
    }
    public void logout() {
        WebElement logoutLink = driver.findElement(By.linkText("logout"));
        logoutLink.click();
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
