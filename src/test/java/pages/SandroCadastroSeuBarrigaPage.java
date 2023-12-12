package pages;

import org.openqa.selenium.By;
import runner.support.Actions;

import static runner.base_class.BaseSteps.screenshot;

public class SandroCadastroSeuBarrigaPage extends Actions {
    private  String url = "https://seubarriga.wcaquino.me/cadastro";
    private By fieldNome = By.id("nome");
    private By fieldEmail = By.id("email");
    private By fieldSenha = By.id("senha");
    private By btnCadastrar = By.className("btn");
    private By validaMessage = By.className("alert");

    public void validaTelaCadastro(){
        get(url);
        screenshot();
    }
    public void cadastrarSeuBarriga(String nome, String email, String senha) {
        if (nome != null) {
            set(fieldNome, nome);
        }
        if ( email != null) {
            set(fieldEmail, email);
        }
        if (senha != null) {
            set(fieldSenha, senha);
        }
        screenshot();
        click(btnCadastrar);
    }

    public String messageValidation(String message){
        get_text(validaMessage, message);
        return message;
    }

}
