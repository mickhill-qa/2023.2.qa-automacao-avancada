package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import runner.base_class.BasePage;

public class LoginGrupo2XPTOPage extends BasePage {
	 private String url = "https://seubarriga.wcaquino.me/login";
	    private By inputEmail = By.id("email");
	    private By inputSenha = By.id("senha");
	    private By btnEntrar = By.cssSelector("button.btn.btn-primary");
	    private By alert = By.cssSelector("div.alert.alert-danger");
	    private By alertSucesso =By.cssSelector("div.alert.alert-success");
	       

	    public void abrir() {
	        driver.get(url);
	    }

	    public void preencherEmail(String _email) {
	    	
	    	driver.findElement(inputEmail).sendKeys(_email);
	    }
	   
	    public void preencherSenha(String _senha) {
	    	
	    	driver.findElement(inputSenha).sendKeys(_senha);
	    	    	
	    }
	    
	    public void entrar() {
	    	driver.findElement(btnEntrar).click();
	    	
	    }
	    
	    public  String alertDanger() {
	    	
	    	String msn = driver.findElement(alert).getText().toString();
	    	return msn;
	    			
	    }
	    public  String alertSucesso () {
	    	
	    	  	String msn = driver.findElement(alertSucesso).getText().toString();
	    	return msn;
	    			
	    }
	    
		public Boolean verificarSeEstouNaPaginaHome() {
			String urlAtual = driver.getTitle();
			return urlAtual.contains("Seu Barriga - Home");
		}

		public Boolean verificarSeEstouNaPaginaLogin() {
			String urlAtual = driver.getTitle();
			return urlAtual.contains("Seu Barriga - Log in");
			
		}
}
