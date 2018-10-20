package helpers;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Страница Google")
public class GooglePage extends AkitaPage {

    @FindBy(css = "#lst-ib")
    @Name("Поиск")
    public SelenideElement searchField;
}
