package pages;

public class GooglePage extends BasePage{
    public GooglePage(){
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
    }

    @Override
    public void cerrarNavegadorclose() {
        super.cerrarNavegadorclose();
    }
}
