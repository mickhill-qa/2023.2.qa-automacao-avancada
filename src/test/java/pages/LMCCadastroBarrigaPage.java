package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.base_class.BasePage;

public class LMCCadastroBarrigaPage extends BasePage {

    private String Url = "https://seubarriga.wcaquino.me/cadastro";

    private By campo_nome = By.cssSelector("input[name ='nome']");

    private By campo_email = By.cssSelector("input[name ='email']");

    private By campo_senha = By.cssSelector("input[name ='senha']");

    private By botao_cadastrar = By.cssSelector("input[class*='btn']");

    private By verificacao_log = By.xpath("//div[@class='alert alert-success']");

    private By verifica_senha_vazia = By.cssSelector("div[role='alert']");

    public void abrir_pagina () throws InterruptedException {
        driver.get(Url);
        Thread.sleep(2000);
    }

    public Boolean verificarSeEstouNapagina() {
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(Url);
    }

    public void preencher_campos(String senha) throws InterruptedException {
        driver.findElement(campo_nome).sendKeys("John");
        Thread.sleep(1000);
        driver.findElement(campo_email).sendKeys("larisa334@gmail.com");
        Thread.sleep(1000);
        driver.findElement(campo_senha).sendKeys(senha);
        Thread.sleep(2000);
        botao_de_cadastro();
    }

    public void botao_de_cadastro() throws InterruptedException {
        driver.findElement(botao_cadastrar).click();
        Thread.sleep(1000);
    }

    public boolean verificacao () throws InterruptedException {
        String verif = "Usuário inserido com sucesso";
        String texto = driver.findElement(verificacao_log).getText();
        Assert.assertEquals(verif, texto);
        Thread.sleep(2000);
        return true;
    }

    public boolean verifica_senha_em_branco() throws InterruptedException {
        String verif = "Senha é um campo obrigatório";
        String texto = driver.findElement(verifica_senha_vazia).getText();
        Assert.assertEquals(verif, texto);
        Thread.sleep(2000);
        return true;
    }
}
