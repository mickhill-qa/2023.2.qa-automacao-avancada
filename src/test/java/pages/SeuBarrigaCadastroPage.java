package pages;

import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class SeuBarrigaCadastroPage extends BasePage{
        private String url = "https://seubarriga.wcaquino.me/cadastro";
        private By inputNome = By.id("nome");
        private By inputEmail = By.id("email");
        private By inputSenha = By.id("senha");
        private By btnCadastrar = By.xpath("(//input[@type='submit'])[1]");

        public void abrir(){
                driver.get(url);
        }
        public void preencherCampoNome(String _nome){
                driver.findElement(inputNome).sendKeys(_nome);
        }
        public void preencherCampoEmail(String _email){
                driver.findElement(inputEmail).sendKeys(_email);
        }
        public void preencherCampoSenha(String _senha){
                driver.findElement(inputSenha).sendKeys(_senha);
        }
        public void clicarBtnCadastrar(){
                driver.findElement(btnCadastrar).click();
        }
}
