package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Температура на месяц")
public class MounthForecastPage extends AkitaPage {

    @FindBy(linkText = "Июнь")
    @Name("Июнь")
    public SelenideElement searchField;

}