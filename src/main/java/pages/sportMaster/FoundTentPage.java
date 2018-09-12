package pages.sportMaster;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@Name("Найденная палатка")
public class FoundTentPage extends AkitaPage {

    @FindBy(css = "li[data-selenium=\"product_tab\"]:nth-child(5)")
    @Name("Наличие в магазинах")
    private SelenideElement availability;

    @Optional
    @FindBy(css = ".sm-goods_tabs_presence-availability label:nth-of-type(1)")
    @Name("Только с товаром в наличии")
    private SelenideElement shopavailability;

    @Optional
//    @FindBy(css = "tr:not([style=\"display: none;\"]) .ccrests__table__column-address")
    @FindBy(css = "tr:not([style=\"display: none;\"]) .ccrests__table__column-rests div[title=\"Мало\"]")
    @Name("магазины")
    private List<SelenideElement> shopadress;
}
