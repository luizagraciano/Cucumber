package cucumber.suport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
    public static WebDriver criarChrome(){
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://automationexercise.com/");
        return navegador;
    }
}
