package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Погода в Москве")
public class MskWeatherPage extends AkitaPage {

//    @FindBy(css = "#lst-ib")
    @FindBy(id = "header2input")
    @Name("Город или район")
    public SelenideElement searchField;


}




