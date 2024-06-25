package cucumber.pages;

//import java.time.Duration;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver navegador;

    public BasePage(WebDriver navegador){
        //navegador.manage().timeouts()
        //.implicitlyWait(Duration.ofSeconds(2))
        //.pageLoadTimeout(Duration.ofSeconds(10));
        this.navegador = navegador;
    }
}
