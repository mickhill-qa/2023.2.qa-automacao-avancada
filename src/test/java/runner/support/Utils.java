package runner.support;

import runner.base_class.BasePage;
import runner.base_class.BaseSteps;

import java.util.Random;

public class Utils extends BaseSteps {
    Random random = new Random();
    public String nomeRandom(String nome){
        nome = "Teste Automation" + random.nextInt();
        return nome;

    }

    public String emailRandom(String email){
        email = "testeautomation" + random.nextInt() + "@seubarriga.com";
        return email;
    }

    public String senhaRandom(String senha){
        senha = "S" + random.nextInt() + "!";
        return senha;
    }



}
