package pack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Created by pc on 07.07.2016.
 */

@DefaultUrl("https://mail.ukr.net/classic/login")
public class UkrNetPage extends PageObject{

    @FindBy(id = "login")
    private WebElementFacade loginForm;

    @FindBy(id = "password")
    private WebElementFacade passwordForm;

    @FindBy(id = ".//button[@type='submit']")
    private WebElementFacade loginButton;

    @FindBy(id = ".//div/aside/button")
    private WebElementFacade sendLetterButton;

    public void enter_login(String keyword) {
        loginForm.type(keyword);
    }

    public void enter_password(String keyword) {
        loginForm.type(keyword);
    }

    public void login_click() {
        loginButton.click();
    }




}
