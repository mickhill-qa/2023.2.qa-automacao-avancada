package runner.support;

import java.util.Random;

public class Utils{
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
