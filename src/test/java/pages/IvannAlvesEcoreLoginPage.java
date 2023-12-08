package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import runner.base_class.BasePage;

class IvannAlvesEcoreLoginPage  extends BasePage  {

	  private String url = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app";
	    private By inputUsername = By.name("username");

	    private By inputPassword = By.name("password");
	    private By btnLogin = By.id("btnLogin");
	    private By mensagem = By.className("alert");
	    private String urlaccount = "https://automation-sandbox-python-mpywqjbdza-uc.a.run.app/account";

	    private By pgTiltulo = By.xpath("//h2['Invoice List']");

	    private By BtnLogout = By.className("outline0");
	
	    public void abrir() {
	        driver.get(url);
	    }
	    public void setInputUsername() {
	        driver.findElement(inputUsername).sendKeys("demouser");
	    }
	    public void setInputPassword() {
	        driver.findElement(inputUsername).sendKeys("abc123");
	    }
	    public void clickBtnLogin() {
	        driver.findElement(btnLogin).click();
	    }

	    public void pressEnter() {
	        actions.sendKeys(Keys.ENTER).perform();
	    }

	    public String validaMensagem(String Texto) { Texto = driver.findElement(mensagem).getText();
	        return Texto;
	    }

	    public void accountabrir() {
	        driver.get(urlaccount);
	    }

	    public String validaInvoice() {
	        driver.findElement(pgTiltulo);
	        driver.findElement(pgTiltulo).getText();
	        return "Invoice List";
	    }

	    
}
