package pages.sportMaster;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Стартовая страница")
public class SMStartPage  extends AkitaPage {

    @FindBy(xpath = "//a[@data-selenium='open_city_menu']")
    @Name("Город")
    private SelenideElement smCity;

    @Optional
    @FindBy(css = ".newMenu")
    @Name("Каталог товаров")
    private SelenideElement catalogMenu;

    @Optional
    @FindBy(css = ".sm-change_city_mini [data-bind*=\"cityName\"]")
    @Name("Регион")
    private SelenideElement cityMoscow;

    @Optional
    @FindBy(css = ".sm-change_city_mini [value=\"Да\"]")
    @Name("Да")
    private SelenideElement yesButton;
}
