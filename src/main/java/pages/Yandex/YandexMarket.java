package pages.Yandex;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Яндекс Маркет")
public class YandexMarket extends AkitaPage {

    @FindBy(css = "li[data-department=\"Электроника\"]")
    @Name("Электроника")
    public SelenideElement menuElectronics;

}
