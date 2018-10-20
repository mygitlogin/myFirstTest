package pages.AO;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Страница входа")
public class AOMainPage extends AkitaPage {

    /**
     * Optional - аннотация, позволяющая исключать поле
     * из обязательной проверки наличия на странице при загрузке страницы
     **/
    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[1]/div[2]/div/div[4]/form/div[1]/span/span/span[2]/input")
    @Name("Логин")
    private SelenideElement login;

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[1]/div[2]/div/div[4]/form/div[2]/span/span/span[2]/input")
    @Name("Пароль")
    private SelenideElement password;

    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[1]/div[2]/div/div[4]/form/div[4]/button")
    @Name("Войти")
    private SelenideElement submitButton;

    @Optional
    @FindBy(xpath = "//*[@id=\"react-app\"]/div/div[1]/div[2]/div/div[3]")
    @Name("Неверный логин или пароль")
    private SelenideElement loginError;
}