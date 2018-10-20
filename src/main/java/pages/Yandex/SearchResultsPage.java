package pages.Yandex;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Результаты поиска")
public class SearchResultsPage extends AkitaPage {

    @FindBy(css = "a[href=\"https://alfabank.ru/\"]")
    @Name("Альфа Банк")
    public SelenideElement alfaLink;

}
