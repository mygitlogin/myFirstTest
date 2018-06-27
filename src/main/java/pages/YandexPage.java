package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;


@Name("Страница Yandex")
public class YandexPage extends AkitaPage {

    @FindBy(linkText = "Погода")
    @Name("Погода")
    public SelenideElement searchField;
}