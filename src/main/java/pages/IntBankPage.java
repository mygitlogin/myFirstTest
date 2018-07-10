package pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Интернет Банк")
public class IntBankPage extends AkitaPage{

    @FindBy(css="input[name$=\"ALBO.login\"]")
    @Name("Логин")
    private SelenideElement login;
}
