package pages;

import org.openqa.selenium.By;

public class Grupo1_Heroherokuapp_Login {
    private By campo_username = By.id("username");
    private By campo_password = By.id("password");
    private By btn_login = By.className("radius");
    private By valida_msg = By.id("flash");
    private By btn_logout = By.linkText("/logout");
}
