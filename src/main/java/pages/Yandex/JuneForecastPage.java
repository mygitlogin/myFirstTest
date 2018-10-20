package pages.Yandex;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@Name("Температура в июне в Барселоне")

public class JuneForecastPage extends AkitaPage {

    @FindBy(xpath = ".//*[(@class=\'title title_level_1\')]")
    @Name("Заголовок")
    private SelenideElement zagolovok;

    @FindBy(xpath = ".//*[(@class='graph-longterm__label-title')]")
    @Name("Температура в июне")
    private List<SelenideElement> tempInMonth;


}