package cucumber.resources;

import java.util.Locale;

import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

import cucumber.pages.SignupPage;
import cucumber.suport.Web;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    private WebDriver navegador;
    private SignupPage signupPage;

    //Criação da massa de testes dinâmica
    Faker faker = new Faker(Locale.CANADA);
    String nomeFaker = faker.name().firstName();
    String emailFaker = faker.internet().emailAddress();

    @Given("Usuário esteja na página principal")
    public void usuário_esteja_na_página_principal() {
        navegador = Web.criarChrome();
        this.signupPage = new SignupPage(navegador);
    }

    @Given("Usuário clique no botão Signup")
    public void usuário_clique_no_botão_signup() {
        signupPage.clicarLogin("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a");
    }

    @When("Usuário inserir um nome no campo Name")
    public void usuário_inserir_um_nome_no_campo_name() {
        signupPage.preencherCampoXpath("/html/body/section/div/div/div[3]/div/form/input[2]", nomeFaker);
    }

    @When("Usuário inserir um email no campo Email Address")
    public void usuário_inserir_um_email_no_campo_email_address() {
        signupPage.preencherCampoXpath("/html/body/section/div/div/div[3]/div/form/input[3]", emailFaker);
    }

    @When("Usuário clicar no botão Signup")
    public void usuário_clicar_no_botão_signup() {
        signupPage.clicarXpath("/html/body/section/div/div/div[3]/div/form/button");
    }

    @Then("Usuário deve ser redirecionado para a página de Cadastro")
    public void usuário_deve_ser_redirecionado_para_a_página_de_cadastro() {
        signupPage.paginaCerta("https://automationexercise.com/signup");
    }



    @When("Usuário inserir um email existente no campo Email Address")
    public void usuário_inserir_um_email_existente_no_campo_email_address() {
        signupPage.preencherCampoXpath("/html/body/section/div/div/div[3]/div/form/input[3]", "user@test.com");
    }

    @Then("Usuário deve receber mensagem de email já cadastrado")
    public void usuário_deve_receber_mensagem_de_email_já_cadastrado() {
        signupPage.verificarTextoXpath("/html/body/section/div/div/div[3]/div/form/p", "Email Address already exist!");
    }
}
