package pages;

import org.openqa.selenium.By;

import runner.base_class.BasePage;

public class IvanAlvesCadastroSeuBarrigaPage extends BasePage {
	
	private String url = "https://seubarriga.wcaquino.me/cadastro";
	private By inputNome= By.id("nome");
	private By inputEmail= By.id("email");
	private By inputSenha= By.id("senha");
	private By btnCadastrar= By.xpath("//input[@type='submit']");
	private By alertSucesso = By.className("alert alert-success");
	private By alertError = By.className("alert alert-danger");
	
	
	   public void abrir() {
	        driver.get(url);
	    }
	   
	   public void preencherCampoNome(String _texto) {
	        driver.findElement(inputNome).sendKeys(_texto);
	    }
	   
	   public void preencherCampoEmail(String _texto) {
	        driver.findElement(inputEmail).sendKeys(_texto);
	    }
	   public void preencherCampoSenha(String _texto) {
	        driver.findElement(inputSenha).sendKeys(_texto);
	    }
	   
	    public void clicarBtnPesquisar() {
	        driver.findElement(btnCadastrar).click();
	    }
	    
	    public String alertSucesso() {
	    	
	    	return driver.findElement(alertSucesso).getText().toString();
	    }
	    
	    public String alertError() {
	    	
	    	return driver.findElement(alertError).getText().toString();
	    }
}


