package pages;

import org.openqa.selenium.By;
import runner.support.Actions;

public class SandroEcoreLoginPage extends Actions {

    String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/";
    private By fieldUserName = By.name("username");
    private By fieldPassWord = By.name("password");
    private By btnLogin = By.id("btnLogin");
    private By messageError = By.className("alert");

    public void abrir() {
        get(url);
    }

    public void preencherField(String username, String password) {
        set(fieldUserName, username);
        set(fieldPassWord, password);
    }

    public void clicarLogin() {
        click(btnLogin);
    }

    public String validaMessageError(){
        String text = get_text(messageError);
        return text;
    }

}
