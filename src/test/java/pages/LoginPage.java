package pages;

import core.Driver;
import maps.LoginMaps;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginMaps {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void realizaLogin(String usuario, String senha){
        inpLogin.sendKeys(usuario);
        inpSenha.sendKeys(senha);
        btnEntrar.click();
    }

    public String getBoasVindas(){
        return linkBoasVindas.getText();
    }
}
