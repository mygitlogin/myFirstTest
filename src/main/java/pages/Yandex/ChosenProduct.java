package pages.Yandex;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Выбранный товар")
public class ChosenProduct extends AkitaPage {

    @Optional
    @FindBy(xpath = ".//*[@class='n-title__text']/h1")
    @Name("Наименование")
    private SelenideElement productName;
}
