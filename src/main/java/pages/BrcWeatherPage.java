package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Погода в Барселоне")
public class BrcWeatherPage extends AkitaPage {

    @FindBy(linkText = "Прогноз на месяц")
    @Name("Прогноз")
    public SelenideElement searchField;


}
