package cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage extends BasePage {

    public SignupPage(WebDriver navegador) {
        super(navegador);
    }

    public void clicarLogin(String xpath){
        navegador.findElement(By.xpath(xpath)).click();
    }

    public void preencherCampoXpath(String xpath, String texto){
       navegador.findElement(By.xpath(xpath)).sendKeys(texto); 
    }

    public void clicarXpath(String xpath){
        navegador.findElement(By.xpath(xpath)).click();
    }

    public boolean paginaCerta(String urlEsperada){
        return navegador.getCurrentUrl().equals(urlEsperada);
    }

    public boolean verificarTextoXpath(String xpath, String texto){
        return navegador.findElement(By.xpath(xpath)).getText().equals(texto);
    }
    
}
